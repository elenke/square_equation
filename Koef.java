import javax.swing.*;

/**
 * Created by admin on 24.02.2017.
 */
public class Koef {
    public double a; // Переменная экземпляра класса
    public double b;
    public double c;
    private String str;

    public void input() {

            str=String.valueOf(JOptionPane.showInputDialog("Введите коэф. А"));
        if (str.matches("(-|\\+)?[0-9]+(\\.[0-9]+)?")) {
            this.a=Double.parseDouble(str);
           // System.out.println("введенное число " + a );
        }
        else {
            System.out.println("Введённые данные не являются числом!!! " + str );
            System.exit(0);
        }
        str=String.valueOf(JOptionPane.showInputDialog("Введите коэф. B"));
        if (str.matches("(-|\\+)?[0-9]+(\\.[0-9]+)?")) {
            this.b=Double.parseDouble(str);
        }
        else {
            System.out.println("Введённые данные не являются числом!!! " + str );
            System.exit(0);
        }
        str=String.valueOf(JOptionPane.showInputDialog("Введите коэф. C"));
        if (str.matches("(-|\\+)?[0-9]+(\\.[0-9]+)?")) {
            this.c=Double.parseDouble(str);
        }
        else {
            System.out.println("Введённые данные не являются числом!!! " + str );
            System.exit(0);
        }

           }
}
