package ru.isa.petnotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isa.petnotes.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
