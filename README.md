# Api Project Sakura Card Captor
## Backend project

## Technology Stack
- Java 17
- MySQL
- Maven
- Spring Boot - Ver 2.5.1
- [Sakura API](https://github.com/JessVel/sakura-card-captor-api)
- Gitlab API


## Routes implemented:

## SakuraCard API

```
https://github.com/JessVel/sakura-card-captor-api
```

# Sakura Card
| Method | Endpoint       | Description                                         | Body                          |
| ------ |----------------|-----------------------------------------------------| ----------------------------- |
| GET    | /greeting      | Show a greeting                                     |                               |
| GET    | /sakura/{id}   | Retrieve the sakura card with the indicated id      |                               |
| GET    | /sakura/random | Retrieve the random sakura |                               |
| GET    | /sakura/all    | Retrieve all sakura cards                           |                               |

# Player
| Method | Endpoint  | Description                               | Body |
|--------|-----------|-------------------------------------------|------|
| GET    | /player/{id} | Retrieve the player with the indicated id |      |
| GET    | /player/all | Retrieve all players                      |      |
| POST   | /player/  | Add one player             | YES  |
