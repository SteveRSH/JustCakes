package com.theironyard.charlotte.JustCakes.models;


import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table(name = "cakes")
public class Cake {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private boolean isRedVelvet;

    @Column
    private boolean isVanilla;

    @Column
    private boolean hasSprinkles;

    public Cake() {
    }

    public Cake(Integer id, boolean isRedVelvet, boolean isVanilla, boolean hasSprinkles) {
        this.id = id;
        this.isRedVelvet = isRedVelvet;
        this.isVanilla = isVanilla;
        this.hasSprinkles = hasSprinkles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isRedVelvet() {
        return isRedVelvet;
    }

    public void setRedVelvet(boolean redVelvet) {
        isRedVelvet = redVelvet;
    }

    public boolean isVanilla() {
        return isVanilla;
    }

    public void setVanilla(boolean vanilla) {
        isVanilla = vanilla;
    }

    public boolean isHasSprinkles() {
        return hasSprinkles;
    }

    public void setHasSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;

    }


            @Override
        public String toString() {
            return "Cake{" +
                    ", isRedVelvet=" + isRedVelvet +
                    ", isVanilla=" + isVanilla +
                    ", hasSprinkles=" + hasSprinkles +
                    ", id=" + id +
                    '}';
    }
}
