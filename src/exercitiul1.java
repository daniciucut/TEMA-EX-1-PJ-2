import java.util.Scanner;

/*1. Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria unui
dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura. Sa se adauge un break
point pe prima linie care citește valoarea unei laturi si din acel punct să se ruleze programul
linie cu linie urmărind valorile variabilelor în memorie.*/





public class exercitiul1 {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        int Lungime; //lungimea dreptunghiului
        int latime; //latimea dreptunghiului

        int perimetru;
        int Arie;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului:");

        Lungime = scanner.nextInt();
        System.out.println("Introduceti latimea dreptunghiului:");
        latime = scanner.nextInt();

        perimetru = 2* Lungime +2* latime;

        Arie = Lungime * latime;

        System.out.println("Perimetrul dreptunghiului este: " + perimetru);

        System.out.println("Aria dreptunghiului este: "+Arie);

        scanner.close();







    }
}
