import java.util.Scanner;

public class TestUserprofile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your favourite Genre(Comedy, Drama, Action, Mystery): ");
        String genre = in.nextLine();
        UserProfile profile = new UserProfile(name, genre);
        System.out.println("User profile ID: " + profile.getUserID() + ", Genre: " + profile.getGenre() + " is created");
    }
}