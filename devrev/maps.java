import java.util.*;
public class maps {
  HashMap<String,String> map=new HashMap<String,String>();
    public void mapping(String user, String pass){  
      //Creating HashMap    
       map.put(user, pass);  //Put elements in Map
        //System.out.println(map.get("vino"));
        //
       // System.out.println(second_map);
      } 
      
 
      public boolean check(String name,String pass){
        int flagname=0;
        int flagpass=0;
       
 
        if(map.containsKey(name)){
          if(map.get(name).equals(pass)){
            flagname=1;
        }
      }
        if(map.containsValue(pass)){
            flagpass= 1;
        }
        if(flagname==1 && flagpass==1){
          return true;
        }
        else{
          return false;
        }
      }
}
