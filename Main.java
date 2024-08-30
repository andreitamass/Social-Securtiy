import java.util.Scanner;

public class Main {
    public static void main (String... args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Personnummer (YYYYMMDD-XXXX): ");
        String birthDate = scanner.nextLine();
        char secondNumber = birthDate.charAt(birthDate.length() - 2);

        int birthYear = Integer.parseInt(birthDate.substring(0, 4));
        int Year = 2024;
        int age = Year - birthYear;

        String gender;

    if (secondNumber % 2 == 0) {
        gender = "Kvinna";
    } else {
        gender = "Man";
    }

    System.out.println(age + " , " + gender);

    }
}