--Exercise 7: Packages
--Scenario 1: CustomerManagement

CREATE OR REPLACE PACKAGE CustomerManagement IS
    PROCEDURE AddCustomer(p_customer_id NUMBER, p_name VARCHAR2, p_dob DATE, p_balance NUMBER);
    PROCEDURE UpdateCustomerDetails(p_customer_id NUMBER, p_name VARCHAR2, p_dob DATE);
    FUNCTION GetCustomerBalance(p_customer_id NUMBER) RETURN NUMBER;
END CustomerManagement;


CREATE OR REPLACE PACKAGE BODY CustomerManagement IS
    PROCEDURE AddCustomer(p_customer_id NUMBER, p_name VARCHAR2, p_dob DATE, p_balance NUMBER) IS
    BEGIN
        INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
        VALUES (p_customer_id, p_name, p_dob, p_balance, SYSDATE);
        COMMIT;
    END AddCustomer;

    PROCEDURE UpdateCustomerDetails(p_customer_id NUMBER, p_name VARCHAR2, p_dob DATE) IS
    BEGIN
        UPDATE Customers
        SET Name = p_name, DOB = p_dob, LastModified = SYSDATE
        WHERE CustomerID = p_customer_id;
        COMMIT;
    END UpdateCustomerDetails;

    FUNCTION GetCustomerBalance(p_customer_id NUMBER) RETURN NUMBER IS
        v_balance NUMBER;
    BEGIN
        SELECT Balance INTO v_balance
        FROM Customers
        WHERE CustomerID = p_customer_id;
        RETURN v_balance;
    END GetCustomerBalance;
END CustomerManagement;

--Scenario 2: EmployeeManagement

CREATE OR REPLACE PACKAGE EmployeeManagement IS
    PROCEDURE HireEmployee(p_employee_id NUMBER, p_name VARCHAR2, p_position VARCHAR2, p_salary NUMBER, p_department VARCHAR2, p_hire_date DATE);
    PROCEDURE UpdateEmployeeDetails(p_employee_id NUMBER, p_name VARCHAR2, p_position VARCHAR2, p_salary NUMBER, p_department VARCHAR2);
    FUNCTION CalculateAnnualSalary(p_employee_id NUMBER) RETURN NUMBER;
END EmployeeManagement;


CREATE OR REPLACE PACKAGE BODY EmployeeManagement IS
    PROCEDURE HireEmployee(p_employee_id NUMBER, p_name VARCHAR2, p_position VARCHAR2, p_salary NUMBER, p_department VARCHAR2, p_hire_date DATE) IS
    BEGIN
        INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
        VALUES (p_employee_id, p_name, p_position, p_salary, p_department, p_hire_date);
        COMMIT;
    END HireEmployee;

    PROCEDURE UpdateEmployeeDetails(p_employee_id NUMBER, p_name VARCHAR2, p_position VARCHAR2, p_salary NUMBER, p_department VARCHAR2) IS
    BEGIN
        UPDATE Employees
        SET Name = p_name, Position = p_position, Salary = p_salary, Department = p_department
        WHERE EmployeeID = p_employee_id;
        COMMIT;
    END UpdateEmployeeDetails;

    FUNCTION CalculateAnnualSalary(p_employee_id NUMBER) RETURN NUMBER IS
        v_salary NUMBER;
    BEGIN
        SELECT Salary INTO v_salary
        FROM Employees
        WHERE EmployeeID = p_employee_id;
        RETURN v_salary * 12;
    END CalculateAnnualSalary;
END EmployeeManagement;

--Scenario 3: AccountOperations

CREATE OR REPLACE PACKAGE AccountOperations IS
    PROCEDURE OpenAccount(p_account_id NUMBER, p_customer_id NUMBER, p_account_type VARCHAR2, p_balance NUMBER);
    PROCEDURE CloseAccount(p_account_id NUMBER);
    FUNCTION GetTotalBalance(p_customer_id NUMBER) RETURN NUMBER;
END AccountOperations;


CREATE OR REPLACE PACKAGE BODY AccountOperations IS
    PROCEDURE OpenAccount(p_account_id NUMBER, p_customer_id NUMBER, p_account_type VARCHAR2, p_balance NUMBER) IS
    BEGIN
        INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
        VALUES (p_account_id, p_customer_id, p_account_type, p_balance, SYSDATE);
        COMMIT;
    END OpenAccount;

    PROCEDURE CloseAccount(p_account_id NUMBER) IS
    BEGIN
        DELETE FROM Accounts
        WHERE AccountID = p_account_id;
        COMMIT;
    END CloseAccount;

    FUNCTION GetTotalBalance(p_customer_id NUMBER) RETURN NUMBER IS
        v_total_balance NUMBER;
    BEGIN
        SELECT SUM(Balance) INTO v_total_balance
        FROM Accounts
        WHERE CustomerID = p_customer_id;
        RETURN v_total_balance;
    END GetTotalBalance;
END AccountOperations;


