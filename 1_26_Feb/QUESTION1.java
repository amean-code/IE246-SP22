public class QUESTION1 {
    
    public static void main(String[] args) {
     
        ticket(55, false);
        ticket(65, true);
        ticket(95, false);



        

    }


    public static void ticket(int speed,boolean isBirthday) {
        
        if (isBirthday) {
            speed=speed-5;
        }

        int ticketValue=0;

        if (speed<=60) {
           
        } else if (speed>60 && speed<=80){
            ticketValue=1;
        
        } else if (speed>80){
            ticketValue=2;
        }   

        switch (ticketValue) {
            case 0:
            System.out.println("You have got no ticket today.");
                break;
            case 1:
            System.out.println("You have got a small ticket.");
                break;
            case 2:
            System.out.println("You have got a big ticket.");
            break;
        
        }
        
        
    
    
    }




}
