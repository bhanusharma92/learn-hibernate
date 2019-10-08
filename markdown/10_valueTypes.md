So far, we have made an assumption that a single field will go into one column
because they are primitive
What if we are gonna have a object which can have multiple fields or collection like 
list or set

Example

To have address object in UserDetails class. This address object have fields like 
street, city, state and pin. 

Simplest solution is to create a these address fields in UserDetails class.

This approach works fine if the object inside UserDetails class is a value object.

There are two types of object in hibernate one is Entity that persist in DB and has 
meaning.

Value object is something that has no meaning to itself but to provide meaning to others.
eg. Address 

To mark the class as value type we can mark it with @Embeddable annotation. 
It is not mandatory but you can mark field address in UserDetails class as Embedded.
