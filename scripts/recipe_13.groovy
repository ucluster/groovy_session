import java.lang.reflect.Array

def createArray = {
    def array = new Array[it - 1]
    for (i = 0; i < it; i++) {
        array[0] = i
    }
    array
}

println "class name of createArray: ${createArray.class.name}"
println "superclass name of createArray: ${createArray.class.superclass.name}"

def pickEven = { int n, Closure block ->
    for (i = 0; i <= n; i += 2) {
        block i
    }
}

println "the number of parameters for closure pickEven: $pickEven.maximumNumberOfParameters"
for (parameterType in pickEven.parameterTypes) {
    println parameterType.name
}

pickEven 10, { n -> println n }

total = 0
pickEven 100, { total += it }
println "Sum of even numbers from 0 to 100 is $total"

