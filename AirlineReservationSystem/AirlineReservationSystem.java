package AirlineReservationSystem;

import java.awt.*;
import java.util.Scanner;
public class AirlineReservationSystem {

    static enum Seat {FIRSTCLASS, ECONOMY, OCCUPIED, FREE}
    static Seat seatStatus;
    static Seat seatType;
    static byte newSeat;
    static byte seatNUmber;
    static byte passengerSelect;
    static Scanner scan = new Scanner(System.in);
    static boolean[] seatArray = new boolean[11];

    //Passenger select Seat Class
     static void setClass() {
        System.out.println("Enter 1 for FirstClass and 2 for Economy");
        passengerSelect= scan.nextByte();
         AirlineReservationSystem.setSeatNo();
    }

    static byte getClassF(){
        return passengerSelect;
    }

    //Assign seatNo to passengers
    private static void setSeatNo(){
        if (getClassF() == 1)
            firstClass();
        else if(getClassF()==2)
            economyClass();
     }

     //Confirm seat availability
    private static boolean confirmSeat(byte seatNo){
         boolean seatStatus;
         if(seatArray[seatNo])
            seatStatus = true;
         else{
             seatStatus = false;
         }
         return seatStatus;
    }

    //CHange Class
    static void changeFirstClass(){
        System.out.printf("No more Space in FirstClass%n Would you like to book Economy Class?%n");
        System.out.printf("If YES, select 1.%nIf NO, select 2%n");
        passengerSelect = scan.nextByte();
        if (passengerSelect == 1){
            economyClass();
        }
        else{
            System.out.println("The next flight takes off in 3 hours");
        }

    }

    static void changeEconomyClass(){
        System.out.printf("No more Space in Economy Class%nWould you like to book First Class?%n");
        System.out.printf("If YES, select 1.%nIf NO, select 2%n");
        passengerSelect = scan.nextByte();
        if (passengerSelect == 1){
            firstClass();
        }
        else{
            System.out.println("The next flight takes off in 3 hours");
        }

    }

     //Assign FirstClass
    private static void firstClass() {
            for (byte i = 1; i <=6; i++) {
                if(i==6){
                   changeFirstClass();
                   break;
                }
                else {if(!confirmSeat(i)){
                    newSeat = i;
                    assignSeat();
                    break;
                }
                }
            }
     }

    //Assign Economy Class
    private static void economyClass(){
        for (byte i = 6; i <=11; i++) {
            if(i==11){
                changeEconomyClass();
                break;
            }
            else {if(!confirmSeat(i)){
                newSeat = i;
                assignSeat();
                break;
            }
            }
        }
        }

    static byte getSeatNo(){

         return newSeat;
    }

    //Assign a seat class based on seat number
    private static void assignSeat() {
        int seatN0=getSeatNo();

        if(seatN0>=1&& seatN0<6) {
            seatArray[seatN0] = true;
            seatType = Seat.FIRSTCLASS;
            AirlineReservationSystem.displayBoardingPass();
        }
        else if(seatN0>=6 && seatN0<11){
            seatArray[seatN0] = true;
            seatType=Seat.ECONOMY;
            AirlineReservationSystem.displayBoardingPass();
        }
    }

    //Check if a particular seat is available
    private static void checkSeatAvailability(byte seatNUmber) {
        AirlineReservationSystem.seatNUmber = seatNUmber;
        if (seatNUmber==0){
            System.out.printf("Seats on this plane are between 1 and 10%n");
        }
        else if (!seatArray[seatNUmber]) {
            seatStatus = Seat.FREE;
            System.out.printf("The seat is %s%n", seatStatus.toString());
        } else {
            seatStatus = Seat.OCCUPIED;
            System.out.printf("The seat is %s%n", seatStatus.toString());
        }
    }

    //Display of Successful transaction
     private static void  displayBoardingPass(){
        System.out.printf("Hello Dear Passenger%nYour seat number is %d and seat class is %s%n", getSeatNo(), seatType.toString());
    }

    //Check if a particular seat no is available or not.
       void getSeatAvailability(){
        System.out.println("Enter Seat NUmber to check");
        seatNUmber = scan.nextByte();
        checkSeatAvailability(seatNUmber);
    }

}




