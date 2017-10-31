# Answers
## Lorentz Lab-5

1. What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
   
   The purpose is to make sure the test cases are able to modify the stack correctly so they may pass.
   
2. Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
   
   They need arguments in order to update variables in order to make progress through the data strucutres.
   The argument moves from node to node in each call and result grows in size.
   
3. What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
   
   populateList: O(n)
   populateFifoList: O(n)
   ReverseLines.printReverse: O(n)
   
4. Which of these methods can be implemented using while loops?
   
   ReverseLines.printReverse, populateList, and populateFifoList
