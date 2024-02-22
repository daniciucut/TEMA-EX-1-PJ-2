/*4. Să se determine cmmdc a două numere naturale, a căror valoare maximă este 30. Numerele
vor fi generate aleatoriu cu ajutorul unui obiect de tip Random și metodei nextInt(); */


import java.util.Random;

public class exercitiul4 {
    public static void main(String[] args) {

        Random random = new Random();

        int a= random.nextInt(30)+1;
        int b= random.nextInt(30)+1;

        System.out.println("Numerele generate sunt: "+ a + " si " + b);

        int cmmdc = determinaCMMDC(a, b); //motoda a clasei de baza

        System.out.println("Cel mai mare divizor comun este: "+cmmdc);

    }

    private static int determinaCMMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}
