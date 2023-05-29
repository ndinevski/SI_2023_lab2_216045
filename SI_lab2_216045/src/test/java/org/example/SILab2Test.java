package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    User user1 = new User("Nikola", "dinevski!123", "n@s.c");
    User user2 = new User("Ana", "as d ", "an@.s");
    User user3 = new User("Nikola", "dinevski123", "n@s.c");
    User user4 = new User("Nikola", "dinevski 123", "n@s.c");
    List<User> userList = new ArrayList<>();

    @BeforeAll
    static void startTest(){
        System.out.println("Start Testing");
    }

    @AfterAll
    static void endTest(){
        System.out.println("End Testing");
    }

    @Test
    void everyBranchTest() {
        System.out.println("Running EVERY BRANCH test!");
        // User is null
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // Null name
        User userWithNullName = new User(null, "asd", "asd");
        assertFalse(SILab2.function(userWithNullName, userList));

        // user1, not included in list with same name or email, and user2 in list
        userList.add(user2);
        assertTrue(SILab2.function(user1, userList));

        // user4, user4 included in list with same name and email, and user2 in list
        userList.add(user4);
        assertFalse(SILab2.function(user4, userList));

        // user3, user3 included in list with same name and email, and user2 in list
        userList.remove(user4);
        userList.add(user3);
        assertFalse(SILab2.function(user3, userList));

        userList.clear();
    }

    @Test
    void multipleConditionTest(){
        System.out.println("Running MULTIPLE CONDITION test!");

        // if (user==null || user.getPassword()==null || user.getEmail()==null)
        RuntimeException ex;

        // T || X || X
        User user1 = null;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user1, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // F || T || X
        User user2 = new User("Nikola", null, "anything");
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user2, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // F || F || T
        User user3 = new User("Nikola", "password123", null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user3, userList));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        // F || F || F
        User user4 = new User("Nikola", "password123", "nd@y.com");
        assertFalse(SILab2.function(user4, userList));


    }
}