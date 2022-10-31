# Graded-Project_Ch9

## UML Class Diagram *** required for project ***

Class: *** Account ***
---
- _id: int_
- _balance: double_
- _annualInterestRate: double_
- dateCreated: Date
---
+ Account()
+ Account(id: int , initialBalance: double)
+ getID(): int
+ _setID(int newID): void_
+ getBalance(): double
+ _setBalance(double newBalance): void_
+ getAnnualInterestRate(): double
+ _setAnnualInterestRate(double newAnnualRate): void_
+ getMonthlyInterest(): double
+ withdraw(double amountToWithdraw): void
+ deposit(double amountToDeposit): void
+ getDateCreated(): Date
---

Object: { __Account: account__ }
---
- _id: int_
- _initialBalance: double_
---

## Design: 
a java `class` named _Account_ that contains,

  ### Data Fields
  + `private` **int id = 0** at default
  + `private` **double balance = 0** at default
  + `private` **double annualInterestRate = 0** at default
    + stores current interest rate
  + `private` _Date_ **dateCreated**
    + stores the date the account was created
  
  ### Constructors
  + a `no-arg` constructor that creates a `default` account
  + a constructor that creates an account with the specfied **id** and initial **balance**
  
  ### Getters & Setters
  + `Accessor` and `mutator` methods for **id**, **balance**, and **annualInterestRate**.
  + `Accessor` method for **dateCreated**
  
  ### Methods
  + a method named [getMonthlyInterestRate()]
    + returns the monthly interest rate
  + a method named [withdraw]
    + withdraws a specified amount from the account
  + a method named [deposit]
    + deposits a specified amount to the account
  
## Tasks

  + Draw the `UML diagram` for the class
  + Implement _Account_ class
  + Write a *** test *** program that:
    + creates an _Account_ object with: 
      + an account **id** of `1122`
      + a **balance** of `$20,000`
      + an **annualInterestRate** of `4.5%`
    + Uses the [withdraw] method to withdraw `$2,500`
    + Uses the [deposit] method to deposit `$3,000`
    + Prints the **balance**, [getMonthlyInterestRate()], and **dateCreated**