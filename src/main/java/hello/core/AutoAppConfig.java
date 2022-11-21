package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    /*
        수동으로 등록한 빈과 자동으로 등록한 빈의 충돌을 확인해보자.. 되네? 왜 되냐
        비밀 : 수동 등록빈이 우선권을 가진다!
        but.. 개발자별 다른 스타일들로 인해 혼선을 방지해주고자 스프링 부트 메인 메서드를 돌릴 경우에 수동/자동 빈이 충돌될 경우에는 에러를 띄워버린다.
        애초에 시작 자체가 안되게..!!
        친절하게 에러 로그도 나오고 이전처럼 수동 등록빈이 우선권을 가지도록 하려면 application.properties에서 설정을 바꿔주라고 알려준다.
        spring.main.allow-bean-definition-overriding=true !!
    */

//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
