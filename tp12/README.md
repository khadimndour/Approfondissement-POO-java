# TP1.2 - Installation des IDE et réalisation d'un micro-projet

**Étudiant :** Khadim Ndour
**Établissement :** ESP, filière GLSI

## 1. IDE installés

Eclipse IDE for Java Developers et Visual Studio Code (avec l'extension Java), avec le JDK 25. Projet `tp12`, package `sn.ucad.esp.glsi.tp12`, classe `Somme`.

## 2. Code source

Le fichier `Somme.java` est dans ce dossier.

## 3. Eclipse

Exécution du programme :

![Exécution Eclipse](01-eclipse-execution.png)

Débogage avec un point d'arrêt sur `total += i;` :

![Débogage Eclipse](02-eclipse-debug.png)

Erreur volontaire (point-virgule retiré) :

![Erreur Eclipse](03-eclipse-erreur.png)

## 4. Visual Studio Code

Import du dossier `src` créé dans Eclipse, puis exécution :

![Exécution VS Code](04-vscode-execution.png)

## 5. Comparaison de mon expérience

J'ai utilisé Eclipse et Visual Studio Code pour le projet tp12. Eclipse demande plus d'étapes à l'installation (installateur, confirmation des signatures, vérification de Microsoft Defender), mais il est complet dès le départ : il compile à chaque enregistrement, souligne l'erreur en rouge dès que je retire le point-virgule, et sa perspective Debug affiche directement `i` et `total` pas à pas avec F6. VS Code était déjà installé et s'ouvre plus vite, mais il a fallu faire confiance au dossier et attendre le chargement de l'extension Java avant d'exécuter la classe. Eclipse m'a paru mieux adapté au débogage et aux gros projets, alors que VS Code est plus léger et plus pratique pour ouvrir un dossier et modifier du code rapidement. Pour un petit projet comme celui-ci, je préfère VS Code, et je garderais Eclipse pour déboguer en détail.
