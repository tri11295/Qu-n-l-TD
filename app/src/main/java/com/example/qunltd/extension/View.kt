package com.example.qunltd.extension

import android.view.View
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

fun <T : View> T.invisibleIf(predicate: Boolean, doWhenVisible: T.() -> Unit = {}) {
    isInvisible = predicate
    if (!predicate) doWhenVisible()
}

fun <T : View> T.visibleIf(predicate: Boolean, doWhenVisible: T.() -> Unit = {}) {
    isVisible = predicate
    if (predicate) doWhenVisible()
}

fun View.gone() {
    if (!isGone) visibility = View.GONE
}

fun View.invisible() {
    if (!isInvisible) visibility = View.INVISIBLE
}

fun View.visible() {
    if (!isVisible) visibility = View.VISIBLE
}

fun List<View>.visible() {
    forEach {
        it.visible()
    }
}

fun List<View>.invisible() {
    forEach {
        it.invisible()
    }
}

fun List<View>.gone() {
    forEach {
        it.gone()
    }
}