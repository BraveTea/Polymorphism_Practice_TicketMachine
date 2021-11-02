public class TicketMachine {
    public void buyTicket(TicketBase ticket, double amountPaid){

        if(paidEnough(ticket, amountPaid)) {
            printTicket(ticket);
        }
        else{
            printTellCustomerNotEnoughMoney(ticket, amountPaid);
        }

    }

    public void printTicket(TicketBase ticket){
        System.out.printf("Film: %s  Price: %.2f%n", ticket.filmName, ticket.price);
    }

    public boolean paidEnough(TicketBase ticket, double amountPaid){
        if (amountPaid >= ticket.price){
            return true;
        }
        else{
            return false;
        }
    }

    public double moneyLeftToPay(TicketBase ticket, double amountPaid){
        return ticket.price - amountPaid;
    }

    public void printTellCustomerNotEnoughMoney(TicketBase ticket, double amountPaid){
        System.out.printf("You had to pay %.2f more. Try Again.%n", moneyLeftToPay(ticket, amountPaid));
    }
}
