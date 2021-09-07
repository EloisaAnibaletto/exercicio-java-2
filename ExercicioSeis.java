public class ExercicioSeis {
    public static void main(String[] args){
        //Nesse trabalho não coloquei tratativa de erro porque como não tem entrada de dados do usuario achei que não era necessario
        //porém não tenho certeza se esta certo...
            int soma = 0;
            
            for(int i = 1; i <= 500; i++){
                if(i % 2 != 0 && i % 7 ==0){
                    soma += i;
                }
            }
            System.out.println("A soma de todos os números ímpares múltiplos de 7 são:" + soma);
    }
}
