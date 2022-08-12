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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "storecomment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Storecomment.findAll", query = "SELECT s FROM Storecomment s"),
    @NamedQuery(name = "Storecomment.findByIdStore", query = "SELECT s FROM Storecomment s WHERE s.idStore = :idStore"),
    @NamedQuery(name = "Storecomment.findByContent", query = "SELECT s FROM Storecomment s WHERE s.content = :content")})
public class Storecomment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_store")
    private Integer idStore;
    @Size(max = 50)
    @Column(name = "content")
    private String content;
    @JoinColumn(name = "id_store", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Store store;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne
    private User idUser;

    public Storecomment() {
    }

    public Storecomment(Integer idStore) {
        this.idStore = idStore;
    }

    public Integer getIdStore() {
        return idStore;
    }

    public void setIdStore(Integer idStore) {
        this.idStore = idStore;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        if (!(object instanceof Storecomment)) {
            return false;
        }
        Storecomment other = (Storecomment) object;
        if ((this.idStore == null && other.idStore != null) || (this.idStore != null && !this.idStore.equals(other.idStore))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.Storecomment[ idStore=" + idStore + " ]";
    }
    
}
