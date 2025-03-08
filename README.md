# Portfolio Web Application

## 📌 Overview
This project is a **Portfolio Web Application** that allows users to showcase their education, projects, contact information, and resume. It is built using **Java, MySQL, Servlet, JSP, HTML, CSS, and JavaScript** and runs on an **Apache Tomcat Server**.

## 🚀 Features
- **Education Section**: Add, update, delete, and retrieve education details.
- **Projects Section**: Manage project details dynamically.
- **Contact Form**: Users can submit contact requests.
- **Resume Upload**: Upload and manage resumes.
- **Responsive UI**: Built using HTML, CSS, and JavaScript for a smooth user experience.

## 🛠️ Technologies Used
- **Backend**: Java, Servlet, JSP
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MySQL
- **Server**: Apache Tomcat
- **JDBC**: For database connectivity

## 📂 Project Structure
```
portfolio-web-app/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controllers/      # Servlet Controllers
│   │   │   ├── models/           # Java Beans (POJOs)
│   │   │   ├── dao/              # Data Access Objects (DAO)
│   │   ├── webapp/
│   │   │   ├── education/        # Education CRUD Views
│   │   │   ├── projects/         # Projects CRUD Views
│   │   │   ├── contact/          # Contact Form View
│   │   │   ├── resume/           # Resume Upload View
│   │   │   ├── index.jsp         # Homepage
│── database.sql                  # Database schema
│── README.md                     # Documentation
```

## ⚙️ Installation & Setup
### Prerequisites
1. Install **JDK** (Java Development Kit)
2. Install **MySQL** and create a database
3. Install **Apache Tomcat**
4. Use **Eclipse/IntelliJ IDEA/NetBeans** as an IDE

### Steps to Run
1. **Clone the repository**:
   ```sh
   git clone https://github.com/YOUR_USERNAME/portfolio-web-app.git
   cd portfolio-web-app
   ```
2. **Set up the database**:
   - Import `database.sql` into MySQL.
   - Update database connection details in `dao/DatabaseConnection.java`.
3. **Deploy the project**:
   - Open the project in your IDE.
   - Configure Tomcat Server.
   - Run the application.
4. **Access the application**:
   - Open `http://localhost:8080` in a web browser.

## 🎯 Live Demo (If Hosted)
[🔗 Live Portfolio](https://rahulbhusari07.github.io/portfolio-web-app/)

## 💡 Contributing
If you'd like to contribute, fork the repository and submit a pull request!



