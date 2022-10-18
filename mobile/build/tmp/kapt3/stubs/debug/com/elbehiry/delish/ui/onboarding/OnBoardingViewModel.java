package com.elbehiry.delish.ui.onboarding;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/elbehiry/delish/ui/onboarding/OnBoardingViewModel;", "Landroidx/lifecycle/ViewModel;", "onBoardingCompleteActionUseCase", "Lcom/elbehiry/shared/domain/pref/OnBoardingCompleteActionSuspendUseCase;", "(Lcom/elbehiry/shared/domain/pref/OnBoardingCompleteActionSuspendUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getOnBoardingCompleteActionUseCase", "()Lcom/elbehiry/shared/domain/pref/OnBoardingCompleteActionSuspendUseCase;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "getOnBoardingItemsList", "", "Lcom/elbehiry/model/OnBoardingItem;", "getStartedClick", "", "mobile_debug"})
public final class OnBoardingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.elbehiry.shared.domain.pref.OnBoardingCompleteActionSuspendUseCase onBoardingCompleteActionUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _state = null;
    
    @javax.inject.Inject()
    public OnBoardingViewModel(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.pref.OnBoardingCompleteActionSuspendUseCase onBoardingCompleteActionUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.elbehiry.shared.domain.pref.OnBoardingCompleteActionSuspendUseCase getOnBoardingCompleteActionUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getViewState() {
        return null;
    }
    
    public final void getStartedClick() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.elbehiry.model.OnBoardingItem> getOnBoardingItemsList() {
        return null;
    }
}