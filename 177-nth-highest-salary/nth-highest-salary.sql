CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      select salary from 
      (select salary, Dense_Rank() over(order by salary desc) AS rnk from Employee) t
      where rnk=N 
      limit 1

  );
END