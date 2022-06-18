package bg.softuni.intro.cats;

import bg.softuni.intro.cats.models.dto.CreateOwnerDTO;
import bg.softuni.intro.cats.services.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Demo implements CommandLineRunner {

    private OwnerService ownerService;

    public Demo(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        ownerService.createOwner(new CreateOwnerDTO().setOwnerName("Peter").setCatNames(List.of("Max", "George")));
    }
}
