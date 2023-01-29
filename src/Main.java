import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Запускаем игру...");
        JFrame window =new JFrame("TicTacToe");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        TicTacToe game=new TicTacToe();
        window.add(game);
        System.out.println("Конец...");
    }
}