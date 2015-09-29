/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author juan.martinez23
 */
@Entity
public class TipoProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id // Llave primaria en la BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoProducto;

    /**
     * Get the value of tipoProducto
     *
     * @return the value of tipoProducto
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Set the value of tipoProducto
     *
     * @param tipoProducto new value of tipoProducto
     */
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof TipoProducto)) {
            return false;
        }
        TipoProducto other = (TipoProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.udea.modelo.TipoProducto[ id=" + id + " ]";
    }

}
