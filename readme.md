# Header

1. Write a function that takes in a list of integers as an argument
and returns true if it contains two integers that are the same, false
otherwise.

# Two solutions

1.  You can solve the contains pair problem by using a nested loop. The first loop iterates through the entire list, choosing one element to compare at a time. Then, for each element, there is another loop that iterates through the rest of the elements in the list. The choosen element is then compared every remaining element in the list. If there is the same element, then the list contains a pair. This method has a chance of being very inefficient due to nested loops. The same elements are being accessed over and over.

2.  A more efficient way of solving this problem is to create a set. You can iterate through every element and see if it has yet been added to the set. If the element is in the set already, then the list contains a pair. Otherwise, add that element to the set, in the event that there is the same element further in the list. This is very efficient. 