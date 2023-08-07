package com.discord.recycler_view.utils;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.recycler_view.scroller.Scroller;
import com.discord.recycler_view.scroller.SmoothScroller;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a*\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0000\u001a\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H\u0000\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u0002¨\u0006\u000e"}, d2 = {"scrollToCenter", "", "Landroidx/recyclerview/widget/RecyclerView;", ViewProps.POSITION, "", "scrollToPositionAnimated", "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "onComplete", "Lkotlin/Function0;", "scrollToPositionWithOffset", "offset", "scrollToTop", "toggleSuppressLayout", "recycler_view_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class RecyclerViewExtensionsKt {
    public static final void scrollToCenter(RecyclerView recyclerView, int i10) {
        q.h(recyclerView, "<this>");
        scrollToPositionWithOffset(recyclerView, i10, recyclerView.getHeight() / 2);
    }

    public static final void scrollToPositionAnimated(RecyclerView recyclerView, int i10, Scroller.TargetAlignment targetAlignment, Function0<Unit> onComplete) {
        q.h(recyclerView, "<this>");
        q.h(targetAlignment, "targetAlignment");
        q.h(onComplete, "onComplete");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        q.e(layoutManager);
        Context context = recyclerView.getContext();
        q.g(context, "context");
        layoutManager.S1(new SmoothScroller(context, i10, targetAlignment, onComplete));
    }

    public static final void scrollToPositionWithOffset(RecyclerView recyclerView, int i10, int i11) {
        q.h(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        q.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).K2(i10, i11);
    }

    public static final void scrollToTop(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        View view;
        q.h(recyclerView, "<this>");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        q.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((LinearLayoutManager) layoutManager).x2()) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i10);
            if (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
                i12 = 0;
            } else {
                i12 = view.getHeight();
            }
            if (i12 == 0) {
                recyclerView.scrollToPosition(i10);
            } else {
                scrollToPositionWithOffset(recyclerView, i10, (recyclerView.getHeight() - (i12 * 2)) - i11);
            }
        } else {
            scrollToPositionWithOffset(recyclerView, i10, i11);
        }
    }

    public static final void toggleSuppressLayout(RecyclerView recyclerView) {
        q.h(recyclerView, "<this>");
        recyclerView.suppressLayout(true);
        recyclerView.suppressLayout(false);
    }
}
