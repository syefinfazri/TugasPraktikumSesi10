public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {34, 12, 45, 2, 18};
        int n = data.length;
        
        for (int i = 0; i < n - 1; i++) {      
            for (int j = 0; j < n - 1 - i; j++) {  
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Hasil Sorting Ascending:");
        for (int x : data)
            System.out.print(x + " ");
    }
}
