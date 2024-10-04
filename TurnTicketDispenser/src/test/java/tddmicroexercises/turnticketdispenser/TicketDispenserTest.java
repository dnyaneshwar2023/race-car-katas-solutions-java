package tddmicroexercises.turnticketdispenser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TicketDispenserTest {

    @Test
    void getTicket() {
        TicketDispenser dispenser = new TicketDispenser(new TurnNumberSequence());
        TurnTicket ticket = dispenser.getTurnTicket();

        assertEquals(0, ticket.getTurnNumber());
    }

    @Test
    void twoDispensersShouldNotGenerateSameTicket() {
        TurnNumberSequence sequence = new TurnNumberSequence();
        TicketDispenser dispenser = new TicketDispenser(sequence);
        TicketDispenser dispenser2 = new TicketDispenser(sequence);
        TurnTicket ticket = dispenser.getTurnTicket();
        TurnTicket ticket2 = dispenser2.getTurnTicket();

        assertEquals(0, ticket.getTurnNumber());
        assertEquals(1, ticket2.getTurnNumber());
    }
}
