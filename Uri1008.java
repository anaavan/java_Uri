import java.util.Scanner;
    public class Uri1008{
        public static void main(String arg[]){
            Scanner teclado = new Scanner (System.in);

            int NumeroFun;
            int HoraTraba;
            float ValorHora;
            float Salario;

            NumeroFun = teclado.nextInt();
            HoraTraba = teclado.nextInt();
            ValorHora = teclado.nextFloat();
           

            Salario = HoraTraba * ValorHora;

            System.out.println("NUMBER = " + NumeroFun);
            System.out.printf("SALARY = U$ %.2f\n", Salario);







        }

    }