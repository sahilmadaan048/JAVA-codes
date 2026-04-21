class DatabaseConnection {

    // Step 1: Create private static instance
    private static DatabaseConnection instance;

    // Step 2: Make constructor private
    private DatabaseConnection() {
        System.out.println("Database Connected");
    }

    // Step 3: Public method to get instance
    public static DatabaseConnection getInstance() {

        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {

        DatabaseConnection obj1 = DatabaseConnection.getInstance();
        DatabaseConnection obj2 = DatabaseConnection.getInstance();

        System.out.println(obj1 == obj2);  // true (same object)
    }
}