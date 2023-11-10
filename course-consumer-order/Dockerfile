FROM openjdk:17-alpine3.14

LABEL maintainer="nekoimi <nekoimime@gmail.com>"

ARG JAR_NAME="target/course-consumer-order-1.0-SNAPSHOT.jar"

ENV TZ Asia/Shanghai
ENV PROFILE prod
ENV JAVA_OPS -server -Xms128m -Xmx256m -XX:CompressedClassSpaceSize=64m -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m

WORKDIR workspace

COPY ${JAR_NAME}  app.jar

EXPOSE 9002

CMD java ${JAVA_OPS} -Dspring.profiles.active=${PROFILE} -Djava.security.egd=file:/dev/./urandom -jar app.jar
