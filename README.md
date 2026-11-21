# Spring Security Examples

[![Java CI with Maven](https://github.com/hendisantika/spring-boot-security-examples/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/spring-boot-security-examples/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.2-6DB33F?logo=springboot)
![Spring Security](https://img.shields.io/badge/Spring%20Security-7-6DB33F?logo=springsecurity)

A collection of small, self-contained Spring Security samples. Each folder is an independent Spring Boot
application that demonstrates one security feature.

## Tech Stack

- Java 25
- Spring Boot 4.1.2 (Spring Framework 7, Spring Security 7)
- Jakarta EE 11 (Servlet, JSP + JSTL, Persistence)
- Hibernate 7 / Spring Data JPA (database examples)
- MySQL (database examples)
- Maven

## Modules

| Module | Description | Credentials |
|---|---|---|
| [`spring-boot-actuator-security`](spring-boot-actuator-security) | Secures Spring Boot Actuator endpoints (base path `/manage`) with HTTP Basic and the `ACTRADMIN` role. | `admin` / `admin` |
| [`spring-security-basic-auth`](spring-security-basic-auth) | REST API (`/users`) protected with HTTP Basic and a custom `BasicAuthenticationEntryPoint`. | `naruto` / `naruto` |
| [`spring-security-example-jsp`](spring-security-example-jsp) | Form login with JSP pages and an in-memory user. | `naruto` / `naruto` |
| [`spring-security-bcrypt-example`](spring-security-bcrypt-example) | Form login backed by users stored in MySQL with BCrypt-hashed passwords. | users from the `userdetails` table |
| [`spring-security-hibernate-example`](spring-security-hibernate-example) | Form login backed by users loaded from MySQL via JPA/Hibernate, seeded by `data.sql`. | e.g. `naruto@example.com` / `naruto` |

All security configurations use the modern component-based style (`SecurityFilterChain` beans and the lambda DSL)
instead of the removed `WebSecurityConfigurerAdapter`.

## Prerequisites

- JDK 25
- Maven 3.9+
- MySQL 8+ running on `localhost:3306` (user `root` / password `root`) — only for the `bcrypt` and `hibernate` examples

## Build

Build every module from the root aggregator:

```bash
mvn clean package
```

## Run

Run any example from its own folder:

```bash
cd spring-security-basic-auth
mvn spring-boot:run
```

The application starts on <http://localhost:8080>.

### Quick checks

```bash
# Basic auth
curl -i http://localhost:8080/users                       # 401 Unauthorized
curl -i -u naruto:naruto http://localhost:8080/users      # 200 OK

# Actuator security
curl -i http://localhost:8080/manage/health               # 401 Unauthorized
curl -i -u admin:admin http://localhost:8080/manage/health # 200 OK
```

For the JSP based examples open <http://localhost:8080/login> in a browser.

### BCrypt example

The schema is created on startup. Generate a hash with `com.hendisantika.config.BcryptGenerator`
(it prints BCrypt hashes for the word `password`) and insert a user, for example:

```sql
INSERT INTO userdetails (username, name, email, password, address)
VALUES ('naruto', 'Uzumaki Naruto', 'naruto@example.com', '<bcrypt-hash>', 'Konohagakure, Japan');
```

Then log in with `naruto` / `password`.

## Continuous Integration

- **GitHub Actions** – [`.github/workflows/maven.yml`](.github/workflows/maven.yml) builds all modules on
  Temurin JDK 25 for every push and pull request to `master`, then submits the dependency graph.
- **Dependabot** – [`.github/dependabot.yml`](.github/dependabot.yml) checks Maven dependencies of every module and
  GitHub Actions daily (05:00 Asia/Jakarta), grouping Spring Boot, Spring Framework, Maven plugin and
  minor/patch updates into fewer pull requests.

## Author

**Hendi Santika**

- Email: hendisantika@gmail.com
- Telegram: [@hendisantika34](https://t.me/hendisantika34)
- Link: [s.id/hendisantika](https://s.id/hendisantika)
