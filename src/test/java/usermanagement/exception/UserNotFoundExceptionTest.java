package usermanagement.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserNotFoundExceptionTest {
    @Test
    public void test_exception_create()
    {
        UserNotFoundException eTest = new UserNotFoundException("message1", 123);

        assertEquals("message1", eTest.getMessage());
        assertEquals(123, eTest.getUserId(), 1e-6);
    }
}
