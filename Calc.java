/**
 * Created by admin on 22.02.2017.
 */
public class Calc {
    /*double a1,b1,c1;
    a1 = 5; // в переменную a присвоили значение 5
    b1=3;
    c1=7;
   /* где D = b2 - 4ac — дискриминант многочлена ax2 + bx + c.
    Если D > 0, то уравнение имеет два различных вещественных корня.
    Если D = 0, то оба корня вещественны и равны.
    Если D < 0, то оба корня являются комплексными числами.
    */
   public double desc(double a,double b,double c) {
       double Res=b*b-4*a*c;
       return Res;
   }
   public double[] answer (double a, double b, double c){
       double[] Res = new double[2];
       /* если а=0 х=-с\b  иначе*/
       Res[0]=(-b+ Math.sqrt(b*b-4*a*c))/(2*a);
       Res[1]=(-b- Math.sqrt(b*b-4*a*c))/(2*a);
       return Res;
   }

}
