public class Event {
    @Id
    private int event_id;

    private String name;
    private String description;
    private String date;
    private String location;
    private String created_by;
    private int capacity;
    private int remaining_capacity;

    @ElementCollection
    private List<String> tags;
}
