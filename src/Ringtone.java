import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/**
 * This class contains all the methods for playing all the different ringtones and sounds.
 * 
 * @author Kate Moksina
 * @editor Luke Simmons
 * @version 25/02/2015
 */

public class Ringtone {
    
    /*
     * These Strings represent the names of the files to be used in each method call.
     */
    
    final static String ringtoneSound = "Ringtone.wav";
    final static String happySound = "HappySound.wav";
    final static String sadSound = "SadSound.wav";
    final static String tritoneSound = "Tritone.wav";
    final static String helloSound = "HelloSound.wav";
    final static String goodbyeSound = "GoodbyeSound.wav";
    final static int buffer_size = 128000;
    
    public static void ringtone() {  //This method plays the phone's ringtone.
        
        try {
            
            File audioFile = new File( ringtoneSound );
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
    
    public static void happySound() {  //This method plays the phone's happy sound.
        
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
    
    public static void sadSound() {  //This method plays the phone's sad sound.
        
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
    
    public static void tritone() {  //This method plays the phone's tritone.
        
        try {
            
            File audioFile = new File( tritoneSound );
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
    
    public static void helloSound() {  //This method plays the phone's hello sound.
        
        try {
            
            File audioFile = new File( helloSound );
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
    
    public static void goodbyeSound() {  //This method plays the phone's goodbye sound.
        
        try {
            
            File audioFile = new File( goodbyeSound );
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
