package User;


import com.mall.controller.UserController;
import com.mall.model.TbUser;

public class UserTest {

    public static void main(String[] args) {
        UserController userController = new UserController();
        TbUser tbUser = new TbUser();
        userController.addUser(tbUser);
    }
}
