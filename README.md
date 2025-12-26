# TP_0_ICT301_Ngueguim_Leslie# TP_0_ICT301 - Principes SOLID

**Nom :** Ngueguim Djimele
**Prénoms :** Leslie  
**Matricule :** 23U2409

## C'est quoi les principes SOLID

Les principes SOLID sont cinq règles de conception en programmation orientée objet qui permettent d'obtenir un code plus maintenable, extensible et robuste.

- **S - Single Responsibility Principle** : Une classe ne doit avoir qu'une seule raison de changer (une seule responsabilité).  
  Cela évite les classes qui font trop de choses à la fois.

- **O - Open-Closed Principle** : Les classes doivent être ouvertes à l'extension mais fermées à la modification.  
  On ajoute de nouvelles fonctionnalités sans modifier le code existant (ex. via interfaces ou héritage).

- **L - Liskov Substitution Principle** : Une sous-classe doit pouvoir remplacer sa classe parente sans casser le programme.  
  Évite les héritages inappropriés (comme Square héritant de Rectangle de façon forcée).

- **I - Interface Segregation Principle** : Préférer plusieurs petites interfaces spécifiques plutôt qu'une grosse interface générale.  
  Une classe ne doit pas être forcée d'implémenter des méthodes qu'elle n'utilise pas.

- **D - Dependency Inversion Principle** : Les modules de haut niveau ne doivent pas dépendre des détails bas niveau, mais des abstractions (interfaces).  
  Cela rend le code plus flexible (ex. changer de base de données facilement).

Ces principes permettent d'éviter la rigidité, la fragilité et l'immobilité du code, surtout en production.

Ce dépôt contient les implémentations des exemples du cours pour chaque principe, avec le code avant et après refactoring, ainsi que les diagrammes de classes dans `fichier.pdf`.