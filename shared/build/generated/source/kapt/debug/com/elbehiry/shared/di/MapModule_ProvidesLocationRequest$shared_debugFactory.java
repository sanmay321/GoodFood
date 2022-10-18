// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.google.android.gms.location.LocationRequest;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapModule_ProvidesLocationRequest$shared_debugFactory implements Factory<LocationRequest> {
  private final MapModule module;

  public MapModule_ProvidesLocationRequest$shared_debugFactory(MapModule module) {
    this.module = module;
  }

  @Override
  public LocationRequest get() {
    return providesLocationRequest$shared_debug(module);
  }

  public static MapModule_ProvidesLocationRequest$shared_debugFactory create(MapModule module) {
    return new MapModule_ProvidesLocationRequest$shared_debugFactory(module);
  }

  public static LocationRequest providesLocationRequest$shared_debug(MapModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesLocationRequest$shared_debug());
  }
}