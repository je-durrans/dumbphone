import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*The Switch On function that asks for a password and redirects to main menu, as well as plays hello Sound when
*switched on, happySound and sadSound depending on whether password has been entered correctly
*
*mouseClicked, mouseEntered and mouseExited have to be overriden for MouseListener implementation, it won't compile otherwise
*
*@author Kate Moksina
*@version 1.0
*/

public class SwitchOn implements MouseListener{
    public long clickTime;
    public long unclickTime;
    String password;
    String pass;
    BasicLayout layout;
    final int TIMER = 2000;
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
        clickTime = System.currentTimeMillis();
        count=1;
    }

    public void mouseReleased(MouseEvent e) {
        unclickTime = System.currentTimeMillis() - clickTime;
        if (unclickTime >= TIMER) {
            layout.ok_buttn.removeMouseListener(this);
            Ringtone.happySound();
            if (password == null) {
                layout.state = State.SET_PASSCODE;
                layout.line1.setText("Set password: ");
                layout.line2.setText(layout.input);
            } else {
                layout.state = State.ENTER_PASSCODE;
                layout.line1.setText("Enter password: ");
            }
        }
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
