public class NameSimpleFactory implements NameFactory {
    
   
    @Override
    public Name createName(String name) {
        String[] namesplt = name.split(" ");
        String first_name = namesplt[0];
        String last_name = namesplt[1];
       return new NameSimple(first_name, last_name);
    }
    
}