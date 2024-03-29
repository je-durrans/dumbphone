import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
* Assistant class for network communication when sending and receiving texts
* 
* @author Kate Moksina 
* @version 1.0
*/

public class Worker implements Runnable {
  private Socket s;

  Worker( Socket s ) {
    this.s = s;
  }

  public void run() {
    try {
      InputStream  in   =  s.getInputStream();
      BufferedReader reader = new BufferedReader( new InputStreamReader( in ) ); 
      String content = reader.readLine() + "\n";
      s.close();
    } catch ( IOException e ) {
      System.out.println( e );
    }
  }
}
