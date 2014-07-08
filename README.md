This is an rpn (or postfix) calculator.

The main() method is in calc.java.

At the prompt, you can enter your numbers and operands all on the same line,
or you can enter them piece by piece on separate lines. Each number goes
onto the stack. When an operator is encountered, two numbers are popped from
the stack, and the result is pushed in their place.

Example run ("?" is your prompt, the following line shows the result):

```
? 45 55 +
100
? 10 5 * +
50
150
```

To look at the stack (currently an array of size 8), type 's'.

If you overfill the stack, the bottom of the stack is deleted,and the numbers 
above drop down. For example, if you enter: 1 2 3 4 5 6 7 8 9 10, the stack will 
consist of the last 8 numbers (because the stack size is set to 8).

To quit, type 'q'
