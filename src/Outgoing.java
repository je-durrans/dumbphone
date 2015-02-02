/**
 * Created by John on 02/02/2015.
 */
public class Outgoing {
    public static void main(String[] args) {
        new Outgoing(new String[]{"hello", ", ", " ", "world", "!"});
        }
    public Outgoing(Object o){
        if(o instanceof String[]){
            //Send to phone
            //Alert phone to text
        }else if (o instanceof String){//audioFile
            //Send to phone
            //Alert phone to call
        }else{
            //Error
        }
    }

}
