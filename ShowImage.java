import javax.swing.*;

public class ShowImage {
  public static void main(String[] args) {
    // Set the path to your image
    String imagePath = "C:\\Users\\mrath\\Downloads\\Pattern project.jpg";

    // Create a JFrame window
    JFrame frame = new JFrame();

    // Try loading the image
    try {
      ImageIcon icon = new ImageIcon(imagePath);

      // Create a JLabel to display the image
      JLabel label = new JLabel(icon);

      // Add the label to the JFrame
      frame.add(label);
    } catch (Exception e) {
      // Handle the case where the image cannot be loaded
      System.out.println("Error loading image: " + e.getMessage());
      return;
    }

    // Set the default close operation of the JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Pack the components to fit the frame's preferred size
    frame.pack();

    // Make the frame visible
    frame.setVisible(true);
  }
}
