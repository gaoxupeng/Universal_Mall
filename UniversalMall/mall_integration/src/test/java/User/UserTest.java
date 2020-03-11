package User;


import com.mall.controller.UserController;
import com.mall.model.User;

public class UserTest {

    public static void main(String[] args) {
        UserController userController = new UserController();
        User user = new User();
        userController.addUser(user);
    }
}
