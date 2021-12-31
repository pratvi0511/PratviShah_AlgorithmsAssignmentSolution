# PratviShah_AlgorithmsAssignmentSolution
PART 2\
Marks : 40 \
PROBLEM STATEMENT\
You are working as a software engineer in a Financial Company, Stockers.
Stockers is a leading MNC that specializes in analyzing a company’s shares and consulting 
investors/traders.
Till today the company is working manually and wants to be digital. As a Software Engineer, you 
are required to code user stories and create the first version of the application.
The Application will accept the no of companies N, that the user wants to store records of.
a) Users will enter the share price(double format) of N companies.
b) Users will enter a boolean value(TRUE, FALSE) of each company, to keep track of the 
company’s share price compared to yesterday. 
The user will enter value through the console.
Insight: If today the share price of the company is greater than that of yesterday then the user 
will input TRUE, else the user will input FALSE. In the given test cases true, false values are 
entered randomly. You can also input values TRUE/FALSE on your own.
USER can perform the following operations in the application:
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price //it will only display whether the stock price is present or not.
Note: The time complexity(average, best, worst) of the sorting function used should not be more 
than O(nlogn).
Consider the following test cases/ sample output
TESTCASE 1
enter the no of companies
1
Enter current stock price of the company 1
112.02
Whether company's stock price rose today compare to yesterday?
true
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
1
Stock prices in ascending order are :
112.02 
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
2
Stock prices in descending order are :
112.02 
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
3
Total no of companies whose stock price rose today : 1
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
4
Total no of companies whose stock price declined today : 0
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
5
enter the key value
112.02
Stock of value 112.02 is present 
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
0
Exited successfully
Explanation: User has given input of only 1 company and its share rose today compared to 
yesterday as the user has given input true.
Hence, Total no of companies whose stock price rose today : 1
 Total no of companies whose stock price declined today : 0
TESTCASE 2
enter the no of companies
2
Enter current stock price of the company 1
10.25
Whether company's stock price rose today compare to yesterday?
false
Enter current stock price of the company 2
200.02
Whether company's stock price rose today compare to yesterday?
true
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
3
Total no of companies whose stock price rose today : 1
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
0
Exited successfully
Explanation : there is only 1 company among two companies whose stock price rose 
today (i.e company’s 2 input was true)
Hence, Total no of companies whose stock price rose today : 1
 
TESTCASE 3
enter the no of companies
3
Enter current stock price of the company 1
10.25
Whether company's stock price rose today compare to yesterday?
false
Enter current stock price of the company 2
85.25
Whether company's stock price rose today compare to yesterday?
true
Enter current stock price of the company 3
52.25
Whether company's stock price rose today compare to yesterday?
true
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
1
Stock prices in ascending order are :
10.25 52.25 85.25 
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
2
Stock prices in descending order are :
85.25 52.25 10.25 
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
3
Total no of companies whose stock price rose today : 2
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
4
Total no of companies whose stock price declined today : 1
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
5
enter the key value
10.25
Stock of value 10.25 is present 
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
0
Exited successfully
TESTCASE 4
enter the no of companies
1
Enter current stock price of the company 1
10.25
Whether company's stock price rose today compare to yesterday?
false
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
4
Total no of companies whose stock price declined today : 1
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
5
enter the key value
10
Value not found
-----------------------------------------------
Enter the operation that you want to perform
1. Display the companies stock prices in ascending order
2. Display the companies stock prices in descending order
3. Display the total no of companies for which stock prices rose today
4. Display the total no of companies for which stock prices declined today
5. Search a specific stock price
6. press 0 to exit
-----------------------------------------------
0
Exited successfully
