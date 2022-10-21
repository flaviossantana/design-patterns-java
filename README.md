# Design Patterns Java
Boas práticas de programação

- Padrões de projeto são soluções genéricas para problemas recorrentes do desenvolvimento de software orientado a objetos;
- Existem três principais categorias de padrões de projeto:
  - Comportamentais (que serão vistos neste treinamento)
  - Estruturais
  - Criacionais

## Strategy
- É um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis.
- Como diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes:
    - Esta técnica é chamada de Strategy, que é um dos padrões de projeto

![](https://refactoring.guru/images/patterns/diagrams/strategy/solution.png)

## Chain of Responsibility
- É um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.

![](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/solution1-pt-br.png)

## Template Method
- É um padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse, mas permite que as subclasses substituam etapas específicas do algoritmo sem mudar sua estrutura.

![](https://refactoring.guru/images/patterns/diagrams/template-method/structure.png?id=924692f994bff6578d8408d90f6fc459)

## State
- É um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. Parece que o objeto mudou sua classe.
![](https://refactoring.guru/images/patterns/diagrams/state/problem2-pt-br.png)
