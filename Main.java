/**
 * Created by admin on 22.02.2017.
 */
public class Main {

    public static void main( String[] args )
    {   Calc calc = new Calc();
        Koef koef = new Koef();
        koef.input();
        double a = koef.a;
        double b = koef.b;
        double c=koef.c;

        double res;
        double x;
        res =calc.desc(a,b,c);

        if (a==0) {
            if (b == 0) {
                System.out.println("Неверные входные данные а=" + a + " b=" + b);
                System.exit(0);
            } else {
                x = -c / b;
                System.out.println("Это линейное уравнение. Х= " + x);
                System.exit(0);
            }
        }

        if (res>=0)
        {
            System.out.println( "Дескриминант= " + res );
            System.out.println( "Х1= " + calc.answer(a,b,c)[0] );
            System.out.println( "Х2= " + calc.answer(a,b,c)[1] );
        }
        else
        {
            System.out.println( "Дескриминант отрицательный =" + res + " Корни комплексные! "  );

        }

    }
}
