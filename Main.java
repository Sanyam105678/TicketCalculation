package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int t;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        Ticket obj = new Ticket();
        int avatickets = sc.nextInt();
        obj.setAvailableTickets(avatickets);
        for(int i=0;i<t;i++){
            System.out.println("Enter ticket Id:");
            obj.setTicketId(sc.nextInt());
            System.out.println("Enter ticket price: ");
            obj.setTicketPrice(sc.nextInt());
            System.out.println("Enter no of tickets: ");
            int ticketswanted = sc.nextInt();


            System.out.println("Available tickets: " + obj.getAvailableTickets());
            System.out.println("Toal Amount: " + obj.calculateTicketCost(ticketswanted));
            System.out.println("Available tickets after booking: " + obj.getAvailableTickets());

        }
    }
}
