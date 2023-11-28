
public class App {
    public static void main(String[] args) throws Exception {
        //cria a fábrica
        InfoFactory factory = new InfoFactory();
        // cria o objeto Info por meio da factory InfoFactory, que retorna InfoConfidential ou InfoPublic,
        // dependendo se a senha estiver correta.
        Info info = factory.createInfo(args[0]);
        //chama o método de Info que imprime na tela a mensagem
        info.printFile();
        
    }
}

/**
 *  PADRÃO DE PROJETO: FACTORY METHOD
 * No exercício foi pedido que dada uma senha passada pelo usuário, caso essa senha fosse "designpatterns", deveria ser mostrada uma 
 * mensagem lida de um arquivo confidencial, caso contrario uma mensagem lida de um arquivo público.
 * Para isso utilizei uma interface Info que possui um método que
 * imprime a mensagem do arquivo e duas classes que implementam essa interface: InfoConfidential e InfoPublic
 * Ao invés da factory ser uma interface, usei uma forma de factory method um pouco diferente do execício anterior, optando por
 * uma classe InfoFactory, que dada uma entrada (senha), verifica se a senha é correta ou não, e lê o arquivo correspondente. Ou seja, 
 * a verificação se a senha está certa não ocorre na Main e sim na própria factory. 
 * Os arquivos estão como documentos texto, publico.txt e confidencial.txt. 
 */