/**
 * Created by John on 03/02/2015.
 */

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import javax.sound.sampled.*;

public class RecordSound {
    final static int AUDIO_BUFFER_SIZE = 128000;
    public static Thread stopper;
    static boolean stopCondition = false;

    RecordSound(){
        try{
            stopper = new Thread(){
                @Override
                public void run(){
                    stopCondition=true;
                }
            };
            stopper.start();
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

            int n;
            while(!stopCondition){
                n=audioInputStream.read(audioBuffer, 0, audioBuffer.length);
                if(n>0){
                    out.write(audioBuffer, 0, n);
                }
            }
            targetLine.drain();
            targetLine.close();
            out.close();
        }catch(ConnectException e) {
            System.out.println("Sad noise");
            System.exit(1);
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }finally {
            stopCondition=false;
        }
    }
}