Проект по автоматизации НОВЕО

Технологии и инструменты
## :hotsprings: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/icons/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/icons/Java.svg">
<img width="6%" title="Selenide" src="images/icons/Selenide.svg">
<img width="6%" title="Selenoid" src="images/icons/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/icons/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/icons/Gradle.svg">
<img width="6%" title="JUnit5" src="images/icons/JUnit5.svg">
<img width="6%" title="GitHub" src="images/icons/Github.svg">
<img width="6%" title="Jenkins" src="images/icons/Jenkins.svg">
<img width="6%" title="Jira" src="images/icons/Jira.svg">
<img width="6%" title="Docker" src="images/icons/Docker.svg">
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
![](../../Desktop/Readme/Screenshot_2.png)
![](../../Desktop/Readme/Screenshot_1.png)

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
