@Service
public class AttendeeService {
    private AttendeeRepository attendeeRepository;

    public Event registerAttendee(Attendee attendee) {
        return attendeeRepository.save(attendee);
    } 
}
