package ru.netology.sort;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {

        int ticketTime1 = t1.getTimeTo() - t1.getTimeFrom();
        int ticketTime2 = t2.getTimeTo() - t2.getTimeFrom();

        if (ticketTime1 < ticketTime2) {
            return -1;
        } else if (ticketTime1 > ticketTime2) {
            return 1;
        } else {
            return 0;
        }
    }
}
