```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { String item, int index ->
        if (item == null) {
            println "Item at index $index is null"
            return //This will exit the eachWithIndex loop prematurely
        }
        println "Item at index $index is: $item"
    }
}

myMethod(['apple', null, 'banana'])
```