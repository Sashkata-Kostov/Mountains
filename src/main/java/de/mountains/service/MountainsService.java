package de.mountains.service;

import de.mountains.model.Mountain;

import java.util.List;

public interface MountainsService {

    List<Mountain> getMountainsBetween(int minHeight, int maxHeight);
    boolean saveMountain(Mountain mountain);
}
