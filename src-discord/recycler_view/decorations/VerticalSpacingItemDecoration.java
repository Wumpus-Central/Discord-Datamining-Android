package com.discord.recycler_view.decorations;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\f\u0010\u0016\u001a\u00020\u0007*\u00020\u0017H\u0002J\f\u0010\u0018\u001a\u00020\u0007*\u00020\u0017H\u0002J\u0014\u0010\u0019\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacingPx", "", "firstItemSpacingPx", "endItemSpacingPx", "isRecyclerLayoutReversed", "", "(IIIZ)V", "()Z", "setRecyclerLayoutReversed", "(Z)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "isOrWasAtFirstItemPosition", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isOrWasAtLastItemPosition", "validateItemPosition", ViewProps.POSITION, "SpacingProviderView", "recycler_view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class VerticalSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final int endItemSpacingPx;
    private final int firstItemSpacingPx;
    private boolean isRecyclerLayoutReversed;
    private final int spacingPx;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "", "spacingPxOverride", "", "()Ljava/lang/Integer;", "recycler_view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public interface SpacingProviderView {
        Integer spacingPxOverride();
    }

    public  VerticalSpacingItemDecoration(int i10, int i11, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? false : z10);
    }

    private final boolean isOrWasAtFirstItemPosition(RecyclerView.ViewHolder viewHolder) {
        int i10;
        if (this.isRecyclerLayoutReversed) {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
            q.e(bindingAdapter);
            i10 = bindingAdapter.getItemCount() - 1;
        } else {
            i10 = 0;
        }
        return validateItemPosition(viewHolder, i10);
    }

    private final boolean isOrWasAtLastItemPosition(RecyclerView.ViewHolder viewHolder) {
        int i10;
        if (this.isRecyclerLayoutReversed) {
            i10 = 0;
        } else {
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = viewHolder.getBindingAdapter();
            q.e(bindingAdapter);
            i10 = bindingAdapter.getItemCount() - 1;
        }
        return validateItemPosition(viewHolder, i10);
    }

    private final boolean validateItemPosition(RecyclerView.ViewHolder viewHolder, int i10) {
        if (viewHolder.getBindingAdapterPosition() == i10 || (viewHolder.getBindingAdapterPosition() == -1 && viewHolder.getOldPosition() == i10)) {
            return true;
        }
        return false;
    }

    @Override 
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        SpacingProviderView spacingProviderView;
        int i10;
        Integer spacingPxOverride;
        q.h(outRect, "outRect");
        q.h(view, "view");
        q.h(parent, "parent");
        q.h(state, "state");
        RecyclerView.ViewHolder viewHolder = parent.getChildViewHolder(view);
        q.g(viewHolder, "viewHolder");
        boolean isOrWasAtLastItemPosition = isOrWasAtLastItemPosition(viewHolder);
        boolean isOrWasAtFirstItemPosition = isOrWasAtFirstItemPosition(viewHolder);
        if (view instanceof SpacingProviderView) {
            spacingProviderView = (SpacingProviderView) view;
        } else {
            spacingProviderView = null;
        }
        if (spacingProviderView == null || (spacingPxOverride = spacingProviderView.spacingPxOverride()) == null) {
            i10 = this.spacingPx;
        } else {
            i10 = spacingPxOverride.intValue();
        }
        if (isOrWasAtLastItemPosition) {
            i10 = this.endItemSpacingPx;
        }
        outRect.bottom = i10;
        if (isOrWasAtFirstItemPosition) {
            outRect.top = this.firstItemSpacingPx;
        }
    }

    public final boolean isRecyclerLayoutReversed() {
        return this.isRecyclerLayoutReversed;
    }

    public final void setRecyclerLayoutReversed(boolean z10) {
        this.isRecyclerLayoutReversed = z10;
    }

    public VerticalSpacingItemDecoration(int i10, int i11, int i12, boolean z10) {
        this.spacingPx = i10;
        this.firstItemSpacingPx = i11;
        this.endItemSpacingPx = i12;
        this.isRecyclerLayoutReversed = z10;
    }
}
