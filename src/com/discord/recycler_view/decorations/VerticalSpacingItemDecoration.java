package com.discord.recycler_view.decorations;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\f\u0010\u0016\u001a\u00020\u0007*\u00020\u0017H\u0002J\f\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0002J\u0014\u0010\u0019\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacingPx", "", "firstItemSpacingPx", "endItemSpacingPx", "isRecyclerLayoutReversed", "", "(IIIZ)V", "()Z", "setRecyclerLayoutReversed", "(Z)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "isOrWasAtFirstItemPosition", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isOrWasAtLastItemPosition", "validateItemPosition", ViewProps.POSITION, "SpacingProviderView", "recycler_view_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class VerticalSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final int endItemSpacingPx;
    private final int firstItemSpacingPx;
    private boolean isRecyclerLayoutReversed;
    private final int spacingPx;

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "", "spacingPxOverride", "", "()Ljava/lang/Integer;", "recycler_view_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes6.dex */
    public interface SpacingProviderView {
        Integer spacingPxOverride();
    }

    public /* synthetic */ VerticalSpacingItemDecoration(int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? false : z);
    }

    private final boolean isOrWasAtFirstItemPosition(RecyclerView.ViewHolder viewHolder) {
        int i;
        if (this.isRecyclerLayoutReversed) {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
            C9971q.m14636d(bindingAdapter);
            i = bindingAdapter.getItemCount() - 1;
        } else {
            i = 0;
        }
        return validateItemPosition(viewHolder, i);
    }

    private final boolean isOrWasAtLastItemPosition(RecyclerView.ViewHolder viewHolder) {
        int i;
        if (this.isRecyclerLayoutReversed) {
            i = 0;
        } else {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
            C9971q.m14636d(bindingAdapter);
            i = bindingAdapter.getItemCount() - 1;
        }
        return validateItemPosition(viewHolder, i);
    }

    private final boolean validateItemPosition(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder.getBindingAdapterPosition() == i || (viewHolder.getBindingAdapterPosition() == -1 && viewHolder.getOldPosition() == i)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        SpacingProviderView spacingProviderView;
        int i;
        Integer spacingPxOverride;
        C9971q.m14633g(outRect, "outRect");
        C9971q.m14633g(view, "view");
        C9971q.m14633g(parent, "parent");
        C9971q.m14633g(state, "state");
        RecyclerView.ViewHolder viewHolder = parent.getChildViewHolder(view);
        C9971q.m14634f(viewHolder, "viewHolder");
        boolean isOrWasAtLastItemPosition = isOrWasAtLastItemPosition(viewHolder);
        boolean isOrWasAtFirstItemPosition = isOrWasAtFirstItemPosition(viewHolder);
        if (view instanceof SpacingProviderView) {
            spacingProviderView = (SpacingProviderView) view;
        } else {
            spacingProviderView = null;
        }
        if (spacingProviderView == null || (spacingPxOverride = spacingProviderView.spacingPxOverride()) == null) {
            i = this.spacingPx;
        } else {
            i = spacingPxOverride.intValue();
        }
        if (isOrWasAtLastItemPosition) {
            i = this.endItemSpacingPx;
        }
        outRect.bottom = i;
        if (isOrWasAtFirstItemPosition) {
            outRect.top = this.firstItemSpacingPx;
        }
    }

    public final boolean isRecyclerLayoutReversed() {
        return this.isRecyclerLayoutReversed;
    }

    public final void setRecyclerLayoutReversed(boolean z) {
        this.isRecyclerLayoutReversed = z;
    }

    public VerticalSpacingItemDecoration(int i, int i2, int i3, boolean z) {
        this.spacingPx = i;
        this.firstItemSpacingPx = i2;
        this.endItemSpacingPx = i3;
        this.isRecyclerLayoutReversed = z;
    }
}
