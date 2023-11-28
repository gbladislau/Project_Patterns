package decorator2.src;
public class App {
    public static void main(String[] args) throws Exception {
        Componente c;

        /**
         * Componente é a interface comum a todos, decoradores e objetos
         *
         * NumeroUm a classe do objeto q está sendo decorado e é tbm quem define a função a ser exercutada
         *
         * Interceptador_Colchete é o decorador que printa o colchete antes e depois da execução da função
         * 
         * Interceptador_Chave é o decorador que printa uma chave antes e depois da execução da função
         * 
         * Interceptador_Parenteses é o decorador que printa um parênteses antes e depois da execução da função
         */

        c =  new Interceptador_Colchete(new Interceptador_Chave(new Interceptador_Parenteses(new Interceptador_Colchete(new NumeroUm()))));

        /**
         * Nessa situação o padrão Decorator está sendo utilizado para demostrar as possibilidades de uso do padrão
         * uma vez que o padrão Decorator serve como um envoltório que envolve a função principal e não necessariamente apresenta uma ordem de execução entre si
         */

        c.imprimir();
        System.out.println("");
    }
}
