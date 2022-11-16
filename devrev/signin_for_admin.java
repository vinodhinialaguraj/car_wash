public class signin_for_admin {
    private String userName;
    private String Password;
   
    public String getval(){
       //System.out.println(userName+" "+Password+" "+Location+" "+service_1+" "+service_2);
        return userName+" "+Password;
    }
    public void setval(String username, String password) {
        this.userName = username;
        this.Password = password;
        
      } 
      
}
