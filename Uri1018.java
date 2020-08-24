import java.util.Scanner;
    public class Uri1018{
        public static void main(String arg[]){
            Scanner teclado = new Scanner (System.in);

             int ValorLido;
             int R;
             int q100;
             int q50;
             int q20;
             int q10;
             int q5;
             int q2;
             int q1;

             ValorLido = teclado.nextInt();

             q100 =  ValorLido / 100;
             R = ValorLido % 100;

             q50 = R / 50;
             R = R % 50;

             q20 = R / 20;
             R = R % 20;

             q10 = R / 10;
             R = R % 10;

             q5 = R / 5;
             R = R % 5;

             q2 = R / 2;         

             q1 = R % 2;
             

            System.out.println(ValorLido);
            System.out.println(q100 + " nota(s) de R$ 100,00" );
            System.out.println(q50 + " nota(s) de R$ 50,00" );
            System.out.println(q20 + " nota(s) de R$ 20,00" );
            System.out.println(q10 + " nota(s) de R$ 10,00" );
            System.out.println(q5 + " nota(s) de R$ 5,00" );
            System.out.println(q2 + " nota(s) de R$ 2,00" );
            System.out.println(q1 + " nota(s) de R$ 1,00" );


        }
        



    }
