package com.springboot;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// v1~v5가 각자 패키지에 @SpringBootApplication을 따로 두고 있어, com.springboot 패키지에서는 찾을 설정 클래스가 없습니다.
// v4, v5 애플리케이션은 실행되면 콘솔 입력을 기다리므로 이 테스트에서 실행하지 않습니다.
@Disabled("v1~v5 애플리케이션이 패키지별로 나뉘어 있어 공통 컨텍스트가 없습니다")
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
