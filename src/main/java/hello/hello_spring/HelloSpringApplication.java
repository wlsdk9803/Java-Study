package hello.hello_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
// ./gradlew.bat build 하면 (잘 안될 때는 ./gradlew.bat clean build) (맥은 ./gradlew build)
// build/libs/hello-spring-0.0.1-SNAPSHOT.jar 이 생긴다.
// java -jar ./build/libs/hello-spring-0.0.1-SNAPSHOT.jar 이렇게 실행하면 됨!
// 배포할 때에도 해당 파일만 복사해서 서버에 올리고 실행하면 끝