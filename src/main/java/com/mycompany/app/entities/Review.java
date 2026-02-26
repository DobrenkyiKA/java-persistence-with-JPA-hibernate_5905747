package com.mycompany.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int reviewId;

    @Column(name = "teacher_id")
    private int teacherId;

    @Column(name = "comment")
    private String comment;

    @Column
    private int rating;
}
