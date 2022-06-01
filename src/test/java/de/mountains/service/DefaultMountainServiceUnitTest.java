package de.mountains.service;

import de.mountains.repository.impl.DefaultMountainsRepository;
import de.mountains.service.impl.DefaultMountainService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class DefaultMountainServiceUnitTest {

    @Mock
    private DefaultMountainsRepository repository;
    @InjectMocks
    private DefaultMountainService service;

    @Test
    public void whenMinHeightIsMoreThanMaxHeight_thenThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> service.getMountainsBetween(100, 50));
    }

}
