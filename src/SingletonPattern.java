public class SingletonPattern {

    private static SingletonPattern singletonpattern;

    // Private Constructor
    private SingletonPattern(){}

    // LAZY INITIALIZATION and Synchronizd is used so that in multi threaded enviroment only single thread can access this code
    public  static SingletonPattern getSingletonPattern(){
        if(singletonpattern == null){
        synchronized (SingletonPattern.class){
// Synchronized Way
                singletonpattern = new SingletonPattern();
            }
        }
        return singletonpattern;
    }
}
