package de.mountains.model;

import java.util.Objects;

public class Mountain {

    private String id;
    private String name;
    private int height;

    public Mountain() {}

    public Mountain(String id, String name, int height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mountain mountain = (Mountain) o;
        return id.equals(mountain.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
