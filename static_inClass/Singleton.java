package static_inClass;

//静态内部类实现单例模式
public class Singleton {
    //声明为 private 避免调用默认构造方法创建对象
    private Singleton(){}

    //声明为 private 表明静态内部该类只能在该Singleton 类中被访问
    private static class SingletonHolder{
        private static final Singleton Instance=new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.Instance;
    }
}
