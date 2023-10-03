package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.Student;

@Repository
public interface Repo extends JpaRepository<Student, Long>
{

}
