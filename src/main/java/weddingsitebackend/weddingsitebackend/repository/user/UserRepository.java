package weddingsitebackend.weddingsitebackend.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import weddingsitebackend.weddingsitebackend.models.users.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    //    Optional<User> findByUsernameOrEmail(String username, String email);
    Boolean existsByUsername(String username);

}