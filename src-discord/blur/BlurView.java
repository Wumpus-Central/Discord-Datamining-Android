package com.discord.blur;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import eightbitlab.com.blurview.BlurViewFacade;
import eightbitlab.com.blurview.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/discord/blur/BlurView;", "Leightbitlab/com/blurview/a;", "Landroid/view/ViewGroup;", "blurTarget", "", "setBlurTarget", "", "radius", "Leightbitlab/com/blurview/BlurViewFacade;", "setBlurRadius", "", "overlayColor", "setOverlayColor", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "blur_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})

public final class BlurView extends a {
    
    public BlurView(Context context) {
        super(context);
        q.g(context, "context");
    }

    @Override 
    public BlurViewFacade setBlurRadius(float f10) {
        BlurViewFacade blurRadius = super.setBlurRadius(f10);
        invalidate();
        q.f(blurRadius, "super.setBlurRadius(radi…   invalidate()\n        }");
        return blurRadius;
    }

    public final void setBlurTarget(ViewGroup blurTarget) {
        q.g(blurTarget, "blurTarget");
        setupWith(blurTarget).c(blurTarget.getBackground());
    }

    @Override 
    public BlurViewFacade setOverlayColor(int i10) {
        BlurViewFacade overlayColor = super.setOverlayColor(i10);
        invalidate();
        q.f(overlayColor, "super.setOverlayColor(ov…   invalidate()\n        }");
        return overlayColor;
    }
}
