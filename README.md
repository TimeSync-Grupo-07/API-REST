# TimeSync API

API REST desenvolvida em Spring Boot Kotlin para o sistema de gerenciamento de tempo TimeSync.

## 🚀 Tecnologias

- Java 17 - JDK
- Spring Boot 3.2.0 - Framework principal
- Kotlin - Linguagem de programação
- Maven - Gerenciamento de dependências
- MySQL - Banco de dados
- Docker - Containerização
- Docker Compose - Orquestração de containers

## 📋 Pré-requisitos

- Java 17 ou superior
- Maven 3.6+ ou Maven Wrapper
- Docker e Docker Compose
- MySQL 8.0+ (externo/container)
  - Para fazer a configuração do container de mysql veja neste repositório [Database-Mysql](https://github.com/TimeSync-Grupo-07/Database-MySQL.git)

## 🛠 Configuração do Ambiente

### 1. Clone o repositório

```bash
git clone https://github.com/TimeSync-Grupo-07/API-REST.git
cd API-REST
```

### 2. Configure as variáveis de ambiente

```bash
cp .env.example .env
```

### 3. Configure o arquivo .env

```env
# Banco de Dados MySQL (externo/container)
DB_HOST=host.docker.internal  # ou IP do container MySQL
DB_PORT=3306
DB_NAME=Timesync
DB_USERNAME=seu_usuario
DB_PASSWORD=sua_senha

# Aplicação
SPRING_PROFILES_ACTIVE=dev
SERVER_PORT=8080
APP_NAME=TimeSync-API

# JPA
JPA_DDL_AUTO=none
JPA_SHOW_SQL=true
JPA_FORMAT_SQL=true
```

## 🏃 Execução

### 1. Desenvolva na sua IDE normalmente

### 2. Gere o pacote da aplicação

```bash
./mvnw clean package
```

### 3. Execute os containers
```bash
docker compose up --build
```

### 4. Parar a execução (Quando Necessário)
````bash
docker compose down -v --rmi all
````

## Comandos Úteis
```bash
# Build e execução em um comando
./mvnw clean package && docker compose up --build

# Executar em background
docker compose up -d --build

# Parar os containers
docker compose down -v --rmi all

# Ver logs da aplicação
docker compose logs app

# Ver logs em tempo real
docker compose logs -f app
```

## 📊 Endpoints da API

### Health Check

- ```GET /health```- Status da aplicação
- ```GET /```- Mensagem de boas-vindas

Resposta do Health Check
```json
{
"status": "UP",
"service": "TimeSync API"
}
```

## 🗄 Estrutura do Projeto
```text
API-REST/
├── src/main/kotlin/com/timesync/
│   ├── TimesyncApplication.kt      # Classe principal
│   ├── repository/ #Diretorio das interfaces Repository 
│   ├── model/ #Diretório das classes JPA
│   └── controller/ #Diretório das controladoras dos Endpoints
├── src/main/resources/
│   └── application.properties      # Configurações principais
├── .env.example                    # Template de variáveis
├── Dockerfile                      # Configuração do container
├── docker-compose.yml             # Orquestração
├── pom.xml                        # Dependências Maven
└── README.md                      # Este arquivo
```

## 🔧 Configurações Técnicas

### Banco de Dados
- Conexão com MySQL externo/container
- JPA/Hibernate para ORM
- Dialeto MySQL8
- SSL desabilitado para desenvolvimento

### Container

- Imagem base: eclipse-temurin:17-jre-jammy
- Porta: 8080
- Hot reload desabilitado (build manual)

## 🐛 Solução de Problemas

### Erro de Conexão com MySQL
```bash
# Verifique se o MySQL está acessível
docker-compose logs app | grep -i "mysql\|database"

# Teste a conectividade
docker-compose run app ping host.docker.internal
```

## Problemas de Build
```bash
# Limpe cache do Maven
./mvnw clean

# Rebuild forçado
docker-compose build --no-cache
```

### Verificar Variáveis de Ambiente
```bash
# Teste se as variáveis estão carregando
docker-compose config
```

## 📝 Notas Importantes

- ✅ Sempre use host.docker.internal para conectar no MySQL local
- ✅ As credenciais são gerenciadas via arquivo .env
- ✅ O arquivo .env não deve ser commitado (está no .gitignore)
- ✅ Para novos desenvolvedores: copie .env.example para .env

## 📝 Autor:

- Este projeto pertence a equipe de desenvolvimento da Timesync
- Desenvolvedores responsáveis:
    - [DaviRdaSilva](https://github.com/DaviRdaSilva)