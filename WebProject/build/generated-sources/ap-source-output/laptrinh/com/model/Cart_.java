package laptrinh.com.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laptrinh.com.model.Cartitem;
import laptrinh.com.model.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-11T14:10:35")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile SingularAttribute<Cart, Date> buydate;
    public static volatile SingularAttribute<Cart, Integer> cartid;
    public static volatile ListAttribute<Cart, Cartitem> cartitemList;
    public static volatile SingularAttribute<Cart, Users> userid;
    public static volatile SingularAttribute<Cart, String> info;
    public static volatile SingularAttribute<Cart, Integer> status;

}