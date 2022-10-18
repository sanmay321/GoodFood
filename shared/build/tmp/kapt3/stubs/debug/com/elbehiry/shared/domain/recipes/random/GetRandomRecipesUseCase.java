package com.elbehiry.shared.domain.recipes.random;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00030\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/random/GetRandomRecipesUseCase;", "Lcom/elbehiry/shared/domain/UseCase;", "Lcom/elbehiry/shared/domain/recipes/random/GetRandomRecipesUseCase$Params;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "", "Lcom/elbehiry/model/RecipesItem;", "randomRecipesRepository", "Lcom/elbehiry/shared/data/recipes/random/repository/RandomRecipesRepository;", "(Lcom/elbehiry/shared/data/recipes/random/repository/RandomRecipesRepository;)V", "execute", "parameters", "Params", "shared_debug"})
public final class GetRandomRecipesUseCase extends com.elbehiry.shared.domain.UseCase<com.elbehiry.shared.domain.recipes.random.GetRandomRecipesUseCase.Params, kotlinx.coroutines.flow.Flow<? extends com.elbehiry.shared.result.Result<? extends java.util.List<? extends com.elbehiry.model.RecipesItem>>>> {
    private final com.elbehiry.shared.data.recipes.random.repository.RandomRecipesRepository randomRecipesRepository = null;
    
    @javax.inject.Inject()
    public GetRandomRecipesUseCase(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.random.repository.RandomRecipesRepository randomRecipesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.RecipesItem>>> execute(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.random.GetRandomRecipesUseCase.Params parameters) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/random/GetRandomRecipesUseCase$Params;", "", "tags", "", "number", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTags", "()Ljava/lang/String;", "Companion", "shared_debug"})
    public static final class Params {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String tags = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer number = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.elbehiry.shared.domain.recipes.random.GetRandomRecipesUseCase.Params.Companion Companion = null;
        
        private Params(java.lang.String tags, java.lang.Integer number) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTags() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static final com.elbehiry.shared.domain.recipes.random.GetRandomRecipesUseCase.Params create(@org.jetbrains.annotations.Nullable()
        java.lang.String tags, @org.jetbrains.annotations.Nullable()
        java.lang.Integer number) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/random/GetRandomRecipesUseCase$Params$Companion;", "", "()V", "create", "Lcom/elbehiry/shared/domain/recipes/random/GetRandomRecipesUseCase$Params;", "tags", "", "number", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/elbehiry/shared/domain/recipes/random/GetRandomRecipesUseCase$Params;", "shared_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.elbehiry.shared.domain.recipes.random.GetRandomRecipesUseCase.Params create(@org.jetbrains.annotations.Nullable()
            java.lang.String tags, @org.jetbrains.annotations.Nullable()
            java.lang.Integer number) {
                return null;
            }
        }
    }
}