/**
 * Created by John on 10/02/2015.
 */
import javax.sound.sampled.AudioInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class AudioClient{
    String host;//= "127.0.0.1"; /* localhost */
    final static int PORT = 7777;

    public AudioClient(String host, AudioInputStream audio) throws IOException{
        this.host = host;
        Socket s = new Socket( host, PORT );

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter writer = new PrintWriter(out);

        writer.print("GET / HTTP/1.1\r\n");
        writer.print("Host : " + host + "\r\n");
        writer.print("Content-Length : 0\r\n");
        writer.print("\r\n");
        writer.flush();

        int c;
        while((c = reader.read()) != -1){
            System.out.write(c);
        }

        s.close();
    }
}