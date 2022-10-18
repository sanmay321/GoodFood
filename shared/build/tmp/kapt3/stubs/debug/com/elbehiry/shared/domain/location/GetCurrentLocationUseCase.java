package com.elbehiry.shared.domain.location;

import java.lang.System;

/**
 * Get current user location.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/elbehiry/shared/domain/location/GetCurrentLocationUseCase;", "Lcom/elbehiry/shared/domain/FlowUseCase;", "", "Lcom/elbehiry/model/LocationModel;", "locationRepository", "Lcom/elbehiry/shared/data/location/repository/ILocationRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/elbehiry/shared/data/location/repository/ILocationRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "parameters", "(Lkotlin/Unit;)Lkotlinx/coroutines/flow/Flow;", "shared_debug"})
public final class GetCurrentLocationUseCase extends com.elbehiry.shared.domain.FlowUseCase<kotlin.Unit, com.elbehiry.model.LocationModel> {
    private final com.elbehiry.shared.data.location.repository.ILocationRepository locationRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject()
    public GetCurrentLocationUseCase(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.location.repository.ILocationRepository locationRepository, @org.jetbrains.annotations.NotNull()
    @com.elbehiry.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<com.elbehiry.model.LocationModel>> execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit parameters) {
        return null;
    }
}