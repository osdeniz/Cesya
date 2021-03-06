package com.cesya.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "FOOD_TABLE")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )//ıd her eklendiğinde otomatik artış sağlar
    @Column(name = "Id")
    private Long id;

    @Column(name= "TITLE")
    private String title;

    @Column(name= "DESCRIPTION")
    private String description;

    @Column(name = "CREATEDATE")
    private Date createDate;

    @Lob//büyük veriler ekleyebilmek için gerekli
    @Column(name = "FOODDETAILS")
    private String foodDetails;

    @Column(name = "POINT")
    private Integer point;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private StudentEntity student;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private StudentEntity score;

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public StudentEntity getScore() {
        return score;
    }

    public void setScore(StudentEntity score) {
        this.score = score;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoodDetails() {
        return foodDetails;
    }

    public void setFoodDetails(String foodDetails) {
        this.foodDetails = foodDetails;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
}
