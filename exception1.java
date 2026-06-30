public class exception1{
    public static void main(String[] args) {
        try {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);

    } catch (Exception e) {
        System.out.println("General Exception");

    } /*catch (ArrayIndexOutOfBoundsException e) { // sıralama hatası 
        System.out.println("Array Exception");
    }*/
    }
}