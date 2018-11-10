import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame
{
    @Override
    public void setTitle(String title) {
        String t = "Example: " + title;
        super.setTitle(t);
    }

    public void sayHello(String hello) {
    }

    public void sayHello(String hello, int other) {
    }
    public void sayHello(int hello1, String other1) {

}
