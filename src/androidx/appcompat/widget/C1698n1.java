package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C2367h;
import p071e.C6525a;

/* renamed from: androidx.appcompat.widget.n1 */
/* loaded from: classes.dex */
public class C1698n1 {

    /* renamed from: a */
    private final Context f1422a;

    /* renamed from: b */
    private final TypedArray f1423b;

    /* renamed from: c */
    private TypedValue f1424c;

    private C1698n1(Context context, TypedArray typedArray) {
        this.f1422a = context;
        this.f1423b = typedArray;
    }

    /* renamed from: t */
    public static C1698n1 m40107t(Context context, int i, int[] iArr) {
        return new C1698n1(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C1698n1 m40106u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1698n1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C1698n1 m40105v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1698n1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m40126a(int i, boolean z) {
        return this.f1423b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m40125b(int i, int i2) {
        return this.f1423b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m40124c(int i) {
        int resourceId;
        ColorStateList a;
        if (!this.f1423b.hasValue(i) || (resourceId = this.f1423b.getResourceId(i, 0)) == 0 || (a = C6525a.m25365a(this.f1422a, resourceId)) == null) {
            return this.f1423b.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: d */
    public float m40123d(int i, float f) {
        return this.f1423b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m40122e(int i, int i2) {
        return this.f1423b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m40121f(int i, int i2) {
        return this.f1423b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m40120g(int i) {
        int resourceId;
        if (!this.f1423b.hasValue(i) || (resourceId = this.f1423b.getResourceId(i, 0)) == 0) {
            return this.f1423b.getDrawable(i);
        }
        return C6525a.m25364b(this.f1422a, resourceId);
    }

    /* renamed from: h */
    public Drawable m40119h(int i) {
        int resourceId;
        if (!this.f1423b.hasValue(i) || (resourceId = this.f1423b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C1683j.m40162b().m40160d(this.f1422a, resourceId, true);
    }

    /* renamed from: i */
    public float m40118i(int i, float f) {
        return this.f1423b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface m40117j(int i, int i2, C2367h.AbstractC2372e eVar) {
        int resourceId = this.f1423b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1424c == null) {
            this.f1424c = new TypedValue();
        }
        return C2367h.m37981i(this.f1422a, resourceId, this.f1424c, i2, eVar);
    }

    /* renamed from: k */
    public int m40116k(int i, int i2) {
        return this.f1423b.getInt(i, i2);
    }

    /* renamed from: l */
    public int m40115l(int i, int i2) {
        return this.f1423b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int m40114m(int i, int i2) {
        return this.f1423b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int m40113n(int i, int i2) {
        return this.f1423b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String m40112o(int i) {
        return this.f1423b.getString(i);
    }

    /* renamed from: p */
    public CharSequence m40111p(int i) {
        return this.f1423b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] m40110q(int i) {
        return this.f1423b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray m40109r() {
        return this.f1423b;
    }

    /* renamed from: s */
    public boolean m40108s(int i) {
        return this.f1423b.hasValue(i);
    }

    /* renamed from: w */
    public void m40104w() {
        this.f1423b.recycle();
    }
}
