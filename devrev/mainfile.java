class sol{
    public static void main(String[] args) {
      sign_in signin = new sign_in();
      signin.setval("vino", "vinorm");
      maps map= new maps();
      map.mapping("vino","vinorm");
      map.mapping("vinodhini","vinormbts");
      if(map.check("vino", "vinorm")){
        System.out.println("Welcome");
      }
      else{
        System.out.println("Pls check!!!");
      }
      area ar = new area();
      ar.writing("chennai", "no", "yes");
      ar.writing("cochi", "no", "yes");
      ar.writing("cudalore", "yes", "yes");
      view_place_book book= new view_place_book();
      book.booking("chennai");
      book.booking("chennai");
      
      
    }
}