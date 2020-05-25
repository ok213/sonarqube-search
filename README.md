# sonarqube-search

**Task:**  
Необходимо исследовать, как Sonarqube подходит к анализу покрытия кода тестами и подготовить пример:

1.Настроить SonarQube или аналог для анализа покрытия кода тестами (возможно подойдет плагин в IDEA)  
2.Подготовить простой пример с 4 классами: Entity, Repository, Service, Controller  
3.Написать простые тесты и изучить влияние каждого класса и метода на долю покрытия тестами  
4.Изучить минимальный набор тестов для покрытия кода 70%
#

1. cd ENV  
2. docker-compose up -d  
3. http://localhost:9000  
   _Log in: admin / admin_  
4. create new project (example, everywhere we enter "test") and get the key
5. Run analysis on your project: java, maven
6. After go idea and the terminal enter:  
_mvn clean test sonar:sonar -Dsonar.projectKey=test -Dsonar.host.url=http://localhost:9000 -Dsonar.login=7f3e8040bc5a0d21afc44fc16becbd36fb63f54e_
7. Return sonarqube and see result.

Built-in plugins in Idea: Code Coverage  
To run code with coverage, open Run menu and click Run with coverage
#

**Results:**
- in folder RESULT;
- Jacoco result here: sonarqube-search/target/site/jacoco/index.html

The findings:  
**Покрытие не анализирует качество тестов!**

- интерфейсы на покрытие не проверяются;
- пустой тест для метода не засчитыватся;
- в тесте класса нужно вызвать каждый метод, тогда класс 100%;
- если в методе есть if или switch, нужно в тесте зайти в каждую ветку

Jacoco методика рассчета здесь:
https://www.jacoco.org/jacoco/trunk/doc/counters.html

