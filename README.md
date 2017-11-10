# Loan allocation coding challenge

A requirement of the Funding Circle marketplace is to fairly allocate loans to investors, according to certain investor-specific criteria.

In this coding challenge you are required to write code that takes a loan as input and allocates it to an investor.

## Challenge data

**Loans** have the following attributes:

* *id* - The unique id of the loan.
* *category* - The category of the loan (Property, Retail, Medical).
* *risk-band* - The risk band associated with the loan (A+, A, B, C, D, E).
* *amount* - The amount of the loan (in £).

An example **loan**:

`{id -> 1234567,
category -> :property,
risk-band -> :A+,
amount -> 1000}`

For the challenge, you should assume there are 3 **Investors**: *Bob*, *Helen* and *Jamie*.

## Investor criteria
Your code should fairly allocate loans according to certain investor-specific criteria.

* *Bob* - only wants to invest in property loans.
* *Helen* - wants to invest in a maximum of 40% property loans.
* *Jamie* - wants to invest only in high grade (> B) property loans.

## Notes
* All state should be handled in memory.
* [Advanced] You should assume that there is > 1 thread allocating loans.
