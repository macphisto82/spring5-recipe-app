package ap.springframework.services;

import java.util.Set;

import ap.springframework.commands.RecipeCommand;
import ap.springframework.domain.Recipe;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
