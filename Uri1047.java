import java.util.Scanner;
    public class Uri1047{
        public static void main (String arg[]){
            Scanner teclado = new Scanner (System.in);

            int HI,HF,MI,MF,Du,CI,CF,DuM,DuH;

        
            HI = teclado.nextInt();
            HF = teclado.nextInt();
            MI = teclado.nextInt();
            MF = teclado.nextInt();
            
            CI = HI * 60 + MI;
            CF = HF * 60 + MF;

            Du = CF - CI ;

            if (Du <= 0){
               Du =  Du + 24*60;
            }
            DuH = Du/60;
            DuM = Du%60;

            System.out.println("O JOGO DUROU "+ DuH +" HORA(S) E "+DuM+" MINUTO(S)");
            

        }


    }