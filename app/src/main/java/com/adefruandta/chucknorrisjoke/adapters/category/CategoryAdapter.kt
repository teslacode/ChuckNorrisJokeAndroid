package com.adefruandta.chucknorrisjoke.adapters.category

import android.view.View
import com.adefruandta.chucknorrisjoke.R
import com.adefruandta.viper.adapters.ViperRecyclerViewAdapter

/**
 * Created by adefruandta on 11/22/17.
 */

class CategoryAdapter : ViperRecyclerViewAdapter<String, CategoryViewHolder>() {

    // region ViperRecyclerViewAdapter

    override fun createViewHolder(view: View, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(view)
    }

    override fun itemLayoutResId(viewType: Int): Int {
        return R.layout.holder_category
    }

    // endregion
}
