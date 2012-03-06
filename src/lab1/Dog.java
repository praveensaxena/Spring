package lab1;

/**
 *
 * @author jlombardo
 */
public class Dog implements Pet {
    private String name;
    private int realAge;

    public Dog(String name, int realAge) {
        this.name = name;
        this.realAge = realAge;
    }

    @Override
    public int getAgeInAnimalYears() {
        return realAge * 6;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getRealAge() {
        return realAge;
    }

    @Override
    public void setRealAge(int realAge) {
        this.realAge = realAge;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", realAge=" + realAge + '}';
    }
    
    
}
