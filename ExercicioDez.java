import java.util.Scanner;
public class ExercicioDez {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner (System.in);

            int num1 = 0;
            int num2 = 0;
            int escolha = 0;

            System.out.println("Digite um número");
            num1 = scanner.nextInt();
            System.out.println("Digite outro número");
            num2 = scanner.nextInt();
            System.out.println("Escolha a opção de calculo 1 para somar, 2 para subtrair, 3 para multiplicar ou 4 para dividir:");
            escolha = scanner.nextInt();

            if(escolha == 1){
            int somar = num1 + num2;
            System.out.println("A soma dos números é:"+somar);
            }else{
                if(escolha == 2){
                    int sub = num1 - num2;
                    System.out.println("A subtração dos números é:"+sub);
                }else{
                    if(escolha == 3){
                        int multi = num1 * num2;
                        System.out.println("A multiplicação dos números é:"+multi);
                    }else{
                        if(escolha == 4){
                            int divisao1 = num1 / num2;
                            int divisao2 = num2 / num1;
                            System.out.println("A divisão do primeiro número pelo segundo é:"+divisao1);
                            System.out.println("A divisão do segundo número pelo primeiro é:"+divisao2);
                        }
                    }
                }
            }
            scanner.close();
        }catch(Exception e){
            System.out.println("Falha :" +e.getMessage());
        }
    }
}
