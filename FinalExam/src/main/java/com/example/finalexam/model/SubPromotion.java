package com.example.finalexam.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="subpromotion")
public class SubPromotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "subPromotion", cascade = CascadeType.DETACH)
    List<Promotion> promotions;

    public SubPromotion() {
    }

    public SubPromotion(Integer id, String name, List<Promotion> promotions) {
        this.id = id;
        this.name = name;
        this.promotions = promotions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }
}
