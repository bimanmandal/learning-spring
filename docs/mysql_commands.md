### Setup Mysql Environment
1. Download and Install [Mysql](https://dev.mysql.com/downloads/installer/)
2. Open Mysql shell
3. Create a seperate database and user for springboot application
```mysql-sql
CREATE DATABASE spring_sample;
CREATE USER 'springbootjpa'@'%' identified by 'SpringPassword';
grant all on spring_sample.* to 'springbootjpa'@'%';
```