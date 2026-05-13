public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");

        } catch (Exception e) {
            System.out.println("General Exception");
        }

        System.out.println("Program Continues...");
    }
}