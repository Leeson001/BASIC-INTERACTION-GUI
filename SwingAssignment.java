import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;

/**
 * CustomFrame demonstrates INHERITANCE: it "extends" JFrame,
 * so it automatically gets everything a JFrame can do.
 * It also demonstrates a CONSTRUCTOR: the code that runs
 * when a new CustomFrame object is created.
 */
class CustomFrame extends JFrame {

    // Constructor: sets up the window's basic properties
    public CustomFrame(String title, int width, int height, ImageIcon appIcon) {
        super(title);                                   // call the JFrame constructor
        setSize(width, height);                         // window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // app closes when X is clicked
        setLocationRelativeTo(null);                    // open in the centre of the screen
        setIconImage(appIcon.getImage());
    }
}

/**
 * Main class for PROG209 Individual Assignment 1.
 */
public class SwingAssignment {

    private static final ImageIcon APP_ICON = loadAppIcon();

    // Components
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    // Data used by the "Addition" feature
    private final String[] messages = {
        "Welcome to Java Swing First Individual Assignment by Alpha Usman Jalloh",
        "Event Driven Programming is fun!",
        "Hello from Limkokwing University, Sierra Leone"
    };
    private final Color[] colours = {
        new Color(224, 242, 254),   // light blue
        new Color(220, 252, 231),   // light green
        new Color(254, 243, 199),   // light yellow
        new Color(252, 231, 243)    // light pink
    };
    private int messageIndex = 0;
    private int colourIndex = 0;

    // Constructor: builds the whole user interface
    public SwingAssignment() {
        // 1. Create the frame (uses our inherited CustomFrame)
        frame = new CustomFrame("Java Swing Assignment", 800, 800, APP_ICON);

        // 2. Create the panel
        panel = new JPanel();
        panel.setBackground(colours[0]);

        // 3. Create the label with the required text
        label = new JLabel(messages[0]);
        Image scaledIcon = APP_ICON.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledIcon));
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(16);

        // 4. Create buttons for the Addition (change text / change background)
        JButton textButton = new JButton("Change Text");
        JButton colourButton = new JButton("Change Background");

        textButton.addActionListener(e -> {
            messageIndex = (messageIndex + 1) % messages.length;
            label.setText(messages[messageIndex]);
        });

        colourButton.addActionListener(e -> {
            colourIndex = (colourIndex + 1) % colours.length;
            panel.setBackground(colours[colourIndex]);
        });

        // 5. Add the label (and buttons) to the panel
        panel.add(label);
        panel.add(textButton);
        panel.add(colourButton);

        // 6. Add the panel to the frame
        frame.add(panel);

        // 7. Show the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Swing programs should start on the Event Dispatch Thread
        SwingUtilities.invokeLater(SwingAssignment::new);
    }

    private static ImageIcon loadAppIcon() {
        URL iconUrl = SwingAssignment.class.getResource("/icon.png");
        if (iconUrl == null) {
            throw new IllegalStateException(
                "Missing application icon resource: add icon.png to the application classpath."
            );
        }

        ImageIcon icon = new ImageIcon(iconUrl);
        if (icon.getIconWidth() <= 0 || icon.getIconHeight() <= 0) {
            throw new IllegalStateException("Unable to load application icon from " + iconUrl);
        }
        return icon;
    }
}
