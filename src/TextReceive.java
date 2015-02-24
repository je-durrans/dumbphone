import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
* A client class receiving text from server 
* 
* @author Kate Moksina 
* @version 1.0
*/

public class TextReceive {
  public final static int PORT = 8888;

  public static void main( String[] argv )
    throws IOException {
    ServerSocket ss = new ServerSocket( PORT );

    while ( true ) {
      Socket s = ss.accept();
      Thread t = new Thread( new Worker( s ) );
      t.start();
    }
  }
}
