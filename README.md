# Loan allocation coding challenge

One of the requirements of the Funding Circle market place is to be able to fairly allocate loans to investors, according to certain investor specified criteria.

In this coding challenge you are required to write some code that takes a loan as input and allocates it to one of a number of investors.


## Challenge data

**Loans** are modelled such that they have the following attributes:

* *id* - The unique id of the loan
* *category* - The category of the loan (Property, Retail, Medical)
* *risk-band* - The risk band associated with the loan (A+, A, B, C, D, E)
* *amount* - The amount of the loan in £

So an example **loan** would look something like:

`{id -> 1234567,
category -> :property,
risk-band -> :A+,
amount -> 1000}`

For the challenge you should assume there are 3 **Investors**: *Bob*, *Helen* and *Jamie*.

## Investor criteria
As mentioned above, your code should fairly allocate loans according to certain investor specified criteria.

* *Bob* - only wants to invest in property loans.
* *Helen* - wants to invest in a maximum of 40% property loans.
* *Jamie* - wants to invest only in high grade (> B) property loans.

## Notes
* All state should be handled in memory
* You should assume that there is > 1 thread allocating loans
