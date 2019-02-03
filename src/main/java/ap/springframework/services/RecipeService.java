package ap.springframework.services;

import java.util.Set;

import ap.springframework.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();
}
