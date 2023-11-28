public class App {
    public static void main(String[] args)  {
        //cria as fábricas para nomes simples e complexos
        NameSimpleFactory simpleFactory = new NameSimpleFactory();
        NameComplexFactory complexFactory = new NameComplexFactory();
        if (args.length == 0) {
            System.out.println("Argument missing");
            return;
        }
        //lê a entrada, identifica se é nome simples ou complexo e chama a fábrica correspondente
        for (String name : args) {

            String[] nameSplt = name.split(" ");
            if (nameSplt[0].substring(nameSplt[0].length() - 1).equals(",")) {
                
                Name namePrint = complexFactory.createName(name);
                namePrint.print();
            }
            else {
                Name namePrint = simpleFactory.createName(name);
                namePrint.print();
            }
        }    
    }
}


/*
 * PADRÃO DE PROJETO: FACTORY METHOD
 * No exercício foi pedido que fossem criadas duas aplicações de construção de nome, uma para cada formato. 
 * Os formatos podem ser "nome sobrenome" ou "sobrenome, nome". Para isso, implementei o factory method com 
 * duas classes (NameSimple e NameComplex) que implementam a interface Name, que possui um método que imprime o nome. 
 * Esses são os produtos. 
 * Também implementei a fábrica como uma interface chamada NameFactory, com um método de criar um nome. Essa interface é implementada por NameFactorySimple
 * e NameFactoryComplex. Assim, quando o usuário desejar criar um objeto Name, ele chamará a fábrica, que por sua vez,
 * criará o objeto name, sendo NameSimple ou NameComplex.
 * ENTRADA: "McNealy, Scott" "James Gosling" "Naughton, Patrick"
 * SAÍDA:   James Gosling
            Scott McNealy
            Patrick Naughton

 */
