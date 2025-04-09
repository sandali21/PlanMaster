@Service
public class EventService {
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event createEvent(Event event) {
        event.setRemainingCapacity(event.getCapacity());
        return eventRepository.save(event);
    } 

    public void deleteEvent(int id){
        eventRepository.deleteById(id);
    }
}
