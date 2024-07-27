package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core", // 시작위치 지정
        basePackageClasses = AutoAppConfig.class, // 해당 클래스의 패키지를 탐색 위치로 지정
        // 지정하지 않으면 현재 클래스의 패키지부터 시작
        
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // 기존에 만든 AppConfig는 컴포넌트 스캔 대상에서 제거
)
// 요즘 권장하는 방법은 패키지 위치를 지정하지 않고, 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것
// 스프링 부트를 사용하면 기본적으로 제공되는 Application(CoreApplication)에 붙어있는 @SpringBootApplication에 @ComponentScan이 들어있다. 즉, 따로 @ComponentScan을 따로 써줄 일은 거의 없다는 뜻!

public class AutoAppConfig {
}
