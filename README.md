## Creational Patterns
1. Factory -> Handles object creation in a centralized manner. No repeating code
2. Abstract -> not asked often
3. Builder -> Creational design pattern for COMPLEX objects or large number of parameters. 
4. Prototype
5. Singleton -> We need only instance to be created (logger, db connection pools)

Builder Pattern → constructs a complex object step-by-step
Factory Pattern → decides which object to create

## Behavioural Patterns
How objects interact and communicate with each other
1. Observer Pattern ->
   Automatic Updates: Observers do not need to repeatedly check or poll the subject for updates. Instead, the subject notifies them as soon as an event occurs.
   Real-world Analogy: The video uses the example of YouTube channel subscriptions (3:26). When a creator posts a new lecture, subscribers receive an automatic notification without needing to manually refresh the channel page constantly (3:35-3:47).
   Decoupling: This pattern effectively decouples the subject from its observers, making the system more modular and easier to maintain.

2. Strategy Pattern ->
   Like having different games plans for different situations. 
   Switch between strategies dynamically depending on the context.
   You define multiple algorithms/behaviors separately,
   and choose one at runtime. Instead of writing huge if-else or switch blocks, you encapsulate each behavior into its own class.

3. Command pattern->  TV remote: execute, undo, queue up commands. 
4. Chain of responsibility pattern
   If one cant solve a problem, they pass it on to the next level
5. Mediator Pattern -> 
   All communication goes through a mediator
6. State Pattern -> Object's behaviour changes dynamically based on its state
   Vending machine (or ATM) behaves differently when it's empty vs fully stocked.  
7. Template Method Pattern
   Provides Fixed structure, but can you customize some steps. Ensures consistency while allowing flexibility
8. Iterator pattern
9. Visitor Pattern
   (Make improvements) Allows new operations to be added to objects without modifying their structure.
10. Memento Pattern (Like nintendo -> Game save feature)
    Capture an object's state and restore it later. (Undo features and rollback functionality)



## Structural design patterns 
1. Adapter: Acts as a bridge between two incompatible interfaces, allowing them to work together without
   altering their underlying code. 
2. Bridge Pattern: Picture a suspension bridge. The cable support the bridge deck, but the two components are separate and
   can be changed independently. lets us split a large class into two separate hierarchies- abstraction and implementation
   which can be developed independently of each other. 
3. Composite pattern (building a hierarchy): Like a tree. A tree is composed of branches, and each branch can have smaller branches
    or leaves. This lets us treat individual objects and groups of objects uniformly, making it easier to work with complex hierarchies. 
4. Decorator Pattern: Customizing on the fly
   Decorating a cake-> add layers of frosting, sprinklers, etc. enhancing final product without altering the base. 
    Allows you to dynamically add new behaviours or responsibilities without modifying their structure. 
5. Facade pattern: Simplifying complexity. Walking into smart home. Instead of controlling each device manually, you press a button to activate the entire system. It provides a simplified interface to a complex subsystem, making it easier to interact without dealing with all the underlying details. 
6. Flyweight pattern: Sharing resources efficiently 
   Minimizes memory usage by sharing common parts of objects while allowing unique details for each instance
7. Proxy Pattern: (The Middleman): As the name suggests, it provides a placeholder or surrogate for another object, controlling access to it or adding extra behavior. 

   