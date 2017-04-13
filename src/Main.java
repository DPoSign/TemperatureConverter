import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Déclaration
        double temperaturebefore, temperatureafter;
        int choice;
        char response = 'O';


        Scanner input = new Scanner (System.in);

        while (response !='N') {
            System.out.println("Veuillez choisir un mode");
            System.out.println("1 - C to F");
            System.out.println("2 - F to C");
            choice = input.nextInt();

            System.out.println("Veuillez donner une température");
            temperaturebefore = input.nextDouble();

            if (choice == 1) {
                temperatureafter = ((9.0 / 5.0) * temperaturebefore + 32.0);
                System.out.println("La température en F est " + temperatureafter);

            } else {
                temperatureafter = 50 + temperaturebefore;
                System.out.println("La température en C est " + temperatureafter);

            }
            input.nextLine();
            System.out.println("Souhaitez-vous continuer ? O/N");
            response = input.nextLine().charAt(0);
        }

    }
}
