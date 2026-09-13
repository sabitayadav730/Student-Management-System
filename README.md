#  Student Management System

A simple **Java-based Student Management System** designed to manage student records through a console-based application. The system provides basic student management operations such as adding, viewing, searching, and deleting student records.

---

## 📌 About the Project

The **Student Management System** is a console-based application developed using **Java**.

The main purpose of this project is to provide a simple way to manage student information and demonstrate the implementation of basic programming concepts such as:

* User authentication
* Conditional statements
* Loops
* Methods
* ArrayList
* User input using Scanner
* Searching and deleting data
* Input validation

---

## Features

###  Login System

The application provides a basic username and password authentication before allowing access to the student management menu.

### ➕ Add Student

Users can add student information including:

* Student ID
* Roll Number
* Name
* Department
* Semester
* Email
* Phone
* Address
* CGPA

The system also checks whether the roll number already exists.

###  View Students

Users can view the list of students currently stored in the system.

###  Search Student

Users can search for a student using the student's roll number.

###  Delete Student

Users can delete a student record by entering the student's roll number.

### ✅ CGPA Validation

The system validates the CGPA and only accepts values between **0 and 10**.

### Exit

Users can safely exit the application using the Exit option.

---

##  Technologies Used

| Technology   | Purpose                   |
| ------------ | ------------------------- |
|  Java       | Main programming language |
|  ArrayList | Store student records     |
|  Scanner   | Read user input           |
|  Console   | User interface            |

---

##  Project Structure

```text
Student-Management-System/
│
├── StudentManagement.java
│
└── README.md
```

### File Description

**`StudentManagement.java`**

Contains the complete implementation of the Student Management System, including:

* Login functionality
* Main menu
* Add Student
* View Students
* Search Student
* Delete Student
* CGPA validation

---

##  Requirements

Before running the project, make sure you have:

* Java Development Kit (JDK)
* Java compiler (`javac`)
* Command Prompt / Terminal
* Any Java IDE such as IntelliJ IDEA, Eclipse, or VS Code

---

##  How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/sabitayadav730/Student-Management-System.git
```

### 2. Open the Project

```bash
cd Student-Management-System
```

### 3. Compile the Java Program

```bash
javac StudentManagement.java
```

### 4. Run the Application

```bash
java StudentManagement
```

---

##  Login Credentials

The current application uses the following credentials:

```text
Username: Sabita
Password: 1234
```

After successful login, the main menu will be displayed.

---

##  Main Menu

```text
===== MENU =====

1. Add Student
2. View Students
3. Search Student
4. Delete Student
5. Exit
```

### Menu Options

| Option | Function                      |
| ------ | ----------------------------- |
| 1      | Add a new student             |
| 2      | View student records          |
| 3      | Search student by roll number |
| 4      | Delete student by roll number |
| 5      | Exit the application          |

---

##  Student Information

When adding a student, the system collects the following information:

```text
Student ID
Roll Number
Name
Department
Semester
Email
Phone
Address
CGPA
```

The CGPA must be within the following range:

```text
0 ≤ CGPA ≤ 10
```

---

##  CRUD Operations

The project demonstrates basic data management operations:

| Operation  | Implementation |
| ---------- | -------------- |
| **Create** | Add Student    |
| **Read**   | View Students  |
| **Search** | Search Student |
| **Delete** | Delete Student |

---

##  Concepts Demonstrated

This project demonstrates several important Java programming concepts:

* Classes and methods
* `ArrayList`
* `Scanner`
* `if-else` statements
* `do-while` loop
* String comparison
* Data validation
* User input handling
* Searching
* Removing elements from collections

---

### Main Menu

```text
===== MENU =====
1. Add Student
2. View Students
3. Search Student
4. Delete Student
5. Exit
```

> You can replace this section with actual screenshots of your running Java application.

---

##  Project Objectives

The objectives of this project are:

1. To develop a basic Student Management System using Java.
2. To understand Java collections such as `ArrayList`.
3. To implement user authentication.
4. To perform basic student record management.
5. To practice searching and deleting data.
6. To implement input validation.
7. To improve understanding of Java programming fundamentals.

---

##  Future Enhancements

The project can be improved in the future by adding:

*  Update student information
*  File/database storage
*  MySQL database integration
*  Multiple user accounts
*  Improved password security
*  Student performance reports
*  Graphical User Interface (GUI)
*  Advanced student search
*  Export student records

---

You can find the complete project here:

**Student Management System**

https://github.com/sabitayadav730/Student-Management-System

