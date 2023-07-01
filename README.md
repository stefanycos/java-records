# Java Records

<p align="justify">
It's a new Java feature, witch was officially released in Java 16. Its main goal is the possibility of creation immutable data transfer classes in a compact way, some caracteristics are similar to the famous libray Lombok.


### Caracteristics:

- Records classes are immutable, once we create a class isn't possible to change its values, they don't give us the "sets" methods, only "gets";
- We can normally create methods in a record, as well as statics methods and/or variables, but note that the variables need to be static, if not, should be declared as argument in Record class;
- By default extends class Record, so it's impossible to extend any other class, but we can implement any interface;
- If we need to validate the received data, we can use @Validate as in any other Java class.
- It has bult-in equals(), toString() and hashCode() methods by default, but we can also override this methods if necessary.

### When to use

<b>Storing data</b>
- With a Record, you can define the data fields in one line of code, instead of having to define a constructor and getter/setter methods for each field in a class. This makes your code shorter, easier to read, and less prone to errors.

<b>Data Transfer Objects (DTOs)</b>
- Records are a good fit for DTOs, which are used to transfer data between different parts of an application. With records, you can define DTOs with just a few lines of code, reducing the amount of boilerplate code you need to write.

<b>Immutable objects</b>
- Records are immutable by default, making them a good choice for classes that should not be modified after instantiation. With records, you don’t need to write any code to make the class immutable — it’s done for you automatically.

<b>API responses</b>
- Records are a good choice for representing responses returned by an API. With records, you can define a class with just the fields you need, making it easier to work with the API response.

<b>Configuration settings</b>
- Records are a good fit for classes that represent configuration settings. With records, you can define a class with just the fields you need, making it easier to manage the configuration settings for your application.
</p>
