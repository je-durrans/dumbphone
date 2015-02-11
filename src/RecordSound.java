/**
 * Created by John on 03/02/2015.
 */
import com.sun.media.sound.WaveFileWriter;

import java.io.*;
import java.net.Socket;
import java.security.KeyException;
import javax.sound.sampled.*;
//import javax.sound.sampled.LineUnavailableException;


public class RecordSound {
    //final static String AUDIO_FILE     = "SOS.wav";
    final static int AUDIO_BUFFER_SIZE = 128000;

    public static void main(String[] args) {
        try{
            //File audioFile = new File(AUDIO_FILE);
            Socket s = new Socket("127.0.0.1", 7777);
            OutputStream out = s.getOutputStream();
            AudioFormat audioFormat = new AudioFormat(8000.0f, 16, 1, true ,true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, audioFormat);

            if(!AudioSystem.isLineSupported(info)){
                System.out.println("Line not supported");
                System.exit(1);
            }

            TargetDataLine targetLine = (TargetDataLine)AudioSystem.getLine(info);

            targetLine.open(audioFormat);
            targetLine.start();

            AudioInputStream audioInputStream = new AudioInputStream(targetLine);

            byte[] audioBuffer = new byte[AUDIO_BUFFER_SIZE];
            //FileOutputStream outFile = new FileOutputStream(AUDIO_FILE);
            //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outFile));
            //ByteArrayOutputStream out = new ByteArrayOutputStream();
            long time = System.currentTimeMillis();

            int n=0;
            while(time+3000<System.currentTimeMillis()){
                n=audioInputStream.read(audioBuffer, 0, audioBuffer.length);
                if(n>0){
                    out.write(audioBuffer, 0, n);
                }
            }


            targetLine.drain();
            targetLine.close();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
