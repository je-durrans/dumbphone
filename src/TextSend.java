import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
* A class sending input text up to 64 characters between server and client 
* 
* @author Kate Moksina 
* @version 1.0
*/

public class TextSend {
  final static String HOST  =  "127.0.0.1"; /* localhost */
  final static int    PORT  =  8888;

  public static void main( String[] argv ) throws IOException {
    Socket s = new Socket( HOST, PORT );
    
    InputStream  in   =  s.getInputStream();
    OutputStream out  =  s.getOutputStream();

    BufferedReader reader = new BufferedReader( new InputStreamReader( in ) );
    PrintWriter writer = new PrintWriter( out );
    String content="";
    for(int i = 0; i<argv.length;i++){
        while(content.length()<64){
        content=content+argv[i]+" ";
    }
    }
    writer.print( content+"\r\n" );
    writer.flush();

    s.close();
  }
}
