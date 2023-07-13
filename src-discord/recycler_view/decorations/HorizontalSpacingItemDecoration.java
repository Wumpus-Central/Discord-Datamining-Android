package com.discord.recycler_view.decorations;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/recycler_view/decorations/HorizontalSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacingPx", "", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "recycler_view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class HorizontalSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final int spacingPx;

    public HorizontalSpacingItemDecoration(int i10) {
        this.spacingPx = i10;
    }

    @Override 
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        q.g(outRect, "outRect");
        q.g(view, "view");
        q.g(parent, "parent");
        q.g(state, "state");
        RecyclerView.Adapter adapter = parent.getAdapter();
        q.d(adapter);
        boolean z10 = true;
        if (parent.getChildAdapterPosition(view) != adapter.getItemCount() - 1) {
            z10 = false;
        }
        if (!z10) {
            outRect.right = this.spacingPx;
        }
    }
}
