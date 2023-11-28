package decorator1.src;
public class App {
    public static void main(String[] args) throws Exception {
        Componente c;

        /**
         * Componente é a interface comum a todos, decoradores e objetos
         *
         * Componente Concreto a classe do objeto q está sendo decorado e é tbm quem define a função a ser exercutada
         *
         * Interceptador1 é o decorador cronômetro cronometra e printa o tempo de execução do programa
         * 
         * Interceptador2 é o decorador log que imprime a hora e data antes da execução da função
         * 
         * Interceptador3 é o decorador condicional que para o programa caso o horário do sistema tenha minuto par
         */

        c = new Interceptador2(new Interceptador3(new Interceptador1(new ComponenteConcreto())));

        /**
         * Nessa situação o padrão Decorator está sendo utilizado para que a função a ser executada compra o padrão exigido 
         * pelo sistema e apresente os condicionais necessários na ordem em que foi pedido
         */

        c.executarTarefa();
        
    }
}
