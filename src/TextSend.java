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
* @version 2.0
*/

public class TextSend {
  final static String HOST  =  "127.0.0.1"; /* localhost */
  final static int    PORT  =  8888;
  static String content="";
  public TextSend(String[] text) throws IOException{
    Socket s = new Socket( HOST, PORT );
    OutputStream out  =  s.getOutputStream();
    PrintWriter writer = new PrintWriter( out );
    
    for(int i = 0; i<text.length;i++){
        while(content.length()<64){
        content=content+text[i]+" ";
    }
    }
    /*
     * following print statement is used for testing. Actual output is used in ButtonFunctions
     */
    writer.print( content+"\r\n" );
    writer.flush();
    s.close();
   
  }
}
