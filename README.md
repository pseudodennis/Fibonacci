## Recursive Fibonacci Sequence
> Dale, Joyce, Weems (4th) p213 #33  

The Fibonacci sequence is the series of integers  

`0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 . . .`  

See the pattern? Each element in the series is the sum of the preceding two elements. 
Here is a recursive formula for calculating the nth number of the sequence:
 
| Fib(N) = | N,                  | if N = 0 or 1 |
|----------|---------------------|---------------|  
| Fib(N) = | Fib(N-2) + Fib(N-1) | if N > 1      |

1.  Write a recursive method `fibonacci` that returns the nth Fibonacci number 
when passed the argument `n`.  
2.  Write a nonrecursive version of the method `fibonacci`.  
3.  Write a driver to test your two versions of the method `fibonacci`.  

4.  Compare the recursive and iterative versions for efficiency. (Use words, not O(N) notation.)
    >   The recursive version seems like it is more efficient for the programmer to code and for other programmers to read and understand. However, the recursive version requires a great deal of overhead, as each method must be stored on the runtime stack. Since the calculation requires two recursive method calls, the overhead grows exponentially with every increase in sequence calculation. 
