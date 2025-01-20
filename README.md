# ToDoApp
Assa Abloy programming task using Spring Data Rest API.

http://localhost:8080/swagger-ui/index.html

curl -i -X GET -H "Content-Type:application/json" http://localhost:8080/api/todos

curl -X 'POST' 'http://localhost:8080/api/todos' -H 'accept:application/hal+json' -H 'Content-Type: application/json' -d '{"todoName": "rakdr538", "category": "names", "toDoStatus": "Active"}'
