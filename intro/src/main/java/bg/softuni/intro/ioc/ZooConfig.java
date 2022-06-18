package bg.softuni.intro.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ZooConfig {
    //By default, all @Bean initialisations is Type == EAGER
    @Bean("normalDog")
    public Animal dog() {
        return new Dog();
    }

    @Bean("mySuperDog")
    public Animal superDog() {
        // TODO: 18/06/2022 Add superpower
        return new Dog(true);
    }

    @Bean("cat")//The default name is the name of the method,
    // but as above we can change it, and it is still going go work
    public Cat cat() {
        return new Cat();
    }
}

//@Primary sets which @Bean should be prioritized.
//@Qualifier or @Primary are rarely used. List<E> injection or a single injection are preferred

//In case of a single call (in our case just one animal) the cat will be called and the
//dog won't be used.
//Dog can be used if we inject into the ZooService a List<Animal>

//More formally said - when we had a List<E>it doesn't matter which is @Primary
// annotated - all @Beans will be injected

//Example below from class ZooService:
    /*
    private final List<Animal> animals;

    public ZooService(List<Animal> animals) {
        this.animals = animals;
    }

    public void doWork() {
        this.animals.forEach(Animal::makeNoise);
    }
     */
//In this case both noises are printed
