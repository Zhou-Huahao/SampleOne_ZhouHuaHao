
public class Myuser {
    String userName;
    String userPassword;
 public Myuser(){

}
public Myuser(String name,String password){
     userName=name;
     userPassword=password;

}
public void showInfo(){
    System.out.println("userName="+userName);
    System.out.println("userPassword"+userPassword);

}

}
