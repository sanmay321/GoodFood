// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.elbehiry.shared.data.recipes.search.remote.SearchDataSource;
import com.elbehiry.shared.data.recipes.search.repository.SearchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipesModule_ProvideSearchRepositoryFactory implements Factory<SearchRepository> {
  private final RecipesModule module;

  private final Provider<SearchDataSource> rearchDataSourceProvider;

  public RecipesModule_ProvideSearchRepositoryFactory(RecipesModule module,
      Provider<SearchDataSource> rearchDataSourceProvider) {
    this.module = module;
    this.rearchDataSourceProvider = rearchDataSourceProvider;
  }

  @Override
  public SearchRepository get() {
    return provideSearchRepository(module, rearchDataSourceProvider.get());
  }

  public static RecipesModule_ProvideSearchRepositoryFactory create(RecipesModule module,
      Provider<SearchDataSource> rearchDataSourceProvider) {
    return new RecipesModule_ProvideSearchRepositoryFactory(module, rearchDataSourceProvider);
  }

  public static SearchRepository provideSearchRepository(RecipesModule instance,
      SearchDataSource rearchDataSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideSearchRepository(rearchDataSource));
  }
}