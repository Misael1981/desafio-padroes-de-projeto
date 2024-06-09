package one.digitalinovation.gof.singleton;

/**
 * Singleton "Apressada"
 * 
 * @author Misael1981
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getIntancia() {
        return instancia;
    }

}
