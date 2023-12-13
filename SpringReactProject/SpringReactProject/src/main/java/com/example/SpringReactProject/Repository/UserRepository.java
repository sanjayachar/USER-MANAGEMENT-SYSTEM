package com.example.SpringReactProject.Repository;

import com.example.SpringReactProject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
