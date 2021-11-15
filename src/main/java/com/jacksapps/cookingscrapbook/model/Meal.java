package com.jacksapps.cookingscrapbook.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    @OneToMany
    private List<Ingredient> ingredients = new ArrayList<>();

    @Column
    private File picture;

    @Column
    @OneToMany
    private List<Comment> notes = new ArrayList<>();

    @Column
    @OneToMany
    private List<Tag> recipeTags = new ArrayList<>();

    public Meal() {
    }

    public Meal(String name, List<Ingredient> ingredients, File picture, List<Comment> notes, List<Tag> recipeTags) {
        this.name = name;
        this.ingredients = ingredients;
        this.picture = picture;
        this.notes = notes;
        this.recipeTags = recipeTags;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    public List<Comment> getNotes() {
        return notes;
    }

    public void setNotes(List<Comment> notes) {
        this.notes = notes;
    }

    public List<Tag> getRecipeTags() {
        return recipeTags;
    }

    public void setRecipeTags(List<Tag> recipeTags) {
        this.recipeTags = recipeTags;
    }
}
