package hust.soict.hedspi.aims.screen;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import hust.soict.hedspi.aims.media.Media;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel(media.getTitle());
    }

}
