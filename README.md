**SINGLETON DESIGN PATTERN**
1) Type of Creational Design Pattern
2) Only one instance of the class should exist.
3) Other objects should be able to get instance of the class.
4) Used in Logging, Cache , Session, Drivers

Implementation:
a) Constructor should be private
b) Public method for returning instance
c) Instance type->private static

**FACTORY DESIGN PATTERN**
1) Type of Creational Design Pattern
2) Used when we have multiple sub-classes of a Super class and based on input we want to return one class instance.
3) It provides abstraction between client and implementation classes.
4) Remove the instantiation of client classes from client code.

Implementation:
a) Super class can be interface or abstract class or basic class
b) Factory class has a static method which returns the instance of subclass based on input.

**BUILDER DESIGN PATTERN**
1) Type of Creational Design Pattern
2) Used when we have too many arguments to send in constructor and it's hard to maintain the order.
3) When we don't want to send all parameters in Object initialization. (Generally we send optional parameters as null)

Implementation:
a) We create a 'static nested class', which contains all arguments of outer class.
b) As per naming convention if class name is 'Vehicle' then builder class will be 'VehicleBuilder'
c) Builder class have a public constructor with all required parameters.
d) Builder class should have methods for optional parameters. Method will return the Builder object.
e) A build method that would return the final object.

**PROTOTYPE DESIGN PATTERN**
1) Type of Creational Design Pattern
2) Used when you want to avoid multiple Object creation of same instance. Instead, you copy the object to new object and then modify as per your need.

Implementation:
a) Object that we are trying to clone should provide us clonable feature by implementing Cloneable interface.
b) We can override clone method to implement as per our need.

**PROXY DESIGN PATTERN**
1) Type of Structural Design Pattern
2) Used when you want to control access i.e. in Databases, you would want to control 'delete' query available only for certain users like admin. 

Implementation:
a) In general, we have class which is executing interface executor method, which is executing all commands.
b) To control this, we add  a Proxy class which implements the same interface & write the condition for 'admin' user before proceeding to actual executor.

**FACADE DESIGN PATTERN**
1) Type of Structural Design Pattern
2) Used when there are multiple interfaces which are doing similar kind of jobs, then we add the Facade interface, which provides better interface for these interfaces & clients.
3) It basically helps in routing to related interfaces i.e. Databases, Drivers

Implementation:
We'll implement Facade helper class, which will route to method related to specific class based on input.
