package de.mountains.service.impl;

import de.mountains.model.Mountain;
import de.mountains.repository.MountainsRepository;
import de.mountains.service.MountainsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultMountainService implements MountainsService {

    @Autowired
    private MountainsRepository mountainsRepository;

    @Override
    public List<Mountain> getMountainsBetween(int minHeight, int maxHeight) {
        List<Mountain> mountains = mountainsRepository.loadAll();
        return mountains.stream()
                .filter(m -> m.getHeight() >= minHeight)
                .filter(m -> m.getHeight() < maxHeight)
                .collect(Collectors.toList());
    }

    @Override
    public boolean saveMountain(Mountain mountain) {
        return mountainsRepository.save(mountain);
    }
}
