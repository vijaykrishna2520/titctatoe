package com.game.tictatoe.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Box implements Serializable {
    private int box11=-1;
    private int box12=-1;
    private int box13=-1;
    private int box21=-1;
    private int box22=-1;
    private int box23=-1;
    private int box32=-1;
    private int box33=-1;

    public Box() {
    }

    public Box(int box11, int box12, int box13, int box21, int box22, int box23, int box32, int box33) {
        this.box11 = box11;
        this.box12 = box12;
        this.box13 = box13;
        this.box21 = box21;
        this.box22 = box22;
        this.box23 = box23;
        this.box32 = box32;
        this.box33 = box33;
    }

    public int getBox11() {
        return box11;
    }

    public void setBox11(int box11) {
        this.box11 = box11;
    }

    public int getBox12() {
        return box12;
    }

    public void setBox12(int box12) {
        this.box12 = box12;
    }

    public int getBox13() {
        return box13;
    }

    public void setBox13(int box13) {
        this.box13 = box13;
    }

    public int getBox21() {
        return box21;
    }

    public void setBox21(int box21) {
        this.box21 = box21;
    }

    public int getBox22() {
        return box22;
    }

    public void setBox22(int box22) {
        this.box22 = box22;
    }

    public int getBox23() {
        return box23;
    }

    public void setBox23(int box23) {
        this.box23 = box23;
    }

    public int getBox32() {
        return box32;
    }

    public void setBox32(int box32) {
        this.box32 = box32;
    }

    public int getBox33() {
        return box33;
    }

    public void setBox33(int box33) {
        this.box33 = box33;
    }

    @Override
    public String toString() {
        return "Box{" +
                "box11=" + box11 +
                ", box12=" + box12 +
                ", box13=" + box13 +
                ", box21=" + box21 +
                ", box22=" + box22 +
                ", box23=" + box23 +
                ", box32=" + box32 +
                ", box33=" + box33 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box box)) return false;
        return getBox11() == box.getBox11() && getBox12() == box.getBox12() && getBox13() == box.getBox13() && getBox21() == box.getBox21() && getBox22() == box.getBox22() && getBox23() == box.getBox23() && getBox32() == box.getBox32() && getBox33() == box.getBox33();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBox11(), getBox12(), getBox13(), getBox21(), getBox22(), getBox23(), getBox32(), getBox33());
    }
}
