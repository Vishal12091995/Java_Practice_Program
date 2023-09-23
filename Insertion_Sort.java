public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 8, 9, 2, 12, 15, 13};

        // Iterate through the array
        for (int i = 0; i < arr.length-1; i++) {
            int j = i + 1;

            // Compare and swap elements to insert the current element at its correct position
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
