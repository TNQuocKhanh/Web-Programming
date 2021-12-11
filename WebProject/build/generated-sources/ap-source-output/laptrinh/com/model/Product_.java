package laptrinh.com.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laptrinh.com.model.Cartitem;
import laptrinh.com.model.Category;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-11T14:10:35")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, Integer> productid;
    public static volatile SingularAttribute<Product, Long> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile ListAttribute<Product, Cartitem> cartitemList;
    public static volatile SingularAttribute<Product, Category> categoryid;

}