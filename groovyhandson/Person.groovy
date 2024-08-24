class Person {
    String name
    int age

    String greet() {
        "Hello, my name is $name and I am $age years old."
    }

    // Method with a closure
    def doSomething(closure) {
        closure(name, age)
    }

    static void main(String[] args) {
        def person = new Person(name: "Anandhraja KrishnaMoorthy", age: 31)
        println person.greet()  // Output: Hello, my name is Alice and I am 30 years old.

        person.doSomething { name, age ->
            println "Name: $name, Age: $age"
        }  // Output: Name: Alice, Age: 30
    }
}
