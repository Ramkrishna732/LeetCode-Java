select a.name as "Employee" from Employee AS a,Employee as b 
where a.ManagerId = b.id AND a.salary> b.salary;