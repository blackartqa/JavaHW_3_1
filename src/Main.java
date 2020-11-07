public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1813999;                        //стоимость билета в копейках
        int bonusAmount = 2000;                           //сумма в копейках, на которую начисляется 1 бонусная миля
        int bonusRecieved = ticketPrice/bonusAmount;

        System.out.println("Вам начислено " +bonusRecieved+ " бонусных миль! Летайте самолётами Netology Airlaines!");
    }
}
