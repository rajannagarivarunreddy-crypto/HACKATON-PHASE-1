import java.util.Scanner;

   public class Solar2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter energy generated in kWh: ");
        double energy = sc.nextDouble();

        if (energy >= 25) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        sc.close();
    }
}