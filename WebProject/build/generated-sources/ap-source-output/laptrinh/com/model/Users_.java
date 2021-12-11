package laptrinh.com.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import laptrinh.com.model.Cart;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-12-11T14:10:35")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Integer> role;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile ListAttribute<Users, Cart> cartList;
    public static volatile SingularAttribute<Users, String> username;

}