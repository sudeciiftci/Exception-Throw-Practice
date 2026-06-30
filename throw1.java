public class throw1 {
    public static void main(String[] args) {
        int age = -5;

        if(age < 0){
            throw new IllegalArgumentException("Can not be negative");
        }
    }
}
