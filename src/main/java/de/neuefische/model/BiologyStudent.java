package de.neuefische.model;

import java.util.Objects;

public class BiologyStudent extends Student{

    private boolean hasScalpel;

    public BiologyStudent(String name, int id, boolean hasScalpel) {
        super(name, id);
        this.hasScalpel = hasScalpel;
    }

    public BiologyStudent() {
    }

    public boolean isHasScalpel() {
        return hasScalpel;
    }

    public void setHasScalpel(boolean hasScalpel) {
        this.hasScalpel = hasScalpel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiologyStudent that = (BiologyStudent) o;
        return hasScalpel == that.hasScalpel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasScalpel);
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "hasScalpel=" + hasScalpel +
                "} " + super.toString();
    }
}
