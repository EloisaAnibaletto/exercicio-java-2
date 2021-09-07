import java.util.Scanner;
public class ExercicioQuatro {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner (System.in);

            int num = 0;
            int TAM= 10;
            int conta = 0;
            
            System.out.println("Digite um número que deseja ver a tabuada");
            num = scanner.nextInt();

            for(int i=0; i<=TAM; i++){
                conta = num * i;
                System.out.println(+num+" * "+i+" = "+conta);
            }
            scanner.close();
            }catch(Exception e){
                System.out.println("Falha :" +e.getMessage());
        }
    }
}
