package com.elbehiry.shared.data.location.remote;

import java.lang.System;

/**
 * Get current location using [FusedLocationProviderClient].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0011\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/elbehiry/shared/data/location/remote/LocationRemoteSource;", "Lcom/elbehiry/shared/data/location/remote/ILocationRemoteDataSource;", "context", "Landroid/content/Context;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "cancellationToken", "Lcom/google/android/gms/tasks/CancellationToken;", "locationSettingsClient", "Lcom/google/android/gms/location/SettingsClient;", "locationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "(Landroid/content/Context;Lcom/google/android/gms/location/FusedLocationProviderClient;Lcom/google/android/gms/tasks/CancellationToken;Lcom/google/android/gms/location/SettingsClient;Lcom/google/android/gms/location/LocationSettingsRequest;)V", "getCurrentLocation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/elbehiry/model/LocationModel;", "requireLocationEnabled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public final class LocationRemoteSource implements com.elbehiry.shared.data.location.remote.ILocationRemoteDataSource {
    private final android.content.Context context = null;
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient = null;
    private final com.google.android.gms.tasks.CancellationToken cancellationToken = null;
    private final com.google.android.gms.location.SettingsClient locationSettingsClient = null;
    private final com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest = null;
    
    @javax.inject.Inject()
    public LocationRemoteSource(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.tasks.CancellationToken cancellationToken, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.SettingsClient locationSettingsClient, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.elbehiry.model.LocationModel> getCurrentLocation() {
        return null;
    }
    
    private final java.lang.Object requireLocationEnabled(kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
}