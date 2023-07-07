package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import eightbitlab.com.blurview.BlurViewFacade;
import eightbitlab.com.blurview.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/discord/blur/BlurView;", "Leightbitlab/com/blurview/a;", "", "radius", "Leightbitlab/com/blurview/BlurViewFacade;", "setBlurRadius", "", "overlayColor", "setOverlayColor", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "blur_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class BlurView extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurView(Context context, Window window) {
        super(context);
        ViewGroup viewGroup;
        View decorView;
        q.g(context, "context");
        if (window == null || (decorView = window.getDecorView()) == null) {
            viewGroup = null;
        } else {
            viewGroup = (ViewGroup) decorView.findViewById(16908290);
        }
        if (viewGroup != null) {
            setupWith(viewGroup).c(viewGroup.getBackground());
        } else {
            setupWith(this);
        }
    }

    @Override // eightbitlab.com.blurview.a
    public BlurViewFacade setBlurRadius(float f10) {
        BlurViewFacade blurRadius = super.setBlurRadius(f10);
        invalidate();
        q.f(blurRadius, "super.setBlurRadius(radi…   invalidate()\n        }");
        return blurRadius;
    }

    @Override // eightbitlab.com.blurview.a
    public BlurViewFacade setOverlayColor(int i10) {
        BlurViewFacade overlayColor = super.setOverlayColor(i10);
        invalidate();
        q.f(overlayColor, "super.setOverlayColor(ov…   invalidate()\n        }");
        return overlayColor;
    }
}
