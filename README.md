# 💊 Pharmacy - API de gestion des produits pharmaceutiques

## 📝 Description

Cette application est une **REST API** développée avec **Spring Boot**, permettant la gestion des produits d'une pharmacie. Elle facilite l'ajout, la modification, la suppression et la consultation des produits disponibles dans le stock.

Elle a été réalisée dans le cadre d'un projet individuel de 5 jours pour répondre aux besoins d'une nouvelle pharmacie souhaitant mieux organiser ses produits.

---

## 🚀 Fonctionnalités

- ✅ Ajouter un nouveau produit avec les informations suivantes :
  - Nom de l'article
  - Quantité en stock
  - Prix
  - Description
- ✅ Modifier les informations d’un produit existant
- ✅ Supprimer un produit de la base de données
- ✅ Consulter la liste complète des produits disponibles

---

## 🛠️ Technologies utilisées

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL / PostgreSQL**
- **Lombok**
- **Postman** (pour le test des routes)
- **Git & GitHub** (gestion de version)
- **Maven** (gestion de dépendances)

---

## 🔗 Endpoints API

| Méthode | Endpoint              | Description                       |
|--------|------------------------|-----------------------------------|
| POST   | `/api/products`        | Ajouter un produit                |
| GET    | `/api/products`        | Lister tous les produits          |
| GET    | `/api/products/{id}`   | Consulter un produit par ID       |
| PUT    | `/api/products/{id}`   | Modifier un produit existant      |
| DELETE | `/api/products/{id}`   | Supprimer un produit              |

---

## 🧪 Tests avec Postman

👉 [Lien vers la collection Postman](https://www.postman.com/) *(à compléter par ton lien)*  
Les routes sont testées avec des requêtes valides et invalides pour tester également la gestion des exceptions.

---

## ⚠️ Gestion des exceptions

L'application gère proprement les erreurs telles que :
- Produit non trouvé (`404 Not Found`)
- Données invalides (`400 Bad Request`)
- Problèmes internes (`500 Internal Server Error`)


## 👨‍💻 Auteur

- **Nom** : Youssef El Madani  
- **Formation** : Développement Web et Web Mobile  
- **Email** : youssfelmadani@gmail.com

---

## 📌 Remarques

- Ce projet respecte l'architecture MVC.
