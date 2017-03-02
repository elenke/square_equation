/**
 * Created by admin on 22.02.2017.
 */
public class Main {

    public static void main( String[] args )
    {   Calculation calc = new Calculation();
        Сoefficient koef = new Сoefficient();
        double[] res = new double[3];

        koef.inputСoefficient();
        res=koef.getСoefficient();
        double a = res[0];
        double b = res[1];
        double c=res[2];

        double d;
        double x;
        d =calc.calculateDiscriminant(a,b,c);

        if (a==0) {
            if (b == 0) {
                System.out.println("Input data is incorrect  а=" + a + " b=" + b);
                System.exit(0);
            } else {
                x = -c / b;
                System.out.println("It is a linear equation. Х= " + x);
                System.exit(0);
            }
        }

        if (d>=0)
        {
            System.out.println( "Discriminant= " + d );
            calc.getAnswer(a,b,c);
            System.out.println( "Х1= " + calc.Res[0] );
            System.out.println( "Х2= " + calc.Res[1] );
        }
        else
        {
            System.out.println( "Discriminant is negative =" + d + " Roots are complex! "  );

        }

    }
}
