package com.elbehiry.shared.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020!H\u0007\u00a8\u0006%"}, d2 = {"Lcom/elbehiry/shared/di/RecipesModule;", "", "()V", "provideCuisinesRepository", "Lcom/elbehiry/shared/data/recipes/cuisines/repository/CuisinesRepository;", "getCuisinesDataSource", "Lcom/elbehiry/shared/data/recipes/cuisines/remote/GetCuisinesDataSource;", "provideGetCuisinesDataSource", "api", "Lcom/elbehiry/shared/data/remote/DelishApi;", "provideIngredientsDataSource", "Lcom/elbehiry/shared/data/recipes/ingredients/remote/GetIngredientsDataSource;", "provideIngredientsRepository", "Lcom/elbehiry/shared/data/recipes/ingredients/repository/IngredientsRepository;", "getIngredientsDataSource", "provideMealPlanDataSource", "Lcom/elbehiry/shared/data/plan/remote/MealPlanDataSource;", "provideMealPlanRepository", "Lcom/elbehiry/shared/data/plan/repository/MealPlanRepository;", "mealPlanDataSource", "provideRandomRecipesDataSource", "Lcom/elbehiry/shared/data/recipes/random/remote/RandomRecipesRemoteDataSource;", "provideRandomRecipesRepository", "Lcom/elbehiry/shared/data/recipes/random/repository/RandomRecipesRepository;", "randomRecipesRemoteDataSource", "provideRecipeInformationDataSource", "Lcom/elbehiry/shared/data/recipes/info/remote/RecipeInformationDataSource;", "provideRecipeInformationRepository", "Lcom/elbehiry/shared/data/recipes/info/repository/RecipeInformationRepository;", "recipeInformationDataSource", "recipesLocalDataStore", "Lcom/elbehiry/shared/data/db/datastore/RecipesLocalDataStore;", "provideSearchDataSource", "Lcom/elbehiry/shared/data/recipes/search/remote/SearchDataSource;", "provideSearchRepository", "Lcom/elbehiry/shared/data/recipes/search/repository/SearchRepository;", "rearchDataSource", "shared_debug"})
@dagger.Module()
public final class RecipesModule {
    
    public RecipesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.random.remote.RandomRecipesRemoteDataSource provideRandomRecipesDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.random.repository.RandomRecipesRepository provideRandomRecipesRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.random.remote.RandomRecipesRemoteDataSource randomRecipesRemoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.cuisines.remote.GetCuisinesDataSource provideGetCuisinesDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.cuisines.repository.CuisinesRepository provideCuisinesRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.cuisines.remote.GetCuisinesDataSource getCuisinesDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.info.remote.RecipeInformationDataSource provideRecipeInformationDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.info.repository.RecipeInformationRepository provideRecipeInformationRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.info.remote.RecipeInformationDataSource recipeInformationDataSource, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.datastore.RecipesLocalDataStore recipesLocalDataStore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.search.remote.SearchDataSource provideSearchDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.search.repository.SearchRepository provideSearchRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.search.remote.SearchDataSource rearchDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.plan.remote.MealPlanDataSource provideMealPlanDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.plan.repository.MealPlanRepository provideMealPlanRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.plan.remote.MealPlanDataSource mealPlanDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.ingredients.remote.GetIngredientsDataSource provideIngredientsDataSource(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.remote.DelishApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.elbehiry.shared.data.recipes.ingredients.repository.IngredientsRepository provideIngredientsRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.ingredients.remote.GetIngredientsDataSource getIngredientsDataSource) {
        return null;
    }
}