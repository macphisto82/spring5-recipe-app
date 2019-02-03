package ap.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import ap.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
