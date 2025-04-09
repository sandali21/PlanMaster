@RestController
@RequestMapping("/api/attendee")
public class AttendeeController {
    private AttendeeService attendeeService;
    
    @PostMapping("/register")
    public Attendee registerAttendee(@RequestBody AttendeeDTO attendeeDTO){
        Attendee attendee = new Attendee();
        return attendeeService.registerAttendee(attendee)
    }
}
