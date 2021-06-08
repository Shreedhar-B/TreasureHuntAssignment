# TreasureHunt (Assignment)

Sample input :

curl --location --request POST 'http://localhost:8080/treasurehunt/solve' \
--header 'Content-Type: application/json' \
--data-raw '[
    [34,21,32,14,25],
    [14,42,43,14,31],
    [54,45,52,42,23],
    [33,15,51,31,35],
    [21,52,33,13,23]
]'


Output :

Row	Column
1	1
3	4
4	2
1	5
2	5
3	1
5	4
1	3
3	2
4	5
3	5
2	3
4	3
5	1
2	1
1	4
Treasure found at 1	4
