package app.authentification.authentification.repository;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import app.authentification.authentification.models.ERole;
import app.authentification.authentification.models.Role;
public interface RoleRepository extends MongoRepository<Role, String> {
	Optional<Role> findByName(ERole name);
}
