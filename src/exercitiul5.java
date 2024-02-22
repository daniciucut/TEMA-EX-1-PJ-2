
/*5. Să se scrie un program care generează aleatoriu un număr întreg cuprins între 0 și 20.
Programul va determina dacă numărul aparține șirului lui Fobonacci*/


import java.util.Random;

public class exercitiul5 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(20)+1;

        System.out.println("Numarul generat este: "+a);


        if(esteFibpnacci(a))
        {
            System.out.println("Numarul: " + a + " apartine sirului Fibonacci! ");
            
        }
        else
        {
            System.out.println("Numarul: " + a + " nu apartine sirului Fibonacci! ");

        }
    }

    private static boolean esteFibpnacci(int numar) {
        int a = 0;
        int b = 1;

        while (a < numar) {
            int suma = a + b;
            a = b;
            b = suma;

            if (a == numar) {
                return true;
            }
        }

        return false;
    }
}
