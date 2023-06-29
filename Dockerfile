FROM openjdk:21-slim-buster as BUILD

ENV LANG        C.UTF-8
ENV LC_ALL      C.UTF-8
ENV LC_CTYPE    C.UTF-8

WORKDIR /app

COPY ./target/chatgpt_con-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT java -Dfile.encoding=UTF-8 -jar app.jar