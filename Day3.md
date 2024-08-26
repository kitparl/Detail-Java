# Day3

- **Execution Flow** 
 (static block) --> (non static block) --> (constructor)

 ```
class ExecutionFlow {
    
    // Static block
    static {
        System.out.println("Static block executed");
    }

    // Non-static block
    {
        System.out.println("Non-static block executed");
    }

    // Constructor
    public ExecutionFlow() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // Creating first object
        ExecutionFlow obj1 = new ExecutionFlow();
        
        // Creating second object
        ExecutionFlow obj2 = new ExecutionFlow();
    }
}

// Output
Static block executed
Main method started
Non-static block executed
Constructor executed
Non-static block executed
Constructor executed
```

## **Object Oriented Language vs Object Based Language**

- Object-oriented languages follow all the concepts of OOPs whereas, the object-based language doesn't follow all the concepts of OOPs like inheritance and polymorphism.

- Object-oriented languages do not have the inbuilt objects whereas Object-based languages have the inbuilt objects, for example, JavaScript has window object.

- eg: java, javascript

## **Why Local Variables and Instance Variables Behave Differently**

```
class HelloWorld {
    int b;
    public static void main(String[] args) {
        int c;
        HelloWorld m = new HelloWorld();
        System.out.println(c); // error
System.out.println(m.b); // correct
    }
}
first print statement got error while 2nd one is printing why?
```
- Local Variables need explicit initialization because they only exist within a method and Java enforces this to prevent the use of uninitialized variables.
- Instance Variables are automatically initialized to a default value by Java when an object is created, ensuring that they always start with a known value.


 *Why They Have Default Values in instance variables:*
- When an object is created, Java automatically assigns default values to its instance variables to ensure that they start with a known value, even if the developer doesn't explicitly initialize them.

  *Why Initialization is Required in local variables?:*
- Since local variables are created and destroyed with each method call, Java doesn't automatically assign them a value. The language enforces initialization to ensure that you don't accidentally use a variable that hasn't been given a specific value, which could lead to unpredictable behavior.


## **Singleton Class or Object Condition**

1. Private Constructor: The class should have a private constructor to prevent external instantiation. This ensures that no other class can create an instance of the singleton class.

2. Static Instance: The class should have a private static field that holds the single instance of the class. This field is used to store the unique instance of the singleton class.

## **Purpose of Default Constructor**
The purpose of the default constructor is to assign the default value to the objects. The java compiler creates a default constructor implicitly if there is no constructor in the class.


## **constructor return any value?**
- The constructor implicitly returns the current instance of the class

## **When to write default constructor in java.**
- When any parameterized constructor is present in the class and we initialize the object with zero argument then it will throw me an error. We need to either add default constructor or remove parameterized constructor.
