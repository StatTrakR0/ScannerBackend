package com.app.movement.entities;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int num;
    private int x;
    private int y;
    private int z;

    public Movement() {
    }

    public Movement(int num, int x, int y, int z) {
        this.num = num;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Movement(Long id, int num, int x, int y, int z) {
        this.id = id;
        this.num = num;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long getId() {
        return id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Movement{" + "id=" + id + ", number=" + num + ", x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
