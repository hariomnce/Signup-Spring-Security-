package com.signup.reposatory;


import com.signup.enities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserReposatory extends JpaRepository<User,Integer> {
      User findByEmailId(String emailId);
      User findOneByIgnoreCaseEmailIdAndPassword(String emailId, String password);
      //User findByUsername(String username);
}
