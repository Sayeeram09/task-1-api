# Task API - Shell Command Task Management (Java + Spring Boot)

This project is a RESTful API built using **Spring Boot** for managing and executing shell command tasks. Each task includes metadata such as name, owner, and command, and maintains a log of its execution history. The backend uses **MongoDB** as its database.

---

## 📌 Features

- ✅ Create new tasks (shell commands)
- 🔍 View all tasks or specific task by ID
- 📝 Update existing tasks
- ❌ Delete tasks
- ▶️ Execute a task and log the output with timestamps
- 🗂️ MongoDB integration for storing task and execution logs

---

## 🚀 Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Data MongoDB
- Maven
- MongoDB
- Postman/Thunder Client for testing (optional)

---

## 📁 Project Structure

```
task-api/
├── src/
│   ├── main/
│   │   ├── java/com/example/taskapi/
│   │   │   ├── controller/TaskController.java
│   │   │   ├── model/Task.java
│   │   │   ├── model/TaskExecution.java
│   │   │   ├── repository/TaskRepository.java
│   │   │   └── TaskApiApplication.java
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

## 🛠️ How to Run the Project

### 1. Prerequisites

- Java 17+
- Maven
- MongoDB (running locally or cloud instance like MongoDB Atlas)

### 2. Clone the Repository

```bash
git clone https://github.com/your-username/task-api.git
cd task-api
```

### 3. Configure MongoDB Connection

Edit `src/main/resources/application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/taskdb
```

> Change the URI if you're using a cloud MongoDB service.

### 4. Build and Run

```bash
mvn clean install
mvn spring-boot:run
```

The API will start at:  
📍 `http://localhost:8080`

---

## 📬 API Endpoints

### ➕ Create a Task

`POST /tasks`

```json
{
  "name": "List Files",
  "owner": "Alice",
  "command": "dir"
}
```

### 📄 Get All Tasks

`GET /tasks`

### 🔍 Get Task by ID

`GET /tasks/{id}`

### ✏️ Update a Task

`PUT /tasks/{id}`

```json
{
  "name": "List Documents",
  "owner": "Bob",
  "command": "dir Documents"
}
```

### ❌ Delete a Task

`DELETE /tasks/{id}`

### ▶️ Execute a Task

`POST /tasks/{id}/execute`

---

## 📓 Sample Response (Execution)

```json
{
  "output": " Volume in drive C is OS
 Volume Serial Number is XXXX-YYYY
 Directory of C:\Users\hp
...",
  "startTime": "2025-06-11T08:10:34.123+00:00",
  "endTime": "2025-06-11T08:10:34.456+00:00",
  "status": "SUCCESS"
}
```

---

## 🧪 Testing the API

You can test the endpoints using:

- [Thunder Client](https://www.thunderclient.com/)
- [Postman](https://www.postman.com/)
- Curl or any HTTP tool

---

## 📌 Notes

- ⚠️ Windows command syntax (e.g., `dir`) should be used if running on Windows.
- ❗ Ensure MongoDB is running before starting the app.
- 🧼 Use valid shell-safe commands to avoid execution errors.

---

## 👨‍💻 Author

Sayee Ram M  
📧 msayeeram2003@gmail.com  
📅 Created: June 2025
🔗 https://linkedin.com/in/sayeeram

