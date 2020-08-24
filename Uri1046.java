import java.util.Scanner;
    public class Main{
        public static void main (String arg[]){
            Scanner teclado = new Scanner (System.in);

            int HI,HF,DuracaoJogo;

        
            HI = teclado.nextInt();
            HF = teclado.nextInt();
            
            DuracaoJogo = HF - HI;

            if (DuracaoJogo <= 0){
               DuracaoJogo =  DuracaoJogo + 24;
            }
                System.out.println("O JOGO DUROU " + DuracaoJogo + " HORA(S)") ;
            

        }


    }