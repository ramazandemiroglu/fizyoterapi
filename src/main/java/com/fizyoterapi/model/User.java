/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fizyoterapi.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "user")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Tip")
    private int tip;
    @Basic(optional = false)
    @Column(name = "TC")
    private String tc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Usermovement> usermovementList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user1")
    private List<Usermovement> usermovementList1;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String lastName, String firstName, int tip, String tc) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.tip = tip;
        this.tc = tc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public List<Usermovement> getUsermovementList() {
        return usermovementList;
    }

    public void setUsermovementList(List<Usermovement> usermovementList) {
        this.usermovementList = usermovementList;
    }

    public List<Usermovement> getUsermovementList1() {
        return usermovementList1;
    }

    public void setUsermovementList1(List<Usermovement> usermovementList1) {
        this.usermovementList1 = usermovementList1;
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
        return "com.fizyoterapi.model.User[ id=" + id + " ]";
    }
    
}
