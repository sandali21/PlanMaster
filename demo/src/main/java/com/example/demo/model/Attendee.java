@Entity
public class Attendee {
    @Id
    private int atd_id;
    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event registered_events;
}
