## Day #

- Why java is not completely OOP | It supports primitive datatype
- Use of .class files | general file for jvm to execute on different platforms
- Why java is robust | powerful memory management.. etc
- Memory leakages in java | JVM heap memory allocation | xmx
- Call by reference in java | Call by value

```
public class CallByValueReassignmentExample {
    public static void main(String[] args) {
        MyObject obj = new MyObject(10);
        System.out.println("Before modifyReference: " + obj.value); // Output will be 10
        modifyReference(obj);
        System.out.println("After modifyReference: " + obj.value);  // Output will still be 10
    }

    public static void modifyReference(MyObject obj) {
        obj = new MyObject(20); // This does not affect the original reference
    }
}

class MyObject {
    int value;

    MyObject(int value) {
        this.value = value;
    }
}
```
```
