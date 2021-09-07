import java.util.Scanner;
public class ExercicioCinco {
    public static void main(String[] args){
        try{
        Scanner scanner = new Scanner (System.in);
        String palavra = "";

        System.out.println("Digite uma palavra");
        palavra = scanner.next();

        for(char i=0; i<palavra.length(); i++){
            System.out.println(palavra.charAt(i));
        }
        scanner.close();
        }catch (Exception e){
            System.out.println("Falha :" +e.getMessage());
        }
    }
}
