# Projeto API Tabela FIPE

## Visão Geral

Este projeto implementa uma interface de linha de comando (CLI) em Java, utilizando o framework Spring Boot, para consultar valores de veículos registrados na Tabela FIPE. Usuários podem buscar informações detalhadas sobre carros, motos e caminhões, incluindo marcas, modelos e valores de avaliação conforme o ano do modelo.

## Funcionalidades

- **Consulta de Marcas**: Os usuários podem listar todas as marcas de carros, motos ou caminhões disponíveis na base de dados da FIPE.
- **Consulta de Modelos**: Após selecionar uma marca, os usuários podem visualizar todos os modelos vinculados àquela marca específica.
- **Filtragem por Nome de Veículo**: É possível filtrar modelos por partes do nome, facilitando encontrar versões específicas sem necessidade de uma busca completa.
- **Consulta de Valores por Ano**: Os usuários podem consultar valores de avaliação FIPE para um modelo específico, com base em seu ano de fabricação.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação.
- **Spring Boot**: Framework para facilitar a configuração e publicação de aplicações Java.
- **Maven**: Ferramenta de automação e gerenciamento de projetos Java.
- **HttpClient**: Utilizado para realizar chamadas HTTP para a API da Tabela FIPE.
- **Jackson**: Biblioteca para serialização e deserialização de objetos JSON.

## Configuração e Execução

Para rodar o projeto, é necessário ter o Java e o Maven instalados. Siga os passos abaixo para configurar e executar o aplicativo:

1. Clone o repositório para o seu ambiente local.
2. Navegue até a pasta do projeto via terminal.
3. Execute o comando `mvn clean install` para construir o projeto.
4. Inicie a aplicação usando `mvn spring-boot:run`.

A aplicação será iniciada e poderá ser acessada via linha de comando para realizar consultas interativas.


