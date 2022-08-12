/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.pojo;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "orderfood")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderfood.findAll", query = "SELECT o FROM Orderfood o"),
    @NamedQuery(name = "Orderfood.findById", query = "SELECT o FROM Orderfood o WHERE o.id = :id"),
    @NamedQuery(name = "Orderfood.findByTotalPrice", query = "SELECT o FROM Orderfood o WHERE o.totalPrice = :totalPrice"),
    @NamedQuery(name = "Orderfood.findByAddressBuyer", query = "SELECT o FROM Orderfood o WHERE o.addressBuyer = :addressBuyer")})
public class Orderfood implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "total_price")
    private Integer totalPrice;
    @Size(max = 50)
    @Column(name = "address_buyer")
    private String addressBuyer;
    @JoinColumn(name = "id_statusorder", referencedColumnName = "id")
    @ManyToOne
    private Statusorder idStatusorder;
    @JoinColumn(name = "id_store", referencedColumnName = "id")
    @ManyToOne
    private Store idStore;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne
    private User idUser;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "orderfood")
    private Orderdetail orderdetail;

    public Orderfood() {
    }

    public Orderfood(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddressBuyer() {
        return addressBuyer;
    }

    public void setAddressBuyer(String addressBuyer) {
        this.addressBuyer = addressBuyer;
    }

    public Statusorder getIdStatusorder() {
        return idStatusorder;
    }

    public void setIdStatusorder(Statusorder idStatusorder) {
        this.idStatusorder = idStatusorder;
    }

    public Store getIdStore() {
        return idStore;
    }

    public void setIdStore(Store idStore) {
        this.idStore = idStore;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Orderdetail getOrderdetail() {
        return orderdetail;
    }

    public void setOrderdetail(Orderdetail orderdetail) {
        this.orderdetail = orderdetail;
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
        if (!(object instanceof Orderfood)) {
            return false;
        }
        Orderfood other = (Orderfood) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.Orderfood[ id=" + id + " ]";
    }
    
}
