
# Sistema de Carrinho de Compras em Java - POO

Este é um sistema simples de carrinho de compras desenvolvido em Java, que utiliza os principais conceitos da Programação Orientada a Objetos (POO). O sistema suporta dois tipos de produtos: físicos e digitais, e permite adicionar, listar e remover produtos do carrinho.

---

## Funcionalidades

- Adição de produtos físicos e digitais com atributos específicos (frete para produtos físicos, URL para digitais).
- Listagem detalhada dos produtos no carrinho, exibindo informações completas.
- Remoção de produtos pelo nome.
- Controle de quantidade ao adicionar produtos com o mesmo nome.
- Uso de `enum` para categorias de produtos.
- Cálculo do total do carrinho (pode ser implementado como melhoria).

---

## Tecnologias e Conceitos Utilizados

- Linguagem Java 17+
- Programação Orientada a Objetos (POO): herança, polimorfismo, abstração e encapsulamento.
- Coleções Java (`ArrayList`).
- Uso de `BigDecimal` para manipulação de valores monetários.
- Enums para categorizar produtos.
- Tratamento básico de entrada de dados via console.

---

## Estrutura do Projeto

```
├── application
│   └── Program.java           # Classe principal com menu interativo
├── entities
│   └── enums
│       └── Categorias.java    # Enum das categorias de produtos
├── maneger
│   └── Sistema.java           # Lógica de gerenciamento do carrinho
└── model
    └── produto
        ├── Produto.java       # Classe abstrata base
        ├── ProdutoFisico.java # Produto com frete
        └── ProdutoDigital.java# Produto com URL
```

---

## Como usar

1. Clone o repositório
2. Compile o projeto usando sua IDE favorita ou via terminal com `javac`
3. Execute a classe `Program`
4. Utilize o menu interativo para adicionar, listar e remover produtos

---

## Possíveis melhorias

- Implementar cálculo e exibição do total do carrinho.
- Persistência dos dados em arquivo ou banco de dados.
- Interface gráfica para melhor usabilidade.
- Validação mais robusta das entradas do usuário.
- Implementação de testes automatizados (JUnit).
- Adicionar funcionalidades para atualização de quantidade e edição de produtos.
