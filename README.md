# <h1 align="center">Dscommerce API</h1>
A DSCommerce é uma API versátil para gerenciamento comercial, atendendo tanto administradores quanto clientes. Possui recursos de autenticação, perfis de usuário, gerenciamento de produtos, geração e consulta de ordens de compra. Utiliza o framework Spring (Spring Web, Spring Data JPA) para gerenciar o servidor e bancos de dados (MySQL, H2), e tecnologias de segurança como OAuth2, JWT e BCrypt.


# Modelo conceitual
![Modelo Conceitual](https://user-images.githubusercontent.com/91570669/206563729-68b3128d-03f5-4870-8350-52c3655a8ac7.png)

# Tecnologias utilizadas
<h3>Framework Spring:</h3>

<li>Spring Web (gerenciamento do servidor web)</li>
<li>Spring Data JPA (manipulação dos dados nos bancos de dados)</li>
<h3>Bancos de dados:</h3>

<li>MySQL</li>
<li>H2 Database</li>
<h3>Segurança e Autenticação:</h3>

<li>OAuth2 Resource Server</li>
<li>JWT (JSON Web Token)</li>
<li>BCrypt</li>

  

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/zBrunoBessa/dscommerce.git
# entrar na pasta do projeto back end
cd backend
# executar o projeto
./mvnw spring-boot:run
```

#  Endpoints
| Método | Endpoint               | Resumo                                          | Necessita Autenticação               | Role
|--------|----------------------|-----------------------------------------------------|--------------------------|----------------------
<kbd>POST</kbd> | <kbd>/oauth2/token</kbd> | Responsável por autenticar usuário e gerar o Bearer Token JWT. Utiliza o *Basic Auth* e o corpo de requisição do tipo *x-www-form-urlencoded* com as chaves: *username*, *password* e *grant_type* | Sim | *
<kbd>GET</kbd> | <kbd>/users/me</kbd> | Responsável por listar as informações do usuário que esta na sessão | Sim | ROLE_ADMIN, ROLE_CLIENT
<kbd>GET</kbd> | <kbd>/products</kbd> | Responsável por listar todos os produtos | Não | *
<kbd>GET</kbd> | <kbd>/products/:id</kbd> | Responsável por exibir um produto especifico por seu ID | Não | *
<kbd>POST</kbd> | <kbd>/products</kbd> | Responsável por cadastrar um produto | Sim | ROLE_ADMIN
<kbd>PUT</kbd> | <kbd>/products/:id</kbd> | Responsável por atualizar um produto, informando o ID no Path e via corpo de requisição as informações | Sim | ROLE_ADMIN
<kbd>PUT</kbd> | <kbd>/products/:id</kbd> | Responsável por deletar um produto, informando o ID no Path | Sim | ROLE_ADMIN
<kbd>GET</kbd> | <kbd>/categories</kbd> | Responsável por listar todos as categorias | Não | *
<kbd>POST</kbd> | <kbd>/orders</kbd> | Responsável por gerar uma ordem de uma compra | Sim | ROLE_CLIENT
<kbd>GET</kbd> | <kbd>/orders/:id</kbd> | Responsável por listar os produtos na ordem de uma compra especifica e seu status, informando o ID | Sim | ROLE_ADMIN, ROLE_CLIENT
<kbd>GET</kbd> | <kbd>/h2-console</kbd> | Responsável por acesso ao *H2 Database* | Sim | *
