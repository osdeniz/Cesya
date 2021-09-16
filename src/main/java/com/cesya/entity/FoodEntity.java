package com.cesya.entity;

import javax.persistence.*;

@Entity
@Table(name = "FOOD_TABLE")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )//ıd her eklendiğinde otomatik artış sağlar
    @Column(name = "Id")
    private int id;

    @Column(name= "TITLE")
    private String title;

    @Column(name= "DESCRIPTION")
    private String description;

    @Column(name = "CREATEDATE")
    private Integer createDate;

    @Column(name = "POINT")
    private Integer point;

    @Lob//büyük veriler ekleyebilmek için gerekli
    @Column(name = "FOODDETAILS")
    private String foodDetails;

    /**    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private UserEntity user;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "image_id",referencedColumnName = "id")
     private ImageEntity image; **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
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