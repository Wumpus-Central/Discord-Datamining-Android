package com.discord.misc.utilities.measure;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014R\u0017\u0010\n\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR,\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m15073d2 = {"Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Landroid/view/View;", "T", "Landroid/widget/FrameLayout;", "", "requestLayout", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lkotlin/Function3;", "onMeasured", "Lkotlin/jvm/functions/Function3;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function3;)V", "misc_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class ViewMeasuringWrapper<T extends View> extends FrameLayout {
    private final Function3<View, Integer, Integer, Unit> onMeasured;
    private final Runnable runnable = new Runnable() { // from class: com.discord.misc.utilities.measure.a
        @Override // java.lang.Runnable
        public final void run() {
            ViewMeasuringWrapper.runnable$lambda$0(ViewMeasuringWrapper.this);
        }
    };
    private final T view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewMeasuringWrapper(T view, Function3<? super View, ? super Integer, ? super Integer, Unit> onMeasured) {
        super(view.getContext());
        C9677q.m14633g(view, "view");
        C9677q.m14633g(onMeasured, "onMeasured");
        this.view = view;
        this.onMeasured = onMeasured;
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$0(ViewMeasuringWrapper this$0) {
        C9677q.m14633g(this$0, "this$0");
        ViewMeasureExtensionsKt.measureAndLayout(this$0);
    }

    public final T getView() {
        return this.view;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                childAt.measure(i, 0);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
                i4 = Math.max(i4, childAt.getMeasuredHeight());
            }
        }
        int max = Math.max(i3, getSuggestedMinimumWidth());
        int max2 = Math.max(i4, getSuggestedMinimumHeight());
        setMeasuredDimension(max, max2);
        this.onMeasured.invoke(this, Integer.valueOf(max), Integer.valueOf(max2));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.runnable);
    }
}
