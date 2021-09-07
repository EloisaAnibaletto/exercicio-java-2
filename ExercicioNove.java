import java.util.Scanner;
public class ExercicioNove {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner (System.in);

            double altura = 0.00;
            double peso = 0.00;

            System.out.println("Digite a altura");
            altura = scanner.nextDouble();
            System.out.println("Digite o peso");
            peso = scanner.nextDouble();

            double imc = peso / (altura *altura);

            if(imc < 18.5){
                System.out.println("Abaixo do peso.");
            }else{
                if((imc >= 18.6) && (imc <=24.9)){
                    System.out.println("Peso ideal.");
                }else{
                    if((imc >= 25) && (imc <= 29.9)){
                        System.out.println("Levemente acima do peso.");
                    }else{
                        if((imc >= 30) && (imc <= 34.9)){
                            System.out.println("Obesidade Grau I.");
                        }else{
                            if((imc >= 35) && (imc <= 39.9)){
                                System.out.println("Obesidade Grau II.");
                            }else{
                                if(imc >= 40){
                                    System.out.println("Obesidade Grau III (mórbida)");
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Seu IMC é:" +imc);
            scanner.close();
        }catch(Exception e){
            System.out.println("Falha :" +e.getMessage());
        }
    }
    
}
