/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-18        koiw1       최초 생성
 */
public class TicketSeller {

    private TicketOffice ticketOffice ;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice ;
    }

    public TicketOffice getTicketOffice(){
        return ticketOffice ;
    }
}
