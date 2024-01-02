package oj.carlos.sneakercounter.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
@Entity
@Table(name = "tb_sneaker")
public class Sneaker implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String model;
    @Column
    private String colorWay;
    @Column
    private String releaseDate;

    @Column(length = 1000)
    private String history;
    @Column
    private String designer;
    @Column
    private String brand;
    @Column
    private String collab;

    public Sneaker() {
    }

    public Sneaker(Long id, String model, String colorWay, String releaseDate, String history, String designer, String brand, String collab) {
        this.id = id;
        this.model = model;
        this.colorWay = colorWay;
        this.releaseDate = releaseDate;
        this.history = history;
        this.designer = designer;
        this.brand = brand;
        this.collab = collab;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColorWay() {
        return colorWay;
    }

    public void setColorWay(String colorWay) {
        this.colorWay = colorWay;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCollab() {
        return collab;
    }

    public void setCollab(String collab) {
        this.collab = collab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sneaker sneaker)) return false;
        return id == sneaker.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
