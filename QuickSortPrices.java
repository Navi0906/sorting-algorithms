public class QuickSortPrices {

    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get pivot index
            int pi = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap pivot to correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {450, 200, 700, 150, 600, 300};

        System.out.println("Before Sorting:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
