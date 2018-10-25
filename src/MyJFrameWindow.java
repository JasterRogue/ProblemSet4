import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyJFrameWindow extends JFrame {



    public MyJFrameWindow()
    {
        setTitle("My own JFrame Application");
        setSize(300,200);
        setVisible(true);
        addWindowListener(new WindowEventHandler());
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }

    private class WindowEventHandler extends WindowAdapter
    {
        @Override
        public void windowClosing(WindowEvent e)
        {

            int input = JOptionPane.showConfirmDialog(null,"Close window");

            if(input == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }

        }

        @Override
        public void windowIconified(WindowEvent e)
        {
            JOptionPane.showMessageDialog(null,"Minimising the window");
        }

        @Override
        public void windowDeiconified(WindowEvent e)
        {
            JOptionPane.showMessageDialog(null,"Restoring the window");

        }
    }




}
