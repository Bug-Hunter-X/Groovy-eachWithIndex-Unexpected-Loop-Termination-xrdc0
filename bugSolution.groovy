```groovy
def myMethod(List<String> list) {
    int index = 0
    list.each { String item ->
        if (item == null) {
            println "Item at index $index is null"
        } else {
            println "Item at index $index is: $item"
        }
        index++
    }
}

myMethod(['apple', null, 'banana'])
```