import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/**
* A class playing sound depending on the Event that called it
* 
* @author Kate Moksina / Luke Simmons 
* @version 1.0
*/

public class Ringtone {
    
    /*
     * These Strings represent the names of the files to be used in each method call.
     */
    
    final static String ringtone = "Ringtone.wav";
    final static String happySound = "HappySound.wav";
    final static String sadSound = "SadSound.wav";
    final static String tritone = "Tritone.wav";
    final static int buffer_size = 128000;
    
    /*
     * This method plays the phone's ringtone.
     */
    
    public static void ringtone() {
        
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
    
    /*
     * This method plays the phone's happy sound.
     */
    
    public static void happySound() {
        
        try {
            
            File audioFile = new File( happySound );
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
    
    /*
     * This method plays the phone's sad sound.
     */
    
    public static void sadSound() {
        
        try {
            
            File audioFile = new File( sadSound );
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
    
    /*
     * This method plays the phone's tritone.
     */
    
    public static void tritone() {
        
        try {
            
            File audioFile = new File( tritone );
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
