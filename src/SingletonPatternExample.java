public class SingletonPatternExample {
    public static void main(String[] args) {
        SingletonPattern s1 = SingletonPattern.getSingletonPattern();
        SingletonPattern s2 = SingletonPattern.getSingletonPattern();

        System.out.println(s1.hashCode() + " == " + s2.hashCode());
    }
}
