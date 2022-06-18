package bg.softuni.intro.cats.repositories;

import bg.softuni.intro.cats.models.entities.CatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<CatEntity, Long> {
}
