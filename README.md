# J2EE_app_Colloc
Projet J2EE de collocation avec une architecture microservices

🏡 LocaImmo








LocaImmo est une plateforme basée sur microservices Java Spring Boot permettant de mettre en relation des locataires et des colocataires compatibles, ainsi que de gérer des annonces de colocation.

Le projet se concentre sur deux microservices principaux :

User Service : gestion des utilisateurs (Locataires / Propriétaires / Rôles)

Housing Service : gestion des biens, chambres et annonces de colocation

📌 Objectif du projet

Permettre aux locataires de trouver des colocataires compatibles et/ou des logements adaptés selon leurs préférences.

Permettre aux propriétaires de publier et gérer leurs annonces de colocation.

Offrir une architecture microservices évolutive et prête pour intégration future de services supplémentaires (matching, messagerie, notifications).

🏗 Architecture
┌──────────────┐
│  API Gateway │
└─────┬────────┘
      │
      │ REST
      ▼
 ┌──────────────┐        ┌──────────────┐
 │ User Service │◄──────►│ Housing Svc  │
 └──────────────┘        └──────────────┘
      ▲
      │
      ▼
 ┌──────────────┐
 │  Eureka Srv  │
 └──────────────┘


Eureka Server : service discovery

API Gateway : point d’entrée unique pour le frontend

User Service : gestion des utilisateurs

Housing Service : gestion des biens et annonces

👤 User Service
Modèle de données

User (Parent)

id

email (unique)

password

nom / prénom

telephone

createdAt / updatedAt

roles (ManyToMany avec Role)

Locataire (hérite de User)

âge

profession

préférences (string pour cette phase)

Propriétaire (hérite de User)

adresse

Role

id

nom (LOCATAIRE / PROPRIETAIRE / ADMIN)

Fonctionnalités

CRUD utilisateurs

Gestion des rôles

Création et modification des profils Locataire / Propriétaire

Récupération des utilisateurs par type ou rôle

🏠 Housing Service
Modèle de données

Property (Bien immobilier)

id

proprietaireId

adresse / ville

latitude / longitude

description

règles de colocation

Room (Chambre)

id

propertyId

superficie

prix

disponibilité

Ad (Annonce)

id

roomId

titre / description

datePublication

Fonctionnalités

CRUD biens et chambres

Publication d’annonces

Recherche par ville, prix, disponibilité

Vérification du propriétaire via User Service

🔗 Communication entre services

Tous les appels passent par API Gateway

REST + Eureka pour discovery

Pas d’accès direct aux bases de données entre services

⚙️ Scénarios d’utilisation
Locataire recherchant une colocation

Création de compte

Remplissage du profil et des préférences

Consultation des annonces disponibles via Housing Service

Filtrage selon budget, localisation et critères

Propriétaire publiant une annonce

Création de compte

Ajout d’un bien

Ajout des chambres

Publication de l’annonce

🗃 Bases de données

user_db → User Service

housing_db → Housing Service

🐳 Conteneurisation

Docker / Docker Compose pour tous les microservices

Bases MySQL intégrées dans Docker Compose

📦 Livrables

Code source des microservices

Documentation API (Swagger / Postman)

Diagrammes UML : architecture, classes, séquence

Docker Compose
