package ap.springframework.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ap.springframework.domain.Category;
import ap.springframework.domain.UnitOfMeasure;
import ap.springframework.repositories.CategoryRepository;
import ap.springframework.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@RequestMapping({"","/","/index"})
	public String getIndexPage() {
		Optional<Category> categOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		System.out.println("Category id: " + categOptional.get().getId());
		System.out.println("UoM id: " + unitOptional.get().getId());
		return "index";
	}
	
	
}
