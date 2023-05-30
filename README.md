# Втора лабораториска вежба по Софтверско инженерство
Никола Диневски, бр. на индекс 216045

# Одговори на прашањата

2. Слика од CFG (во кодот од задачата во истиот репозиториум се наоѓаат во коментари обележани јазлите од овој граф:
<img width="386" alt="cfg" src="https://github.com/ndinevski/SI_2023_lab2_216045/assets/61565298/a1960516-9e76-4b69-9dc1-743374c1cbfc">

3. Цикломатската комплексност на овој код е 11, истата ја добив преку начинот на добивање цикломатска комплексност со броење на региони 
   одделени од ребрата. Во случајот постојат 10 региони одделени со ребра, и надворешниот регион, вкупно 11.
   
4. Во табелата подолу на левата страна се наоѓаат сите ребра, додека во колоните се наоѓаат конкретни примери. Со "\*" означувам минување низ ребро за соодветен пример.
<img width="529" alt="everybranch" src="https://github.com/ndinevski/SI_2023_lab2_216045/assets/61565298/10837363-0285-47c0-8287-29337e167013">

5. Можни се 4 случаи за условот претставени во табелата подолу.

![multiplecase](https://github.com/ndinevski/SI_2023_lab2_216045/assets/61565298/436e5507-0e16-4485-b90c-b59440abebc7)

6. Објаснување за unit tests:
   - Двата тестови од оваа вежба се everyBranchTest() и multipleConditionTest(). За тестот за секое ребро, ги тестирам сите примери кои се наведени во
     табелата од прашање 4. Првиот подтест е со исклучок, па соодветно се справувам со него, а останатите се проверка за наведените примери обележани во 
     коментари над проверката. За тестот за повеќе услови, како наведено во прашање 5, постојат 4 подтестови. За секој подтест,
     е тестирано со соодветен пример, наведен во коментар над самиот тест. Подолу, се наведени слики од сите тестови. Сите тестови беа успешни.
     ![image](https://github.com/ndinevski/SI_2023_lab2_216045/assets/61565298/137b1e5a-e5c8-4541-92d0-8a005fcb1260)
     ![image](https://github.com/ndinevski/SI_2023_lab2_216045/assets/61565298/509df6a7-7065-4c23-9d26-df168649516a)
     ![image](https://github.com/ndinevski/SI_2023_lab2_216045/assets/61565298/64fcb264-d44b-4629-9c7f-4fe0acfd34aa)
     
# Директориумот од Gradle build-от се наоѓа во овој односно  истиот репозиториум (https://github.com/ndinevski/SI_2023_lab2_216045/tree/main/SI_lab2_216045)
