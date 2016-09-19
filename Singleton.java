package a2;

public final class Singleton {
    private static final Singleton instance = new Singleton();
    private static final Singleton instance1 = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
    public static Singleton getInstance1() {
        return instance1;
    }
    
}
