package finalproject.javaapichallenge.domain.repository;

import finalproject.javaapichallenge.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
