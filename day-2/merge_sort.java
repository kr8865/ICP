public class merge_sort {
    public static void main(String[] args) {
         int arr[] = { 12, 11, 13, 5, 6, 7 };

        
        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
        
    
    // Function to merge two halves
    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        // Copy data
        for (int i = 0; i < n1; ++i)
            arr1[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            arr2[j] = arr[m + 1 + j];

        // Merge temp arrays
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r]
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    // Driver method
    
}

