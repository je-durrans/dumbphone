/**
 * Created by David Wakeling on ???.
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class PlaySound {
    final static String AUDIO_FILE     = "SOS.wav";
    final static int AUDIO_BUFFER_SIZE = 128000;

    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(7777);
            Socket s = ss.accept();
            InputStream inStream = s.getInputStream();
            BufferedInputStream in = new BufferedInputStream(inStream);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(in);
            AudioFormat audioFormat = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
            SourceDataLine sourceLine = (SourceDataLine)AudioSystem.getLine(info);

            sourceLine.open(audioFormat);
            sourceLine.start();

            byte[] audioBuffer = new byte[AUDIO_BUFFER_SIZE];
            int n = 0;
            while(n!=-1){
                n = audioInputStream.read(audioBuffer, 0, audioBuffer.length);
                if(n>=0){
                    sourceLine.write(audioBuffer, 0, n);
                }
            }
            sourceLine.drain();
            sourceLine.close();
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
