import javax.swing.*;
import java.awt.*;

public class BicycleTest {
    public static void main(String[] args)
    {
        BicycleFrame2 bicycleFrame = new BicycleFrame2();
        bicycleFrame.setVisible(true);
        ImageIcon bikeIcon = new ImageIcon("bike.PNG");
        bicycleFrame.setIconImage(bikeIcon.getImage());
        bicycleFrame.getContentPane().setBackground(Color.CYAN);
    }
}
