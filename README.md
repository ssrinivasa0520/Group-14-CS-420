How to run Project: Load entire project folder into your IDE and run Application.java 
                  - Change Desktop screen resolution in Display settings if Farm Dashboard is too big for your screen.  

GitHub repository link: https://github.com/ssrinivasa0520/Group-14-CS-420

# Singleton Design Pattern

The Singleton design pattern in Java is a creational design pattern that ensures a class has only one instance while providing a global point of access to that instance. This means that no matter how many times you request an instance of the class, you will always get the same one.


In this project:

1. The class `DashboardScene` has a private static field `scene` that holds the single instance of the class.
2. The constructor of the class is private, preventing any other class from instantiating it.
3. The `getInstance` method is a static method that provides a way to access the instance of the class. If `scene` is null, it creates a new instance; otherwise, it returns the existing instance.

Usage:

In this project, the overridden start() method in Application class uses DashboardScene to instantiate a scene. This means that no matter how many times you call getInstance(), you always get the same instance. This will prevent creation of multiple dashboards.

The Singleton pattern is often used in scenarios where you want to control access to resources such as database connections, thread pools, or configuration settings. However, it's important to be careful with Singletons, as they can sometimes introduce global state and make code harder to test and reason about.

# Composite Design Pattern

The Composite design pattern is a structural design pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

In simpler terms, the Composite pattern is used when you have objects that can be treated in a hierarchical manner. Each object can be either a leaf (an individual element) or a composite (a collection of elements, which may contain other composites or leaves).

Key components of the Composite pattern:

1. **ItemI**: This is the base interface or abstract class that declares the common operations for both leaf and composite objects. In our project, a component is an interface called `ItemI` that declares methods like `getName()`, setPos() etc.

2. **ItemLeaf**: This represents the individual objects in the composition. It implements the `ItemI` interface. In our project, the `ItemLeaf` class is a leaf, representing individual items.

3. **Item**: This represents the container of components. It also implements the `ItemI` interface. It can hold a collection of child components, which can be either leaves or other composites. In our project, the `Item` class is a composite, representing folders that can contain both items and sub-items.

Usage:

In our project, we have a item container and item representation. Item containers (`Item`) and items (`ItemLeaf`) both implement the `ItemI` interface. Item containers can contain other items or item containers, allowing for a hierarchical structure.

The Composite pattern is particularly useful when you want clients to treat individual objects and compositions of objects uniformly, without having to distinguish between them. This can simplify code and make it more flexible. It's commonly used in GUI frameworks, file systems, and hierarchical data structures.
