# Trees
<!-- Short summary or background information -->
* Trees are Data structures used to store and organize data.
* Trees are a collection of nodes, and they are linked with edges (pointers), representing the hierarchical connections between the nodes.
* Trees are non-linear data structures.

## Challenge
<!-- Description of the challenge -->
1. Create a Binary Tree that have three method for each of the depth first traversals: 
preOrder, inOrder and postOrder which returns an array of the values, ordered appropriately.
2. Create a Binary Search Tree that is subclass of Binary Tree and have two methods which are 
add method have value as arg and return nothing and Contains have value as arg and return boolean 
3. indicating whether or not the value is in the tree at least once

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Big O for the methods :
* preOrder: time -> O(1), Space ->O(n) 
* inOrder: time -> O(1), Space ->O(n)
* postOrder: time -> O(1), Space ->O(n)
* add : time -> O(n), Space ->O(1)
* contains:  time -> O(n), Space ->O(1)
## API
<!-- Description of each method publicly available in each of your trees -->
* Methods for depth first traversal:
1. preOrder: return an array list for the tree as root » left » right
2. inOrder: return an array list for the tree as  left » root » right
3. postOrder: return an array list for the tree as  left » right » root
* add(value) : method that accept value as arg and return nothingm this method will adds a new node
with that value in the correct location in the binary search tree.
* contains(value): method that accept value as arg and return boolean indicating whether or not the value is in the tree at least once
