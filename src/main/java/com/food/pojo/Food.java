/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "food")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Food.findAll", query = "SELECT f FROM Food f"),
    @NamedQuery(name = "Food.findById", query = "SELECT f FROM Food f WHERE f.id = :id"),
    @NamedQuery(name = "Food.findByName", query = "SELECT f FROM Food f WHERE f.name = :name"),
    @NamedQuery(name = "Food.findByPrice", query = "SELECT f FROM Food f WHERE f.price = :price"),
    @NamedQuery(name = "Food.findByImageFood", query = "SELECT f FROM Food f WHERE f.imageFood = :imageFood")})
public class Food implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @Size(max = 255)
    @Column(name = "image_food")
    private String imageFood;
    @JoinColumn(name = "id_categoryfood", referencedColumnName = "id")
    @ManyToOne
    private Categoryfood idCategoryfood;
    @JoinColumn(name = "id_store", referencedColumnName = "id")
    @ManyToOne
    private Store idStore;
    @OneToMany(mappedBy = "idFood")
    private Collection<Cartfood> cartfoodCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "food")
    private Foodrate foodrate;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "food")
    private Menufood menufood;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "food")
    private Foodcomment foodcomment;
    @OneToMany(mappedBy = "idFood")
    private Collection<Orderdetail> orderdetailCollection;

    public Food() {
    }

    public Food(Integer id) {
        this.id = id;
    }

    public Food(Integer id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImageFood() {
        return imageFood;
    }

    public void setImageFood(String imageFood) {
        this.imageFood = imageFood;
    }

    public Categoryfood getIdCategoryfood() {
        return idCategoryfood;
    }

    public void setIdCategoryfood(Categoryfood idCategoryfood) {
        this.idCategoryfood = idCategoryfood;
    }

    public Store getIdStore() {
        return idStore;
    }

    public void setIdStore(Store idStore) {
        this.idStore = idStore;
    }

    @XmlTransient
    public Collection<Cartfood> getCartfoodCollection() {
        return cartfoodCollection;
    }

    public void setCartfoodCollection(Collection<Cartfood> cartfoodCollection) {
        this.cartfoodCollection = cartfoodCollection;
    }

    public Foodrate getFoodrate() {
        return foodrate;
    }

    public void setFoodrate(Foodrate foodrate) {
        this.foodrate = foodrate;
    }

    public Menufood getMenufood() {
        return menufood;
    }

    public void setMenufood(Menufood menufood) {
        this.menufood = menufood;
    }

    public Foodcomment getFoodcomment() {
        return foodcomment;
    }

    public void setFoodcomment(Foodcomment foodcomment) {
        this.foodcomment = foodcomment;
    }

    @XmlTransient
    public Collection<Orderdetail> getOrderdetailCollection() {
        return orderdetailCollection;
    }

    public void setOrderdetailCollection(Collection<Orderdetail> orderdetailCollection) {
        this.orderdetailCollection = orderdetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Food)) {
            return false;
        }
        Food other = (Food) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.Food[ id=" + id + " ]";
    }
    
}
