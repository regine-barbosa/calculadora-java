# 🧮 Calculadora Java

Calculadora desenvolvida em **Java** com interação via terminal.

O projeto foi criado com o objetivo de praticar e consolidar fundamentos da linguagem Java e **Programação Orientada a Objetos (POO)** por meio da construção e evolução incremental de uma aplicação.

A proposta é começar com uma calculadora básica e, conforme novos conceitos forem estudados, aplicar melhorias de organização, validação, coleções e estrutura ao mesmo projeto.

---

## 📚 Sobre o projeto

A aplicação permite que o usuário realize operações matemáticas básicas através de um menu interativo no terminal.

Atualmente, o projeto conta com:

* Soma
* Subtração
* Multiplicação
* Divisão

O desenvolvimento será realizado de forma incremental, permitindo aplicar novos conhecimentos de Java à mesma aplicação ao longo do tempo.

---

## ⚙️ Funcionalidades

### Atualmente implementadas

* [x] Soma
* [x] Subtração
* [x] Multiplicação
* [x] Divisão
* [x] Menu interativo
* [x] Execução contínua até o usuário escolher sair
* [x] Refatoração do código duplicado

### Em desenvolvimento

* [ ] Melhorar a organização das responsabilidades
* [ ] Tratamento de divisão por zero
* [ ] Validação de entradas
* [ ] Histórico de operações utilizando `ArrayList`
* [ ] Novas operações matemáticas
* [ ] Evolução da estrutura utilizando conceitos mais avançados de POO

---

## 🛠️ Tecnologias utilizadas

* **Java**
* **Programação Orientada a Objetos (POO)**
* **Collections Framework**
* **Git**
* **GitHub**

---

## 📂 Estrutura atual do projeto

```text
calculadora-java/
│
├── src/
│   └── calculadora/
│       ├── Main.java
│       └── Calculadora.java
│
├── .gitignore
└── README.md
```

### `Main.java`

Responsável pela interação com o usuário, incluindo:

* Exibição do menu
* Leitura das opções
* Entrada dos números
* Exibição dos resultados
* Controle do fluxo da aplicação

### `Calculadora.java`

Responsável pela implementação das operações matemáticas.

---

## ▶️ Como executar

### Pré-requisitos

* Java JDK instalado
* IDE de sua preferência, como IntelliJ IDEA, Eclipse ou VS Code

### Executando

1. Clone o repositório:

```bash
git clone https://github.com/regine-barbosa/calculadora-java.git
```

2. Abra o projeto em sua IDE.

3. Execute a classe `Main`.

4. Utilize o menu apresentado no terminal para realizar os cálculos.

---

## 🎯 Objetivos de aprendizado

Este projeto também funciona como um laboratório prático para consolidar conceitos estudados durante minha formação em Java.

### Fundamentos de Java

* [x] Variáveis e tipos de dados
* [x] Operadores
* [x] Estruturas condicionais
* [x] Estruturas de repetição
* [x] `switch`
* [x] Métodos
* [ ] Tratamento de exceções

### Programação Orientada a Objetos

Conceitos já utilizados ou em processo de consolidação:

* [x] Classes e objetos
* [x] Atributos e métodos
* [x] Construtores
* [x] Encapsulamento
* [x] Modificadores de acesso
* [x] Sobrescrita de métodos
* [~] Polimorfismo — em consolidação
* [~] Abstração — em consolidação
* [~] Classes abstratas — em consolidação
* [~] Interfaces — em consolidação
* [~] Herança — em consolidação
* [~] Composição — em consolidação
* [~] Associação e agregação — em consolidação

### Collections

* [~] `ArrayList`
* [ ] `List`
* [ ] Iteração e manipulação de coleções
* [ ] Outras estruturas do Collections Framework

> `~` indica conceitos em processo de consolidação.

---

## 📈 Evolução planejada

O projeto será desenvolvido de forma incremental. Cada etapa representa uma oportunidade de aplicar conhecimentos estudados em Java e melhorar uma versão existente da aplicação.

### V1.0 — Calculadora básica

* [x] Operações matemáticas básicas
* [x] Menu interativo
* [x] Estrutura inicial de classes
* [x] Execução contínua

### V1.1 — Refatoração

* [x] Reduzir código duplicado
* [ ] Revisar responsabilidades das classes
* [ ] Melhorar a organização do `Main`
* [ ] Revisar a utilização de atributos e parâmetros
* [ ] Corrigir a divisão inteira

### V1.2 — Validações

* [ ] Tratar divisão por zero
* [ ] Validar entradas numéricas
* [ ] Tratar opções inválidas
* [ ] Melhorar mensagens apresentadas ao usuário

### V1.3 — Histórico de operações

Aplicar os conhecimentos de Collections, especialmente `ArrayList`, para armazenar e consultar os cálculos realizados.

* [ ] Criar estrutura para representar uma operação
* [ ] Armazenar operações utilizando `ArrayList`
* [ ] Listar histórico
* [ ] Remover operações do histórico
* [ ] Limpar histórico

### V1.4 — Novas operações

* [ ] Potenciação
* [ ] Raiz quadrada
* [ ] Porcentagem
* [ ] Outras operações matemáticas

### V2.0 — Evolução da POO

Aplicar conceitos de POO conforme forem consolidados durante os estudos.

* [ ] Criar abstrações para as operações
* [ ] Utilizar interfaces
* [ ] Aplicar polimorfismo
* [ ] Avaliar utilização de herança quando fizer sentido
* [ ] Separar responsabilidades entre classes
* [ ] Avaliar aplicação do padrão Strategy

---

## 🖥️ Demonstração

Em breve, será adicionada uma demonstração da aplicação em execução no terminal.

---

## 📌 Histórico de versões

| Versão | Descrição                        | Status                |
| ------ | -------------------------------- | --------------------- |
| `v1.0` | Calculadora básica               | ✅ Concluída           |
| `v1.1` | Refatoração e organização        | 🔄 Em desenvolvimento |
| `v1.2` | Validações e tratamento de erros | ⏳ Planejada           |
| `v1.3` | Histórico com `ArrayList`        | ⏳ Planejada           |
| `v1.4` | Novas operações                  | ⏳ Planejada           |
| `v2.0` | Evolução da estrutura de POO     | ⏳ Planejada           |

---

## 👩‍💻 Autora

**Regine Barbosa**

Desenvolvedora em formação, com foco em **Java e desenvolvimento backend**.
