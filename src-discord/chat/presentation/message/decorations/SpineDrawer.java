package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.R;
import jg.n;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0005J0\u0010!\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/SpineDrawer;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "contentStartPositionPx", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "itemPaddingOffset", "lineDrawable", "Landroid/graphics/drawable/PaintDrawable;", "getLineDrawable", "()Landroid/graphics/drawable/PaintDrawable;", "lineDrawable$delegate", "Lkotlin/Lazy;", "spineRect", "Landroid/graphics/Rect;", "splineView", "Lcom/discord/channel_spine/ChannelSpineView;", "getSplineView", "()Lcom/discord/channel_spine/ChannelSpineView;", "splineView$delegate", "drawSpineCurve", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "viewToCenterSpine", "middle", "drawSpinePiece", "topOffsetPx", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SpineDrawer extends RecyclerView.ItemDecoration {
    private final int contentStartPositionPx;
    private final Context context;
    private final int itemPaddingOffset;
    private final Lazy lineDrawable$delegate;
    private final Rect spineRect = new Rect();
    private final Lazy splineView$delegate;

    public SpineDrawer(Context context, int i10) {
        Lazy b10;
        Lazy b11;
        q.g(context, "context");
        this.context = context;
        this.contentStartPositionPx = i10;
        b10 = n.b(new SpineDrawer$lineDrawable$2(this));
        this.lineDrawable$delegate = b10;
        b11 = n.b(new SpineDrawer$splineView$2(this));
        this.splineView$delegate = b11;
        this.itemPaddingOffset = context.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
    }

    public static /* synthetic */ void drawSpinePiece$default(SpineDrawer spineDrawer, Canvas canvas, RecyclerView recyclerView, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        spineDrawer.drawSpinePiece(canvas, recyclerView, view, i10, i11);
    }

    private final PaintDrawable getLineDrawable() {
        return (PaintDrawable) this.lineDrawable$delegate.getValue();
    }

    private final ChannelSpineView getSplineView() {
        return (ChannelSpineView) this.splineView$delegate.getValue();
    }

    public final void drawSpineCurve(Canvas canvas, RecyclerView parent, View child, View viewToCenterSpine, int i10) {
        q.g(canvas, "canvas");
        q.g(parent, "parent");
        q.g(child, "child");
        q.g(viewToCenterSpine, "viewToCenterSpine");
        canvas.save();
        parent.getDecoratedBoundsWithMargins(child, this.spineRect);
        Rect rect = new Rect(i10 - (getLineDrawable().getIntrinsicWidth() / 2), child.getTop(), this.contentStartPositionPx, child.getTop() + ((viewToCenterSpine.getBottom() - viewToCenterSpine.getTop()) / 2) + this.itemPaddingOffset);
        ChannelSpineView splineView = getSplineView();
        splineView.setRowHeight(rect.height() / 2);
        splineView.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(rect.height(), 1073741824));
        splineView.layout(0, 0, rect.width(), rect.height());
        canvas.translate(rect.left, rect.top);
        splineView.draw(canvas);
        canvas.restore();
    }

    public final void drawSpinePiece(Canvas canvas, RecyclerView parent, View child, int i10, int i11) {
        q.g(canvas, "canvas");
        q.g(parent, "parent");
        q.g(child, "child");
        canvas.save();
        parent.getDecoratedBoundsWithMargins(child, this.spineRect);
        PaintDrawable lineDrawable = getLineDrawable();
        lineDrawable.setBounds(i10 - (lineDrawable.getIntrinsicWidth() / 2), this.spineRect.top + i11, (int) Math.ceil(i10 + (lineDrawable.getIntrinsicWidth() / 2)), this.spineRect.bottom);
        lineDrawable.draw(canvas);
        canvas.restore();
    }

    public final Context getContext() {
        return this.context;
    }
}
