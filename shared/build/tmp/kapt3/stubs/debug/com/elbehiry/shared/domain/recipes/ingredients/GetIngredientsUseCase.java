package com.elbehiry.shared.domain.recipes.ingredients;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/elbehiry/shared/domain/recipes/ingredients/GetIngredientsUseCase;", "Lcom/elbehiry/shared/domain/UseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "", "Lcom/elbehiry/model/IngredientItem;", "ingredientsRepository", "Lcom/elbehiry/shared/data/recipes/ingredients/repository/IngredientsRepository;", "(Lcom/elbehiry/shared/data/recipes/ingredients/repository/IngredientsRepository;)V", "execute", "parameters", "(Lkotlin/Unit;)Lkotlinx/coroutines/flow/Flow;", "shared_debug"})
public final class GetIngredientsUseCase extends com.elbehiry.shared.domain.UseCase<kotlin.Unit, kotlinx.coroutines.flow.Flow<? extends com.elbehiry.shared.result.Result<? extends java.util.List<? extends com.elbehiry.model.IngredientItem>>>> {
    private final com.elbehiry.shared.data.recipes.ingredients.repository.IngredientsRepository ingredientsRepository = null;
    
    @javax.inject.Inject()
    public GetIngredientsUseCase(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.recipes.ingredients.repository.IngredientsRepository ingredientsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<java.util.List<com.elbehiry.model.IngredientItem>>> execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit parameters) {
        return null;
    }
}