import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BicycleFrame extends JFrame {

    FlowLayout flow = new FlowLayout();
    ImageIcon smileIcon = new ImageIcon("smile.png");
    ImageIcon frownIcon = new ImageIcon("frown.png");
    JButton smileButton = new JButton(smileIcon);
    JButton frownButton = new JButton(frownIcon);

    public BicycleFrame()
    {
        setTitle("Bicycle Shop");
        setSize(400,200);
        setLocation(100,200);
        setLayout(flow);

        add(smileButton);
        add(frownButton);
        smileButton.setVisible(true);
        frownButton.setVisible(true);

        ButtonEventHandler handler = new ButtonEventHandler();

        smileButton.addActionListener(handler);
        frownButton.addActionListener(handler);

    }

    private class ButtonEventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == smileButton)
            {
                JOptionPane.showMessageDialog(null,"You clicked the smile button");

            }

            if(e.getSource() == frownButton)
            {
                JOptionPane.showMessageDialog(null,"You clicked the frown button");

            }
        }
    }


}
