Проект по автоматизации НОВЕО

Технологии и инструменты
## :hotsprings: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="https://mfs-03.getcourse.ru/public/files/159627/383/ccb79347a3ba4f05bfb3129dfd913fcf.svg?e=1659041999&s=cjWAy6g9FXeWMywTKl6cQw">
<img width="6%" title="Java" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/56/h/07d564cc70e29ca3f184523294545f8b.svg">
<img width="6%" title="Selenide" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/399/h/5d2c34e97efd8aff6f7f2c1d3c8c30b8.svg">
<img width="6%" title="Selenoid" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/131/h/40ba0a9a145340d913192bff0f6c6b77.svg">
<img width="6%" title="Allure Report" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/185/h/c79ab1cf937ba73a952a0a02a11e9469.svg">
<img width="6%" title="Gradle" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/147/h/4e2b5444985e5c3a7f7b1df2b71046f1.svg">
<img width="6%" title="JUnit5" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/390/h/b90dddb8bcf49db3d4ea4647f02cb479.svg">
<img width="6%" title="GitHub" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/247/h/fd6e833503e0e9255ae86ec12fcd6a82.svg">
<img width="6%" title="Jenkins" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/93/h/2ec41c19823d5239d3b6c540cfe97202.svg">
<img width="6%" title="Docker" src="https://fs.getcourse.ru/fileservice/file/download/a/159627/sc/321/h/c8dff31ce0854741a2ba5feb45b40a3b.svg">
</p>

## :hotsprings: Проверки
Тест 1:
- Открыть сайт НОВЕО.РФ
- Нажать кнопку поиска
- Ввести вакансию Тестировщик
- Выбрать вакансию
- Проверить корректность текста в шапке

Тест 2:
- Открыть сайт НОВЕО.РФ
- Проверка названия в шапке сайта

## :hotsprings: Jenkins job
https://jenkins.autotests.cloud/job/Qa_guru_14_Avtotests/
### <img title="jenkins-job" src="images/Screenshots/Screenshot_2.png">
<p align="center">
<img title="jenkins-job" src="images/Screenshots/Screenshot_1.png">
</p>

### Параметры сборки в Jenkins:
Сборка в Jenkins

- browser (браузер, default browser chrome)
- size (размер окна браузера, default size 1920x1080)
- threads (количество потоков)


## :hotsprings: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

Удаленный запуск:
```
clean
test
-Dbrowser=${BROWSER}
-Dsize=${BROWSER_SIZE}
-Dthreads=${THREADS}
```
