package com.quanghuyabc9.rest.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HelloResourceTest
{
    @Spy
    HelloResource helloResource;

    @Test
    public void testHello()
    {
        assertEquals(helloResource.hello().text(), "Hello from Jakarta EE");
    }
}
