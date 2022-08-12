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
@Table(name = "store")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Store.findAll", query = "SELECT s FROM Store s"),
    @NamedQuery(name = "Store.findById", query = "SELECT s FROM Store s WHERE s.id = :id"),
    @NamedQuery(name = "Store.findByName", query = "SELECT s FROM Store s WHERE s.name = :name"),
    @NamedQuery(name = "Store.findByAddress", query = "SELECT s FROM Store s WHERE s.address = :address"),
    @NamedQuery(name = "Store.findByImageStore", query = "SELECT s FROM Store s WHERE s.imageStore = :imageStore"),
    @NamedQuery(name = "Store.findByShipPrice", query = "SELECT s FROM Store s WHERE s.shipPrice = :shipPrice")})
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "address")
    private String address;
    @Size(max = 255)
    @Column(name = "image_store")
    private String imageStore;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ship_price")
    private int shipPrice;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "store")
    private Storecomment storecomment;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "store")
    private Storerate storerate;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne
    private User idUser;
    @OneToMany(mappedBy = "idStore")
    private Collection<Menu> menuCollection;
    @OneToMany(mappedBy = "idStore")
    private Collection<Cart> cartCollection;
    @OneToMany(mappedBy = "idStore")
    private Collection<Food> foodCollection;
    @OneToMany(mappedBy = "idStore")
    private Collection<Orderfood> orderfoodCollection;

    public Store() {
    }

    public Store(Integer id) {
        this.id = id;
    }

    public Store(Integer id, String name, String address, int shipPrice) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.shipPrice = shipPrice;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageStore() {
        return imageStore;
    }

    public void setImageStore(String imageStore) {
        this.imageStore = imageStore;
    }

    public int getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(int shipPrice) {
        this.shipPrice = shipPrice;
    }

    public Storecomment getStorecomment() {
        return storecomment;
    }

    public void setStorecomment(Storecomment storecomment) {
        this.storecomment = storecomment;
    }

    public Storerate getStorerate() {
        return storerate;
    }

    public void setStorerate(Storerate storerate) {
        this.storerate = storerate;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public Collection<Menu> getMenuCollection() {
        return menuCollection;
    }

    public void setMenuCollection(Collection<Menu> menuCollection) {
        this.menuCollection = menuCollection;
    }

    @XmlTransient
    public Collection<Cart> getCartCollection() {
        return cartCollection;
    }

    public void setCartCollection(Collection<Cart> cartCollection) {
        this.cartCollection = cartCollection;
    }

    @XmlTransient
    public Collection<Food> getFoodCollection() {
        return foodCollection;
    }

    public void setFoodCollection(Collection<Food> foodCollection) {
        this.foodCollection = foodCollection;
    }

    @XmlTransient
    public Collection<Orderfood> getOrderfoodCollection() {
        return orderfoodCollection;
    }

    public void setOrderfoodCollection(Collection<Orderfood> orderfoodCollection) {
        this.orderfoodCollection = orderfoodCollection;
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
        if (!(object instanceof Store)) {
            return false;
        }
        Store other = (Store) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.Store[ id=" + id + " ]";
    }
    
}
