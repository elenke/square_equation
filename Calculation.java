/**
 * Created by admin on 22.02.2017.
 */
public class Calculation{
    double[] Res = new double[2];

   /* где D = b2 - 4ac — дискриминант многочлена ax2 + bx + c.
    Если D > 0, то уравнение имеет два различных вещественных корня.
    Если D = 0, то оба корня вещественны и равны.
    Если D < 0, то оба корня являются комплексными числами.
    */
   public double  calculateDiscriminant(double a,double b,double c) {
       double res=b*b-4*a*c;
       return res;
   }
   public void getAnswer (double a, double b, double c){
       /* если а=0 х=-с\b  иначе*/
       Res[0]=(-b+ Math.sqrt(b*b-4*a*c))/(2*a);
       Res[1]=(-b- Math.sqrt(b*b-4*a*c))/(2*a);

   }

}
