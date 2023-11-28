public class NameComplexFactory implements NameFactory {

    @Override
    public Name createName(String name) {
        String[] namesplt = name.split(" ");
        String first_name = namesplt[1];
        String last_name = namesplt[0].substring(0, namesplt[0].length() - 1);
        return new NameComplex(first_name, last_name);
    }
    
}