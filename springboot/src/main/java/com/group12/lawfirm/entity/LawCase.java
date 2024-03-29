package com.group12.lawfirm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lawcase")
public class LawCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "cname")
    private String cname;
    @Column(name = "status")
    private String status;
    @Column(name = "feedback")
    private String feedback;
    @Column(name = "type")
    private String type;
    @Column(name = "lname")
    private String lname;

    @Transient
    private String lawyerName;
}
