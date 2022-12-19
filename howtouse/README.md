<img src="https://i.ibb.co/M6nBBb0/mascote.png" align="right" width="130">

# Java

## Manual (How to use)

#### _Let's Code!_

- StackTrace.
- [Stream.](./stream/README.md)
- Parse - usando o método.

---

**StackTrace**

Depurar um app geralmente requer trabalhar com stack traces. Um stack trace é gerado quando o app falha devido a um erro
ou uma exceção. Um stack trace mostra uma lista de chamadas de método que geram a exceção, junto com os nomes de arquivo
e números de linha em que as chamadas ocorreram. [Code](./StackTrace.java)

```Java
public class StackTrace {
    public static void main(String[] args) {
        try {
            new FileInputStream("fileNotExist.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/* Output
java.io.FileNotFoundException: fileNotExist.txt (O sistema não conseguiu localizar o ficheiro especificado)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        at howtouse.StackTrace.main(StackTrace.java:9)
 */
```

**Parse - usando o método**

```Java
public class StringInt {
    public static void main(String[] args) {
        String stringValue = "100";
        int intValue;
        intValue = Integer.parseInt(stringValue);
        System.out.println(intValue);
    }
}

public class IntString {
    public static void main(String[] args) {
        int intValue = 110;
        String stringValue;
        stringValue = Integer.toString(intValue);
        System.out.println(stringValue);
    }
}
```