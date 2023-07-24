Using the BufferedReader class, read and buffer the text from the console. The text will be
stored later in a text file. If the line is empty (the user just presses Enter) the program should be
finished, after the text is stored. To store the text, the program should create the directiory ”data”
(if it is not existing already), and store it in the file ”log0.txt”. If the file ”log0.txt” already exists,
this file should be copied onto the file ”log1.txt” and then removed, at the start of the program.
Similarly, ”log1.txt” should be copied onto ”log2.txt”, and so on, thus ”log0.txt” holds always
the newest log. The last file should be ”log5.txt” and its content is always removed. Provide
appropriate exceptions to handle the situations, when one of the log files is opened by another
application, and cannot be removed, or you do not have an access to that file

## In folder where you have that code there should be another folder called "data"
