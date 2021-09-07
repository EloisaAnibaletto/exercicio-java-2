import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner (System.in);
            int nota1 = 0;
            int nota2 = 0;
            int nota3 = 0;

            System.out.println("Digite uma nota");
            nota1 = scanner.nextInt();
            System.out.println("Digite outra nota");
            nota2 = scanner.nextInt();
            System.out.println("Digite outra nota");
            nota3 = scanner.nextInt();

            while(( nota1 <= -1) || (nota2 <= -1) || (nota3 <= -1)){
                System.out.println("Alguma nota esta errada!");
                System.exit(0);
            }

            int media = (nota1 + nota2 + nota3) / 3;

            System.out.println("Média das notas:");
            System.out.println(media);
            
            if (media >= 7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
            scanner.close();
        }catch(Exception e){
            System.out.println("Falha :" +e.getMessage());
        }
    }
}
        