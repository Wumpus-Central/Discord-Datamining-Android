package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.collection.C2094a;
import androidx.core.content.res.C2379l;
import androidx.core.graphics.drawable.C2400a;
import com.facebook.react.uimanager.events.TouchesHelper;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.vectordrawable.graphics.drawable.c */
/* loaded from: classes.dex */
public class C3286c extends AbstractC3293g implements Animatable {

    /* renamed from: l */
    private C3288b f5191l;

    /* renamed from: m */
    private Context f5192m;

    /* renamed from: n */
    private ArgbEvaluator f5193n;

    /* renamed from: o */
    private Animator.AnimatorListener f5194o;

    /* renamed from: p */
    ArrayList<AbstractC3285b> f5195p;

    /* renamed from: q */
    final Drawable.Callback f5196q;

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    /* loaded from: classes.dex */
    class C3287a implements Drawable.Callback {
        C3287a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C3286c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C3286c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C3286c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    /* loaded from: classes.dex */
    public static class C3288b extends Drawable.ConstantState {

        /* renamed from: a */
        int f5198a;

        /* renamed from: b */
        C3294h f5199b;

        /* renamed from: c */
        AnimatorSet f5200c;

        /* renamed from: d */
        ArrayList<Animator> f5201d;

        /* renamed from: e */
        C2094a<Animator, String> f5202e;

        public C3288b(Context context, C3288b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f5198a = bVar.f5198a;
                C3294h hVar = bVar.f5199b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f5199b = (C3294h) constantState.newDrawable(resources);
                    } else {
                        this.f5199b = (C3294h) constantState.newDrawable();
                    }
                    C3294h hVar2 = (C3294h) this.f5199b.mutate();
                    this.f5199b = hVar2;
                    hVar2.setCallback(callback);
                    this.f5199b.setBounds(bVar.f5199b.getBounds());
                    this.f5199b.m34783h(false);
                }
                ArrayList<Animator> arrayList = bVar.f5201d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5201d = new ArrayList<>(size);
                    this.f5202e = new C2094a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f5201d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f5202e.get(animator);
                        clone.setTarget(this.f5199b.m34787d(str));
                        this.f5201d.add(clone);
                        this.f5202e.put(clone, str);
                    }
                    m34813a();
                }
            }
        }

        /* renamed from: a */
        public void m34813a() {
            if (this.f5200c == null) {
                this.f5200c = new AnimatorSet();
            }
            this.f5200c.playTogether(this.f5201d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5198a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C3286c() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C3286c m34815a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C3286c cVar = new C3286c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: b */
    private void m34814b(String str, Animator animator) {
        animator.setTarget(this.f5191l.f5199b.m34787d(str));
        C3288b bVar = this.f5191l;
        if (bVar.f5201d == null) {
            bVar.f5201d = new ArrayList<>();
            this.f5191l.f5202e = new C2094a<>();
        }
        this.f5191l.f5201d.add(animator);
        this.f5191l.f5202e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37842a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return C2400a.m37841b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5191l.f5199b.draw(canvas);
        if (this.f5191l.f5200c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return C2400a.m37839d(drawable);
        }
        return this.f5191l.f5199b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5191l.f5198a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return C2400a.m37838e(drawable);
        }
        return this.f5191l.f5199b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5206k == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0068c(this.f5206k.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f5191l.f5199b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f5191l.f5199b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f5191l.f5199b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37836g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5183e);
                    int resourceId = k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C3294h b = C3294h.m34789b(resources, resourceId, theme);
                        b.m34783h(false);
                        b.setCallback(this.f5196q);
                        C3294h hVar = this.f5191l.f5199b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f5191l.f5199b = b;
                    }
                    k.recycle();
                } else if (TouchesHelper.TARGET_KEY.equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C3284a.f5184f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5192m;
                        if (context != null) {
                            m34814b(string, C3290e.m34803i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f5191l.m34813a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return C2400a.m37835h(drawable);
        }
        return this.f5191l.f5199b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f5191l.f5200c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f5191l.f5199b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5191l.f5199b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f5191l.f5199b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f5191l.f5199b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5191l.f5199b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37833j(drawable, z);
        } else {
            this.f5191l.f5199b.setAutoMirrored(z);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC3293g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37829n(drawable, i);
        } else {
            this.f5191l.f5199b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37828o(drawable, colorStateList);
        } else {
            this.f5191l.f5199b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            C2400a.m37827p(drawable, mode);
        } else {
            this.f5191l.f5199b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5191l.f5199b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f5191l.f5200c.isStarted()) {
            this.f5191l.f5200c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5191l.f5200c.end();
        }
    }

    private C3286c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5206k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5191l.f5199b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    /* loaded from: classes.dex */
    private static class C0068c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5203a;

        public C0068c(Drawable.ConstantState constantState) {
            this.f5203a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5203a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5203a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C3286c cVar = new C3286c();
            Drawable newDrawable = this.f5203a.newDrawable();
            cVar.f5206k = newDrawable;
            newDrawable.setCallback(cVar.f5196q);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C3286c cVar = new C3286c();
            Drawable newDrawable = this.f5203a.newDrawable(resources);
            cVar.f5206k = newDrawable;
            newDrawable.setCallback(cVar.f5196q);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C3286c cVar = new C3286c();
            Drawable newDrawable = this.f5203a.newDrawable(resources, theme);
            cVar.f5206k = newDrawable;
            newDrawable.setCallback(cVar.f5196q);
            return cVar;
        }
    }

    private C3286c(Context context, C3288b bVar, Resources resources) {
        this.f5193n = null;
        this.f5194o = null;
        this.f5195p = null;
        C3287a aVar = new C3287a();
        this.f5196q = aVar;
        this.f5192m = context;
        if (bVar != null) {
            this.f5191l = bVar;
        } else {
            this.f5191l = new C3288b(context, bVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
