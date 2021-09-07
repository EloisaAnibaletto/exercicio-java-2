import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner (System.in);
            int mes = 0;

            do{
            System.out.println("Digite um número");
            System.out.println("Se desejar sair digite 13");
            mes = scanner.nextInt();
            
                switch (mes) {
                    case 1:{
                        System.out.println("Número 1 representa mês Janeiro");
                        break;
                    }
                    case 2:{
                        System.out.println("Número 2 representa mês Fevereiro");
                        break;
                    }
                    case 3:{
                        System.out.println("Número 3 representa mês Março");
                        break;
                    }
                    case 4:{
                        System.out.println("Número 4 representa mês Abril");
                        break;
                    }
                    case 5:{
                        System.out.println("Número 5 representa mês Maio");
                        break;
                    }
                    case 6:{
                        System.out.println("Número 6 representa mês Junho");
                        break;
                    }
                    case 7:{
                        System.out.println("Número 7 representa mês Julho");
                        break;
                    }
                    case 8:{
                        System.out.println("Número 8 representa mês Agosto");
                        break;
                    }
                    case 9:{
                        System.out.println("Número 9 representa mês Setembro");
                        break;
                    }
                    case 10:{
                        System.out.println("Número 10 representa mês Outubro");
                        break;
                    }
                    case 11:{
                        System.out.println("Número 11 representa mês Novembro");
                        break;
                    }
                    case 12:{
                        System.out.println("Número 12 representa mês Dezembro");
                        break;
                    }
                    case 13:{
                        System.out.println("Obrigada por usar o programa!");
                        break;
                    }
                    default : {
                        System.out.println("Escolha Inválida!");
                        break;
                    }
                }
            }while(mes != 13);   
            scanner.close();
            }catch(Exception e){
                System.out.println("Falha :" +e.getMessage());
        }
    }
}
