// Fractional Knapsack Problem
// Input: n items with weights w1, ..., wn and values v1, ..., vn
//        and a knapsack of capacity W
// Output: Maximum total value of items that can be put into the knapsack
//Time Complexity: O(nlogn)
//Space Complexity: O(1)

import java.util.*;

class FractionalKnapsack {
    public static void main(String[] args) {
        int[] weights = { 10, 40, 20, 30 };
        int[] values = { 60, 40, 100, 120 };
        int capacity = 50;
        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);
    }

    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        ItemValue[] itemValues = new ItemValue[weights.length];
        for (int i = 0; i < weights.length; i++) {
            itemValues[i] = new ItemValue(weights[i], values[i], i);
        }
        Arrays.sort(itemValues, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });
        double maxValue = 0;
        for (ItemValue itemValue : itemValues) {
            int currWeight = (int) itemValue.weight;
            int currValue = (int) itemValue.value;
            if (capacity - currWeight >= 0) {
                capacity -= currWeight;
                maxValue += currValue;
            } else {
                double fraction = (double) capacity / (double) currWeight;
                maxValue += currValue * fraction;
                capacity = (int) (capacity - (currWeight * fraction));
                break;
            }
        }
        return maxValue;
    }

    static class ItemValue {
        Double cost;
        double weight, value, index;

        public ItemValue(int weight, int value, int index) {
            this.weight = weight;
            this.value = value;
            this.index = index;
            cost = (double) value / (double) weight;
        }
    }
}