import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class stars {
    String name;
    Double diameter;
    Double temperature;
    ArrayList<Planet>  planetArr = new ArrayList<Planet>();

    public void addStar() {
        Scanner input = new Scanner(System.in);
        System.out.print("varskvalvis saxeli:");
        this.name = input.nextLine();
        System.out.print("varskvalvis diametri: ");
        this.diameter = input.nextDouble();
        System.out.print("varskvalvis temperatura: ");
        this.temperature = input.nextDouble();
    }

    public void get_info() {
        System.out.println("varskvalvis saxeli - "+this.name);
        System.out.println("varskvalvis diametri - "+this.diameter);
        System.out.println("varskvalvis temepratura - "+this.temperature);
    }
    public void write_in_file(){
        try{
            File file = new File("kosmosi.txt",true);;
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("varskvalvis saxeli- "+this.name);
            bw.write(System.lineSeparator());
            bw.write("varskvalvis diametri - "+this.diameter);
            bw.write(System.lineSeparator());
            bw.write("varskvalvis temepratura - "+this.temperature);
            bw.write(System.lineSeparator());
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
