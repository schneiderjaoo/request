package com.request.api.modelTest;

import com.request.api.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    public void testCreateUser() {
        User u1 = User.createUser("Teste", "abc");

        assertTrue(u1.getId() > 0);
        assertEquals("Teste", u1.getName());
        assertEquals("abc", u1.getPassword());
    }
}
