package de.mountains.repository.impl;

import de.mountains.model.Mountain;
import de.mountains.repository.MountainsRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DefaultMountainsRepository implements MountainsRepository {

    private List<Mountain> mountains = new ArrayList<>();

    @Override
    public boolean save(Mountain mountain) {
        return mountains.add(mountain);
    }

    @Override
    public List<Mountain> loadAll() {
        return mountains;
    }
}
