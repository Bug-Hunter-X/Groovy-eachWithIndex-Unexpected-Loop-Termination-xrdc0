# Groovy eachWithIndex Unexpected Loop Termination
This repository demonstrates a subtle bug in Groovy's `eachWithIndex` method. When a null check is performed within the loop and a null value is encountered, the `return` statement prematurely terminates the entire loop instead of just the current iteration. 

This can lead to unexpected behavior and missing processing of elements after the null value.

The `bug.groovy` file contains the buggy code, while `bugSolution.groovy` provides the corrected version.  The solution utilizes `each` with an index tracker to maintain the expected functionality.