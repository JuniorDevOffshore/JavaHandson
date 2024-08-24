class Car { // 'class' is a keyword, 'Car' is an identifier
    String make // 'String' is a keyword, 'make' is an identifier
    String model // 'String' is a keyword, 'model' is an identifier

    // Constructor to initialize Car object
    Car(String make, String model) { // 'Car', 'String' are keywords, 'make', 'model' are identifiers
        this.make = make // 'this' is a keyword, 'make' is an identifier, '=' is a token
        this.model = model // 'this' is a keyword, 'model' is an identifier, '=' is a token
    }

    // Method to print car details
    void printDetails() { // 'void' is a keyword, 'printDetails' is an identifier
        println "Car Make: ${make}, Model: ${model}" // 'println' is a keyword, string literal inside double quotes
    }

    // Main method to run the program
    static void main(String[] args) { // 'static', 'void' are keywords, 'main' is an identifier
        Car myCar = new Car("Toyota", "Corolla") // 'Car' is an identifier, 'new' is a keyword, literals: "Toyota", "Corolla"
        myCar.printDetails() // 'myCar' is an identifier, '.' and '()' are tokens
    }
}