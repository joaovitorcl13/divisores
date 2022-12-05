import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MergeText {
    public static void main(String[] args) throws IOException{
        String output = "";
        try(
        Scanner sc1 = new Scanner((new File("resultados-c.csv")));
        Scanner sc2 = new Scanner((new File("resultados-java.csv")))){

        while(sc1.hasNext() || sc2.hasNext()){
            output += sc1.next() +"     "+ sc2.next();
            output += "\n";
        }

        }

        try(PrintWriter pw = new PrintWriter(new File("resultados-pareados.csv"))){
        pw.write(output);
        }        
    }
}