import javax.imageio.stream.FileImageInputStream;
import java.io.*;

public class exercitiul2 {
    public static void main(String[] args) throws FileNotFoundException {



        String nume_fisier_intrare = "C:\\Users\\cucic\\Desktop\\PJ\\TEMA-EX-1-PJ\\src\\in.txt";


        String nume_fisier_iesire = "C:\\Users\\cucic\\Desktop\\PJ\\TEMA-EX-1-PJ\\src\\out.txt";



        try {
            //deschidem fisierul pentru citire folosind bufferReader
            BufferedReader  reader;
            reader = new BufferedReader(new FileReader(nume_fisier_intrare));

            //deschidem fisierul pentru afisare folosind bufferWriter
            BufferedWriter writer;
            writer= new BufferedWriter(new FileWriter(nume_fisier_iesire));

            String Line; //linia pe care o vom citii


            int suma = 0;
            int numarElemente = 0 ;
            int ValoareMinima = Integer.MAX_VALUE;
            int ValoareMaxima= Integer.MIN_VALUE;
            float MediaAritmetica;



            //citim fiecare linie a fisierui pana ajungem la capat
            while((Line=reader.readLine())!=null)
            {
                //System.out.println(Line); //afisam fiecare linie citita

                int numar_curent = Integer.parseInt(Line); //citim linia si o tarnsformam in interg

                //calculam suma
                suma += numar_curent;

                numarElemente++;

                if(numar_curent<ValoareMinima)
                {
                    ValoareMinima=numar_curent;
                }
                if(numar_curent>ValoareMaxima)
                {
                    ValoareMaxima=numar_curent;
                }




            }
            MediaAritmetica = suma /numarElemente;

            //afisam pe ecran
            System.out.println("Suma este: "+suma);
            System.out.println("Media Aritmetica este: "+MediaAritmetica);
            System.out.println("Valoare minima este: "+ValoareMinima);
            System.out.println("Valoarea Maxima este: "+ValoareMaxima);

             //afisam in fisier
              writer.write("Suma: "+ suma +"\n");
              writer.write("Media Aritmetica:" + MediaAritmetica + "\n");
              writer.write("Valoarea Minima: "+ ValoareMinima + "\n");
              writer.write("Valoarea Maxima: "+ ValoareMaxima + "\n");


            //inchidem bufferul de ciitire dupa terminare
            reader.close();
            //inchidem bufferul de scriere dupa terminare
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}

