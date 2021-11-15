package com.jacksapps.cookingscrapbook.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    private LocalDate dateRecorded;

    public Comment() {
    }
}
