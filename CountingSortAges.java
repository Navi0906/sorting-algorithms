public class CountingSortAges {

    public static void countingSort(int[] ages) {
        int min = 10;
        int max = 18;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Step 1: Count the frequency of each age
        for (int age : ages) {
            count[age - min]++;
        }

        // Step 2: Compute cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place ages into output array based on cumulative count
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        // Step 4: Copy sorted ages back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 17, 11, 13, 12};

        System.out.println("Before Sorting:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        countingSort(ages);

        System.out.println("\nAfter Sorting:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
