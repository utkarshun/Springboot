# 🚀 Spring Boot Portfolio: Beginner to Advanced

This repository contains a curated collection of Spring Boot and full-stack projects developed while learning core and advanced Spring concepts. Projects cover everything from REST APIs and MVC to security with JWT and OAuth2.

---

## 📁 Project Directory

### 🔰 1. `demoApp/demoApp`
- **Type:** Basic Starter App
- **Concepts:** Spring Boot setup, REST API, Hello World
- **Purpose:** Foundation project to verify Spring Boot setup and run a basic controller.

---

### 🛡️ 2. `springSecEx/springSecEx`
- **Type:** Security Project
- **Concepts:** Spring Security, custom login, in-memory authentication, CSRF, BCrypt
- **Features:**
  - Form-based login
  - CSRF token handling
  - BCrypt password encoding
  - Custom user verification

---

### 🔐 3. `SpringOauth2Demo/SpringOauth2Demo`
- **Type:** OAuth2 Login Integration
- **Concepts:** OAuth2, third-party login (Google, GitHub)
- **Features:**
  - Secure login using external providers
  - Token-based user sessions

---

### 🧰 4. `ems-backend/ems-backend`
- **Type:** Backend API
- **Concepts:** Spring MVC, Spring Data JPA, H2, CRUD operations
- **Features:**
  - Employee Create, Read, Update, Delete
  - RESTful endpoints
  - Layered architecture

---

### 🛍️ 5. `ecom-proj/ecom-proj`
- **Type:** Full-stack E-commerce Backend
- **Concepts:** Product CRUD, ResponseEntity, H2 DB, CORS, image handling
- **Features:**
  - Add/view/update/delete product APIs
  - Image upload and retrieval
  - Error handling & status codes

---

### 🖼️ 6. E-commerce UI Frontends
#### Folders:
- `ecom-frontend-1-main`
- `ecom-frontend-2-main/ecom-frontend-2-main`
- `ecom-frontend-3-main`
- `ecom-frontend-4-main`
- `ecom-frontend-5-main/ecom-frontend-5-main`

- **Type:** Static frontend UIs for e-commerce
- **Technologies:** HTML, CSS, JS
- **Purpose:** Created progressively to design clean and responsive UI components for e-commerce platforms.

---

### 🌐 7. `simpleWebApp/simpleWebApp1`
- **Type:** Basic Web App
- **Concepts:** Spring Boot MVC, static templates
- **Use Case:** Serve HTML content via controllers, understand static resource mapping.

---

### 🧪 8. `myApp` and `myApp1`
- **Type:** Miscellaneous Experiments
- **Concepts:** Testing different Spring Boot configurations, controller-service-repo pattern.

---

## 🛠️ Tools & Technologies Used

- **Backend:** Java 17, Spring Boot, Spring Security, Spring MVC, JPA
- **Database:** H2, MySQL
- **Frontend:** HTML, CSS, JavaScript
- **Security:** JWT, OAuth2, BCrypt
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA / VS Code

---

## 🚀 How to Run

```bash
cd <project-folder>
mvn spring-boot:run
