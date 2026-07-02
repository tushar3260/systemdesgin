package desginPattern.creational;
class viceChancelor {
    private static viceChancelor instance;
    private viceChancelor() {
    }

    public static viceChancelor getInstance() {
        if (instance == null) {
            instance = new viceChancelor();
        }
        return instance;
    }
    
}
public class Singleton {
    public static void main(String[] args) {
        viceChancelor vc1 = viceChancelor.getInstance();
        viceChancelor vc2 = viceChancelor.getInstance();

        if (vc1 == vc2) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Instances are different. Singleton pattern failed.");
        }
    }
}
