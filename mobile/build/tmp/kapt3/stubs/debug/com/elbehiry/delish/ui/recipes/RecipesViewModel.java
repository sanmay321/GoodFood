package com.elbehiry.delish.ui.recipes;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\""}, d2 = {"Lcom/elbehiry/delish/ui/recipes/RecipesViewModel;", "Landroidx/lifecycle/ViewModel;", "getRandomRecipesUseCase", "Lcom/elbehiry/shared/domain/recipes/random/GetRandomRecipesUseCase;", "getAvailableCuisinesUseCase", "Lcom/elbehiry/shared/domain/recipes/cuisines/GetAvailableCuisinesUseCase;", "saveRecipeUseCase", "Lcom/elbehiry/shared/domain/recipes/bookmark/SaveRecipeSuspendUseCase;", "deleteRecipeUseCase", "Lcom/elbehiry/shared/domain/recipes/bookmark/DeleteRecipeSuspendUseCase;", "isRecipeSavedUseCase", "Lcom/elbehiry/shared/domain/recipes/bookmark/IsRecipeSavedSuspendUseCase;", "getIngredientsUseCase", "Lcom/elbehiry/shared/domain/recipes/ingredients/GetIngredientsUseCase;", "(Lcom/elbehiry/shared/domain/recipes/random/GetRandomRecipesUseCase;Lcom/elbehiry/shared/domain/recipes/cuisines/GetAvailableCuisinesUseCase;Lcom/elbehiry/shared/domain/recipes/bookmark/SaveRecipeSuspendUseCase;Lcom/elbehiry/shared/domain/recipes/bookmark/DeleteRecipeSuspendUseCase;Lcom/elbehiry/shared/domain/recipes/bookmark/IsRecipeSavedSuspendUseCase;Lcom/elbehiry/shared/domain/recipes/ingredients/GetIngredientsUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/elbehiry/delish/ui/recipes/RecipesViewModel$RecipesViewState;", "hasError", "", "getHasError", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "loading", "getLoading", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "getHomeContent", "", "onBookMark", "recipesItem", "Lcom/elbehiry/model/RecipesItem;", "RecipesViewState", "mobile_debug"})
public final class RecipesViewModel extends androidx.lifecycle.ViewModel {
    private final com.elbehiry.shared.domain.recipes.random.GetRandomRecipesUseCase getRandomRecipesUseCase = null;
    private final com.elbehiry.shared.domain.recipes.cuisines.GetAvailableCuisinesUseCase getAvailableCuisinesUseCase = null;
    private final com.elbehiry.shared.domain.recipes.bookmark.SaveRecipeSuspendUseCase saveRecipeUseCase = null;
    private final com.elbehiry.shared.domain.recipes.bookmark.DeleteRecipeSuspendUseCase deleteRecipeUseCase = null;
    private final com.elbehiry.shared.domain.recipes.bookmark.IsRecipeSavedSuspendUseCase isRecipeSavedUseCase = null;
    private final com.elbehiry.shared.domain.recipes.ingredients.GetIngredientsUseCase getIngredientsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> hasError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> loading = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.elbehiry.delish.ui.recipes.RecipesViewModel.RecipesViewState> _state = null;
    
    @javax.inject.Inject()
    public RecipesViewModel(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.random.GetRandomRecipesUseCase getRandomRecipesUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.cuisines.GetAvailableCuisinesUseCase getAvailableCuisinesUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.bookmark.SaveRecipeSuspendUseCase saveRecipeUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.bookmark.DeleteRecipeSuspendUseCase deleteRecipeUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.bookmark.IsRecipeSavedSuspendUseCase isRecipeSavedUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.ingredients.GetIngredientsUseCase getIngredientsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHasError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.elbehiry.delish.ui.recipes.RecipesViewModel.RecipesViewState> getViewState() {
        return null;
    }
    
    public final void getHomeContent() {
    }
    
    public final void onBookMark(@org.jetbrains.annotations.NotNull()
    com.elbehiry.model.RecipesItem recipesItem) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/elbehiry/delish/ui/recipes/RecipesViewModel$RecipesViewState;", "", "ingredientList", "", "Lcom/elbehiry/model/IngredientItem;", "cuisinesList", "Lcom/elbehiry/model/CuisineItem;", "randomRecipes", "Lcom/elbehiry/model/RecipesItem;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCuisinesList", "()Ljava/util/List;", "getIngredientList", "getRandomRecipes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mobile_debug"})
    public static final class RecipesViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.elbehiry.model.IngredientItem> ingredientList = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.elbehiry.model.CuisineItem> cuisinesList = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.elbehiry.model.RecipesItem> randomRecipes = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.elbehiry.delish.ui.recipes.RecipesViewModel.RecipesViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.IngredientItem> ingredientList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.CuisineItem> cuisinesList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.RecipesItem> randomRecipes) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public RecipesViewState() {
            super();
        }
        
        public RecipesViewState(@org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.IngredientItem> ingredientList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.CuisineItem> cuisinesList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.RecipesItem> randomRecipes) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.IngredientItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.IngredientItem> getIngredientList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.CuisineItem> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.CuisineItem> getCuisinesList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.RecipesItem> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.RecipesItem> getRandomRecipes() {
            return null;
        }
    }
}