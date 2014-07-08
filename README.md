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

When finished, just enter a lower-case 'q' at the prompt.
To look at the stack (currently an array of size 4), type 's'.

One more note: if you overfill the stack, the bottom of the stack is deleted,
and the values above drop down. If you enter: 1 2 3 4 5, the stack will contain
the values 2, 3, 4 and 5 (for a stack of size 4 - the current setting).
