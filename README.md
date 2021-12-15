# spring-boot-jwt

This is an example project where a Spring REST API is secured using JSON Web Tokens. 


Using the application

1.
POST  http://localhost:8080/authenticate

{
"username": "frok",
"password":"frik"
}

2.
GET http://localhost:8080/hello
// in header key -> Value
//          [{"key":"Authorization","value":"Bearer xxx","description":""}]



[Blog post on this subject](https://aboullaite.me/spring-boot-token-authentication-using-jwt)