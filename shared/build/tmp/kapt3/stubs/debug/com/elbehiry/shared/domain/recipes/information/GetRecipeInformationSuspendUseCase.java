package com.elbehiry.shared.domain.recipes.information;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/information/GetRecipeInformationSuspendUseCase;", "Lcom/elbehiry/shared/domain/SuspendUseCase;", "", "Lcom/elbehiry/model/RecipesItem;", "recipeInformationRepository", "Lcom/elbehiry/shared/data/recipes/info/repository/RecipeInformationRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/elbehiry/shared/data/recipes/info/repository/RecipeInformationRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class GetRecipeInformationSuspendUseCase extends com.elbehiry.shared.domain.SuspendUseCase<java.lang.Integer, com.elbehiry.model.RecipesItem> {
    private final com.elbehiry.shared.data.recipes.info.repository.RecipeInformationRepository recipeInformationRepository = null;
    
    @javax.inject.Inject()
    public GetRecipeInformationSuspendUseCase(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.info.repository.RecipeInformationRepository recipeInformationRepository, @org.jetbrains.annotations.NotNull()
    @com.elbehiry.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(int parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.RecipesItem> p1) {
        return null;
    }
}