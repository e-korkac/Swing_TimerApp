package timer_app;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, ParseException {

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        int answer = JOptionPane.showOptionDialog(null, "Choose option", "Option dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Settings", "Close"}, null);

        switch (answer) {
            
            case JOptionPane.YES_OPTION:
                MyFrame frame = new MyFrame();
                frame.setVisible(true);
            break;
            
            case JOptionPane.NO_OPTION:
                System.exit(0);  
            break;
            
        }

    }

}
