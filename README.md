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

- `GET /match` - Get all matches  
- `GET /match/dateMatch/{dateMatch}` - Get matches on a specific date  
- `GET /match/{id}/stades` - Get stadium for a specific match  
- `POST /match` - Create a new match  
- `PUT /match` - Update an existing match  
- `DELETE /match/{id}` - Delete a match  

---

### 🛡 Teams (*Équipes*)

- `GET /equipe` - Get all teams  
- `GET /equipe/{id}` - Get team by ID  
- `GET /equipe/pays/{pays}` - Get teams from a specific country  
- `GET /equipe/{id}/joueur` - Get all players of a team  
- `POST /equipe` - Create a new team  
- `PUT /equipe` - Update an existing team  
- `DELETE /equipe/{id}` - Delete a team  

---

### 🧍 Players (*Joueurs*)

- `GET /joueur` - Get all players  
- `POST /joueur` - Create a new player  
- `PUT /joueur` - Update an existing player  
- `DELETE /joueur/{id}` - Delete a player  

---

### 🏟 Stadiums (*Stades*)

- `GET /stade` - Get all stadiums  
- `POST /stade` - Create a new stadium  
- `PUT /stade` - Update an existing stadium  
- `DELETE /stade/{id}` - Delete a stadium  
- `POST /stade/{idStade}/match` - Add a match to a stadium  
- `GET /stade/{idStade}/match` - Get all matches for a stadium  
