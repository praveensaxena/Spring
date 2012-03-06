package lab1;

/**
 *
 * @author jlombardo
 */
public class PetOwner {
    private String name;
    private Pet pet;

    public PetOwner(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "PetOwner{" + "name=" + name + ", pet=" + pet.toString() + '}';
    }
    
    
}
