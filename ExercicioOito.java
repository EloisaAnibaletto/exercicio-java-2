import java.util.Scanner;
public class ExercicioOito {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner (System.in);

            int num = 0;
            int fatorial = 1;

            System.out.println("Digite um número");
            num = scanner.nextInt();

            if(num >= 0){
                for(int i=1; i<=num; i++){
                    fatorial = fatorial * i;
                }
                System.out.println("Fatorial é =" +fatorial);
            }else{
                System.out.println("Informe números a partir de zero! ");
            }
            scanner.close();
        }catch(Exception e){
            System.out.println("Falha :" +e.getMessage());
        }
    }
}
