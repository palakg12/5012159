--Exercise 6: Cursors
--Scenario 1: GenerateMonthlyStatements

DECLARE
    CURSOR cur_statements IS
        SELECT c.CustomerID, c.Name, t.TransactionDate, t.Amount, t.TransactionType
        FROM Customers c
        JOIN Accounts a ON c.CustomerID = a.CustomerID
        JOIN Transactions t ON a.AccountID = t.AccountID
        WHERE t.TransactionDate BETWEEN TRUNC(SYSDATE, 'MM') AND LAST_DAY(SYSDATE);

BEGIN
    FOR r IN cur_statements LOOP
        DBMS_OUTPUT.PUT_LINE('Customer ID: ' || r.CustomerID || ', Name: ' || r.Name || ', Date: ' || r.TransactionDate || ', Amount: ' || r.Amount || ', Type: ' || r.TransactionType);
    END LOOP;
END;

--Scenario 2: ApplyAnnualFee

DECLARE
    CURSOR cur_annual_fee IS
        SELECT AccountID, Balance
        FROM Accounts;

    v_annual_fee CONSTANT NUMBER := 50; -- Define annual fee amount
BEGIN
    FOR r IN cur_annual_fee LOOP
        UPDATE Accounts
        SET Balance = Balance - v_annual_fee
        WHERE AccountID = r.AccountID;
    END LOOP;
    COMMIT;
END;

--Scenario 3: UpdateLoanInterestRates

DECLARE
    CURSOR cur_loans IS
        SELECT LoanID, InterestRate
        FROM Loans;

    v_new_interest_rate CONSTANT NUMBER := 7; -- Define new interest rate
BEGIN
    FOR r IN cur_loans LOOP
        UPDATE Loans
        SET InterestRate = v_new_interest_rate
        WHERE LoanID = r.LoanID;
    END LOOP;
    COMMIT;
END;