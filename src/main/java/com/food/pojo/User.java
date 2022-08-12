/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.food.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
import javax.persistence.Transient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByFirstname", query = "SELECT u FROM User u WHERE u.firstname = :firstname"),
    @NamedQuery(name = "User.findByLastname", query = "SELECT u FROM User u WHERE u.lastname = :lastname"),
    @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email"),
    @NamedQuery(name = "User.findByPhone", query = "SELECT u FROM User u WHERE u.phone = :phone")})
public class User implements Serializable {

    /**
     * @return the isSuperUser
     */
    public Boolean getIsSuperUser() {
        return isSuperUser;
    }

    /**
     * @param isSuperUser the isSuperUser to set
     */
    public void setIsSuperUser(Boolean isSuperUser) {
        this.isSuperUser = isSuperUser;
    }
    


    /**
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max = 20)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    
    @Size(min = 1, max = 20)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    
    @Size(min = 1, max = 30)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    
    @Size(min = 1, max = 30)
    @Column(name = "lastname")
    private String lastname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    
    @Size(max = 5)
    @Column(name = "is_superuser")
    private Boolean isSuperUser;
    
    @Size(max = 10)
    @Column(name = "phone")
    private String phone;
    
    @Transient
    private String confirmPassword;
    
    @OneToMany(mappedBy = "idUser")
    private Collection<Storecomment> storecommentCollection;
    @OneToMany(mappedBy = "idUser")
    private Collection<Storerate> storerateCollection;
    @OneToMany(mappedBy = "idUser")
    private Collection<Store> storeCollection;
    @OneToOne(mappedBy = "idUser")
    private Cart cart;
    @OneToMany(mappedBy = "idUser")
    private Collection<Foodrate> foodrateCollection;
    @OneToMany(mappedBy = "idUser")
    private Collection<Orderfood> orderfoodCollection;
    @JoinColumn(name = "id_status", referencedColumnName = "id")
    @ManyToOne
    private Status idStatus;
    @JoinColumn(name = "id_usertype", referencedColumnName = "id")
    @ManyToOne(fetch=FetchType.LAZY)
    private Usertype idUsertype;
    @OneToMany(mappedBy = "idUser")
    private Collection<Foodcomment> foodcommentCollection;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String password, String firstname, String lastname) {
        this.id = id;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlTransient
    public Collection<Storecomment> getStorecommentCollection() {
        return storecommentCollection;
    }

    public void setStorecommentCollection(Collection<Storecomment> storecommentCollection) {
        this.storecommentCollection = storecommentCollection;
    }

    @XmlTransient
    public Collection<Storerate> getStorerateCollection() {
        return storerateCollection;
    }

    public void setStorerateCollection(Collection<Storerate> storerateCollection) {
        this.storerateCollection = storerateCollection;
    }

    @XmlTransient
    public Collection<Store> getStoreCollection() {
        return storeCollection;
    }

    public void setStoreCollection(Collection<Store> storeCollection) {
        this.storeCollection = storeCollection;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @XmlTransient
    public Collection<Foodrate> getFoodrateCollection() {
        return foodrateCollection;
    }

    public void setFoodrateCollection(Collection<Foodrate> foodrateCollection) {
        this.foodrateCollection = foodrateCollection;
    }

    @XmlTransient
    public Collection<Orderfood> getOrderfoodCollection() {
        return orderfoodCollection;
    }

    public void setOrderfoodCollection(Collection<Orderfood> orderfoodCollection) {
        this.orderfoodCollection = orderfoodCollection;
    }

    public Status getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Status idStatus) {
        this.idStatus = idStatus;
    }

    public Usertype getIdUsertype() {
        return idUsertype;
    }

    public void setIdUsertype(Usertype idUsertype) {
        this.idUsertype = idUsertype;
    }

    @XmlTransient
    public Collection<Foodcomment> getFoodcommentCollection() {
        return foodcommentCollection;
    }

    public void setFoodcommentCollection(Collection<Foodcomment> foodcommentCollection) {
        this.foodcommentCollection = foodcommentCollection;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.food.pojo.User[ id=" + id + " ]";
    }
    
}
