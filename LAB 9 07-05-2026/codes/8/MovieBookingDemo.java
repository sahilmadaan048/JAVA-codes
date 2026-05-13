class MovieTheater {

    int availableSeats = 5;

    synchronized void bookSeat(String user, int seats) {

        System.out.println(user + " trying to book " + seats + " seat(s)");

        if (availableSeats >= seats) {

            System.out.println("Booking successful for " + user);

            availableSeats -= seats;

            System.out.println("Seats Left: " + availableSeats);

        } else {
            System.out.println("Not enough seats for " + user);
        }
    }
}

class BookingThread extends Thread {

    MovieTheater theater;
    String user;
    int seats;

    BookingThread(MovieTheater theater, String user, int seats) {
        this.theater = theater;
        this.user = user;
        this.seats = seats;
    }

    public void run() {
        theater.bookSeat(user, seats);
    }
}

public class MovieBookingDemo {
    public static void main(String[] args) {

        MovieTheater theater = new MovieTheater();

        BookingThread t1 = new BookingThread(theater, "Rahul", 2);
        BookingThread t2 = new BookingThread(theater, "Aman", 3);
        BookingThread t3 = new BookingThread(theater, "Neha", 2);

        t1.start();
        t2.start();
        t3.start();
    }
}