package usermanagement.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void test_hashcode() {
        User user = new User();

        assertEquals(31, user.hashCode(), 1e-6);
        
        user.setUserId(456);
        assertEquals(487, user.hashCode(), 1e-6);
    }
}
