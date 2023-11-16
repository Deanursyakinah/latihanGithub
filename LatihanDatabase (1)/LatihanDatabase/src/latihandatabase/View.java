package latihandatabase;
import java.util.ArrayList;
public class View {

    public View() {
        Controller controller =  new Controller();
        ArrayList<User> users = controller.getAllUsers();
        if (users.size() > 0) {
            for (User user : users) {
                System.out.println(user.toString());
            }
        } else {
            System.out.println("Mohon maaf ada kesalahan, silakan coba kembali");
        }
        //User specificUser = controller.getUser("Budi", "Jl. Dipati Ukur");
        
        User newUser = new User();
        newUser.setName("blabla");
        newUser.setAddress("Jalan DU");
        newUser.setAge(15);
        newUser.setPhone("08261212323");
        // newUser.setName(textfieldName.getText());
        
        boolean status = controller.insertNewUser(newUser);
        if(status) {
            System.out.println("Insert Sukses");
        } else {
            System.out.println("Insert Gagal");
        }
    }
    
    public static void main(String[] args) {
       new View();
    }
}
