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
@Table(name = "cartfood")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartfood.findAll", query = "SELECT c FROM Cartfood c"),
    @NamedQuery(name = "Cartfood.findByIdCart", query = "SELECT c FROM Cartfood c WHERE c.idCart = :idCart"),
    @NamedQuery(name = "Cartfood.findByQuantity", query = "SELECT c FROM Cartfood c WHERE c.quantity = :quantity")})
public class Cartfood implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cart")
    private Integer idCart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @JoinColumn(name = "id_cart", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Cart cart;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_food", referencedColumnName = "id")
    @ManyToOne
    private Food idFood;

    public Cartfood() {
    }

    public Cartfood(Integer idCart) {
        this.idCart = idCart;
    }

    public Cartfood(Integer idCart, int quantity) {
        this.idCart = idCart;
        this.quantity = quantity;
    }

    public Integer getIdCart() {
        return idCart;
    }

    public void setIdCart(Integer idCart) {
        this.idCart = idCart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Food getIdFood() {
        return idFood;
    }

    public void setIdFood(Food idFood) {
        this.idFood = idFood;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCart != null ? idCart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartfood)) {
            return false;
        }
        Cartfood other = (Cartfood) object;
        if ((this.idCart == null && other.idCart != null) || (this.idCart != null && !this.idCart.equals(other.idCart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.Cartfood[ idCart=" + idCart + " ]";
    }
    
}
