//类和对象的举例

class Rabbit {
    int age;
    String name;

    public Rabbit() {
    }

    public Rabbit(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //跑的方法
    public void run() {
        System.out.println("兔子蹦跳！");
    }
}
public class RabbitTest{
    public static void main(String[] args) {
        Rabbit rabbit1=new Rabbit();  //用无参的构造器创建对象
        Rabbit rabbit2=new Rabbit(3,"小白兔"); //用有参的构造器创建对象
        System.out.println(rabbit2.name);
        rabbit2.run();
    }
}
