package com.elbehiry.delish.ui.recipes;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.elbehiry.delish.R;
import com.elbehiry.delish.ui.search.SearchType;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static GoToRecipesDetails goToRecipesDetails(int id) {
    return new GoToRecipesDetails(id);
  }

  @NonNull
  public static GoToSearchScreen goToSearchScreen(@NonNull String query, @NonNull SearchType type) {
    return new GoToSearchScreen(query, type);
  }

  @NonNull
  public static NavDirections goToMapScreen() {
    return new ActionOnlyNavDirections(R.id.goToMapScreen);
  }

  public static class GoToRecipesDetails implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private GoToRecipesDetails(int id) {
      this.arguments.put("id", id);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public GoToRecipesDetails setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("id")) {
        int id = (int) arguments.get("id");
        __result.putInt("id", id);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.goToRecipesDetails;
    }

    @SuppressWarnings("unchecked")
    public int getId() {
      return (int) arguments.get("id");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      GoToRecipesDetails that = (GoToRecipesDetails) object;
      if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
        return false;
      }
      if (getId() != that.getId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "GoToRecipesDetails(actionId=" + getActionId() + "){"
          + "id=" + getId()
          + "}";
    }
  }

  public static class GoToSearchScreen implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private GoToSearchScreen(@NonNull String query, @NonNull SearchType type) {
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
    @SuppressWarnings("unchecked")
    public GoToSearchScreen setQuery(@NonNull String query) {
      if (query == null) {
        throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("query", query);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public GoToSearchScreen setType(@NonNull SearchType type) {
      if (type == null) {
        throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("type", type);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.goToSearchScreen;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      GoToSearchScreen that = (GoToSearchScreen) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getQuery() != null ? getQuery().hashCode() : 0);
      result = 31 * result + (getType() != null ? getType().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "GoToSearchScreen(actionId=" + getActionId() + "){"
          + "query=" + getQuery()
          + ", type=" + getType()
          + "}";
    }
  }
}
