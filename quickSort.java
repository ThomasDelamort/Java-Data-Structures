public class quickSort {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 5, 1};
        int end = array.length - 1;

        long startTime = System.nanoTime();

        quick(array, 0, end);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        for (int i : array){
            System.out.print(i + " ");
        }

        System.out.println("\nTime taken: "+duration+" ns");
    }

    private static void quick(int[] array, int start, int end) {
        
        if (end <= start) return;

        int pivot = partition(array, start, end);
        quick(array, start, pivot - 1);
        quick(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        
        int pivot = array[end];
        int i = start - 1;
        
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;

        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
