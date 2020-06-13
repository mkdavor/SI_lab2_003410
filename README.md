# SI_lab2_003410
Втора лабораториска вежба по Софтверско инженерство
Давор Дениќ, бр. на индекс 003410
Група на код: 
Ја добив групата на код 1

Control Flow Graph
![alt text](https://github.com/mkdavor/SI_lab2_003410/blob/master/zadaca1slika2.jpg)

Цикломатска комплексност
Цикломатската комплексност на овој код е 2, истата ја добив преку формулата E–N+2, каде што Е е бројот на edges, а N е бројот на nodes. Во случајoв Е=16, а N=12, па цикломатската комплексност изнесува 16-12+2=6.

Тест случаи според критериумот <b>multiple condition</b>

Според multiple condition критериумот има 2^n тест случаи каде n е бројот на различни булови изрази. Во кодот на функцијата function има 9 уникатни булови изрази и тоа:

1: user!=null

2: user.getUsername()!=null

3: user.getEmail()!=null

4: !allUsers.contains(user.getUsername())

5: i<user.getEmail().length()

6: user.getEmail().charAt(i)=='@'

7: atChar == true

8: user.getEmail().charAt(i)=='.'

9: dotChar == true

Според ова имаме 2^9 уникатни комбинации за тест случаи почнувајќи од тоа сите да се false (F), до тоа сите да се true (T). Во продолжение неколку случаи:

1 2 3 4 5 6 7 8 9 (условите)

F F F F F F F F F (резултатот)

F F F F F F F F T 

F F F F F F F T F 

.................

T T T T T T T T F

T T T T T T T T T

Се разбира, не сите од овие комбинации се возможни во пракса, односно user != null да е false, и во исто време user.getUsername() != null да е true, па ваквите случаеви нема логика да бидат тестирани. Така се добиваат следниве валидни случаи (X Означува било која вредност затоа што не менува во резултатот):

1 2 3 4 5 6 7 8 9

T F X X X X X X X

T T F X X X X X X

T T T F X X X X X

T T T T F X F X X

T T T T F X T X F

T T T T F X T X T

T T T T T F F X X

T T T T T F T F F

T T T T T F T T F

T T T T T F T F T

T T T T T F T T T

T T T T T T F X X

T T T T T T T F F

T T T T T T T T F

T T T T T T T F T

T T T T T T T T T

F X X X X X X X X

Тест случаи според критериумот <b>Every path</b>
Every path критериумот оценува дали еден јазел е true или false и така се добиваат ункатните патеки.



Тука условите во јазлите се :

1. user!=null

2. user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername())

3. i<user.getEmail().length()

4. user.getEmail().charAt(i)=='@'

5. atChar && user.getEmail().charAt(i)=='.'

6. atChar && dotChar


Според ова, уникатните патеки кои според кодот се возможни се:

1 2 3 4 5 6

F X X X X X

T F X X X X

T T F X X F

T T T F X F

T T T T F F

T T T T T T

Објаснување на напишаните unit tests

Првиот тест го тестира multiple condition тестот T T T F X X X X X
каде што 
1: user!=null => T

2: user.getUsername()!=null => T

3: user.getEmail()!=null => T

4: !allUsers.contains(user.getUsername()) => F

останатите услови не се важни.

Ова враќа false затоа што според условите во тестот името на корисникот го има во листата на корисници.


Вториот тест го тестира every path тестот T T T F X F
каде што
1. user!=null => T

2. user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername()) => T

3. i<user.getEmail().length() => T

4. user.getEmail().charAt(i)=='@' => F

6. atChar && dotChar => F

останатите услови не се важни.
Ова враќа false затоа што според условите во тестот емаил адресата на корисникот нема знак @.