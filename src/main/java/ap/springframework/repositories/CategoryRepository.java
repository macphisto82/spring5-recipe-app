package ap.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import ap.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
