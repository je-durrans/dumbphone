/**
 * Created by John 03/02/15.
 * 
 * Receives sound data from another phone and plays that sound.
 */

import java.io.BufferedInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.sound.sampled.*;

public class PlaySound {
    final static int AUDIO_BUFFER_SIZE = 128000;

    public static void main(String[] args) {
        new PlaySound();
    }
    PlaySound(){
        try{
            ServerSocket ss = new ServerSocket(7777);
            Socket s = ss.accept();
            BufferedInputStream in = new BufferedInputStream(s.getInputStream());
            AudioFormat audioFormat = new AudioFormat(8000.0f, 16, 1, true ,true);
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
            SourceDataLine sourceLine = (SourceDataLine)AudioSystem.getLine(info);
            sourceLine.open(audioFormat);
            sourceLine.start();

            byte[] audioBuffer = new byte[AUDIO_BUFFER_SIZE];
            int n = 0;
            while(n!=-1){
                n = in.read(audioBuffer, 0, audioBuffer.length);
                if(n>0){
                    sourceLine.write(audioBuffer, 0, n);
                }
            }
            sourceLine.drain();
            sourceLine.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
