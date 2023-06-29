# ChatGPT_Java
Baeldung: ChatGPT + java + maven

Запуск в docker:

1. поправить переменные в application.properties
2. mvn.clean
3. mvn.install
4. Запустить Docker
5. выполнить в терминале из корневой папки приложения .../ChatGPT_Java/
6. docker build -t chat_gpt_connect_from_java .
7. Далее можно с UI Docker запустить image из конейнера
8. п.с. это для себя: docker run -d -p 8083:8083 chat_gpt_connect_from_java
