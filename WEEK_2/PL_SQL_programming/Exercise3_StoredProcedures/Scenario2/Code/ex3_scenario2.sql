CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_pct IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE Department = p_department;
    
    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_pct || '% applied to department: ' || p_department);
END;
/


SET SERVEROUTPUT ON;

BEGIN
    UpdateEmployeeBonus('IT', 10);
END;
/



SELECT * FROM Employees WHERE Department = 'IT';