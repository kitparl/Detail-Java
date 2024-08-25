
## Day2

- types of memory areas are allocated by JVM?

Stack : it stores short life like varaibale value, method call, refernce varabable.
Heap : It stores long life like object.

Stack: LIFO order
Heap: allocation taken care by JVM


Stack: It is not flexible eg: int num => 4 byte
Heap: It is flexible eg: we can change the size of an array

Stack: It has faster access, allocation, and deallocation.
Heap: It has slow access, allocation, and deallocation.

Stack: It is smaller in size.
Heap: It is larger in size.

Stack: We can increase the stack size by using the JVM option -Xss.
Heap: We can increase the heap size by using the JVM option -Xmx.

Stack: JVM throws the java.lang.StackOverFlowError if the stack size is greater than the limit. To avoid this error, increase the stack size.
Heap: JVM throws the java.lang.OutOfMemoryError if the JVM is unable to create a new native method.

Stack: Memory allocation is continuous.
Heap: Memory allocated in random order.

Stack: It is thread-safe, so no need of synchronization.
Heap: It is not thread-safe, so properly synchronization of code is required.


- **What is classloader?**
  - used to load class files.
  - Three builtin classloader
    - 1. Bootstrap Classloader (loads  rt.jar file - all jse packages and classes)
    - 2. Extension Classloader (loads .jar file)
    - 3. App Classloader (It loads the class files from the classpath)

- JAR files
JAR stands for Java Archive, and it's a file format that combines many files into one. It is based on ZIP file format.

- WEB files
(Web Application Resource or Web application ARchive) is a file used to distribute a collection of JAR-files, JavaServer Pages, Java Servlets, Java classes, XML files, tag libraries, static web pages (HTML and related files) and other resources etc.


- .java file can be compiled to .class file but .class file name will be the same as .java class name.
- I can write static public void instead of public static void


- What is the default value of the local variables?
The local variables are not initialized to any default value, neither primitives nor object references.


- Protected modifier vs Default modifier

