import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Создаем инстанцию класса MainWindow
        MainWindow mainWindow = new MainWindow();

        // Упаковываем все лементы с нашей формы
        mainWindow.pack();

        // Изменяем размеры окна
        mainWindow.setSize(new Dimension(200, 200));

        // Отображаем созданное окно
        mainWindow.setVisible(true);
    }
}
