public interface MyInterface {
     void run();
}

class Dog implements MyInterface{

    @Override
    public void run() {
        System.out.println("蹦跳！！！");
    }
}