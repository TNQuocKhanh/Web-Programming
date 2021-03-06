/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinh.com.model;

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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "cartitem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartitem.findAll", query = "SELECT c FROM Cartitem c"),
    @NamedQuery(name = "Cartitem.findById", query = "SELECT c FROM Cartitem c WHERE c.id = :id"),
    @NamedQuery(name = "Cartitem.findByQuantity", query = "SELECT c FROM Cartitem c WHERE c.quantity = :quantity")})
public class Cartitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "quantity")
    private Integer quantity;
    @JoinColumn(name = "cartid", referencedColumnName = "cartid")
    @ManyToOne(optional = false)
    private Cart cartid;
    @JoinColumn(name = "productid", referencedColumnName = "productid")
    @ManyToOne(optional = false)
    private Product productid;

    public Cartitem() {
    }

    public Cartitem(Integer quantity, Cart cartid, Product productid) {
        this.quantity = quantity;
        this.cartid = cartid;
        this.productid = productid;
    }

    public Cartitem(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Cart getCartid() {
        return cartid;
    }

    public void setCartid(Cart cartid) {
        this.cartid = cartid;
    }

    public Product getProductid() {
        return productid;
    }

    public void setProductid(Product productid) {
        this.productid = productid;
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
        if (!(object instanceof Cartitem)) {
            return false;
        }
        Cartitem other = (Cartitem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ten san pham: " + productid.getName() + ", so luong: " +quantity +
                ", thanh tien: " + productid.getPrice()*quantity ;
    }
    
}
