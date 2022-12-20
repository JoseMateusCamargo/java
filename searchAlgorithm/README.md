<img src="https://i.ibb.co/M6nBBb0/mascote.png" align="right" width="130">

# Algoritmos de busca (Search Algorithms)

Em ciência da computação, um algoritmo de pesquisa é um algoritmo (normalmente envolvendo uma infinidade de outros
algoritmos mais específicos) que resolve um problema de pesquisa. Os algoritmos de busca funcionam para recuperar
informações armazenadas dentro de alguma estrutura de dados, ou calculadas no espaço de busca de um domínio de problema,
com valores discretos ou contínuos. Em termos gerais é um algoritmo que toma um problema como entrada e retorna a
solução para o problema, geralmente após resolver um número possível de soluções.

#### Let's Go Code!

---

[Dijkstra's Algorithm.](./Dijkstra.java)

O algoritmo de Dijkstra, concebido pelo cientista da computação holandês Edsger Dijkstra em 1956 e publicado em 1959,
soluciona o problema do caminho mais curto num grafo dirigido ou não dirigido com arestas de peso não negativo, em tempo
computacional `O( E+ V log V)` onde V é o número de vértices e E é o número de arestas. O algoritmo que serve para
resolver o mesmo problema em um grafo com pesos negativos é o algoritmo de Bellman-Ford, que possui maior tempo de
execução que o Dijkstra.

* Time Complexity:
    * Worst Case: `O( E+ V log V)`

![Alt text](img/Dijkstra.gif?raw=true "Dijkstra")