import java.util.Scanner;
public class view_place_book {
    int chennai=0;
    int cochi=0;
    int cudalore=0;
public void booking(String location){
    Scanner scan = new Scanner (System.in);
    booking_count_for_each_location books = new booking_count_for_each_location();
    if(location=="chennai"){
        System.out.println("chennai has"+" "+chennai+" "+"bookings");
        System.out.println("wanna book??");
        String choice = scan.nextLine();
        if(choice.equals("yes")){
            System.out.println("booked..... thank you");
        chennai++;
            books.datas(location, chennai);
        }
        if(choice.equals("other")){
            System.out.println("enter other location");
            location = scan.nextLine();
        }
        if(choice.equals("no")){
            System.out.println("Thank you...!!!");
        }
    }
    if(location=="cochi"){
        System.out.println("cochi has"+" "+cochi+" "+"bookings");
        System.out.println("wanna book??");
        String choice = scan.nextLine();
        if(choice.equals("yes")){
            System.out.println("booked.....thank you");
        cochi++;
        books.datas(location, cochi);
        }
        if(choice.equals("other")){
            System.out.println("enter other location");
            location = scan.nextLine();
        }
        if(choice.equals("no")){
            System.out.println("Thank you...!!!");
        }
        //cochi++;
    }
    if(location=="cudalore"){
        System.out.println("cudalore has"+" "+cudalore+" "+"bookings");
        System.out.println("wanna book??");
        String choice = scan.nextLine();
        if(choice.equals("yes")){
            System.out.println("booked..... thank you");
        cudalore++;
        books.datas(location, cudalore);
        }
        if(choice.equals("other")){
            System.out.println("enter other location");
            location = scan.nextLine();
        }
        if(choice.equals("no")){
            System.out.println("Thank you...!!!");
        }
        //cudalore++;
    }
    if(chennai>5||cochi>5||cudalore>5){
        System.out.println("booking closed at"+" "+location);
    }
   

}
}
