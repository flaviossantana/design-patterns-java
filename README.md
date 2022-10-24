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

![](https://refactoring.guru/images/patterns/content/strategy/strategy.png)

## Chain of Responsibility
- É um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.

![](https://refactoring.guru/images/patterns/content/chain-of-responsibility/chain-of-responsibility.png)

## Template Method
- É um padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse, mas permite que as subclasses substituam etapas específicas do algoritmo sem mudar sua estrutura.

![](https://refactoring.guru/images/patterns/content/template-method/template-method.png)

## State
- É um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. Parece que o objeto mudou sua classe.
![](https://refactoring.guru/images/patterns/content/state/state-pt-br.png)

## Command
- É um padrão de projeto comportamental que transforma solicitações em objetos independentes que contêm todas as informações sobre a solicitação. Este padrão permite que você parametrize métodos com diferentes solicitações, enfileire ou registre solicitações e suporte operações que não podem ser realizadas.
![](https://refactoring.guru/images/patterns/diagrams/command/solution2-pt-br.png)

## Observer
- É um padrão de projeto comportamental que permite que você defina uma subscrição de um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.
![](https://refactoring.guru/images/patterns/content/command/command-pt-br.png)

## Adapter
- É um padrão de projeto estrutural que permite objetos com interfaces incompatíveis trabalharem juntos
![](https://refactoring.guru/images/patterns/content/adapter/adapter-pt-br.png)

## Decorator
- É um padrão de projeto estrutural que permite que você adicione novos comportamentos a objetos existentes ao envolvê-los em objetos de embalagem que contêm os comportamentos.
![](https://refactoring.guru/images/patterns/content/decorator/decorator.png)

## Composite
- É um padrão de projeto estrutural que permite que você compor objetos em estruturas de árvore e trabalhar com estas estruturas como se elas fossem objetos individuais.
![](https://refactoring.guru/images/patterns/content/composite/composite.png)

### Referências:
Refactoring Guru: https://refactoring.guru/pt-br/design-patterns
