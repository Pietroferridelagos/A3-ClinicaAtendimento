# Projeto: Sistema de Clínica "Star Bem"

## Descrição
Este projeto é um sistema básico de gerenciamento para uma clínica médica chamado **Star Bem**. O sistema permite realizar operações como cadastro de pacientes, médicos, medicamentos, dispositivos médicos e a criação de prescrições médicas. Ele foi desenvolvido em Java e utiliza o framework de testes **JUnit** para validar as funcionalidades principais.

## Funcionalidades
O sistema possui as seguintes funcionalidades:

1. **Cadastro de Paciente**: Permite cadastrar pacientes, armazenando informações como nome, CPF, data de nascimento, endereço, telefone e e-mail.
2. **Cadastro de Médico**: Permite cadastrar médicos, armazenando informações como nome, especialidade, CRM, telefone e e-mail.
3. **Cadastro de Medicamentos**: Permite cadastrar medicamentos, armazenando informações como nome, dosagem, frequência e data de prescrição.
4. **Cadastro de Dispositivos**: Permite cadastrar dispositivos médicos, armazenando informações como tipo, marca, modelo, status e valores de referência.
5. **Criação de Prescrição Médica**: Permite criar prescrições médicas associando um paciente, um médico e um medicamento.
6. **Listagem**: Listagem de pacientes, médicos, medicamentos, dispositivos e prescrições.

## Tecnologias Utilizadas
- **Java**: Linguagem principal para desenvolvimento do sistema.
- **JUnit 5**: Framework de testes utilizado para garantir a qualidade do código.
- **IntelliJ IDEA**: IDE utilizada para o desenvolvimento do projeto.
- **Maven**: Gerenciador de dependências e build.

## Como Executar o Projeto
### Pré-requisitos
- **Java JDK** 11 ou superior instalado.
- **Maven** instalado.
- **IntelliJ IDEA** (opcional, mas recomendado).

### Passos para Executar
1. **Clone o repositório**:
   ```sh
   git clone https://github.com/seu-usuario/clinica-star-bem.git
   ```
2. **Importe o projeto no IntelliJ IDEA**:
    - Abra o IntelliJ e clique em **File > Open** e selecione o diretório do projeto.
3. **Instale as dependências**:
    - Maven deve baixar as dependências automaticamente. Caso não, execute:
   ```sh
   mvn clean install
   ```
4. **Execute o projeto**:
    - Acesse a classe `Main` e execute o método `main` para iniciar a aplicação.

## Estrutura do Projeto
- **Main.java**: Classe principal responsável pela execução da aplicação.
- **Classes de Modelos (Paciente, Medico, Medicamento, Dispositivo, PrescricaoMedica)**: Representam os diferentes objetos do sistema.
- **MainTest.java**: Contém testes unitários para validar as principais funcionalidades do sistema.

## Executando os Testes
Para rodar os testes, use o seguinte comando no terminal:
```sh
mvn test
```
Ou execute diretamente pela IDE clicando na classe de teste `MainTest` e selecionando **Run 'MainTest'**.

## Contribuição
Contribuições são bem-vindas! Se desejar contribuir:
1. Fork este repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Faça o push da branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Contato
- **Autor**: Seu Nome
- **E-mail**: seu-email@example.com
- **LinkedIn**: [seu-linkedin](https://www.linkedin.com/in/seu-usuario/)

