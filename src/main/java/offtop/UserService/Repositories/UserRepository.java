package offtop.UserService.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import offtop.UserService.Models.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called UserRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

    List<User> findByEmail(String email);

    User findById(int id);

    List<User> findAll();


}
