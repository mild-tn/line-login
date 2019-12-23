package project.linelogin.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import project.linelogin.models.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Integer>{
    User findByUsername(String username);
}
