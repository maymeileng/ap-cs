Introduction: To create classes and methods based on the code already provided to us, while also using 
our own interpretation of the code to write the code.

My project: I fulfilled the the specification of the first block of code by creating all of the appropriate
classes and passing constructors the correct arguments. I also used HashMaps for the TruthAssignment class 
to assign a boolean value to key Proposition Constants and have a get method that returned the values.
However, I failed to create the evaluate method, the truth table, and the findMatch method. Furthermore, I
did create a legal method that checked whether or not a logical sentence was legal, but there were errors in it.

Current errors: In the evaluate method, I managed to run the get method of TruthAssignment. But I did not know
where to continue after that because LogicalSentence and PropositionConstant's classes have nothing to do with 
boolean values (since the only argument it is passed is a PropositionContant), so I couldn't find a way to 
relate the logical sentences to those boolean values in the first place. Furthermore, whenever the Negation class
was used, I had no way of updating that that sentence's value was now the opposite of what it was before 
because it also had no links to boolean values or TruthAssignment. I might fix this by passing LogicalSentence
an additional argument of the TruthAssignment ta1 so that I can actually keep track of its truth value. In the
legal method, for some reason
