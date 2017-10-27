# Answers
## Ensminger-Lorentz 

1. The linked stack has a default empty parameter, and for the sake of DRY we do not need to implement one
2. Push, Peek, Pop and isEmpty are O(1), asList, reverseLines is O(n)
3. Instantiate an ArrayList and as the data is pushed into the stack, add it to the arraylist so it can be returned with O(n)
4. Pros of just item: if you just want to access the top item one at a time, which is usually the motivation of using Stack
   Cons of just item: it you have an item deeper in the stack, or an error then you don't know until you pop and runtime suffers
   Pros of returning whole stack: it is easy to compare the whole stack at once for errors
   Cons of whole stack: must return more data and breaks the abstraction of using a stack in the first place