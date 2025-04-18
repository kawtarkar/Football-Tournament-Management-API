# ⚽ Football Tournament Management API

A **Spring Boot REST API** for managing football tournaments — including teams, players, matches, stadiums, and referees.

---

## 📌 Overview

This project provides a backend system built with **Spring Boot**, **Spring Web**, and **Spring Data JPA** for managing football tournaments. It enables the creation, retrieval, updating, and deletion (CRUD) of various entities through RESTful endpoints.

---

## 🧩 Entity Relationship Model

The core entities of this system are:

- **Match**: A football match between two teams  
- **Team**: A participating football team  
- **Player**: A player who belongs to a team  
- **Stadium**: A venue where matches take place  
- **Referee**: An official overseeing the match  

---

## 🚀 Features

The API supports the following functionalities:

- Full **CRUD operations** for:
  - Matches
  - Teams
  - Players
  - Stadiums
  - Referees
- Retrieve teams by country (e.g., Morocco)
- Fetch matches scheduled on a specific date
- Get the stadium of a specific match
- List players from a specific team
- Get both teams in a specific match
- Filter players by position within a team
- Delete all matches that have already been played

---

## 📚 API Endpoints

### 🏟 Matches

- `GET /api/matches` - Get all matches  
- `GET /api/matches/date/{date}` - Get matches on a specific date  
- `GET /api/matches/{id}` - Get match by ID  
- `GET /api/matches/{id}/teams` - Get teams for a specific match  
- `GET /api/matches/{id}/stadium` - Get stadium for a specific match  
- `POST /api/matches` - Create a new match  
- `PUT /api/matches/{id}` - Update an existing match  
- `DELETE /api/matches/{id}` - Delete a match  
- `DELETE /api/matches/past` - Delete all past matches  

### 🛡 Teams

- `GET /api/teams` - Get all teams  
- `GET /api/teams/country/{country}` - Get teams from a specific country  
- `GET /api/teams/{name}` - Get team by name  
- `GET /api/teams/{id}/players` - Get all players of a team  
- `GET /api/teams/{name}/players/{position}` - Get players with specific position from a team  
- `POST /api/teams` - Create a new team  
- `PUT /api/teams/{id}` - Update a team  
- `DELETE /api/teams/{id}` - Delete a team  

### 🧍 Players

- `GET /api/players` - Get all players  
- `GET /api/players/{id}` - Get player by ID  
- `POST /api/players` - Create a new player  
- `PUT /api/players/{id}` - Update a player  
- `DELETE /api/players/{id}` - Delete a player  

### 🏟 Stadiums

- `GET /api/stadiums` - Get all stadiums  
- `GET /api/stadiums/{id}` - Get stadium by ID  
- `POST /api/stadiums` - Create a new stadium  
- `PUT /api/stadiums/{id}` - Update a stadium  
- `DELETE /api/stadiums/{id}` - Delete a stadium  

### 🧑‍⚖️ Referees

- `GET /api/referees` - Get all referees  
- `GET /api/referees/{id}` - Get referee by ID  
- `POST /api/referees` - Create a new referee  
- `PUT /api/referees/{id}` - Update a referee  
- `DELETE /api/referees/{id}` - Delete a referee  
