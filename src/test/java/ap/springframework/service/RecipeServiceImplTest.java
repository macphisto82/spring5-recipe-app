package ap.springframework.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import ap.springframework.domain.Recipe;
import ap.springframework.repositories.RecipeRepository;
import ap.springframework.services.RecipeService;
import ap.springframework.services.RecipeServiceImpl;

public class RecipeServiceImplTest {
	
	RecipeService recipeService;
	
	@Mock
	RecipeRepository recipeRepository;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		recipeService = new RecipeServiceImpl(recipeRepository);
	}
	
	@Test
    public void getRecipes() throws Exception {
        Recipe recipe = new Recipe();
        Set<Recipe> recipesData = new HashSet<Recipe>();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
	}

}
