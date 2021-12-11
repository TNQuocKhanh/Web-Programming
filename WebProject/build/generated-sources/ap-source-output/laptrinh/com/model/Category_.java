package laptrinh.com.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laptrinh.com.model.Product;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-11T14:10:35")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, Integer> categoryid;
    public static volatile ListAttribute<Category, Product> productList;

}