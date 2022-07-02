import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestInput {
/*

 * */

    public static void main(String[] args) throws Exception {

    while (true)
    {
           /* System.out.print("Your input for System.in:");
            InputStream in = System.in;
            int x = in.read();
            // print System.in.read results (bytes)

           // System.out.println("System.in.read() result:");
            System.out.println(x);
            //System.out.println("");
*/
            /*System.out.print("Your input for InputStream:");
            InputStreamReader reader = new InputStreamReader(System.in);
            int y = reader.read();
            // print InputStreamReader.read results (symbol code)
            System.out.println("InputStreamReader.read results:");
            System.out.println(y);
            System.out.println("");*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Мы считали с клавиатуры эту строку:");
        System.out.println(s);
        }
    }

    }



