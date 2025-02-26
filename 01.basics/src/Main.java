
// Following Telusko @https://www.youtube.com/watch?v=YbqneqDIZh8

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int a) {age = a;}

    public String getName() {
        return name;
    }
    public void setName(String n) {name = n;}

}

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.setAge(22);
        human.setName("blaQPablo88");
        int age = human.getAge();
        String name = human.getName();
        System.out.println(name + " : " + age);

    }
}