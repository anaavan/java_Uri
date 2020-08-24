import java.util.Scanner;
    public class Uri1064{
        public static void main (String arg[]){
            Scanner teclado = new Scanner (System.in);
            
            float num;
            int positivos=0;
            float total=0;
            float media=0;

            for ( int cont=1; cont<=6 ; cont++){
                num = teclado.nextFloat();
                
                if ( num > 0){
                    positivos++;
                    total = total + num;
                    
                }

            }
            
            media = total / positivos;

            System.out.println(positivos+" valores positivos");
            System.out.printf("%.1f\n",media);



        }



    }