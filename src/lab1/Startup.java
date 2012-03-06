package lab1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        PetOwner owner = (PetOwner) ctx.getBean("owner");
        
        String petName = owner.getPet().getName();
        int realAge = owner.getPet().getRealAge();
        int adjAge = owner.getPet().getAgeInAnimalYears();
        
        System.out.println("The pet named " + petName + " owned by " + owner.getName() +
                " is really " + realAge + " years old, but acts like an animal that is " + adjAge);
    }

}
