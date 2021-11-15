package com.jacksapps.cookingscrapbook.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String comment;

    @Column
    private LocalDate dateRecorded;

    public Comment() {
    }

    public Comment(String comment, LocalDate dateRecorded) {
        this.comment = comment;
        this.dateRecorded = dateRecorded;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDateRecorded() {
        return dateRecorded;
    }

    public void setDateRecorded(LocalDate dateRecorded) {
        this.dateRecorded = dateRecorded;
    }
}
