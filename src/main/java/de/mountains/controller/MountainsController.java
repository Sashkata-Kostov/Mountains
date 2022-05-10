package de.mountains.controller;

import de.mountains.model.Mountain;
import de.mountains.service.MountainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MountainsController {

    @Autowired
    private MountainsService mountainsService;

    @GetMapping(path = "getmountainsbetween")
    public List<Mountain> getMountainsBetween(@RequestParam int minHeight,
                                              @RequestParam int maxHeight){
        return mountainsService.getMountainsBetween(minHeight, maxHeight);
    }

    @PostMapping(path = "save")
    public void saveMountain(@RequestBody Mountain mountain) {
        mountainsService.saveMountain(mountain);
    }
}
