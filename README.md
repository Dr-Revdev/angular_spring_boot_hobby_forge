# HobbyForge

Application e-commerce dédiée aux passionnés de loisirs créatifs.

> Projet en cours de développement.

## Stack technique

- **Backend** : Java 25 · Spring Boot 4 · Spring Security · Spring Data JPA · Flyway
- **Base de données** : PostgreSQL 17
- **Documentation API** : SpringDoc OpenAPI (Swagger UI)
- **Outillage** : Docker · Maven · Lombok

## Prérequis

- Docker & Docker Compose
- Java 25
- Maven 3.9+

## Lancer le projet

**1. Configurer les variables d'environnement**

Copier `.env.example` en `.env` et renseigner les valeurs :

```bash
cp .env.example .env
```

**2. Démarrer la base de données**

```bash
docker-compose up -d
```

**3. Lancer le backend**

```bash
cd backend
./mvnw spring-boot:run
```

L'API est accessible sur `http://localhost:8080`.  
La documentation Swagger est disponible sur `http://localhost:8080/swagger-ui.html`.

## Structure du projet

```
HobbyForge/
├── backend/        # API Spring Boot
├── frontend/       # À venir
├── database/       # Scripts SQL
└── docker-compose.yml
```

## Modèle de données

Les entités principales : `users`, `roles`, `products`, `categories`, `orders`, `order_items`.
