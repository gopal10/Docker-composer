FROM openjdk:11

ADD ./target/zuul-0.0.1-SNAPSHOT.jar /usr/src/zuul-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "zuul-0.0.1-SNAPSHOT.jar"]