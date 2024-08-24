import groovy.lang.Expando

class DataTypesExample {

    static void main(String[] args) {
        // Primitive data types
        byte b = 10
        short s = 100
        int i = 1000
        long l = 10000L
        float f = 1.23f
        double d = 1.23
        char c = 'A'
        boolean flag = true

        // GString
        def name = "Groovy"
        def greeting = "Hello, ${name}"

        // List
        def list = [1, 2, 3, 4]

        // Map
        def map = [
            name: 'Groovy',
            version: 4.0,
            features: ['Dynamic Typing', 'Closures', 'Metaprogramming']
        ]

        // Closure
        def closure = { message -> println "Closure says: $message" }
        closure("Hello from Closure!")

        // Range
        def range = 1..5

        // BigInteger
        def bigInt = new BigInteger("12345678901234567890")

        // BigDecimal
        def bigDec = new BigDecimal("12345.67890")

    

        // Print values to console
        println "Primitive Types:"
        println "byte: $b"
        println "short: $s"
        println "int: $i"
        println "long: $l"
        println "float: $f"
        println "double: $d"
        println "char: $c"
        println "boolean: $flag"

        println "\nGString:"
        println greeting

        println "\nList:"
        println list

        println "\nMap:"
        println map

        println "\nRange:"
        println range

        println "\nBigInteger:"
        println bigInt

        println "\nBigDecimal:"
        println bigDec

        
    }
}
