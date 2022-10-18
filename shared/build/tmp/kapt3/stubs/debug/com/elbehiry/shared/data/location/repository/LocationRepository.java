package com.elbehiry.shared.data.location.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/elbehiry/shared/data/location/repository/LocationRepository;", "Lcom/elbehiry/shared/data/location/repository/ILocationRepository;", "remoteDataSource", "Lcom/elbehiry/shared/data/location/remote/ILocationRemoteDataSource;", "(Lcom/elbehiry/shared/data/location/remote/ILocationRemoteDataSource;)V", "getCurrentLocation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/shared/result/Result;", "Lcom/elbehiry/model/LocationModel;", "shared_debug"})
public final class LocationRepository implements com.elbehiry.shared.data.location.repository.ILocationRepository {
    private final com.elbehiry.shared.data.location.remote.ILocationRemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject()
    public LocationRepository(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.location.remote.ILocationRemoteDataSource remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.elbehiry.shared.result.Result<com.elbehiry.model.LocationModel>> getCurrentLocation() {
        return null;
    }
}