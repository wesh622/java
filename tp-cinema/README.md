# TP Cinéma — POO : Polymorphisme, interfaces, classes abstraites, héritage

## Objectif

Implémenter un système de gestion d'un catalogue cinématographique en Java.
Ce TP suit une progression en 10 questions, chacune testée par des tests JUnit 5.

## Hiérarchie de classes

```
Authorable (interface)         Datable (interface)       Taggable (interface)
     |                              |                          |
     +------------------------------+                          |
                    |                                          |
             AbstractWork (abstract)                           |
            /              \                                   |
          Film         AbstractVisualWork (abstract) ----------+
                          /            \
                       Movie          Series
```

## Questions

| # | Classe/Interface | Description |
|---|-----------------|-------------|
| 1 | `Authorable` | Interface avec `getDirector()` |
| 2 | `Datable` | Interface avec `getReleaseYear()` |
| 3 | `Taggable` | Interface avec `addTag`, `removeTag`, `tagsCount`, `getTags` |
| 4 | `AbstractWork` | Classe abstraite implémentant `Authorable` et `Datable` |
| 5 | `AbstractVisualWork` | Classe abstraite étendant `AbstractWork`, implémentant `Taggable` |
| 6 | `Film` | Classe concrète étendant `AbstractWork`, avec `getSynopsis()` |
| 7 | `Movie` | Classe concrète étendant `AbstractVisualWork`, avec `getURL()`, `getDuration()` |
| 8 | `Series` | Classe concrète étendant `AbstractVisualWork`, avec `getURL()`, `getTitle()`, `getSeasons()` |
| 9 | `CatalogService` | Interface du service catalogue (déjà fournie) |
| 10 | `CatalogServiceImpl` | Implémentation du service catalogue |


## Constructeurs attendus

- `AbstractWork(String director, int releaseYear)`
- `AbstractVisualWork(String director, int releaseYear)`
- `Film(String director, int releaseYear, String synopsis)`
- `Movie(String director, int releaseYear, String url, int duration)`
- `Series(String director, int releaseYear, String url, String title, int seasons)`
- `CatalogServiceImpl(String name)`

## Comportements importants

- `addTag(null)` ne doit rien faire (null ignoré)
- `addTag` ne doit pas ajouter de doublons
- `removeTag(null)` ne doit rien faire
- `findEntriesByTags` retourne les entrées ayant **tous** les tags demandés
- `findEntriesBySynopsis` cherche les `Film` dont le synopsis **contient** chaque mot donné
- `findEntriesByTagsOrSynopsis` fait l'union des deux méthodes précédentes (sans doublons)

## Exécution des tests

```bash
./gradlew test
```

Pour activer les tests d'une question, décommenter la ligne correspondante dans `build.gradle`.
