package com.elbehiry.delish.ui.recipedetails;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/elbehiry/delish/ui/recipedetails/RecipeDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "getRecipeInformationUseCase", "Lcom/elbehiry/shared/domain/recipes/information/GetRecipeInformationSuspendUseCase;", "saveRecipeUseCase", "Lcom/elbehiry/shared/domain/recipes/bookmark/SaveRecipeSuspendUseCase;", "(Lcom/elbehiry/shared/domain/recipes/information/GetRecipeInformationSuspendUseCase;Lcom/elbehiry/shared/domain/recipes/bookmark/SaveRecipeSuspendUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/elbehiry/delish/ui/recipedetails/RecipeDetailsViewModel$RecipesDetailsViewState;", "isloading", "", "getIsloading", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "getRecipeDetails", "", "id", "", "saveRecipe", "recipesItem", "Lcom/elbehiry/model/RecipesItem;", "RecipesDetailsViewState", "mobile_debug"})
public final class RecipeDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.elbehiry.shared.domain.recipes.information.GetRecipeInformationSuspendUseCase getRecipeInformationUseCase = null;
    private final com.elbehiry.shared.domain.recipes.bookmark.SaveRecipeSuspendUseCase saveRecipeUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isloading = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.elbehiry.delish.ui.recipedetails.RecipeDetailsViewModel.RecipesDetailsViewState> _state = null;
    
    @javax.inject.Inject()
    public RecipeDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.information.GetRecipeInformationSuspendUseCase getRecipeInformationUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.bookmark.SaveRecipeSuspendUseCase saveRecipeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getIsloading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.elbehiry.delish.ui.recipedetails.RecipeDetailsViewModel.RecipesDetailsViewState> getViewState() {
        return null;
    }
    
    public final void getRecipeDetails(int id) {
    }
    
    public final void saveRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.model.RecipesItem recipesItem) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/elbehiry/delish/ui/recipedetails/RecipeDetailsViewModel$RecipesDetailsViewState;", "", "recipe", "Lcom/elbehiry/model/RecipesItem;", "isEmpty", "", "hasError", "(Lcom/elbehiry/model/RecipesItem;ZZ)V", "getHasError", "()Z", "getRecipe", "()Lcom/elbehiry/model/RecipesItem;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "mobile_debug"})
    public static final class RecipesDetailsViewState {
        @org.jetbrains.annotations.NotNull()
        private final com.elbehiry.model.RecipesItem recipe = null;
        private final boolean isEmpty = false;
        private final boolean hasError = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.elbehiry.delish.ui.recipedetails.RecipeDetailsViewModel.RecipesDetailsViewState copy(@org.jetbrains.annotations.NotNull()
        com.elbehiry.model.RecipesItem recipe, boolean isEmpty, boolean hasError) {
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
        
        public RecipesDetailsViewState() {
            super();
        }
        
        public RecipesDetailsViewState(@org.jetbrains.annotations.NotNull()
        com.elbehiry.model.RecipesItem recipe, boolean isEmpty, boolean hasError) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.elbehiry.model.RecipesItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.elbehiry.model.RecipesItem getRecipe() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isEmpty() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getHasError() {
            return false;
        }
    }
}