import javax.swing.*;

/**
 * Created by admin on 24.02.2017.
 */
public class Сoefficient {
    private double a; // Переменная экземпляра класса
    private double b;
    private double c;
    private String str;

    public void inputСoefficient() {
        str = String.valueOf(JOptionPane.showInputDialog("Enter coefficient А"));
        if (isValueNumber(str)) {
            this.a = Double.parseDouble(str);
        }
        str = String.valueOf(JOptionPane.showInputDialog("Enter coefficient B"));
        if (isValueNumber(str)) {
            this.b = Double.parseDouble(str);
        }
        str = String.valueOf(JOptionPane.showInputDialog("Enter coefficient C"));
        if (isValueNumber(str)) {
            this.c = Double.parseDouble(str);
        }
    }

    private boolean isValueNumber(String str) {
        if (str.matches("(-|\\+)?[0-9]+(\\.[0-9]+)?")) // + or - double
        {
          return true;
        }
        else {
            System.out.println("The entered data is not a number!!! " + str );
            System.exit(0);
            return false;

        }

    }

    public double[] getСoefficient() {
        double[] res = new double[3];
        res[0]=a;
        res[1]=b;
        res[2]=c;
        return res;
    }

}
