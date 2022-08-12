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
@Table(name = "orderdetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdetail.findAll", query = "SELECT o FROM Orderdetail o"),
    @NamedQuery(name = "Orderdetail.findByIdOrder", query = "SELECT o FROM Orderdetail o WHERE o.idOrder = :idOrder"),
    @NamedQuery(name = "Orderdetail.findByQuantity", query = "SELECT o FROM Orderdetail o WHERE o.quantity = :quantity")})
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_order")
    private Integer idOrder;
    @Column(name = "quantity")
    private Integer quantity;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_food", referencedColumnName = "id")
    @ManyToOne
    private Food idFood;
    @JoinColumn(name = "id_order", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Orderfood orderfood;

    public Orderdetail() {
    }

    public Orderdetail(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Food getIdFood() {
        return idFood;
    }

    public void setIdFood(Food idFood) {
        this.idFood = idFood;
    }

    public Orderfood getOrderfood() {
        return orderfood;
    }

    public void setOrderfood(Orderfood orderfood) {
        this.orderfood = orderfood;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdetail)) {
            return false;
        }
        Orderdetail other = (Orderdetail) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.Orderdetail[ idOrder=" + idOrder + " ]";
    }
    
}
