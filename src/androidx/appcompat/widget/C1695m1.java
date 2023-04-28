package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.m1 */
/* loaded from: classes.dex */
class C1695m1 extends C1662e1 {

    /* renamed from: b */
    private final WeakReference<Context> f1421b;

    public C1695m1(Context context, Resources resources) {
        super(resources);
        this.f1421b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable a = m40251a(i);
        Context context = this.f1421b.get();
        if (!(a == null || context == null)) {
            C1652d1.m40273h().m40257x(context, i, a);
        }
        return a;
    }
}
