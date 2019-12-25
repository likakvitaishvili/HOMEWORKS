import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Planet{
    String name;
    String star_name;
    Double distance_from_star;
    Double speed;
    double time;

    public void addPlanet() {
        Scanner input = new Scanner(System.in);
        System.out.print("planetis saxeli: ");
        this.name = input.nextLine();
        System.out.print("varskvlavis saxeli: ");
        this.star_name = input.nextLine();
        System.out.print("dashoreba varskvlavidan dan: ");
        this.distance_from_star = input.nextDouble();
        System.out.print("planetis siswrafe: ");
        this.speed = input.nextDouble();

    }
    public void get_info() {
        System.out.println("planetis saxeli - "+this.name);
        System.out.println("varskvalvis saxeli - "+this.star_name);
        System.out.println("distancia varskvalvidan - "+this.distance_from_star);
        System.out.println("planetis siswrafe - "+this.speed);
        System.out.println("shebrunebis dro - "+this.time);
    }
    public double get_time(double star_diameter){
        return (star_diameter/2+this.distance_from_star)*Math.PI/this.speed;
    }


    public void write_in_file(){
        try{
            File file = new File("kosmosi.txt",true);;
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("planetis saxeli - "+this.name);
            bw.write(System.lineSeparator());
            bw.write("varskvalvis saxeli - "+this.star_name);
            bw.write(System.lineSeparator());
            bw.write("distancia varskvaidan - "+this.distance_from_star);
            bw.write(System.lineSeparator());
            bw.write("planetis siswrafe - "+this.speed);
            bw.write(System.lineSeparator());
            bw.write("shebrunebis dro - "+this.time);
            bw.write(System.lineSeparator());
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}
