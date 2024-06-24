package repository;

import org.springframework.data.repository.CrudRepository;

import model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
