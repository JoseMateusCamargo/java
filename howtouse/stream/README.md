<img src="https://i.ibb.co/M6nBBb0/mascote.png" align="right" width="130">

# Java

## Lambda

[Código de exemplo.](./StreamExample.java)

#### _Let's Code!_

- Stream.of usando `map`.
- Stream.of usando `map` com `toList`.
- `filter`, filtrando valor minimo.
- `mapToInt` com `sum`.
- `filter` e ordenação `sorted`.

----

**Stream.of usando `map`**

```Java
public class StreamExample {
    public static void example01(String[] data) {
        Stream.of(data)
                //.map(languages -> languages.toUpperCase())
                .map(String::toUpperCase) // Lambda method (String::toUpperCase)
                .forEach(System.out::println);
    }
}
```

**Stream.of usando `map` com `toList`**

```Java
public class StreamExample {
    public static void example02(String[] data) {
        List<String> languages = Stream.of(data).map(String::toUpperCase).toList();
        languages.forEach(System.out::println);
    }
}
```

**`filter`, filtrando valor minimo**

```Java
public class StreamExample {
    public static void example03(int minimum) {
        Integer[] numbersOfArray = {1, 3, 4, 7, 8, 99, 1};
        List<Integer> numbers = Arrays.asList(numbersOfArray);

        numbers.stream().filter(number -> number >= minimum).forEach(System.out::println);
    }
}
```

**`mapToInt` com `sum`**

```Java
public class StreamExample {
    public static int example04() {
        Integer[] numbersOfArray = {1, 3, 4, 7, 8, 99};
        List<Integer> numbers = Arrays.asList(numbersOfArray);

        return numbers.stream().mapToInt(number -> number * number).sum();
    }
}
```

**`filter` e ordenação `sorted`**

```Java
public class StreamExample {
    public static void example05() {
        ArrayList<Data> data = new ArrayList<Data>();

        Data data1 = new Data(1, "Mateus01", "Tech");
        Data data2 = new Data(2, "Mateus02", "Admin");
        Data data3 = new Data(3, "Mateus03", "Leader");
        Data data4 = new Data(4, "Mateus04", "Tech");
        Data data5 = new Data(5, "Mateus05", "Tech");

        data.add(data1);
        data.add(data2);
        data.add(data3);
        data.add(data4);
        data.add(data5);

        data.stream()
                .filter(x -> x.getPosition().equals("Tech"))
                .sorted((x, y) -> x.getName().compareToIgnoreCase(y.getName())) // Ordenação do array
                .forEach(System.out::println);
    }
}
```