package singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * @author mrLv
 * @date
 */
public class Singleton01 {

    /**
     * 定义一个静态的实例，确保单例模式中有实例
     * */
    private static final Singleton01 INSTANCE = new Singleton01();

    /**
     * 定义一个私有的构造方法
     * */
    private Singleton01(){}

    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public void singleton(){
        System.out.println("singleton");
    }

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        Singleton01 singleton02 = Singleton01.getInstance();
        System.out.println(singleton01 == singleton02);
    }
}
