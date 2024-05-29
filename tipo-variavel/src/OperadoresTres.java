public class OperadoresTres {

    public static void main(String[] args) {
        String nomeUm = "nicole";
        String nomeDois = new String("nicole");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condicao é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroNois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroNois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroNois?" + simNao);

    }

}
