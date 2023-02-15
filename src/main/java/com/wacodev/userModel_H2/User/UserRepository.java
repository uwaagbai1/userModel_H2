package com.wacodev.userModel_H2.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Component
    public class DatabaseLoader implements CommandLineRunner {
        @Autowired
        private UserRepository userRepository;

        @Override
        public void run(String... args) throws Exception {
            User user1 = new User();
            user1.setUsername("alice");
            user1.setPassword("password1");
            userRepository.save(user1);

            User user2 = new User();
            user2.setUsername("bob");
            user2.setPassword("password2");
            userRepository.save(user2);
        }
    }

}
