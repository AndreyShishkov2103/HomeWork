package learningSwing;

import javax.swing.*;

/**
 * Individual Java Swing learning
 * @author Andrey Shishkov
 * @version 2024-03-30
 */
class SwingDemo {
    SwingDemo() {
        // Создать контейнер JFrame.
        JFrame jfrm = new JFrame ( "A Simple Swing Application") ;
        // Установить начальные размеры фрейма.
        jfrm.setSize(350, 100);
        // Прекратить работу, когда пользователь закрывает приложение.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создать текстовую метку.
        JLabel jlab = new JLabel ( "Swing means powerful GUis.");
        // Добавить метку в панель содержимого.
        jfrm.add(jlab);
        // Отобразить фрейм.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
