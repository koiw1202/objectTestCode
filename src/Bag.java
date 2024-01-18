/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-18        koiw1       최초 생성
 */
public class Bag {

    private Long amount ;
    private Invitation invitation ;
    private Ticket ticket ;

    public Bag(long amount) {
        this(null, amount) ;
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation ;
        this.amount = amount ;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Long getAmount() {
        return amount;
    }

    public Boolean hasInvitation() {
        return ticket != null ;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount ;
    }

    public void plusAmount(Long amount) {
        this.amount += amount ;
    }

}
