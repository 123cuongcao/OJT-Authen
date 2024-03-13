package com.rikkei.managementuser.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ClassName")
    private String name;

    private int maxStudent;

    @ManyToOne
    @JoinColumn(name = "CourseId")
    private Courses courses;

    @Column(name = "Status")
    private int status;

    @Column(name = "StartTime")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date startTime;

    @OneToMany(mappedBy = "aClass")
    private Set<Student> students;


//    @ManyToOne
//    @JoinColumn(name = "instructorName")
//    private Teacher teacher;


}
