package kr.ac.hansung.cse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHwApplication {

	//main 함수 => run 하면 톰캣이 이 application 수행
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHwApplication.class, args);
	}

}
