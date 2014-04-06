package fr.devoxx.devops.jhipster.repository;

import fr.devoxx.devops.jhipster.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the User entity.
 */
public interface UserRepository extends JpaRepository<User, String> {

}
