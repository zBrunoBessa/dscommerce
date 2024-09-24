# <h1 align="center">Dscommerce API</h1>

DSCommerce is a versatile API for commercial management, serving both administrators and customers. It includes features such as authentication, user profiles, product management, order generation, and order consultation. It uses the Spring framework (Spring Web, Spring Data JPA) to manage the server and databases (MySQL, H2), and security technologies like OAuth2, JWT, and BCrypt.

# Conceptual Model
![Conceptual Model](https://user-images.githubusercontent.com/91570669/206563729-68b3128d-03f5-4870-8350-52c3655a8ac7.png)

# Technologies used
### Spring Framework:
- Spring Web (web server management)
- Spring Data JPA (database management)

### Databases:
- MySQL
- H2 Database

### Security and Authentication:
- OAuth2 Resource Server
- JWT (JSON Web Token)
- BCrypt

# How to run the project

## Backend
**Prerequisites:** Java 17

```bash
# clone the repository
git clone https://github.com/zBrunoBessa/dscommerce.git
# navigate to the backend project folder
cd backend
# run the project
./mvnw spring-boot:run

```

#  Endpoints
| Method | Endpoint               | Summary                                          | Requires authentication               | Role
|--------|----------------------|-----------------------------------------------------|--------------------------|----------------------
<kbd>POST</kbd> | <kbd>/oauth2/token</kbd> |  Authenticates the user and generates a Bearer JWT token. Uses *Basic Auth* and an *x-www-form-urlencoded* request body with keys: *username*, *password*, and *grant_type*. | Yes | *
<kbd>GET</kbd> | <kbd>/users/me</kbd> | Fetches information of the user in the current session | Yes | ROLE_ADMIN, ROLE_CLIENT
<kbd>GET</kbd> | <kbd>/products</kbd> | Lists all products | No | *
<kbd>GET</kbd> | <kbd>/products/:id</kbd> | Displays a specific product by its ID | No | *
<kbd>POST</kbd> | <kbd>/products</kbd> | Creates a new product | Yes | ROLE_ADMIN
<kbd>PUT</kbd> | <kbd>/products/:id</kbd> | Updates a product by providing its ID in the path and information in the request body | Yes | ROLE_ADMIN
<kbd>PUT</kbd> | <kbd>/products/:id</kbd> | Deletes a product by providing its ID in the path | Yes | ROLE_ADMIN
<kbd>GET</kbd> | <kbd>/categories</kbd> | Lists all categories | No | *
<kbd>POST</kbd> | <kbd>/orders</kbd> | Creates a new purchase order | Yes | ROLE_CLIENT
<kbd>GET</kbd> | <kbd>/orders/:id</kbd> | Lists products in a specific purchase order and its status by providing the order ID | Yes | ROLE_ADMIN, ROLE_CLIENT
<kbd>GET</kbd> | <kbd>/h2-console</kbd> | Provides access to the H2 Database | Yes | *
