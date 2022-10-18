package com.elbehiry.delish.ui.bookmark;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/elbehiry/delish/ui/bookmark/BookmarkViewModel;", "Landroidx/lifecycle/ViewModel;", "getSavedRecipesUseCase", "Lcom/elbehiry/shared/domain/recipes/bookmark/GetSavedRecipesUseCase;", "deleteRecipeUseCase", "Lcom/elbehiry/shared/domain/recipes/bookmark/DeleteRecipeSuspendUseCase;", "(Lcom/elbehiry/shared/domain/recipes/bookmark/GetSavedRecipesUseCase;Lcom/elbehiry/shared/domain/recipes/bookmark/DeleteRecipeSuspendUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/elbehiry/delish/ui/bookmark/BookmarkViewModel$BookmarkViewState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteRecipe", "", "recipe", "Lcom/elbehiry/model/RecipesItem;", "getSavedRecipes", "BookmarkViewState", "mobile_debug"})
public final class BookmarkViewModel extends androidx.lifecycle.ViewModel {
    private final com.elbehiry.shared.domain.recipes.bookmark.GetSavedRecipesUseCase getSavedRecipesUseCase = null;
    private final com.elbehiry.shared.domain.recipes.bookmark.DeleteRecipeSuspendUseCase deleteRecipeUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.elbehiry.delish.ui.bookmark.BookmarkViewModel.BookmarkViewState> _state = null;
    
    @javax.inject.Inject()
    public BookmarkViewModel(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.bookmark.GetSavedRecipesUseCase getSavedRecipesUseCase, @org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.bookmark.DeleteRecipeSuspendUseCase deleteRecipeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.elbehiry.delish.ui.bookmark.BookmarkViewModel.BookmarkViewState> getState() {
        return null;
    }
    
    private final void getSavedRecipes() {
    }
    
    public final void deleteRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.model.RecipesItem recipe) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0006H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/elbehiry/delish/ui/bookmark/BookmarkViewModel$BookmarkViewState;", "", "recipes", "", "Lcom/elbehiry/model/RecipesItem;", "isEmpty", "", "(Ljava/util/List;Z)V", "()Z", "getRecipes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "mobile_debug"})
    public static final class BookmarkViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.elbehiry.model.RecipesItem> recipes = null;
        private final boolean isEmpty = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.elbehiry.delish.ui.bookmark.BookmarkViewModel.BookmarkViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.RecipesItem> recipes, boolean isEmpty) {
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
        
        public BookmarkViewState() {
            super();
        }
        
        public BookmarkViewState(@org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.RecipesItem> recipes, boolean isEmpty) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.RecipesItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.RecipesItem> getRecipes() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isEmpty() {
            return false;
        }
    }
}