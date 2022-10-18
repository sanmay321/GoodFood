package com.elbehiry.delish.ui.plan;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/elbehiry/delish/ui/plan/MealPlanViewModel;", "Landroidx/lifecycle/ViewModel;", "getMealPlanUseCase", "Lcom/elbehiry/shared/domain/plan/GetMealPlanUseCase;", "(Lcom/elbehiry/shared/domain/plan/GetMealPlanUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/elbehiry/delish/ui/plan/MealPlanViewModel$MealPlanViewState;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "getMealPlan", "", "MealPlanViewState", "mobile_debug"})
public final class MealPlanViewModel extends androidx.lifecycle.ViewModel {
    private final com.elbehiry.shared.domain.plan.GetMealPlanUseCase getMealPlanUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.elbehiry.delish.ui.plan.MealPlanViewModel.MealPlanViewState> _state = null;
    
    @javax.inject.Inject()
    public MealPlanViewModel(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.plan.GetMealPlanUseCase getMealPlanUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.elbehiry.delish.ui.plan.MealPlanViewModel.MealPlanViewState> getViewState() {
        return null;
    }
    
    private final void getMealPlan() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/elbehiry/delish/ui/plan/MealPlanViewModel$MealPlanViewState;", "", "loading", "", "meals", "", "Lcom/elbehiry/model/DayMeal;", "isEmpty", "hasError", "(ZLjava/util/List;ZZ)V", "getHasError", "()Z", "getLoading", "getMeals", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "mobile_debug"})
    public static final class MealPlanViewState {
        private final boolean loading = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.elbehiry.model.DayMeal> meals = null;
        private final boolean isEmpty = false;
        private final boolean hasError = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.elbehiry.delish.ui.plan.MealPlanViewModel.MealPlanViewState copy(boolean loading, @org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.DayMeal> meals, boolean isEmpty, boolean hasError) {
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
        
        public MealPlanViewState() {
            super();
        }
        
        public MealPlanViewState(boolean loading, @org.jetbrains.annotations.NotNull()
        java.util.List<com.elbehiry.model.DayMeal> meals, boolean isEmpty, boolean hasError) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.DayMeal> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.elbehiry.model.DayMeal> getMeals() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isEmpty() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getHasError() {
            return false;
        }
    }
}