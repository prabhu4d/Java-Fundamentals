# OOPs Concepts

### public static void main(String args[])
```java
public static void main(String args[]){
	///
}
```

- Execution of the program starts with main function
- When we call main we can pass arguments so that we write **String args[]**
    - where String can take int, float, string any value
    - args[] represents **n**
- We don't return anything from main so we put **void**
- In Java everything is object, to call a method we need to create obj for that class, and objects are defined inside the another class. so we put **static** to call a main method without creating a object.
- main method is public so we put **public**

### Memory Allocation
- for int it is 4 bytes, for string it is 2 bytes. but what about object. the memory space is defined in constructor of the class

### Constructor
- constructor is member method
- its name is same as class method. 
- it will never return anything. it is used to allocate memory
- a class have many constructor with different arguments. this is called constructor overloading

### this
- **this** refers to instance variable
- if local and instance variable have different name **this** is not required.

### method overloading
- based on the type of argument or number of arguments the method will run.

### static
- before allocating memory for object, class have its own memory.
- static variables goes into class loader memory.
- to access static variable or static method we don't need object
- static block only runs when class is loaded
- too many static block run in sequence