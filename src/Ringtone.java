
/* this is where we would put our ringtone IF WE HAD ONE **/

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
public class CallReceive {
    final static String ringtone = "ringtone.wav";
    final static int buffer_size = 128000;
    public static void main( String[] argv ) {
        try {
            File audioFile = new File( ringtone );
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream( audioFile );
            AudioFormat audioFormat = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info( SourceDataLine.class, audioFormat );
            SourceDataLine sourceLine = ( SourceDataLine ) AudioSystem.getLine( info );
            sourceLine.open( audioFormat );
            sourceLine.start();
            byte[] audioBuffer = new byte[ buffer_size ];
            int n = 0;
            while ( n != -1 ) {
                n = audioInputStream.read( audioBuffer, 0, audioBuffer.length );
                    if ( n >= 0 ) {
                        sourceLine.write( audioBuffer, 0, n );
                    }
                }
            sourceLine.drain();
            sourceLine.close();
        } catch ( Exception e ) {
            e.printStackTrace();
            System.exit( 1 );
        }
    }
}