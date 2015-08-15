/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.firstcorp.entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author first
 */
@Entity
@Table(name = "sex")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sex.findAll", query = "SELECT s FROM Sex s"),
    @NamedQuery(name = "Sex.findById", query = "SELECT s FROM Sex s WHERE s.id = :id"),
    @NamedQuery(name = "Sex.findBySexType", query = "SELECT s FROM Sex s WHERE s.sexType = :sexType")})
public class Sex implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sexType")
    private String sexType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sexId")
    private Collection<Customer> customerCollection;

    public Sex() {
    }

    public Sex(Integer id) {
        this.id = id;
    }

    public Sex(Integer id, String sexType) {
        this.id = id;
        this.sexType = sexType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }

    @XmlTransient
    public Collection<Customer> getCustomerCollection() {
        return customerCollection;
    }

    public void setCustomerCollection(Collection<Customer> customerCollection) {
        this.customerCollection = customerCollection;
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
        if (!(object instanceof Sex)) {
            return false;
        }
        Sex other = (Sex) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.firstcorp.entity.Sex[ id=" + id + " ]";
    }
    
}
