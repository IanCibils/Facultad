import java.util.Scanner;

public class EjercicioUnoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        public int NumCasosA;
        public int NumCasosB;

       
        int numCasosA = scanner.nextInt();
        scanner.nextLine(); 

        int numCasosB = scanner.nextInt();
        scanner.nextLine();

        for (int caso = NumCasosB ; caso <= numCasosA; caso++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();

            int sumaImpares = SumaImpares.calcularSumaImpares(a, b);


            System.out.println("Rango de la suma de impares [", + NumCasosA + "," + NumCasosB + "] la suma total es de:" + sumaImpares);
        }

        scanner.close();
    }
}