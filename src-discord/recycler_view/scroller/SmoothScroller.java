package com.discord.recycler_view.scroller;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.discord.recycler_view.scroller.Scroller;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014J0\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/discord/recycler_view/scroller/SmoothScroller;", "Landroidx/recyclerview/widget/g;", "Landroid/view/View;", "child", "", "onChildAttachedToWindow", "", "dx", "dy", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;", "action", "onSeekTargetStep", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateDtToFit", "onStop", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "Lkotlin/Function0;", "onStopScroll", "Lkotlin/jvm/functions/Function0;", "targetView", "Landroid/view/View;", "Landroid/content/Context;", "context", "targetPosition", "<init>", "(Landroid/content/Context;ILcom/discord/recycler_view/scroller/Scroller$TargetAlignment;Lkotlin/jvm/functions/Function0;)V", "recycler_view_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class SmoothScroller extends g {
    private final Function0<Unit> onStopScroll;
    private final Scroller.TargetAlignment targetAlignment;
    private View targetView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothScroller(Context context, int i10, Scroller.TargetAlignment targetAlignment, Function0<Unit> function0) {
        super(context);
        q.g(context, "context");
        q.g(targetAlignment, "targetAlignment");
        this.targetAlignment = targetAlignment;
        this.onStopScroll = function0;
        setTargetPosition(i10);
    }

    @Override // androidx.recyclerview.widget.g
    public int calculateDtToFit(int i10, int i11, int i12, int i13, int i14) {
        Scroller.TargetAlignment targetAlignment = this.targetAlignment;
        if (targetAlignment instanceof Scroller.TargetAlignment.Center) {
            return (i12 + ((i13 - i12) / 2)) - (i10 + ((i11 - i10) / 2));
        }
        if (targetAlignment instanceof Scroller.TargetAlignment.Top) {
            return (i12 - i10) + ((Scroller.TargetAlignment.Top) targetAlignment).getOffsetPx();
        }
        if (targetAlignment instanceof Scroller.TargetAlignment.Anywhere) {
            return super.calculateDtToFit(i10, i11, i12, i13, i14);
        }
        throw new kg.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onChildAttachedToWindow(View child) {
        q.g(child, "child");
        super.onChildAttachedToWindow(child);
        if (this.targetView == null && getChildPosition(child) == getTargetPosition()) {
            this.targetView = child;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int i10, int i11, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        q.g(state, "state");
        q.g(action, "action");
        View view = this.targetView;
        if (view != null) {
            onTargetFound(view, state, action);
        } else {
            super.onSeekTargetStep(i10, i11, state, action);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        super.onStop();
        Function0<Unit> function0 = this.onStopScroll;
        if (function0 != null) {
            function0.invoke();
        }
        this.targetView = null;
    }
}
