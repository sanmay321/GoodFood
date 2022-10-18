/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.elbehiry.delish.ui.bookmark

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import com.elbehiry.delish.R
import com.elbehiry.delish.ui.recipes.InspirationItem
import com.elbehiry.delish.ui.widget.EmptyView

@ExperimentalFoundationApi
@ExperimentalAnimationApi
@Composable
fun BookMark(
    viewModel: BookmarkViewModel,
    onDetails: (Int) -> Unit
) {
    val recipes by viewModel.state.collectAsState()
    LazyVerticalGrid(cells = GridCells.Fixed(2)) {
        items(recipes.recipes.distinct()) { recipe ->
            InspirationItem(recipe, onDetails = onDetails) {
                viewModel.deleteRecipe(recipe)
            }
        }
    }

    AnimatedVisibility(visible = recipes.isEmpty) {
        EmptyView(
            descText = stringResource(id = R.string.book_mark_empty)
        )
    }
}
