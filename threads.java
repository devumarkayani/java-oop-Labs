import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameTask extends Thread {
    static int count = 0;
    static int sum = 0;
    static int num;
    static JTextField inputField;
    static JTextArea outputArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
            startGameTask();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Game GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setBackground(Color.MAGENTA);

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new BorderLayout());

        inputField = new JTextField();
        outputArea = new JTextArea();

        gamePanel.add(inputField, BorderLayout.WEST);
        gamePanel.add(outputArea, BorderLayout.SOUTH);

        frame.add(gamePanel, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setForeground(Color.RED);

        JButton closeButton = new JButton("Close Window");
        closeButton.setBackground(Color.MAGENTA);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(closeButton, BorderLayout.SOUTH);
    }

    private static void startGameTask() {
        GameTask gt = new GameTask();
        gt.start();
    }

    @Override
    public void run() {
        for (; ; ) {
            num = (int) (Math.random() * 100);
            System.out.println(num);

            SwingUtilities.invokeLater(() -> {
                outputArea.append(num + "\n");
            });

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            if (count == 3)
                break;
        }
    }
}