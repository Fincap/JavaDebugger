# JDebugger
A simple and lightweight java library useful for implementing a system output debugger into any program. The static class is simple to use, and can be turned on and off at any point in a program. Includes optional timestamping. Useful for debugging with logging.

Faster, flexible, and more customizable than using `System.out.printf()`.

### Enable/disable debugger
*Enabled by default*

`Debugger.setEnabled(true)`

### Enable/disable timestamps
*Enabled by default*

`Debugger.setTimestampEnabled(true)`

### Write to system output
`Debugger.log(string, args...)`

For example

`Debugger.log("New point at %.2f : %.2f", pointA, pointB)`

Will output

`[2019.06.21|22:00:42] New point at 14.93 : 12.77`
