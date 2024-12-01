package Pack;

import java.awt.*;
import javax.swing.*;

public class SecondGui {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Two Panels App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Создаем панель с GridLayout для размещения двух панелей
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        // Создаем первую панель
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(5, 5, 66)); // Темно-синий фон
        panel1.setPreferredSize(new Dimension(200, 300));

        // Создаем надпись для первой панели
        JLabel label1 = new JLabel("Привет МИР");
        label1.setForeground(new Color(144, 238, 144)); // Белый текст
        label1.setFont(new Font("Serif", Font.BOLD, 24)); // Размер и стиль шрифта

        // Добавляем надпись на первую панель
        panel1.add(label1);

        // Создаем вторую панель
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(66, 5, 5)); // Темно-красный фон
        panel2.setPreferredSize(new Dimension(200, 300));

        // Создаем надпись для второй панели
        JLabel label2 = new JLabel("4К");
        label2.setForeground(Color.WHITE); // Желтый текст
        label2.setFont(new Font("Serif", Font.BOLD, 18)); // Размер и стиль шрифта

        // Добавляем надпись на вторую панель
        panel2.add(label2);

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