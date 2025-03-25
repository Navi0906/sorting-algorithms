public class HeapSortSalary {

    // Function to perform heap sort
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Function to maintain the heap property
    public static void heapify(int[] salaries, int n, int i) {
        int largest = i; // Assume root is largest
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If root is not largest, swap and continue heapifying
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            // Recursively heapify affected subtree
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {50000, 40000, 70000, 60000, 55000, 45000};

        System.out.println("Before Sorting:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        heapSort(salaries);

        System.out.println("\nAfter Sorting:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}
