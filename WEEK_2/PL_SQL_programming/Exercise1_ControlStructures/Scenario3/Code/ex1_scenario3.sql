SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT c.Name, l.LoanID, l.EndDate
        FROM Loans l
        JOIN Customers c ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || rec.Name || 
                             ', your loan (Loan ID: ' || rec.LoanID || 
                             ') is due on ' || TO_CHAR(rec.EndDate, 'DD-MON-YYYY') || '. Please make necessary arrangements.');
    END LOOP;
END;
/