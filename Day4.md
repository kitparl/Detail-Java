## ***What are the restrictions that are applied to the Java static methods?***

Two main restrictions are applied to the static methods.

- The static method can not use non-static data member or call the non-static method directly.

- this and super cannot be used in static context as they are non-static.

### ***Why this Cannot Be Used in a Static Context***

Instance Reference: The this keyword refers to the current instance of the class. In a static context, there is no instance of the class available because static members belong to the class itself, not to any specific object. Without an instance, this has no meaning and thus cannot be used.

### ***Why super Cannot Be Used in a Static Context***

Superclass Reference: The super keyword is used to refer to the superclass of the current object, typically to call superclass methods or constructors. Like this, super also relies on the existence of an instance of the class. Since static methods and variables are not tied to any particular object instance, there is no concept of a superclass in this context, making super unusable.

```
class MyClass {
    int instanceVar = 10;
    
    static void staticMethod() {
        // Cannot use `this` or `super` here because this is a static context.
        // System.out.println(this.instanceVar); // Error
        // System.out.println(super.toString()); // Error
    }
    
    void instanceMethod() {
        // `this` and `super` can be used here because this is an instance context.
        System.out.println(this.instanceVar); // Works fine
        System.out.println(super.toString()); // Works fine
    }
}
```

## **Why is the main method static?**

Because the object is not required to call the static method. If we make the main method non-static, JVM will have to create its object first and then call main() method which will lead to the extra memory allocation

### **What if the static modifier is removed from the signature of the main method?**

Program compiles. However, at runtime, It throws an error "NoSuchMethodError."

### **Can we make constructors static?**

- Because static load once in the class level. Whenver we need to create multiple objects of a single class then static wont load to create object again.

- Static cannot load multiple times in a class.

- Static is class level context whenever we create an object from other class that time also it makes no sense to create an object.

- We get an error when we try to create an object from static context. compiler error.
