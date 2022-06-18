package bg.softuni.intro.cats.services;

import bg.softuni.intro.cats.models.dto.CreateOwnerDTO;

public interface OwnerService {
    void createOwner(CreateOwnerDTO createOwnerDTO);
}
