create database myapp10001 with encoding='UTF8' owner=postgres template=template1 connection limit=-1 tablespace=pg_default;
create user madhu with password 'madhu123';
grant all privileges on database myapp10001 to madhu;