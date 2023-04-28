package com.facebook.drawee.span;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.drawee.controller.AbstractC4795a;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.image.ImageInfo;
import java.util.HashSet;
import java.util.Set;
import p293q4.C11990a;
import p394w3.C13740j;

/* loaded from: classes7.dex */
public class DraweeSpanStringBuilder extends SpannableStringBuilder {

    /* renamed from: k */
    private final Set<C4836a> f7839k = new HashSet();

    /* renamed from: l */
    private final C4833b f7840l = new C4833b();

    /* renamed from: m */
    private View f7841m;

    /* renamed from: n */
    private Drawable f7842n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.drawee.span.DraweeSpanStringBuilder$b */
    /* loaded from: classes7.dex */
    public class C4833b implements Drawable.Callback {
        private C4833b() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            if (DraweeSpanStringBuilder.this.f7841m != null) {
                DraweeSpanStringBuilder.this.f7841m.invalidate();
            } else if (DraweeSpanStringBuilder.this.f7842n != null) {
                DraweeSpanStringBuilder.this.f7842n.invalidateSelf();
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (DraweeSpanStringBuilder.this.f7841m != null) {
                DraweeSpanStringBuilder.this.f7841m.postDelayed(runnable, j - SystemClock.uptimeMillis());
            } else if (DraweeSpanStringBuilder.this.f7842n != null) {
                DraweeSpanStringBuilder.this.f7842n.scheduleSelf(runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (DraweeSpanStringBuilder.this.f7841m != null) {
                DraweeSpanStringBuilder.this.f7841m.removeCallbacks(runnable);
            } else if (DraweeSpanStringBuilder.this.f7842n != null) {
                DraweeSpanStringBuilder.this.f7842n.unscheduleSelf(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.drawee.span.DraweeSpanStringBuilder$c */
    /* loaded from: classes7.dex */
    public class C4834c extends C11990a<ImageInfo> {

        /* renamed from: l */
        private final C4836a f7844l;

        /* renamed from: m */
        private final boolean f7845m;

        /* renamed from: n */
        private final int f7846n;

        public C4834c(C4836a aVar, boolean z, int i) {
            C13740j.m2834g(aVar);
            this.f7844l = aVar;
            this.f7845m = z;
            this.f7846n = i;
        }

        /* renamed from: b */
        public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
            if (this.f7845m && imageInfo != null && this.f7844l.m31676c().m31664h() != null) {
                Drawable h = this.f7844l.m31676c().m31664h();
                Rect bounds = h.getBounds();
                int i = this.f7846n;
                if (i != -1) {
                    int height = (int) ((i / imageInfo.getHeight()) * imageInfo.getWidth());
                    if (bounds.width() != height || bounds.height() != this.f7846n) {
                        h.setBounds(0, 0, height, this.f7846n);
                        DraweeSpanStringBuilder.this.getClass();
                    }
                } else if (bounds.width() != imageInfo.getWidth() || bounds.height() != imageInfo.getHeight()) {
                    h.setBounds(0, 0, imageInfo.getWidth(), imageInfo.getHeight());
                    DraweeSpanStringBuilder.this.getClass();
                }
            }
        }
    }

    /* renamed from: com.facebook.drawee.span.DraweeSpanStringBuilder$d */
    /* loaded from: classes7.dex */
    public interface AbstractC4835d {
    }

    public DraweeSpanStringBuilder() {
    }

    /* renamed from: d */
    protected void m31688d(View view) {
        m31679m();
        this.f7841m = view;
    }

    /* renamed from: e */
    void m31687e() {
        for (C4836a aVar : this.f7839k) {
            aVar.m31675d();
        }
    }

    /* renamed from: f */
    public void m31686f(View view) {
        m31688d(view);
        m31687e();
    }

    /* renamed from: g */
    void m31685g() {
        for (C4836a aVar : this.f7839k) {
            aVar.m31674e();
        }
    }

    /* renamed from: h */
    public void m31684h(View view) {
        m31678n(view);
        m31685g();
    }

    /* renamed from: i */
    public void m31683i(Context context, DraweeHierarchy draweeHierarchy, DraweeController draweeController, int i, int i2, int i3, int i4, boolean z, int i5) {
        DraweeHolder d = DraweeHolder.m31668d(draweeHierarchy, context);
        d.m31657o(draweeController);
        m31681k(d, i, i2, i3, i4, z, i5);
    }

    /* renamed from: j */
    public void m31682j(Context context, DraweeHierarchy draweeHierarchy, DraweeController draweeController, int i, int i2, int i3, boolean z, int i4) {
        m31683i(context, draweeHierarchy, draweeController, i, i, i2, i3, z, i4);
    }

    /* renamed from: k */
    public void m31681k(DraweeHolder draweeHolder, int i, int i2, int i3, int i4, boolean z, int i5) {
        if (i2 < length()) {
            Drawable h = draweeHolder.m31664h();
            if (h != null) {
                if (h.getBounds().isEmpty()) {
                    h.setBounds(0, 0, i3, i4);
                }
                h.setCallback(this.f7840l);
            }
            C4836a aVar = new C4836a(draweeHolder, i5);
            DraweeController f = draweeHolder.m31666f();
            if (f instanceof AbstractC4795a) {
                ((AbstractC4795a) f).m31870j(new C4834c(aVar, z, i4));
            }
            this.f7839k.add(aVar);
            setSpan(aVar, i, i2 + 1, 33);
        }
    }

    /* renamed from: l */
    protected void m31680l(Drawable drawable) {
        if (drawable == this.f7842n) {
            this.f7842n = null;
        }
    }

    /* renamed from: m */
    protected void m31679m() {
        View view = this.f7841m;
        if (view != null) {
            m31678n(view);
        }
        Drawable drawable = this.f7842n;
        if (drawable != null) {
            m31680l(drawable);
        }
    }

    /* renamed from: n */
    protected void m31678n(View view) {
        if (view == this.f7841m) {
            this.f7841m = null;
        }
    }

    public DraweeSpanStringBuilder(CharSequence charSequence) {
        super(charSequence);
    }
}
