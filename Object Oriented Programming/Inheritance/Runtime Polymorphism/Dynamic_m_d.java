class Phone{

    public void turnOn(){
        System.out.println("Phone turning ON....");
    }

    public void showDate(){
        System.out.println("Phone date: 17 June 2022");
    }

}

class SmartPhone extends Phone{

    public void turnOn(){
        System.out.println("Smart Phone turning ON....");
    }

    public void playMusic(){
        System.out.println("Smart Phone playing Music.....");
    }
}

public class Dynamic_m_d {
    public static void main(String[] args) {

        //Here "nokia" refers to Phone but the object is created with "SmartPhone"
        //Super Class       Sub Class   Reverse is not possible
        Phone nokia = new SmartPhone();

        //Will invoke the turnOn of Sub Class i.e SmartPhone
        nokia.turnOn();

        //Will invoke the showDate() method of Super Class i.e Phone
        nokia.showDate();

        //nokia.playMusic();    Error

    }
}
/*
     Smart Phone turning ON....
     Phone date: 17 June 2022
 */