-- Seleccionamos el nombre del empleado como 'Employee'
SELECT e1.Name AS Employee

-- Hacemos un JOIN de la tabla Employee consigo misma
-- e1 representa al empleado, e2 representa a su manager
FROM Employee e1
JOIN Employee e2 ON e1.ManagerId = e2.Id

-- Filtramos los casos donde el salario del empleado es mayor que el de su manager
WHERE e1.Salary > e2.Salary;
