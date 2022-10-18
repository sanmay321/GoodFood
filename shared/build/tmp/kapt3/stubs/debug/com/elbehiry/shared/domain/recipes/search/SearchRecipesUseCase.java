package com.elbehiry.shared.domain.recipes.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/search/SearchRecipesUseCase;", "Lcom/elbehiry/shared/domain/UseCase;", "Lcom/elbehiry/shared/domain/recipes/search/SearchRecipesUseCase$Params;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/elbehiry/model/RecipesItem;", "searchRepository", "Lcom/elbehiry/shared/data/recipes/search/repository/SearchRepository;", "(Lcom/elbehiry/shared/data/recipes/search/repository/SearchRepository;)V", "execute", "parameters", "Params", "shared_debug"})
public final class SearchRecipesUseCase extends com.elbehiry.shared.domain.UseCase<com.elbehiry.shared.domain.recipes.search.SearchRecipesUseCase.Params, kotlinx.coroutines.flow.Flow<? extends androidx.paging.PagingData<com.elbehiry.model.RecipesItem>>> {
    private final com.elbehiry.shared.data.recipes.search.repository.SearchRepository searchRepository = null;
    
    @javax.inject.Inject()
    public SearchRecipesUseCase(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.search.repository.SearchRepository searchRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.elbehiry.model.RecipesItem>> execute(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.search.SearchRecipesUseCase.Params parameters) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/search/SearchRecipesUseCase$Params;", "", "query", "", "cuisine", "(Ljava/lang/String;Ljava/lang/String;)V", "getCuisine", "()Ljava/lang/String;", "getQuery", "Companion", "shared_debug"})
    public static final class Params {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String query = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String cuisine = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.elbehiry.shared.domain.recipes.search.SearchRecipesUseCase.Params.Companion Companion = null;
        
        private Params(java.lang.String query, java.lang.String cuisine) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCuisine() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static final com.elbehiry.shared.domain.recipes.search.SearchRecipesUseCase.Params create(@org.jetbrains.annotations.Nullable()
        java.lang.String query, @org.jetbrains.annotations.Nullable()
        java.lang.String cuisine) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/search/SearchRecipesUseCase$Params$Companion;", "", "()V", "create", "Lcom/elbehiry/shared/domain/recipes/search/SearchRecipesUseCase$Params;", "query", "", "cuisine", "shared_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.elbehiry.shared.domain.recipes.search.SearchRecipesUseCase.Params create(@org.jetbrains.annotations.Nullable()
            java.lang.String query, @org.jetbrains.annotations.Nullable()
            java.lang.String cuisine) {
                return null;
            }
        }
    }
}