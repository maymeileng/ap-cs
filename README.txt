Introduction
In this assignment, I created a priority queue class from scratch with the use of the ArrayList class. I wrote 
main methods for the class: poll, peek, add, offer, clear, and merge.
Meeting the Specifications
I managed to successfully write methods for a constructor, and poll, peek, add, offer, and clear methods. However,
I could not figure out how to get the merge method to work. 
Explanation of current errors
The current error is with my merge method. I can't find a way to differentiate between the current instance 
variable (the this.queue instance variable) and the other "PriorityQueue a" variable that I want to merge into the
current queue. The problem is that the ArrayList methods size and get do not work for the class, but when I try
to write size and get methods for the class, I can't make it work because I want to apply it to "PriorityQueue a" 
and not this.queue. I may fix it by somehow finding a different way of merging two queues together without having 
to use get or size methods. 
Code Structure
The structure of my code follows the standard structure of a class. It starts with a constructor method that takes
no arguments and creates an instance of the class with an element capacity of eleven. Then, there are the instance
methods poll, peek, add, offer, clear, and merge. There are also private helper methods in the class, which are
findMax and order methods that are used in the poll/peek and add/offer methods respectively.  
Major Challenges
As explained in the current errors section above, I am having a challenge with the merge method for the reasons 
explained in the paragraph above. I also had troubles with the order method. At first, I was using a for loop
and comparing consecutive elements with each other, and assigning the smaller one to the zeroth index, while
adding one to the index. I definitely new my code was missing a lot of stuff because I was only comparing the 
elements in the array once, the whole thing was not sorted. Moreover, by reassigning the elements, I lost a lot
of the elements in the original array, so I got a lot of repeated elements in the array. I finally figured out
that I also needed a while loop with a boolean value along with a "temporary" variable so that I could swap 
elements instead of completely reassigning elements. Furthermore, the while loop will allow for the entire array
to be sorted from least to greatest.
Acknowledgments
I would like to thank Anuva and Mr. Kuszmaul for explaining to me what the priority queue class is and 
specifically what the methods in the class should do and are meant to do. I would also like to acknowledge 
Oracle Help Center for also describing the priority queue class in detail, and all of its methods in detail. The 
link to that website is: https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html.
