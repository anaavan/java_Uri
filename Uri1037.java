import java.util.Scanner;
    public class Uri1037{
        public static void main(String arg[]){
            Scanner teclado = new Scanner (System.in);

                float valor;

                valor = teclado.nextFloat();

                if (0 <= valor && valor <= 25){
                    System.out.println("Intervalo [0,25]");
                }
                else if ( 25 < valor && valor <= 50 ){
                    System.out.println("Intervalo (25,50]");                
                    
                } else if ( 50 < valor && valor <= 75){
                    System.out.println("Intervalo (25,75]");

                }else if ( 75 < valor && valor <= 100){
                    System.out.println("Intervalo (75,100]");
            
                }else {
                        System.out.println("Fora de intervalo");
                    }
                   
         
            }

    }
    