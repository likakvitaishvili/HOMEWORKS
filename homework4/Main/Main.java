import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String lang;
        String para;
        Scanner s = new Scanner(System.in);
        System.out.println("Input language: ");
          lang = s.nextLine();
          System.out.println("Input parameters: ");
          para = s.nextLine();
       
        String[] paraArr = para.split("-");
        ArrayList param = new ArrayList();
        for (String parameter: paraArr) {

            try {
               param.add(Integer.parseInt(parameter));
            } catch (NumberFormatException e) {
             //  e.printStackTrace();
            }
        }
        System.out.println(param);
        Generator generator = new Generator(lang, param);
        generator.generateAlphabet();
        System.out.println(generator.generateChar());
    }
}
