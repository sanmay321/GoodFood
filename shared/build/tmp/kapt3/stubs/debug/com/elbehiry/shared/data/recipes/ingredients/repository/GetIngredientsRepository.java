package com.elbehiry.shared.data.recipes.ingredients.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/elbehiry/shared/data/recipes/ingredients/repository/GetIngredientsRepository;", "Lcom/elbehiry/shared/data/recipes/ingredients/repository/IngredientsRepository;", "getIngredientsDataSource", "Lcom/elbehiry/shared/data/recipes/ingredients/remote/GetIngredientsDataSource;", "(Lcom/elbehiry/shared/data/recipes/ingredients/remote/GetIngredientsDataSource;)V", "getIngredients", "", "Lcom/elbehiry/model/IngredientItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class GetIngredientsRepository implements com.elbehiry.shared.data.recipes.ingredients.repository.IngredientsRepository {
    private final com.elbehiry.shared.data.recipes.ingredients.remote.GetIngredientsDataSource getIngredientsDataSource = null;
    
    @javax.inject.Inject()
    public GetIngredientsRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.ingredients.remote.GetIngredientsDataSource getIngredientsDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getIngredients(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elbehiry.model.IngredientItem>> p0) {
        return null;
    }
}