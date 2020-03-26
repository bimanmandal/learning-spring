## Download Mongo DB
https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2012plus-4.2.5-signed.msi

## What is MongoDB Compass
The GUI for MongoDB. Visually explore your data. Run ad hoc queries in seconds. Interact with your data with full CRUD 
functionality. View and optimize your query performance.

https://www.mongodb.com/download-center/compass

```shell script
mongo.exe --username alice --password --host "mongodb://localhost:27017" 
```
```javascript
db.createUser(
  {
    user: "root",
    pwd: "root123",
    roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
  }
)
```