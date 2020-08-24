import java.util.Scanner;
    public class Uri1043{
        public static void main (String arg[]){
            Scanner teclado = new Scanner (System.in);

            double A,B,C;
            double peri,area;

            A = teclado.nextDouble();
            B = teclado.nextDouble();
            C = teclado.nextDouble();

            if ( (A + B > C ) && (B + C > A) && (A + C > B) ){
                peri = A + B + C;
                System.out.printf("Perimetro = %.1f\n " , peri);
            }
            else {
                area = (A + B) * C / 2;
                System.out.printf("Area = %.1f\n " , area);
            }




        } 

    }