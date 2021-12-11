package laptrinh.com.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laptrinh.com.model.Cart;
import laptrinh.com.model.Product;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-11T14:10:35")
@StaticMetamodel(Cartitem.class)
public class Cartitem_ { 

    public static volatile SingularAttribute<Cartitem, Integer> quantity;
    public static volatile SingularAttribute<Cartitem, Product> productid;
    public static volatile SingularAttribute<Cartitem, Cart> cartid;
    public static volatile SingularAttribute<Cartitem, Integer> id;

}