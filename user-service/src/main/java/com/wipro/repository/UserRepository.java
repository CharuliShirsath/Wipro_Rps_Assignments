package com.wipro.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
}
