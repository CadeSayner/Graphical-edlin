# Graphical-edlin
A program to manage a set of graphical objects based on the commands in a specified file. This is a graphical equivalent of the famous edlin tool for text manipulation.

In order to run the program a text file named myfile.txt (There is a sample file included) must be present in the directory with all the compiled classes. 

Each line of the file contains an instruction in one of the formats given below:
a <id> <x> <y> rectangle <x_length> <y_length>
a <id> <x> <y> hline <x_length>
a <id> <x> <y> vline <y_length>
a <id> <x> <y> ptline <x1> <y1>
w
d <id>
m <id> <x> <y>
x

Explanation:

‘a’ adds an object of a particular type (rectangle/hline/vline/ptline) with the specified 
parameters.

‘w’ renders/draws the objects and prints the composite image to the screen.
Version: 08/09/2022 12:48:25

‘d’ deletes an object based on its id.

‘m’ moves an object to a new position based on its id.

‘x’ exits the program.

hline - horizontal line.
vline - vertical line. 
ptline - a line connecting two given points. 

The driver class can be modified in order to change the file name and the size of the grid on which the final rendering is displayed. 
