import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

public class AnnotationViewerMain extends JFrame {
    private static final long serialVersionUID = -3201723535833938833L;

    private static final String HELP_MESSAGE = "Instructions for using Annotation Viewer:\n\n"
            + "1) In the \"Input Directory\" field, either type or use the browse\n"
            + "button to select a directory containing the analyzed documents\n "
            + "(in XMI or XCAS format) that you want to view.\n\n"
            + "2) In the \"TypeSystem or AE Descriptor File\" field, either type or use the browse\n"
            + "button to select the TypeSystem or AE descriptor for the AE that generated the\n"
            + "XMI or XCAS files.  (This is needed for type system infornation only.\n"
            + "Analysis will not be redone.)\n\n"
            + "3) Click the \"View\" button at the buttom of the window.\n\n"
            + "A list of the analyzed documents will be displayed.\n\n\n"
            + "4) Select the view type -- either the Java annotation viewer, HTML,\n"
            + "or XML.  The Java annotation viewer is recommended.\n\n"
            + "5) Double-click on a document to view it.\n";

    private File uimaHomeDir;

    private FileSelector inputFileSelector;

    private FileSelector taeDescriptorFileSelector;

    private JButton viewButton;

    private JDialog aboutDialog;

    /** Stores user preferences */
    private Preferences prefs = Preferences.userRoot().node("org/apache/uima/tools/AnnotationViewer");

    /**
     * Constructor. Sets up the GUI.
     */
    public AnnotationViewerMain() {
        super("Annotation Viewer");

        // set UIMA home dir
        uimaHomeDir = new File(System.getProperty("uima.home", "C:/Program Files/apache-uima"));

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // I don't think this should ever happen, but if it does just print error and continue
            // with defalt look and feel
            System.err.println("Could not set look and feel: " + e.getMessage());
        }
        // UIManager.put("Panel.background",Color.WHITE);
        // Need to set other colors as well

        // Set frame icon image
        try {
            this.setIconImage(Images.getImage(Images.MICROSCOPE));
            // new ImageIcon(getClass().getResource(FRAME_ICON_IMAGE)).getImage());
        } catch (IOException e) {
            System.err.println("Image could not be loaded: " + e.getMessage());
        }

        this.getContentPane().setBackground(Color.WHITE);

        // create about dialog
        aboutDialog = new AboutDialog(this, "About Annotation Viewer");

        // Create Menu Bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        // Menu Items
        JMenuItem aboutMenuItem = new JMenuItem("About");
        JMenuItem helpMenuItem = new JMenuItem("Help");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(exitMenuItem);
        helpMenu.add(aboutMenuItem);
        helpMenu.add(helpMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);