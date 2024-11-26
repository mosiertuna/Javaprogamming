package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class Choosing_Option {
    public static void main(String[] args) {
        Object[] options = {"I do", "I don't"};
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Choose option",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        // dùng message để thể hiện giá trị option
        String message;
        if (option == JOptionPane.YES_OPTION) {
            message = "Choosen: Yes";
        } else if (option == JOptionPane.NO_OPTION) {
            message = "Choosen: No";
        } else {
            message = "No option selected";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}