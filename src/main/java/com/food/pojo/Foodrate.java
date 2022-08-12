/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "foodrate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foodrate.findAll", query = "SELECT f FROM Foodrate f"),
    @NamedQuery(name = "Foodrate.findByIdFood", query = "SELECT f FROM Foodrate f WHERE f.idFood = :idFood"),
    @NamedQuery(name = "Foodrate.findByRate", query = "SELECT f FROM Foodrate f WHERE f.rate = :rate")})
public class Foodrate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_food")
    private Integer idFood;
    @Column(name = "rate")
    private Integer rate;
    @JoinColumn(name = "id_food", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Food food;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne
    private User idUser;

    public Foodrate() {
    }

    public Foodrate(Integer idFood) {
        this.idFood = idFood;
    }

    public Integer getIdFood() {
        return idFood;
    }

    public void setIdFood(Integer idFood) {
        this.idFood = idFood;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFood != null ? idFood.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foodrate)) {
            return false;
        }
        Foodrate other = (Foodrate) object;
        if ((this.idFood == null && other.idFood != null) || (this.idFood != null && !this.idFood.equals(other.idFood))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.Foodrate[ idFood=" + idFood + " ]";
    }
    
}
