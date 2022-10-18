package com.elbehiry.delish.ui.search;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SearchFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SearchFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SearchFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SearchFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SearchFragmentArgs __result = new SearchFragmentArgs();
    bundle.setClassLoader(SearchFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("query")) {
      String query;
      query = bundle.getString("query");
      if (query == null) {
        throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("query", query);
    } else {
      throw new IllegalArgumentException("Required argument \"query\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("type")) {
      SearchType type;
      if (Parcelable.class.isAssignableFrom(SearchType.class) || Serializable.class.isAssignableFrom(SearchType.class)) {
        type = (SearchType) bundle.get("type");
      } else {
        throw new UnsupportedOperationException(SearchType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (type == null) {
        throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("type", type);
    } else {
      throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SearchFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    SearchFragmentArgs __result = new SearchFragmentArgs();
    if (savedStateHandle.contains("query")) {
      String query;
      query = savedStateHandle.get("query");
      if (query == null) {
        throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("query", query);
    } else {
      throw new IllegalArgumentException("Required argument \"query\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("type")) {
      SearchType type;
      type = savedStateHandle.get("type");
      if (type == null) {
        throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("type", type);
    } else {
      throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getQuery() {
    return (String) arguments.get("query");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SearchType getType() {
    return (SearchType) arguments.get("type");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("query")) {
      String query = (String) arguments.get("query");
      __result.putString("query", query);
    }
    if (arguments.containsKey("type")) {
      SearchType type = (SearchType) arguments.get("type");
      if (Parcelable.class.isAssignableFrom(SearchType.class) || type == null) {
        __result.putParcelable("type", Parcelable.class.cast(type));
      } else if (Serializable.class.isAssignableFrom(SearchType.class)) {
        __result.putSerializable("type", Serializable.class.cast(type));
      } else {
        throw new UnsupportedOperationException(SearchType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SearchFragmentArgs that = (SearchFragmentArgs) object;
    if (arguments.containsKey("query") != that.arguments.containsKey("query")) {
      return false;
    }
    if (getQuery() != null ? !getQuery().equals(that.getQuery()) : that.getQuery() != null) {
      return false;
    }
    if (arguments.containsKey("type") != that.arguments.containsKey("type")) {
      return false;
    }
    if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getQuery() != null ? getQuery().hashCode() : 0);
    result = 31 * result + (getType() != null ? getType().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SearchFragmentArgs{"
        + "query=" + getQuery()
        + ", type=" + getType()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(SearchFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String query, @NonNull SearchType type) {
      if (query == null) {
        throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("query", query);
      if (type == null) {
        throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("type", type);
    }

    @NonNull
    public SearchFragmentArgs build() {
      SearchFragmentArgs result = new SearchFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setQuery(@NonNull String query) {
      if (query == null) {
        throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("query", query);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setType(@NonNull SearchType type) {
      if (type == null) {
        throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("type", type);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getQuery() {
      return (String) arguments.get("query");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public SearchType getType() {
      return (SearchType) arguments.get("type");
    }
  }
}
