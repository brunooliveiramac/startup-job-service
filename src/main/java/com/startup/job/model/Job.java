package com.startup.job.model;

import lombok.Builder;

import javax.persistence.*;

@Builder
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer jobId;

    @Column
    private String desciption;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
