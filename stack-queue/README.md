# Stacks and Queues
* A Stack is a linear data structure or container of objects that are inserted and removed according to the last-in first-out (LIFO) principle or First-In Last-Out (FILO) principle, that mean the sequential access is only possible.

* A Queue is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO) and (LILO) Last-In Last-Out principle

## Challenge
<!-- Description of the challenge -->
create Stack class has a top property. It creates an empty Stack when instantiated.
The class should contain the following methods: push,pop,peek and isEmpty.

create Stack class has a front property. It creates an empty Queue when instantiated.
The class should contain the following methods: enqueue, dequeue, peek, isEmpty.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For all the method in Stack and Queue take same time and space complexity which is :
**Time -> O(1)**
**Space -> O(1)**


## API
<!-- Description of each method publicly available to your Stack and Queue-->
#### Stack method :
* push(x): used to insert node at the top of the stack (pushed), we need to pass element that want to be bushed .
* pop() : used to delete node from the top of the stack and we don't pass an arg. it checked if the stack is empty or not before conducting a pop to ensure that an exception is not raised.
* Peek(): function just returns the value of the top element available in the stack. it checked  if the stack is empty or not before conducting a peek to ensure that an exception is not raised.
* isEmpty() : this function will return a true value if the stack is empty or otherwise it will return a false value.

#### Queue method :
* enqueue(x) - used to add node at the rear of the queue,  need to pass arg that want to be added .
* dequeue() - used to delete node from the queue and don't need to pass an arg. it checked if the stack is empty or not before conducting a Dequeue to ensure that an exception is not raised.
* Peek() - function just returns the value of the Front element available in the queue. it checked if the queue is empty or not before conducting a peek to ensure that an exception is not raised.
* isEmpty() - returns true when queue is empty otherwise returns false.