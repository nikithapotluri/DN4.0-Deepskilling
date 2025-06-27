CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account_id IN NUMBER,
    p_to_account_id   IN NUMBER,
    p_amount          IN NUMBER
) AS
    v_from_balance NUMBER;
BEGIN
    SELECT Balance INTO v_from_balance
    FROM Accounts
    WHERE AccountID = p_from_account_id;

    IF v_from_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance in account ' || p_from_account_id);
    ELSE
        UPDATE Accounts
        SET Balance = Balance - p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_from_account_id;

        UPDATE Accounts
        SET Balance = Balance + p_amount,
            LastModified = SYSDATE
        WHERE AccountID = p_to_account_id;

        DBMS_OUTPUT.PUT_LINE('Transfer successful: ' || p_amount || 
                             ' transferred from Account ' || p_from_account_id || 
                             ' to Account ' || p_to_account_id);
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Error: One or both account IDs are invalid.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
END;
/


SET SERVEROUTPUT ON;

BEGIN
    TransferFunds(1, 2, 300); 
END;
/



SELECT * FROM Accounts WHERE AccountID IN (1, 2);