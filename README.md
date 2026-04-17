# 🏨 Sistema de Gestão de Hotel

Sistema de gerenciamento de quartos desenvolvido em **Java**, com foco na aplicação prática de **Programação Orientada a Objetos (POO)**.  

O projeto simula o controle básico de um hotel, permitindo cadastrar quartos, consultar disponibilidade, realizar reservas e cancelar reservas por meio de um menu interativo via console.

---

## 📌 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de:

- Praticar conceitos fundamentais de POO
- Trabalhar com estruturas de dados (`ArrayList`)
- Aplicar encapsulamento e organização de responsabilidades
- Simular regras de negócio de um sistema real
- Desenvolver lógica aplicada a um cenário prático

---

## ⚙️ Funcionalidades

- ✔ Cadastrar quartos
- ✔ Listar todos os quartos
- ✔ Consultar quartos disponíveis
- ✔ Consultar quartos indisponíveis
- ✔ Reservar quarto
- ✔ Cancelar reserva
- ✔ Validação para quartos inexistentes

---

## 🛠 Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- Programação Orientada a Objetos
- Estrutura de dados `ArrayList`
- Controle de fluxo com `switch`
- Entrada de dados com `Scanner`

---

## 🏗 Estrutura do Projeto

```
SistemaHotel/
│
├── Main.java        # Classe principal (menu e interação)
├── Hotel.java       # Regras de negócio do sistema
└── Quarto.java      # Modelo da entidade Quarto
```

### 🔹 Main
Responsável pelo menu interativo e comunicação com o usuário.

### 🔹 Hotel
Contém as regras de negócio:
- Cadastro de quartos
- Listagens
- Reserva
- Cancelamento de reservas

### 🔹 Quarto
Classe modelo contendo:
- Número do quarto
- Tipo (Simples, Duplo, Luxo)
- Status de disponibilidade

---

## Como Executar o Projeto

### Clonar o repositório

```bash
git clone https://github.com/MateusLima04/SistemaHotel.git
```
