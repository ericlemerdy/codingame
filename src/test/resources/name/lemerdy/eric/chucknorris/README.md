
Question
Temps maximum pour trouver une solution : 60:00


Le binaire avec des 0 et des 1 c'est bien. Mais le binaire avec que des 0, ou presque, c'est encore mieux. A l'origine, c'est un concept inventé par Chuck Norris pour envoyer des messages dits unaires.

Voici le principe d'encodage :

    Le message en entrée est constitué de caractères ASCII (7 bits)
    Le message encodé en sortie est constitué de blocs de 0
    Un bloc est séparé d'un autre bloc par un espace
    Deux blocs consécutifs servent à produir une série de bits de même valeur (que des 1 ou que des 0) :
        Premier bloc : il vaut toujours 0 ou 00. S'il vaut 0 la série contient des 1, sinon elle contient des 0
        Deuxième bloc : le nombre de 0 dans ce bloc correspond au nombre de bits dans la série

Prenons un exemple simple avec un message constitué d'un seul caractère : C majuscule. C en binaire vaut 1000011 ce qui donne avec la technique de Chuck Norris :

    0 0 (la première série composée d'un seul 1)
    00 0000 (la deuxième série composée de quatre 0)
    0 00 (la troisième série composée de deux 1)

C vaut donc : 0 0 00 0000 0 00

Deuxième exemple, nous voulons encoder le message CC (soit les 14 bits 10000111000011) :

    0 0 (un seul 1)
    00 0000 (quatre 0)
    0 000 (trois 1)
    00 0000 (quatre 0)
    0 00 (deux 1)

CC vaut donc : 0 0 00 0000 0 000 00 0000 0 00

Ecrivez un programme qui, à partir d'un message en entrée, affiche le message codé façon Chuck Norris en sortie.
ENTRÉE :
Ligne 1 : le message composé de N caractères ASCII (sans retour chariot)

SORTIE :
Le message encodé

CONTRAINTES :
0 < N < 100

EXEMPLE :
Entrée
C
Sortie
0 0 00 0000 0 00

Mémoire RAM disponible : 512Mo
Durée maximum d’exécution : 1 secondes

    Le programme doit lire les entrées depuis l’entrée standard
    Le programme doit écrire la réponse dans la sortie standard
    Le programme doit fonctionner dans l’environnement de test fourni

Fichiers fournis dans le script de test :
Caractère C : in1.txt out1.txt
Message CC : in2.txt out2.txt
Caractère % : in3.txt out3.txt
Message de Chuck Norris : in4.txt out4.txt