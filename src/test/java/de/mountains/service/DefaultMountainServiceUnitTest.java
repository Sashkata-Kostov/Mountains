package de.mountains.service;

import de.mountains.repository.impl.DefaultMountainsRepository;
import de.mountains.service.impl.DefaultMountainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultMountainServiceUnitTest {

    @Mock
    private DefaultMountainsRepository repository;
    @InjectMocks
    private DefaultMountainService service;

    @Test(expected = IllegalArgumentException.class)
    public void minHeightGreaterThanMaxHeight() {
        service.getMountainsBetween(100, 50);
    }

}
