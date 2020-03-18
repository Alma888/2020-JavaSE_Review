//方法重载举例
public class MethodOverloading {

    private void receive(int i) {
        System.out.println("收到一个整型数据："+ i);
    }
    private void receive(double i) {
        System.out.println("收到一个double类型的数据："+i);
    }
    private void receive(String s) {
        System.out.println("收到一个字符串："+s);
    }
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.receive(666);
        m.receive(3.3);
        m.receive("方法重载！");
    }

}
