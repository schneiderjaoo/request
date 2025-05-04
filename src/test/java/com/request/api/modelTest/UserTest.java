package com.request.api.modelTest;

import com.request.api.model.User;
import com.request.api.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        try {
            User u1 = User.createUser("Teste", "abc");
            User saveUser = userRepository.save(u1);

            assertNotNull(saveUser.getId());
            assertEquals("Teste", u1.getName());
            assertEquals("abc", u1.getPassword());
        } catch (Exception e ) {
            System.err.println("Error: "+e.getMessage());
        }
    }
}
