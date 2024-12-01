package Pack;

import java.awt.*;
import javax.swing.*;

public class ThirdGui {
    public static void main(String args[]) {
        JFrame frame = new JFrame("ThirdGui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Создаем панель с GridLayout для размещения двух панелей
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        // Создаем первую панель
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(5, 5, 66)); // Темно-синий фон
        panel1.setPreferredSize(new Dimension(300, 400));

        // Создаем надпись для первой панели
        JLabel label1 = new JLabel("ЕЗЧ");
        label1.setForeground(new Color(144, 238, 144)); // Белый текст
        label1.setFont(new Font("Serif", Font.BOLD, 24)); // Размер и стиль шрифта

        // Загружаем изображение для первой панели
        ImageIcon imageIcon1 = new ImageIcon("C:/Users/User2/Downloads/6061973173_48f2f03722_b.jpg");
        JLabel imageLabel1 = new JLabel(imageIcon1);

        // Добавляем надпись и изображение на первую панель
        panel1.add(label1);
        panel1.add(imageLabel1);

        // Создаем вторую панель
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(66, 5, 5)); // Темно-красный фон
        panel2.setPreferredSize(new Dimension(300, 400));

        // Создаем надпись для второй панели
        JLabel label2 = new JLabel("W220");
        label2.setForeground(Color.WHITE); // Желтый текст
        label2.setFont(new Font("Serif", Font.BOLD, 24)); // Размер и стиль шрифта

        // Загружаем изображение для второй панели
        ImageIcon imageIcon2 = new ImageIcon("C:/Users/User2/Downloads/2578346s-1920.jpg");
        JLabel imageLabel2 = new JLabel(imageIcon2);

        // Добавляем надпись и изображение на вторую панель
        panel2.add(label2);
        panel2.add(imageLabel2);

        // Добавляем обе панели на основную панель
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        // Добавляем основную панель к фрейму
        frame.getContentPane().add(mainPanel);

        // Упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}
