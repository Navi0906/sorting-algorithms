public class SelectionSortExam {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first element
            int minIdx = i;

            // Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {88, 75, 95, 60, 85, 70};

        System.out.println("Before Sorting:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        selectionSort(scores);

        System.out.println("\nAfter Sorting:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
