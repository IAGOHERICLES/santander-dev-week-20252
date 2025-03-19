package me.dio.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String description;


    public Long setId() {return id;}
    public void getId(Long id) {this.id = id;}
    public String setIcon() {return icon;}
    public void getIcon(String icon) {this.icon = icon;}
    public String setDescription() {return description;}
    public void getDescripton(String description) {this.description = description;}
}
