package project.linelogin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import project.linelogin.models.User;
import project.linelogin.repositories.UserRepository;

@Service
public class UserService {

    @Qualifier("userRepository")
    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username){
        return this.userRepository.findByUsername(username);
    }
}
