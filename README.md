### **Project Description: Event Management System**

This is a full-stack **Event Management System** built using **Spring Boot (Backend)** and **React (Frontend)**, connected via RESTful APIs and backed by a relational database (**PostgreSQL** or **MySQL**). The system allows users to create, update, delete, and view events, as well as register attendees. It demonstrates modular architecture, reusable components, and clean coding practices.

---

## Backend (Spring Boot)

### **Technologies Used:**
- **Spring Boot** (Java)
- **Spring Data JPA & Hibernate**
- **PostgreSQL / MySQL**
- **Maven** (build tool)
- **RESTful API**

### **Key Features:**
- Create and manage events with capacity constraints.
- Register and manage attendees for specific events.
- Fetch events with pagination, filters (date, location, tags).
- View detailed event analytics (total attendees, utilization).
- Input validation, data integrity, and error handling.
- Uses **DTOs** for data transfer and **Service Layer Design Pattern**.

## Frontend (React)

### **Technologies Used:**
- **React.js**
- **React Context API / Redux Toolkit** (state management)
- **Axios** (for API calls)
- **CSS Modules / SCSS** (styling)
- **React Router** (navigation)

### **Key Components & Pages:**
- **Reusable Components**: Buttons, Inputs, Modals, Tables.
- **Event List Page**: Paginated list with filters and search.
- **Event Detail Page**: Detailed view with attendee list.
- **Event Creation Page**: Form to add new events.
- **Event Update Page**: Edit form with prefilled data.
- **Confirmation Modals**: For delete actions and confirmations.
