
// Following Telusko @https://www.youtube.com/watch?v=YbqneqDIZh8

class Human {
    private int age = 22;
    private String name = "Kagiso";

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

}

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        int age = human.getAge();
        String name = human.getName();
        System.out.println(name + " : " + age);

    }
}