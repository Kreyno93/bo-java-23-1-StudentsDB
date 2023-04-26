package de.neuefische.model;

import java.util.Objects;

public class ComputerScienceStudent extends Student{
   private boolean hasNotebook;

    public ComputerScienceStudent(String name, int id, boolean hasNotebook) {
        super(name, id);
        this.hasNotebook = hasNotebook;
    }

    public ComputerScienceStudent() {
    }

    public boolean isHasNotebook() {
        return hasNotebook;
    }

    public void setHasNotebook(boolean hasNotebook) {
        this.hasNotebook = hasNotebook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return hasNotebook == that.hasNotebook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasNotebook);
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "hasNotebook=" + hasNotebook +
                "} " + super.toString();
    }

}
