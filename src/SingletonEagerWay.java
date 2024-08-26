public class SingletonEagerWay {

    // Eager way
    private static SingletonEagerWay singleton = new SingletonEagerWay();

    public static SingletonEagerWay getSingletonEagerWay(){
        return singleton;
    }
}
