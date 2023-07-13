package com.discord.misc.utilities.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"setUpLayoutForList", "", "Landroid/view/ViewGroup;", "listSize", "", "inflater", "Lkotlin/Function0;", "Landroid/view/View;", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ViewGroupUtilsKt {
    public static final void setUpLayoutForList(ViewGroup viewGroup, int i10, Function0<? extends View> inflater) {
        q.g(viewGroup, "<this>");
        q.g(inflater, "inflater");
        if (i10 != viewGroup.getChildCount()) {
            if (viewGroup.getChildCount() > i10) {
                viewGroup.removeViews(0, viewGroup.getChildCount() - i10);
            } else if (viewGroup.getChildCount() < i10) {
                int childCount = i10 - viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    viewGroup.addView((View) inflater.invoke());
                }
            }
        }
    }
}
