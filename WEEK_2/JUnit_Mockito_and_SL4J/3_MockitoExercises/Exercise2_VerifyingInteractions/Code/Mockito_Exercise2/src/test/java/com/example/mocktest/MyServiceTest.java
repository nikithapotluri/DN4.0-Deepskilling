package com.example.mocktest;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create service and call the method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify the method was called
        verify(mockApi).getData();
    }
}
