@RestController
@RequestMapping("/api/events")
public class EventController {
    private EventService eventService;

    @GetMapping("/")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("/")
    public Event createEvent(@RequestBody EventDTO eventDTO) {
        Event event = new Event();
        return eventService.createEvent(event);
    } 

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable String id) {
        eventService.deleteEvent(id);
    }
}

