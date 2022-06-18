package bg.softuni.intro.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooService {

    private final Animal animal;

    //@Qualifier can be user more than once, so that more animals will doWork() and respectively makeSound();
    //@Qualifier or @Primary are rarely used. List<E> injection or a single injection are preferred
    public ZooService(@Qualifier("normalDog") Animal animal) {
        this.animal = animal;
    }

    public void doWork() {
        animal.makeNoise();
    }

   /* private final List<Animal> animals;

    public ZooService(List<Animal> animals) {
        this.animals = animals;
    }

    public void doWork() {
        this.animals.forEach(Animal::makeNoise);
    }*/
}


