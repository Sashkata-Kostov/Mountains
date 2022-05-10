package de.mountains.repository;

import de.mountains.model.Mountain;

import java.util.List;

public interface MountainsRepository {

    boolean save(Mountain mountain);
    List<Mountain> loadAll();

}
