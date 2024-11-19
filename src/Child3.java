public class Child3 extends Parent implements Printable{
    private String height;

    public String getHeight() {
        return height;
    }

    public Child3(int age, String height) {
        super(age);
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Height: " + height + " Age: " + getAge());
    }
}
