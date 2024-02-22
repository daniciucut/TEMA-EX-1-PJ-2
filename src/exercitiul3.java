
/*

3. Să se scrie un program care citește un număr n natural de la tastatură și afișează toți
divizorii acestuia pe ecran. Dacă numărul este prim se va afișa un mesaj corespunzător

*/

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class exercitiul3 {
    public static void main(String[] args) {
       // System.out.println("Hello ");

        int Numar;

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Introduceti numarul:");
        Numar = scanner.nextInt();

        System.out.println("Ati introdus valoarea: "+ Numar);
        scanner.close();

       int i=0;
       int count=0;
       for(i=1;i<=Numar;i++)
       {
           if((Numar%i)==0)
           {
               //afisam divizori
               System.out.println(i);

             count++;
           }
       }
       if(count==2)
       {
           System.out.println("Numarul este Prim!");

       }
       else
       {
           System.out.println("Numarul nu este Prim!");
       }




    }
}
