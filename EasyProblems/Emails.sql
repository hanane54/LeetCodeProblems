-- simple practice for sql: get duplicate emails 
select email as Email from Person group by email having count(email)>1;