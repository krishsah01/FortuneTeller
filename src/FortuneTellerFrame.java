import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame{

    public FortuneTellerFrame(int width,int height, boolean visible) {
        super("Fortune Teller");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);

        this.setLayout(new BorderLayout());

        JPanel TopPanel = new JPanel();

        Font font = new Font("Serif",Font.BOLD,36);
        ImageIcon fortuneTellerImg = new ImageIcon("./src/fortune-teller.png");
        JLabel label = new JLabel("Fortune Teller", fortuneTellerImg,JLabel.CENTER);
        label.setFont(font);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);

        TopPanel.add(label);

        JPanel middlePanel = new JPanel(new BorderLayout());

        JTextArea fortunes = new JTextArea();
        fortunes.setEditable(false);
        Font fortunesFont = new Font("sans serif",Font.BOLD,26);
        fortunes.setFont(fortunesFont);
        JScrollPane scrollPane = new JScrollPane(fortunes);

        middlePanel.add(scrollPane);

        JPanel BottomPanel = new JPanel(new BorderLayout());

        JButton readButton = new JButton("Read My Fortune");
        JButton quitBtn = new JButton("Quit");

        Dimension btnDimension = new Dimension(50,50);

        Font btnFont = new Font("Arial", Font.PLAIN,15);


        readButton.setPreferredSize(btnDimension);
        readButton.setFont(btnFont);

        quitBtn.setPreferredSize(btnDimension);
        quitBtn.setFont(btnFont);

        BottomPanel.add(readButton,BorderLayout.NORTH);
        BottomPanel.add(quitBtn, BorderLayout.SOUTH);

        this.add(TopPanel,BorderLayout.NORTH);
        this.add(middlePanel, BorderLayout.CENTER);
        this.add(BottomPanel,BorderLayout.SOUTH);

        quitBtn.addActionListener(e -> System.exit(0));

        FortuneGenerator randomFortunes = new FortuneGenerator();

        readButton.addActionListener(e -> {
            String lastFortune = randomFortunes.getFortune();
            if (fortunes.getText().isEmpty()) {
                fortunes.append(randomFortunes.getFortune());

            }else fortunes.append("\n" + lastFortune);
        });

        this.setVisible(visible);
    }

}
