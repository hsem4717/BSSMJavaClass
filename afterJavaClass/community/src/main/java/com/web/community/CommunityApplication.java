package com.web.community;

import com.web.community.domain.Board;
import com.web.community.domain.BoardType;
import com.web.community.domain.User;
import com.web.community.repository.BoardRepository;
import com.web.community.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(UserRepository userRepository, BoardRepository boardRepository)
			throws Exception{
		return (args)->{
			User user = userRepository.save(User.builder()
					.name("choi")
					.password("123")
					.email("test@gmail.com")
					.createdDate(LocalDateTime.now())
					.updatedDate(LocalDateTime.now())
					.build());

			for(int i = 1; i<200; i++){
				Board board = boardRepository.save(Board.builder()
						.title("hi")
						.subTitle("서브타이틀")
						.boardType(BoardType.FREE)
						.createdDae(LocalDateTime.now())
						.upDatedate(LocalDateTime.now())
						.build());
			}

		};
	}

}
