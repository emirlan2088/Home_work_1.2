public class Child2 extends Parent implements Printable{
    public String getName() {
        return name;
    }

    private String name;
    public Child2(int age, String name) {
        super(age);
        this.name = name;

    }

    @Override
    public void print() {
        System.out.println("Name: " + name + " Age: " + getAge());
    }
}
