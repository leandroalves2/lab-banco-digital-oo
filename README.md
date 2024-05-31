# Criando um Banco Digital com Java e Orientação a Objetos

## Implementação do Desafio

Neste desafio, utilizei os conceitos de Orientação a Objetos da seguinte forma:

### Abstração
Criei classes que representam entidades do domínio bancário. Essas classes incluem `Conta`, `ContaCorrente`, `ContaPoupanca`, `Cliente`, `ClientePF` e `ClientePJ`. Cada uma dessas classes abstrai os principais aspectos de uma conta bancária e de um cliente do banco, permitindo a criação de objetos que representam essas entidades no sistema.

### Encapsulamento
Utilizei encapsulamento para proteger os dados das classes. Isso foi feito através da definição de atributos privados e da criação de métodos públicos (getters e setters) para acessar e modificar esses atributos. Por exemplo, na interface `IConta`, métodos como `depositar`, `sacar`, `transferir` e `imprimirExtrato` foram definidos, garantindo que a lógica de negócios fosse aplicada corretamente sempre que esses métodos fossem utilizados.

### Herança
Implementei herança para reutilizar código entre as classes de contas e clientes. A classe `Conta` é a classe base que define os comportamentos comuns para todas as contas (como depósito, saque, transferência e imprimirExtrato). As classes `ContaCorrente` e `ContaPoupanca` herdam de `Conta` e podem estender ou modificar esses comportamentos conforme necessário. De maneira similar, `ClientePF` e `ClientePJ` herdam da classe `Cliente`, permitindo a reutilização e especialização do código.

### Polimorfismo
Apliquei polimorfismo ao tratar diferentes tipos de contas (`ContaCorrente` e `ContaPoupanca`) e clientes (`ClientePF` e `ClientePJ`) de maneira uniforme, utilizando referências do tipo genérico `Conta` e `Cliente`. Isso permite que o código que realiza operações bancárias seja mais flexível e extensível. Por exemplo, métodos que operam em objetos do tipo `IConta` podem aceitar tanto `ContaCorrente` quanto `ContaPoupanca`, facilitando a adição de novos tipos de contas no futuro sem a necessidade de alterar a lógica existente.

## Conclusão
Através deste desafio, demonstrei a aplicação prática dos princípios de Abstração, Encapsulamento, Herança e Polimorfismo na criação de um sistema bancário simples em Java. Essas técnicas não só ajudam a organizar e estruturar o código de maneira mais eficiente, mas também facilitam a manutenção e a evolução do sistema ao longo do tempo.
```
