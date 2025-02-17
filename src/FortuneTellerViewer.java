import java.awt.*;

public class FortuneTellerViewer{
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width * 0.75);
        int height = (int) (screenSize.height * 0.75);
        FortuneTellerFrame frame = new FortuneTellerFrame(width,height,true);
    }
}
