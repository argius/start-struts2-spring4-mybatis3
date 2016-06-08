start-struts2-spring4-mybatis3
==============================

A starter for struts2-spring4-mybatis3 with Maven.


Main Dependencies
=================

- Struts 2.5
- Spring 4.2.6
- MyBatis 3.4.0


Settings
========

You need to create a table into your database using below DDL to run codes for accessing a database.

```sql
create table users (
  id bigint primary key,
  name varchar(128),
  age smallint
)
```


License
=======

Apache License 2.0
