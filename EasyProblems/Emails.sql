-- can be found in https://leetcode.com/problems/duplicate-emails/
-- Runtime 421ms Beats 19.45
-- simple practice for sql: get duplicate emails 
select email as Email from Person group by email having count(email)>1;