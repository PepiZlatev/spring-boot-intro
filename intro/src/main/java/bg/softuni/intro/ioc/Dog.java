package bg.softuni.intro.ioc;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PostConstruct;

public class Dog implements Animal, BeanNameAware, DisposableBean {

    private final boolean superDog;

    public Dog() {
        this(false);
    }

    public Dog(boolean superDog) {
        this.superDog = superDog;
    }

    @Override
    public void makeNoise() {
        if (superDog) {
            System.out.println("SUPER bark-bark");
        } else {
            System.out.println("bark-bark");
        }
    }

    //@PostConstruct  + @PreDestroy preferred in front of Interfaces or custom @Bean construct/destroy,
    // as this annotations give us more freedom
    @PostConstruct
    public void afterInit() {
        System.out.println("Dog ist ready to byte!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Name: " + name);
    }

    //The @Beans (dogs in our case) are destroyed when the app shuts down
    @Override
    public void destroy() throws Exception {
        System.out.println("Dog is about to die...Bye-bye!");
    }
}
