public class Programme {
    public static void main(String[] args){
        System.out.println("test");

        TicketMachine TM1 = new TicketMachine();
        TicketBase SW4 = new StarWars4();
        TicketBase IJ1 = new IndianaJones1();
        //I could probably write a loop/statement where it does:
        //TicketBase currentTicket = new SomethingOutOfAListOfClasses();
        //And this based on a switch case or something.


        double moneyPutIn = 14;
        TM1.buyTicket(SW4, moneyPutIn);
        TM1.buyTicket(IJ1, moneyPutIn);

    }
}
