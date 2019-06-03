package decorator;

import java.io.*;

/**
 * Created by David on 04 Jun 2019, at 12:30 AM
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(new ByteArrayInputStream(
                            "I know the Decorator Pattern therefore I RULE!".getBytes())));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
