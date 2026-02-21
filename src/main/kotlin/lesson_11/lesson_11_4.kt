package lesson_11

class RecipeCategory(
    val id: Int,
    val categoryTitle: String,
    val imageUrl: String,
    val recipes: List<Recipe>,

    )

class Recipe(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val ingredients: List<Ingredient>,
    val numberOfPortions: Int,
    val mealPrep: String,
    val addToFavourite: Boolean,
)

class Ingredient(
    val ingredientName: String,
    val amount: Int,
    val unitOfMeasure: String,
)