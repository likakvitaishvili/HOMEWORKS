import java.io.PrintStream;
import java.io.IOException;

public class Pirveli{

    public static void main(String[] args)throws
    
     IOException {

        int [] roots = {1, 2};
        double y;
       

        for (int x : roots) {
            
           y = Math.pow(x, 2) + 2 * x + 3;

PrintStream printStream = new PrintStream("function.txt"); 
printStream.print(y);
printStream.close();
        }
    }
}
