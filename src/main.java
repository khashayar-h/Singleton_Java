public class main {

    public static void main(String[] args) {
        System.out.println(SimpleSingleton.getInstance());
        SimpleSingleton sym1 = SimpleSingleton.getInstance();
        SimpleSingleton sym2 = SimpleSingleton.getInstance();
        System.out.println(sym1);
        System.out.println(sym2);
    }

}
