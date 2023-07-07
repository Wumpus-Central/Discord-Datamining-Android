package com.discord.image.animated_image.apng;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.k2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u001a\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0017J\u001e\u0010\u0017\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0014R\u001a\u0010\t\u001a\u00020\nX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/discord/image/animated_image/apng/APNGImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "apngView", "Lcom/discord/image/animated_image/apng/APNGView;", "getApngView", "()Lcom/discord/image/animated_image/apng/APNGView;", "setApngView", "(Lcom/discord/image/animated_image/apng/APNGView;)V", "inflateApngView", "", "showLoading", "", "recycle", "recycleChild", "child", "Landroid/view/View;", "resetViews", "visibleView", "animated_image_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class APNGImageView extends FrameLayout {
    protected APNGView apngView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public APNGImageView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public APNGImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ APNGImageView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void inflateApngView$default(APNGImageView aPNGImageView, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            aPNGImageView.inflateApngView(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inflateApngView");
    }

    public static /* synthetic */ void recycleChild$default(APNGImageView aPNGImageView, View view, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aPNGImageView.recycleChild(view, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recycleChild");
    }

    public static /* synthetic */ void resetViews$default(APNGImageView aPNGImageView, View view, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                view = null;
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aPNGImageView.resetViews(view, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetViews");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final APNGView getApngView() {
        APNGView aPNGView = this.apngView;
        if (aPNGView != null) {
            return aPNGView;
        }
        q.y("apngView");
        return null;
    }

    public final void inflateApngView(boolean z10) {
        if (this.apngView == null) {
            Context context = getContext();
            q.f(context, "context");
            setApngView(new APNGView(context));
            getApngView().recycle(false, z10);
            getApngView().setId(View.generateViewId());
            addView(getApngView());
        }
    }

    public final void recycle() {
        resetViews$default(this, null, false, 3, null);
    }

    public void recycleChild(View child, boolean z10) {
        q.g(child, "child");
        APNGView aPNGView = child instanceof APNGView ? (APNGView) child : null;
        if (aPNGView != null) {
            aPNGView.recycle(true, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resetViews(View view, boolean z10) {
        int i10;
        for (View view2 : k2.a(this)) {
            boolean b10 = q.b(view2, view);
            if (!b10) {
                recycleChild(view2, z10);
            }
            if (b10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view2.setVisibility(i10);
        }
    }

    protected final void setApngView(APNGView aPNGView) {
        q.g(aPNGView, "<set-?>");
        this.apngView = aPNGView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
    }

    public void recycleChild(View child) {
        q.g(child, "child");
        APNGView aPNGView = child instanceof APNGView ? (APNGView) child : null;
        if (aPNGView != null) {
            APNGView.recycle$default(aPNGView, true, false, 2, null);
        }
    }
}
