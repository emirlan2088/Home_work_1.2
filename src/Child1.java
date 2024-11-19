public class Child1 extends Parent implements Printable{
    private String hobby;
    public Child1(int age, String hobby) {
        super(age);
        this.hobby = hobby;

    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public void print() {
        System.out.println("Hobby: " + hobby + " Age: "+ getAge());
    }
}
