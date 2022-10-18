package com.elbehiry.shared.data.db.recipes.tables;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.elbehiry.shared.data.db.recipes.entities.RecipeEntity;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipesTable_Impl implements RecipesTable {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RecipeEntity> __insertionAdapterOfRecipeEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRecipe;

  public RecipesTable_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecipeEntity = new EntityInsertionAdapter<RecipeEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `recipes` (`recipeId`,`recipeTitle`,`sustainable`,`glutenFree`,`veryPopular`,`vegetarian`,`dairyFree`,`veryHealthy`,`vegan`,`cheap`,`spoonScore`,`aggregateLikes`,`sourceName`,`creditsText`,`readyInMinutes`,`image`,`percentCarbs`,`percentProtein`,`percentFat`,`nutrientsAmount`,`nutrientsName`,`ingredientOriginalString`,`steps`,`servings`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecipeEntity value) {
        stmt.bindLong(1, value.getRecipeId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        final int _tmp;
        _tmp = value.getSustainable() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        final int _tmp_1;
        _tmp_1 = value.getGlutenFree() ? 1 : 0;
        stmt.bindLong(4, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.getVeryPopular() ? 1 : 0;
        stmt.bindLong(5, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getVegetarian() ? 1 : 0;
        stmt.bindLong(6, _tmp_3);
        final int _tmp_4;
        _tmp_4 = value.getDairyFree() ? 1 : 0;
        stmt.bindLong(7, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.getVeryHealthy() ? 1 : 0;
        stmt.bindLong(8, _tmp_5);
        final int _tmp_6;
        _tmp_6 = value.getVegan() ? 1 : 0;
        stmt.bindLong(9, _tmp_6);
        final int _tmp_7;
        _tmp_7 = value.getCheap() ? 1 : 0;
        stmt.bindLong(10, _tmp_7);
        stmt.bindDouble(11, value.getSpoonScore());
        stmt.bindLong(12, value.getAggregateLikes());
        if (value.getSourceName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getSourceName());
        }
        if (value.getCreditsText() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getCreditsText());
        }
        stmt.bindLong(15, value.getReadyInMinutes());
        if (value.getImage() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getImage());
        }
        stmt.bindDouble(17, value.getPercentCarbs());
        stmt.bindDouble(18, value.getPercentProtein());
        stmt.bindDouble(19, value.getPercentFat());
        stmt.bindDouble(20, value.getNutrientsAmount());
        if (value.getNutrientsName() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getNutrientsName());
        }
        if (value.getIngredientOriginalString() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getIngredientOriginalString());
        }
        if (value.getSteps() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getSteps());
        }
        stmt.bindLong(24, value.getServings());
      }
    };
    this.__preparedStmtOfDeleteRecipe = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE FROM recipes \n"
                + "        WHERE recipeId = ?\n"
                + "        ";
        return _query;
      }
    };
  }

  @Override
  public Object saveRecipe(final RecipeEntity recipe, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRecipeEntity.insert(recipe);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteRecipe(final Integer recipeId, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRecipe.acquire();
        int _argIndex = 1;
        if (recipeId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindLong(_argIndex, recipeId);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteRecipe.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<RecipeEntity>> getRecipes() {
    final String _sql = "\n"
            + "            SELECT * FROM recipes\n"
            + "            ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"recipes"}, new Callable<List<RecipeEntity>>() {
      @Override
      public List<RecipeEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<RecipeEntity> _result = new ArrayList<RecipeEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RecipeEntity _item;
            _item = __entityCursorConverter_comElbehirySharedDataDbRecipesEntitiesRecipeEntity(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getRecipe(final Integer recipeId, final Continuation<? super RecipeEntity> p1) {
    final String _sql = "\n"
            + "        SELECT * FROM recipes \n"
            + "        WHERE recipeId = ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (recipeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, recipeId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<RecipeEntity>() {
      @Override
      public RecipeEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final RecipeEntity _result;
          if(_cursor.moveToFirst()) {
            _result = __entityCursorConverter_comElbehirySharedDataDbRecipesEntitiesRecipeEntity(_cursor);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object isRecipeSaved(final Integer recipeId, final Continuation<? super Boolean> p1) {
    final String _sql = "\n"
            + "        SELECT COUNT(*) FROM recipes \n"
            + "        WHERE recipeId = ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (recipeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, recipeId);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  private RecipeEntity __entityCursorConverter_comElbehirySharedDataDbRecipesEntitiesRecipeEntity(
      Cursor cursor) {
    final RecipeEntity _entity;
    final int _cursorIndexOfRecipeId = cursor.getColumnIndex("recipeId");
    final int _cursorIndexOfTitle = cursor.getColumnIndex("recipeTitle");
    final int _cursorIndexOfSustainable = cursor.getColumnIndex("sustainable");
    final int _cursorIndexOfGlutenFree = cursor.getColumnIndex("glutenFree");
    final int _cursorIndexOfVeryPopular = cursor.getColumnIndex("veryPopular");
    final int _cursorIndexOfVegetarian = cursor.getColumnIndex("vegetarian");
    final int _cursorIndexOfDairyFree = cursor.getColumnIndex("dairyFree");
    final int _cursorIndexOfVeryHealthy = cursor.getColumnIndex("veryHealthy");
    final int _cursorIndexOfVegan = cursor.getColumnIndex("vegan");
    final int _cursorIndexOfCheap = cursor.getColumnIndex("cheap");
    final int _cursorIndexOfSpoonScore = cursor.getColumnIndex("spoonScore");
    final int _cursorIndexOfAggregateLikes = cursor.getColumnIndex("aggregateLikes");
    final int _cursorIndexOfSourceName = cursor.getColumnIndex("sourceName");
    final int _cursorIndexOfCreditsText = cursor.getColumnIndex("creditsText");
    final int _cursorIndexOfReadyInMinutes = cursor.getColumnIndex("readyInMinutes");
    final int _cursorIndexOfImage = cursor.getColumnIndex("image");
    final int _cursorIndexOfPercentCarbs = cursor.getColumnIndex("percentCarbs");
    final int _cursorIndexOfPercentProtein = cursor.getColumnIndex("percentProtein");
    final int _cursorIndexOfPercentFat = cursor.getColumnIndex("percentFat");
    final int _cursorIndexOfNutrientsAmount = cursor.getColumnIndex("nutrientsAmount");
    final int _cursorIndexOfNutrientsName = cursor.getColumnIndex("nutrientsName");
    final int _cursorIndexOfIngredientOriginalString = cursor.getColumnIndex("ingredientOriginalString");
    final int _cursorIndexOfSteps = cursor.getColumnIndex("steps");
    final int _cursorIndexOfServings = cursor.getColumnIndex("servings");
    final int _tmpRecipeId;
    if (_cursorIndexOfRecipeId == -1) {
      _tmpRecipeId = 0;
    } else {
      _tmpRecipeId = cursor.getInt(_cursorIndexOfRecipeId);
    }
    final String _tmpTitle;
    if (_cursorIndexOfTitle == -1) {
      _tmpTitle = null;
    } else {
      _tmpTitle = cursor.getString(_cursorIndexOfTitle);
    }
    final boolean _tmpSustainable;
    if (_cursorIndexOfSustainable == -1) {
      _tmpSustainable = false;
    } else {
      final int _tmp;
      _tmp = cursor.getInt(_cursorIndexOfSustainable);
      _tmpSustainable = _tmp != 0;
    }
    final boolean _tmpGlutenFree;
    if (_cursorIndexOfGlutenFree == -1) {
      _tmpGlutenFree = false;
    } else {
      final int _tmp_1;
      _tmp_1 = cursor.getInt(_cursorIndexOfGlutenFree);
      _tmpGlutenFree = _tmp_1 != 0;
    }
    final boolean _tmpVeryPopular;
    if (_cursorIndexOfVeryPopular == -1) {
      _tmpVeryPopular = false;
    } else {
      final int _tmp_2;
      _tmp_2 = cursor.getInt(_cursorIndexOfVeryPopular);
      _tmpVeryPopular = _tmp_2 != 0;
    }
    final boolean _tmpVegetarian;
    if (_cursorIndexOfVegetarian == -1) {
      _tmpVegetarian = false;
    } else {
      final int _tmp_3;
      _tmp_3 = cursor.getInt(_cursorIndexOfVegetarian);
      _tmpVegetarian = _tmp_3 != 0;
    }
    final boolean _tmpDairyFree;
    if (_cursorIndexOfDairyFree == -1) {
      _tmpDairyFree = false;
    } else {
      final int _tmp_4;
      _tmp_4 = cursor.getInt(_cursorIndexOfDairyFree);
      _tmpDairyFree = _tmp_4 != 0;
    }
    final boolean _tmpVeryHealthy;
    if (_cursorIndexOfVeryHealthy == -1) {
      _tmpVeryHealthy = false;
    } else {
      final int _tmp_5;
      _tmp_5 = cursor.getInt(_cursorIndexOfVeryHealthy);
      _tmpVeryHealthy = _tmp_5 != 0;
    }
    final boolean _tmpVegan;
    if (_cursorIndexOfVegan == -1) {
      _tmpVegan = false;
    } else {
      final int _tmp_6;
      _tmp_6 = cursor.getInt(_cursorIndexOfVegan);
      _tmpVegan = _tmp_6 != 0;
    }
    final boolean _tmpCheap;
    if (_cursorIndexOfCheap == -1) {
      _tmpCheap = false;
    } else {
      final int _tmp_7;
      _tmp_7 = cursor.getInt(_cursorIndexOfCheap);
      _tmpCheap = _tmp_7 != 0;
    }
    final double _tmpSpoonScore;
    if (_cursorIndexOfSpoonScore == -1) {
      _tmpSpoonScore = 0;
    } else {
      _tmpSpoonScore = cursor.getDouble(_cursorIndexOfSpoonScore);
    }
    final int _tmpAggregateLikes;
    if (_cursorIndexOfAggregateLikes == -1) {
      _tmpAggregateLikes = 0;
    } else {
      _tmpAggregateLikes = cursor.getInt(_cursorIndexOfAggregateLikes);
    }
    final String _tmpSourceName;
    if (_cursorIndexOfSourceName == -1) {
      _tmpSourceName = null;
    } else {
      _tmpSourceName = cursor.getString(_cursorIndexOfSourceName);
    }
    final String _tmpCreditsText;
    if (_cursorIndexOfCreditsText == -1) {
      _tmpCreditsText = null;
    } else {
      _tmpCreditsText = cursor.getString(_cursorIndexOfCreditsText);
    }
    final int _tmpReadyInMinutes;
    if (_cursorIndexOfReadyInMinutes == -1) {
      _tmpReadyInMinutes = 0;
    } else {
      _tmpReadyInMinutes = cursor.getInt(_cursorIndexOfReadyInMinutes);
    }
    final String _tmpImage;
    if (_cursorIndexOfImage == -1) {
      _tmpImage = null;
    } else {
      _tmpImage = cursor.getString(_cursorIndexOfImage);
    }
    final double _tmpPercentCarbs;
    if (_cursorIndexOfPercentCarbs == -1) {
      _tmpPercentCarbs = 0;
    } else {
      _tmpPercentCarbs = cursor.getDouble(_cursorIndexOfPercentCarbs);
    }
    final double _tmpPercentProtein;
    if (_cursorIndexOfPercentProtein == -1) {
      _tmpPercentProtein = 0;
    } else {
      _tmpPercentProtein = cursor.getDouble(_cursorIndexOfPercentProtein);
    }
    final double _tmpPercentFat;
    if (_cursorIndexOfPercentFat == -1) {
      _tmpPercentFat = 0;
    } else {
      _tmpPercentFat = cursor.getDouble(_cursorIndexOfPercentFat);
    }
    final double _tmpNutrientsAmount;
    if (_cursorIndexOfNutrientsAmount == -1) {
      _tmpNutrientsAmount = 0;
    } else {
      _tmpNutrientsAmount = cursor.getDouble(_cursorIndexOfNutrientsAmount);
    }
    final String _tmpNutrientsName;
    if (_cursorIndexOfNutrientsName == -1) {
      _tmpNutrientsName = null;
    } else {
      _tmpNutrientsName = cursor.getString(_cursorIndexOfNutrientsName);
    }
    final String _tmpIngredientOriginalString;
    if (_cursorIndexOfIngredientOriginalString == -1) {
      _tmpIngredientOriginalString = null;
    } else {
      _tmpIngredientOriginalString = cursor.getString(_cursorIndexOfIngredientOriginalString);
    }
    final String _tmpSteps;
    if (_cursorIndexOfSteps == -1) {
      _tmpSteps = null;
    } else {
      _tmpSteps = cursor.getString(_cursorIndexOfSteps);
    }
    final int _tmpServings;
    if (_cursorIndexOfServings == -1) {
      _tmpServings = 0;
    } else {
      _tmpServings = cursor.getInt(_cursorIndexOfServings);
    }
    _entity = new RecipeEntity(_tmpRecipeId,_tmpTitle,_tmpSustainable,_tmpGlutenFree,_tmpVeryPopular,_tmpVegetarian,_tmpDairyFree,_tmpVeryHealthy,_tmpVegan,_tmpCheap,_tmpSpoonScore,_tmpAggregateLikes,_tmpSourceName,_tmpCreditsText,_tmpReadyInMinutes,_tmpImage,_tmpPercentCarbs,_tmpPercentProtein,_tmpPercentFat,_tmpNutrientsAmount,_tmpNutrientsName,_tmpIngredientOriginalString,_tmpSteps,_tmpServings);
    return _entity;
  }
}
