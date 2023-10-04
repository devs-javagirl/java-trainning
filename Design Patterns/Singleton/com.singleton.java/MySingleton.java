public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton() {
    }

    public static synchronized MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }

        return instance;
    }
}
