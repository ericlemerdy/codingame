
Question
Temps maximum pour trouver une solution : 80:00



Dans les gares et aéroports on croise souvent ce type d'écran. Vous êtes-vous demandé comment il serait possible de simuler cet affichage dans un bon vieux terminal ? Nous oui : avec l'art ASCII !

L'art ASCII permet de représenter des formes en utilisant des caractères. Dans notre cas, ces formes sont précisément des mots. Par exemple, le mot "MANHATTAN" pourra être affiché ainsi en art ASCII :
# #  #  ### # #  #  ### ###  #  ###
### # # # # # # # #  #   #  # # # #
### ### # # ### ###  #   #  ### # #
# # # # # # # # # #  #   #  # # # #
# # # # # # # # # #  #   #  # # # #

​Votre mission : Ecrire un programme capable d'afficher une ligne de texte en art ASCII.

ENTRÉE :
Ligne 1 : la largeur L d'une lettre representée en art ASCII. Toutes les lettres font la même largeur.
Ligne 2 : la hauteur H d'une lettre représentée en art ASCII. Toutes les lettres font la même hauteur.
Ligne 3 : La ligne de texte T, composée de N caractères ASCII
Lignes suivantes : La chaîne de caractères ABCDEFGHIJKLMNOPQRSTUVWXYZ? représentée en art ASCII.

SORTIE :
Le texte T en art ASCII.
Les caractères de a à z seront affichés en art ASCII par leur équivalent en majuscule.
Les caractères qui ne sont pas dans les intervales [a-z] ou [A-Z], seront affichés par le point d'interrogation en art ASCII.

CONTRAINTES :
0 < L < 30
0 < H < 30
0 < N < 200

EXEMPLE 1 :
Entrée
4
5
E
 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  # # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  # # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        # # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #
Sortie
###
#
##
#
###

EXEMPLE 2 :
Entrée
4
5
MANHATTAN
 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  # # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  # # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        # # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #
Sortie
# #  #  ### # #  #  ### ###  #  ###  ### # # # # # # # #  #   #  # # # #  ### ### # # ### ###  #   #  ### # #  # # # # # # # # # #  #   #  # # # #  # # # # # # # # # #  #   #  # # # #
Mémoire RAM disponible : 512Mo
Durée maximum d’exécution : 2 secondes

    Le programme doit lire les entrées depuis l’entrée standard
    Le programme doit écrire la réponse dans la sortie standard
    Le programme doit fonctionner dans l’environnement de test fourni

Fichiers fournis dans le script de test :
Test une seul lettre : E : in1.txt out1.txt
Test MANHATTAN : in2.txt out2.txt
Test ManhAtTan : in3.txt out3.txt
Test M@NH@TT@N : in4.txt out4.txt
MANHATTAN avec une autre représentation ASCII : in5.txt out5.txt