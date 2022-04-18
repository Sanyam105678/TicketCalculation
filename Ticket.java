package com.company;

public class Ticket {
    int ticketId;
    int ticketPrice;
    int availableTickets;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        if(availableTickets>0)
            this.availableTickets = availableTickets;
        else
            System.out.println("Enter positive value");
    }

    public int calculateTicketCost(int nooftickets){
        if(this.getAvailableTickets()>0){
            this.setAvailableTickets(this.getAvailableTickets()-nooftickets);
            return nooftickets*this.getTicketPrice();
        }
        else
            return -1;

    }
}
