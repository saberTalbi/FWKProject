/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sabeur
 */
@Entity
public class NewEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String localistation;

    public String getLocalistation() {
        return localistation;
    }
    
    public void setLocalistation(String localistation) {
        this.localistation = localistation;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.localistation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NewEntity other = (NewEntity) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.localistation, other.localistation)) {
            return false;
        }
        return true;
    }

  

    @Override
    public String toString() {
        return "com.model.NewEntity[ id=" + id + " ]";
    }
    
}
