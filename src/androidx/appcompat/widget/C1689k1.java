package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.k1 */
/* loaded from: classes.dex */
public class C1689k1 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1410c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C1689k1>> f1411d;

    /* renamed from: a */
    private final Resources f1412a;

    /* renamed from: b */
    private final Resources.Theme f1413b;

    private C1689k1(Context context) {
        super(context);
        if (C1731u1.m40004d()) {
            C1731u1 u1Var = new C1731u1(this, context.getResources());
            this.f1412a = u1Var;
            Resources.Theme newTheme = u1Var.newTheme();
            this.f1413b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1412a = new C1695m1(this, context.getResources());
        this.f1413b = null;
    }

    /* renamed from: a */
    private static boolean m40132a(Context context) {
        if ((context instanceof C1689k1) || (context.getResources() instanceof C1695m1) || (context.getResources() instanceof C1731u1) || !C1731u1.m40004d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Context m40131b(Context context) {
        C1689k1 k1Var;
        if (!m40132a(context)) {
            return context;
        }
        synchronized (f1410c) {
            ArrayList<WeakReference<C1689k1>> arrayList = f1411d;
            if (arrayList == null) {
                f1411d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C1689k1> weakReference = f1411d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1411d.remove(size);
                    }
                }
                for (int size2 = f1411d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C1689k1> weakReference2 = f1411d.get(size2);
                    if (weakReference2 != null) {
                        k1Var = weakReference2.get();
                    } else {
                        k1Var = null;
                    }
                    if (k1Var != null && k1Var.getBaseContext() == context) {
                        return k1Var;
                    }
                }
            }
            C1689k1 k1Var2 = new C1689k1(context);
            f1411d.add(new WeakReference<>(k1Var2));
            return k1Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1412a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1412a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1413b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1413b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
