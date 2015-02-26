import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*The Switch On function that asks for a password and redirects to main menu, as well as plays hello Sound when
*switched on, happySound and sadSound depending on whether password has been entered correctly
*@author Kate Moksina
*@version 1.0
*/

public class SwitchOn implements MouseListener{
    //private static TextField line1 = new TextField();
    //public static JButton ok_buttn = new JButton("OK");
    public long click;
    public long unclick;
    String password;
    String pass;
    BasicLayout layout;
    int count=0;
    public SwitchOn(BasicLayout layout) {
        this.layout = layout;
        layout.ok_buttn.addMouseListener( this );
    }

    public static void main(String[] args){
        BasicLayout b = new BasicLayout();
        SwitchOn window = new SwitchOn(b);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        click = System.currentTimeMillis();
        count=1;
    }

    public void mouseReleased(MouseEvent e) {
        unclick = System.currentTimeMillis() - click;
        if (unclick >= 2000) {
            layout.ok_buttn.removeMouseListener(this);
            //Ringtone.happySound();

            if (password == null) {
                layout.state = State.SET_PASSCODE;
                layout.line1.setText("Set password: ");
                layout.line2.setText(layout.input);
                //wait for enter
                password = layout.line2.getText();
                layout.state = State.MAIN_MENU;
            } else {
                layout.state = State.ENTER_PASSCODE;
                layout.line1.setText("Enter password: ");
                while (!pass.equals(password)) {
                    layout.line2.setText(layout.input);
                    //wait again
                    pass = layout.line2.getText();
                    //Ringtone.sadSound();
                    layout.clearLines(layout.lines);
                    if (pass.equals(password)) {
                        //Ringtone.happySound();
                        layout.state = State.MAIN_MENU;
                    }
                }
            }
        }
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
