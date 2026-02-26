public class CommandLineInputs {
    public static void main(String[] args) {

        if (args.length < 4) {
            System.out.println("Please provide the following command line inputs:");
            System.out.println("Name RollNumber Department Email");
            return;
        }

        String name = args[0];
        String rollNo = args[1];
        String department = args[2];
        String email = args[3];

        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Department : " + department);
        System.out.println("Email      : " + email);
    }
}