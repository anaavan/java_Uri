import java.util.Scanner;
    public class Uri1067{
        public static void main (String arg[]){
            Scanner teclado = new Scanner(System.in);

            int x;
            
            x = teclado.nextInt();

            for ( int i = 0 ; i <= x ; i = i + 2 ){
                System.out.println(i);
            }

            

        }

    }