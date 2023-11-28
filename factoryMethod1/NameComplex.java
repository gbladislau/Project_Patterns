public class NameComplex implements Name {
    private String first_name;
    private String last_name;

    public NameComplex(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
    @Override
    public void print() {
        System.out.println(this.first_name + " " +   this.last_name);
    }
    
}