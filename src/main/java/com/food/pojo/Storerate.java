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
@Table(name = "storerate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Storerate.findAll", query = "SELECT s FROM Storerate s"),
    @NamedQuery(name = "Storerate.findByIdStore", query = "SELECT s FROM Storerate s WHERE s.idStore = :idStore"),
    @NamedQuery(name = "Storerate.findByRate", query = "SELECT s FROM Storerate s WHERE s.rate = :rate")})
public class Storerate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_store")
    private Integer idStore;
    @Column(name = "rate")
    private Integer rate;
    @JoinColumn(name = "id_store", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Store store;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne
    private User idUser;

    public Storerate() {
    }

    public Storerate(Integer idStore) {
        this.idStore = idStore;
    }

    public Integer getIdStore() {
        return idStore;
    }

    public void setIdStore(Integer idStore) {
        this.idStore = idStore;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
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
        hash += (idStore != null ? idStore.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Storerate)) {
            return false;
        }
        Storerate other = (Storerate) object;
        if ((this.idStore == null && other.idStore != null) || (this.idStore != null && !this.idStore.equals(other.idStore))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.Storerate[ idStore=" + idStore + " ]";
    }
    
}
