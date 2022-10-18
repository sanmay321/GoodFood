package com.elbehiry.shared.data.plan.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/elbehiry/shared/data/plan/repository/GetMealPlanRepository;", "Lcom/elbehiry/shared/data/plan/repository/MealPlanRepository;", "mealPlanRemoteDataSource", "Lcom/elbehiry/shared/data/plan/remote/MealPlanDataSource;", "(Lcom/elbehiry/shared/data/plan/remote/MealPlanDataSource;)V", "getMealsPlan", "Lcom/elbehiry/model/MealsPlan;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class GetMealPlanRepository implements com.elbehiry.shared.data.plan.repository.MealPlanRepository {
    private final com.elbehiry.shared.data.plan.remote.MealPlanDataSource mealPlanRemoteDataSource = null;
    
    @javax.inject.Inject()
    public GetMealPlanRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.plan.remote.MealPlanDataSource mealPlanRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMealsPlan(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.elbehiry.model.MealsPlan> p0) {
        return null;
    }
}