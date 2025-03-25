public class BubbleSort {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for pairwise comparison
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j+1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {88, 55, 78, 92, 45, 66};

        System.out.println("Before Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        bubbleSort(marks);

        System.out.println("\nAfter Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
