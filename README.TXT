Introduction
In this assignment, I inserted code into the coding bat setstuff problems to pass the tests, and made a class
that contains all of the methods created in coding bat.
Meeting the Specifications
I successfully passed every coding bat problem except for collectNodes, which I had an extremely difficult time
with. I also successfully put all the methods in coding bat into a class called SetStuff.
Explanation of current errors
The only error I have right now is with my collectNodes method. As of now, I can get the union of the elements 
within each ArrayList element in the 2D ArrayList, my problem is how to make the union only contain distinct
elements and have the elements appear in the same order they were in originally. I have a feeling that I could
somehow implement the helper methods I created for the intersect method to help me create an ArrayList of unique
elements, but I would still have the problem of achieving the correct element order.
Code Structure
The structure of my code is that the order of my methods follow the order the methods are in in the coding bat 
page. Any additional helper methods are placed right next to the method that they are used in, to ensure that
the helper methods are easy to find and my code is easy to follow and understand. Inside each method, the basic
structure of the code usually starts with assigning an arbitrary value to the variable that I will return at the
end of the method, followed by for loops and if statements, and then the return statement.
Major Challenges
The biggest challenge I faced was with the intersect method. It was much more challenging than I had anticipated,
because I had a really hard time thinking of the most straightforward and logical way to compare every digit in
the two arrays with each other to find ones that matched. It is really easy for me to overthink and needing to plan
out every step that I often get stuck. What I found very helpful was to just write down a simple for loop first
and test out whatever I could think of and see what the result was. From there, it made it easier for me to
adjust the for loops and indexes so that I got the result that I wanted. I also figured out that it was much easier
to just use an ArrayList first and then convert that back into an array.
Acknowledgments
I would like to thank Stack Overflow (https://stackoverflow.com/questions/4211054/hard-coding-a-two-dimensional-array-error)
for reminding me how to hardcode java arrays. I would also like to thank https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
for allowing me to search for the right ArrayList methods that I wanted to perform a specific task.