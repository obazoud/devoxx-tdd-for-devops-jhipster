package fr.devoxx.devops.jhipster.repository;

import fr.devoxx.devops.jhipster.domain.PersistentToken;
import fr.devoxx.devops.jhipster.domain.User;
import org.joda.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Spring Data JPA repository for the User entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {

    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);

}
