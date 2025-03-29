package com.quanghuyabc9.rest.service;

import com.quanghuyabc9.jpa.entity.Coffee;
import com.quanghuyabc9.jpa.repository.CafeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CafeResourceTest
{
    @Mock
    CafeRepository cafeRepository;
    @InjectMocks
    CafeResource cafeResource;

    @Test
    public void testFindCoffee()
    {
        Coffee coffee = initCoffee();
        Mockito.when(cafeRepository.findById(Mockito.any())).thenReturn(Optional.of(coffee));

        assertEquals(coffee, cafeResource.findCoffee(6L));
    }

    private Coffee initCoffee()
    {
        Coffee coffee = new Coffee();
        coffee.setId(6L);
        coffee.setName("Coffee-A");
        coffee.setPrice("2.86");
        return coffee;
    }
}
