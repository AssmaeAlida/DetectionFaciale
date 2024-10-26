

**DetectionFacialeFX** est une application de bureau développée en Java utilisant JavaFX pour l'interface utilisateur et OpenCV pour la détection faciale. Elle est conçue pour détecter et identifier les visages des employés, facilitant la reconnaissance d'identité en temps réel dans des environnements professionnels.

## Sommaire
- [Fonctionnalités](#fonctionnalités)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Technologies Utilisées](#technologies-utilisées)
- [Contributeurs](#contributeurs)
- [Licence](#licence)

---

## Fonctionnalités
- **Détection faciale en temps réel** : Capture et détecte les visages via une webcam connectée.
- **Reconnaissance faciale des employés** : Permet d'identifier les employés en utilisant un ensemble de données d'images stockées.
- **Interface utilisateur conviviale** : Interface développée avec JavaFX pour une expérience utilisateur intuitive.
- **Journalisation des accès** : Enregistre les entrées et les sorties des employés pour le suivi des présences.
  
## Prérequis
Avant de démarrer, assurez-vous d'avoir installé les éléments suivants :
- **Java** (JDK 11 ou supérieur)
- **JavaFX** (si nécessaire, configuration JavaFX SDK)
- **OpenCV** (version 4.0 ou supérieure)
- Un **IDE** tel que IntelliJ IDEA, Eclipse ou NetBeans

## Installation

1. **Cloner le dépôt**
   ```bash
   git clone https://github.com/AssmaeAlida/DetectionFaciale.git
   cd DetectionFaciale
   ```

2. **Configurer OpenCV**
   - Téléchargez OpenCV depuis [OpenCV.org](https://opencv.org/releases/).
   - Décompressez et copiez les fichiers `.dll` (Windows) ou `.so` (Linux/Mac) vers votre répertoire de projet ou configurez le chemin dans votre IDE.

3. **Configurer JavaFX** (si nécessaire)
   - Téléchargez JavaFX SDK depuis [GluonHQ](https://gluonhq.com/products/javafx/).
   - Ajoutez le chemin JavaFX à vos variables d'environnement, ou configurez votre IDE pour inclure JavaFX.

4. **Lancer l'application**
   - Importez le projet dans votre IDE et lancez le fichier principal `Main.java`.
  
## Utilisation

1. **Démarrage de la Détection Faciale**
   - Lancez l'application et activez la webcam pour démarrer la détection faciale en temps réel.
  
2. **Identification d'Employés**
   - Chargez les données des employés (images de référence) via l'interface et enregistrez les profils des employés.

3. **Suivi des Présences**
   - L'application enregistrera automatiquement les dates et heures d'entrée et de sortie de chaque employé détecté.

## Technologies Utilisées
- **Java** : Langage de programmation principal
- **JavaFX** : Pour la création d'interfaces utilisateur
- **OpenCV** : Pour la détection et la reconnaissance faciale
- **MySQL** : Pour stocker les informations des employés et l'historique des accès

## Contributeurs
- **Assmae Alida** - Développeuse principale et architecte du projet.

## Licence
Ce projet est sous licence MIT. Consultez le fichier [LICENSE](LICENSE) pour plus de détails.
