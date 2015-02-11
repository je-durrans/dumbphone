import javax.sound.sampled.*;
import java.io.*;

/**
 * Created by John on 09/02/2015.
 */
public class SendAudio {
    final static String AUDIO_FILE     = "SOS.wav";
    final static int AUDIO_BUFFER_SIZE = 128000;

    public static void main(String[] args) {

        try{
            File audioFile = new File(AUDIO_FILE);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat audioFormat = audioInputStream.getFormat();
            //AudioFormat audioFormat = new AudioFormat(8000.0f, 16, 1, true ,true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, audioFormat);

            if(!AudioSystem.isLineSupported(info)){
                System.out.println("Line not supported");
                System.exit(1);
            }

            TargetDataLine targetLine = (TargetDataLine)AudioSystem.getLine(info);

            targetLine.open(audioFormat);
            targetLine.start();

            //AudioInputStream audioInputStream = new AudioInputStream(targetLine);

            byte[] audioBuffer = new byte[AUDIO_BUFFER_SIZE];
            int n = 0;
            FileOutputStream outFile = new FileOutputStream(AUDIO_FILE);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outFile));
            long time = System.currentTimeMillis();

            //AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE, audioFile);
            //AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE, new OutputStreamWriter());

            targetLine.drain();
            targetLine.close();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}