package array;

public class ArrayTraversal {

    public static void arrayTraversal(int[] arr) {
        // code here

        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i] + " ");
            
        }
    }

    public static void main(String[] args) {
        
        arrayTraversal(new int[] {1,2,3,4,5});
        
    }
}
