package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.AspectRatioMeasure;
import p007a6.C1271b;
import p394w3.C13736i;

/* renamed from: com.facebook.drawee.view.a */
/* loaded from: classes7.dex */
public class C4837a<DH extends DraweeHierarchy> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled = false;
    private DraweeHolder<DH> mDraweeHolder;
    private final AspectRatioMeasure.Spec mMeasureSpec = new AspectRatioMeasure.Spec();
    private float mAspectRatio = 0.0f;
    private boolean mInitialised = false;
    private boolean mLegacyVisibilityHandlingEnabled = false;

    public C4837a(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        try {
            if (C1271b.m41491d()) {
                C1271b.m41494a("DraweeView#init");
            }
            if (!this.mInitialised) {
                boolean z = true;
                this.mInitialised = true;
                this.mDraweeHolder = DraweeHolder.m31668d(null, context);
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList != null) {
                    setColorFilter(imageTintList.getDefaultColor());
                    if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                        z = false;
                    }
                    this.mLegacyVisibilityHandlingEnabled = z;
                    if (C1271b.m41491d()) {
                        C1271b.m41493b();
                    }
                } else if (C1271b.m41491d()) {
                    C1271b.m41493b();
                }
            }
        } finally {
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    private void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        boolean z;
        if (this.mLegacyVisibilityHandlingEnabled && (drawable = getDrawable()) != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    protected void doAttach() {
        this.mDraweeHolder.m31661k();
    }

    protected void doDetach() {
        this.mDraweeHolder.m31660l();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public DraweeController getController() {
        return this.mDraweeHolder.m31666f();
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.m31665g();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.m31664h();
    }

    public boolean hasController() {
        return this.mDraweeHolder.m31666f() != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.m31663i();
    }

    protected void onAttach() {
        doAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    protected void onDetach() {
        doDetach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        AspectRatioMeasure.Spec spec = this.mMeasureSpec;
        spec.f7849a = i;
        spec.f7850b = i2;
        AspectRatioMeasure.m31672b(spec, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        AspectRatioMeasure.Spec spec2 = this.mMeasureSpec;
        super.onMeasure(spec2.f7849a, spec2.f7850b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.m31659m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        maybeOverrideVisibilityHandling();
    }

    public void setAspectRatio(float f) {
        if (f != this.mAspectRatio) {
            this.mAspectRatio = f;
            requestLayout();
        }
    }

    public void setController(DraweeController draweeController) {
        this.mDraweeHolder.m31657o(draweeController);
        super.setImageDrawable(this.mDraweeHolder.m31664h());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.m31656p(dh);
        super.setImageDrawable(this.mDraweeHolder.m31664h());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.m31657o(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.m31657o(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        init(getContext());
        this.mDraweeHolder.m31657o(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.m31657o(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    @Override // android.view.View
    public String toString() {
        String str;
        C13736i.C13738b c = C13736i.m2846c(this);
        DraweeHolder<DH> draweeHolder = this.mDraweeHolder;
        if (draweeHolder != null) {
            str = draweeHolder.toString();
        } else {
            str = "<no holder set>";
        }
        return c.m2844b("holder", str).toString();
    }

    public C4837a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public C4837a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    @TargetApi(21)
    public C4837a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
