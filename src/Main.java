public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];

        objects[0] = createObject("Child1");
        objects[1] = createObject("Child2");
        objects[2] = createObject("Child3");

        for(Printable obj: objects){
            obj.print();
        }
    }
    public static Printable createObject(String className){
        switch (className) {
            case "Child1":
                return new Child1(14,"Football");
            case "Child2":
                return new Child2(17, "Alice");
            case "Child3":
                return new Child3(11, "1.5 m");
            default:
                System.out.println("Unknown class name: " + className);
        }
        return null;
    }
}