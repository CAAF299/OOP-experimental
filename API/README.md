This is an experimental, basic API that is the combination of 
the various knowledge that i gathered with springboot, which 
recieves json payloads in a temporary space in memory instead of 
being connected with a database.

For now, this small project lacks portability. I'll add that feature in
the future.




\\SAMPLE COMMANDS FOR COMMUNICATING WITH THE API VIA CURL : \\ 


1. Getting the API respone body.

curl http://localhost:8080/api/users/info

OUTPUT : 

This is an API running on port 8080.



2. Creating a resource.

curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d '{"age": 19, "name": "Alexander"}'

OUTPUT:

{"adult":true,"age":19,"id":122,"name":"Alexander"}

PS : The id varies because it's randomly generated.


3. Fetching a resource


curl http://localhost:8080/api/users/122
("122" is the Id that the API assigned to our entry.)

OUTPUT:

{"adult":true,"age":19,"id":122,"name":"Alexander"}

(it got the object that we needed)


4. Editing a resource :


curl -X PUT http://localhost:8080/api/users/122 -H "Content-Type: application/json" -d '{"age": 29, "name": "Alexander" }'


OUTPUT: 

{"adult":true,"age":29,"id":122,"name":"Alexander"}


5. Look up currently created entries :

curl http://localhost:8080/api/users


OUTPUT :

[{"adult":true,"age":29,"id":122,"name":"Alexander"}, {"adult":true,"age":37,"id":131,"name":"Maurice"}]

If you have multiple entries, it'll list them in an array.


6. Delete an entry : 

curl -X DELETE http://localhost:8080/api/users/131
