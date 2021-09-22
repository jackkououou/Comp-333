Assignment 1
for powershell
compile : javac -cp '.;hamcrest-2.2.jar;junit-4.13.jar' -Xlint:all ImmutableList.java Cons.java Nil.java ImmutableListTest.java
run test : java -cp '.;hamcrest-2.2.jar;junit-4.13.jar' org.junit.runner.JUnitCore ImmutableListTest

!!!!ALSO!!!
edits i made: removed 'package src' from nils, cons, and ImutableList