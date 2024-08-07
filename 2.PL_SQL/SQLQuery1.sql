-- Scenario 1: Apply a 1% discount to loan interest rates for customers above 60 years old

BEGIN
    FOR r IN (SELECT LoanID, InterestRate, CustomerID, 
                     (SYSDATE - DOB) / 365 AS Age 
              FROM Loans l JOIN Customers c ON l.CustomerID = c.CustomerID) LOOP
        IF r.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = r.LoanID;
        END IF;
    END LOOP;
END;


--Scenario 2: Set IsVIP to TRUE for customers with a balance over $10,000


BEGIN
    FOR r IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF r.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = r.CustomerID;
       END IF;
    END LOOP;
END;

--Scenario 3: Send reminders to customers whose loans are due within the next 30 days

BEGIN
    FOR r IN (SELECT LoanID, CustomerID, EndDate 
              FROM Loans 
              WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || r.LoanID || ' for customer ' || r.CustomerID || ' is due on ' || r.EndDate);
    END LOOP;
END;