public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person =new Person("John","Doe",20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("Lastname: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}