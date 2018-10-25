import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ButtonChaser extends JFrame{

    JFrame buttonChaserFrame = new JFrame();
    //FlowLayout flow = new FlowLayout();
   // GridLayout grid = new GridLayout();
    JButton pressMeButton = new JButton();

    public ButtonChaser()
    {
        //setting up the frame
        buttonChaserFrame.setTitle("The Button Chaser Application");
        buttonChaserFrame.setLocation(200,300);
        buttonChaserFrame.setSize(700,700);
        buttonChaserFrame.setLayout(null);
        buttonChaserFrame.setVisible(true);
        buttonChaserFrame.setResizable(false);
        buttonChaserFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //setting up the button
        pressMeButton.setText("Press Me");
        pressMeButton.setMnemonic(KeyEvent.VK_P);
        //pressMeButton.setBounds(220,320,100,100);
        pressMeButton.setSize(100,100);
        pressMeButton.setLocation(300,300);
        buttonChaserFrame.add(pressMeButton);

        //Setting up listener
        ButtonListener handler = new ButtonListener();
        pressMeButton.addActionListener(handler);

    }

    public static void main(String[] args)
    {
        ButtonChaser win = new ButtonChaser();
    }

    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int randomX, randomY;
            int min = 0, max = 500;
            int range = (max - min) + 1;

            randomX = (int)(Math.random() * range) + min;
            randomY = (int)(Math.random() * range) + min;

            pressMeButton.setLocation(randomX, randomY);

        }

    }
}
