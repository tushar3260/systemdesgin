package desginPattern.creational;

abstract class WashingMachine {

    // common method
    abstract void wash();
}


// Samsung machine
class Samsung extends WashingMachine {

    @Override
    void wash() {
        System.out.println("Samsung normal wash");
    }

    void strongWash() {
        System.out.println("Samsung strong wash mode");
    }
}


// LG machine
class LG extends WashingMachine {

    @Override
    void wash() {
        System.out.println("LG normal wash");
    }

    void turboWash() {
        System.out.println("LG turbo wash mode");
    }
}


// Factory class
class WashingMachineFactory {

    public static WashingMachine getMachine(String brand) {

        if (brand.equalsIgnoreCase("Samsung")) {
            return new Samsung();
        } 
        else if (brand.equalsIgnoreCase("LG")) {
            return new LG();
        } 
        else {
            System.out.println("Invalid brand");
            return null;
        }
    }
}


// Main class
public class FactoryPattern {

    public static void main(String[] args) {

        // Factory creates Samsung object
        WashingMachine wm1 = WashingMachineFactory.getMachine("Samsung");
        wm1.wash();

        // Access Samsung special feature
        if (wm1 instanceof Samsung) {
            Samsung s = (Samsung) wm1;
            s.strongWash();
        }

        System.out.println();

        // Factory creates LG object
        WashingMachine wm2 = WashingMachineFactory.getMachine("LG");
        wm2.wash();

        // Access LG special feature
        if (wm2 instanceof LG) {
            LG l = (LG) wm2;
            l.turboWash();
        }
    }
}