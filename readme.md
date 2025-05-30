# Crisis Management Information System

This repository contains a full-stack application designed to support flood crisis response coordination. It enables actors such as the Prefect, Mayors, and emergency services to manage and respond to crises like the flooding of the city of Blois. The system is built as part of a broader study on how information systems and process intelligence can assist in disaster scenarios through structured data management and analysis.

---

## Project Structure

- **CMSFE/**  
  The frontend of the application, built using React and Vite. It includes the user interface for interacting with the system.
  
- **db/crisisManagement.db**  
  A local SQLite database file used for development and testing.

- **src/**  
  Contains the Spring Boot backend application, including:
  - `main/java/.../Controllers/`: REST controllers for handling HTTP requests.
  - `main/java/.../Models/`: JPA entities, including embedded keys and data relationships.
  - `main/java/.../Services/`: Business logic layer.
  - `main/resources/`: Configuration files, templates, and static assets.
  - `test/`: Unit and integration tests.

- **pom.xml**  
  Maven configuration file for building the backend.

- **mvnw / mvnw.cmd**  
  Maven wrapper scripts.

- **HELP.md**  
  Default help file generated by Spring Initializr.

---

## Project Context

This application models and manages crisis response procedures using a process-oriented approach. The flood of Blois is used as a primary scenario to simulate real-world coordination between actors. The project includes support for:

- Crisis process modeling (alerting, evacuation, resource coordination).
- Trace conformity and deviation analysis (e.g., via Levenshtein distance).
- Actor and service coordination.
- Data collection and decision-making support.

It is designed to reflect real-life decision-making sequences and dependency handling under emergency conditions.

---

## 🗃️ Data Representation of the Universe of Discourse

The system captures and stores entities that are key to understanding and supporting flood crisis responses. These entities include:

- **Actor**: Represents people or organizations (e.g., Prefect, Mayor).
- **Service**: Activities that actors can carry out during a crisis.
- **Dependency**: Defines logical and operational relationships between services.
- **Input/Output**: Data that flows into or out of services.
- **ServiceChoice**: Decision branches or options within a service chain.
- **Variable**: Parameters influencing service behavior or execution.

All of these are implemented using Java classes annotated with JPA and are persisted in a relational database. The current version uses SQLite for simplicity in development, but it can be adapted to PostgreSQL, MySQL, or other relational DBMSs.

---


## ⚙️ Technologies Used

- **Frontend**: React, Vite, JavaScript
- **Backend**: Java, Spring Boot, Spring Data JPA
- **Database**: SQLite (for development)
- **Build Tools**: Maven
- **Process Analysis**: Python (trace deviation with Levenshtein), future integration with process mining tools
- **Other Tools**: ESLint, Git

---

## 🚀 Running the Project

### Backend
```bash
./mvnw spring-boot:run
