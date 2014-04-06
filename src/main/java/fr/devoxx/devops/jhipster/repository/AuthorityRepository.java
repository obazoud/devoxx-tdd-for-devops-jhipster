package fr.devoxx.devops.jhipster.repository;

import fr.devoxx.devops.jhipster.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {

}
