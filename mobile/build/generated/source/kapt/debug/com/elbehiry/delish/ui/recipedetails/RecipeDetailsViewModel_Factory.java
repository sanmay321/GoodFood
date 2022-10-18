// Generated by Dagger (https://dagger.dev).
package com.elbehiry.delish.ui.recipedetails;

import com.elbehiry.shared.domain.recipes.bookmark.SaveRecipeSuspendUseCase;
import com.elbehiry.shared.domain.recipes.information.GetRecipeInformationSuspendUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipeDetailsViewModel_Factory implements Factory<RecipeDetailsViewModel> {
  private final Provider<GetRecipeInformationSuspendUseCase> getRecipeInformationUseCaseProvider;

  private final Provider<SaveRecipeSuspendUseCase> saveRecipeUseCaseProvider;

  public RecipeDetailsViewModel_Factory(
      Provider<GetRecipeInformationSuspendUseCase> getRecipeInformationUseCaseProvider,
      Provider<SaveRecipeSuspendUseCase> saveRecipeUseCaseProvider) {
    this.getRecipeInformationUseCaseProvider = getRecipeInformationUseCaseProvider;
    this.saveRecipeUseCaseProvider = saveRecipeUseCaseProvider;
  }

  @Override
  public RecipeDetailsViewModel get() {
    return newInstance(getRecipeInformationUseCaseProvider.get(), saveRecipeUseCaseProvider.get());
  }

  public static RecipeDetailsViewModel_Factory create(
      Provider<GetRecipeInformationSuspendUseCase> getRecipeInformationUseCaseProvider,
      Provider<SaveRecipeSuspendUseCase> saveRecipeUseCaseProvider) {
    return new RecipeDetailsViewModel_Factory(getRecipeInformationUseCaseProvider, saveRecipeUseCaseProvider);
  }

  public static RecipeDetailsViewModel newInstance(
      GetRecipeInformationSuspendUseCase getRecipeInformationUseCase,
      SaveRecipeSuspendUseCase saveRecipeUseCase) {
    return new RecipeDetailsViewModel(getRecipeInformationUseCase, saveRecipeUseCase);
  }
}