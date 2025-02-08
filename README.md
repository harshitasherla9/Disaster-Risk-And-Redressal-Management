# **Disaster Risk and Redressal Management System (DRRMS)**

## **Overview**
The **Disaster Risk and Redressal Management System (DRRMS)** is a browser-based application designed to mitigate disaster risks and facilitate emergency response. The system enables users to report disaster-related incidents by registering complaints and provides administrators with tools to assign response teams effectively. The goal is to improve communication between affected individuals and authorities, ensuring timely intervention.

## **Features**
- **User Module:**
  - Register complaints by submitting details such as name, location, disaster type, and an image proof.
  - Check complaint status and assigned response force details.
  - View disaster-prone areas based on location.
  
- **Admin Module:**
  - View registered complaints based on date and location.
  - Assign response force teams to handle reported disasters.
  - Maintain records of disaster-prone areas.

## **System Architecture**
The project is developed using **Java Swings** for the frontend and **Oracle 11g SQL Database** for backend storage. It follows a **client-server model**, where users interact through a graphical interface, and the admin manages data via an integrated dashboard.

## **Technologies Used**
- **Programming Language:** Java (Java SE 15.0.2)
- **Database:** Oracle 11g SQLPlus (Version 11.2.0.2.0)
- **Libraries & Tools:**
  - Java Swing (GUI Development)
  - JDBC (Java Database Connectivity)
  - MySQL Driver for database connectivity

## **Database Schema**
The system includes key database tables such as:
- **User Details**: Stores registered users and their complaints.
- **Complaints Table**: Maintains disaster-related reports and their statuses.
- **Disaster Prone Areas**: Lists regions frequently affected by disasters.
- **Response Force Details**: Manages assigned response teams.

## **Implementation Details**
- **Frontend:** Built using **Java Swing**, providing an interactive GUI for users and administrators.
- **Backend:** Uses **Oracle SQL** for storing and managing complaint records.
- **Data Processing:** Users’ complaints are logged in the database and retrieved by administrators for action.
- **Security:** Implements user authentication and role-based access for **admin and users**.

## **Installation & Setup**
1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-repository/DRRMS.git
   ```
2. **Install Java SE Development Kit (JDK 15.0.2).**
3. **Set up the database:**
   - Install Oracle 11g SQLPlus.
   - Import the database schema using the provided SQL scripts.
4. **Run the application:**
   - Navigate to the project folder and execute:
     ```bash
     javac MainPage.java
     java MainPage
     ```

## **Future Scope**
- Integration with **real-time GIS mapping** for visualizing disaster-prone areas.
- Development of a **mobile application** for better accessibility.
- AI-based prediction models for **early disaster warnings**.

## **Contributors**
- **S. Harshita**
- **M. Siddhi Vinayak**

