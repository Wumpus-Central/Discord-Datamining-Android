package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.C1731u1;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C2095b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* renamed from: k */
    private static int f727k = -100;

    /* renamed from: l */
    private static final C2095b<WeakReference<AppCompatDelegate>> f728l = new C2095b<>();

    /* renamed from: m */
    private static final Object f729m = new Object();

    /* renamed from: B */
    public static void m40926B(boolean z) {
        C1731u1.m40005c(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m40925c(AppCompatDelegate appCompatDelegate) {
        synchronized (f729m) {
            m40919z(appCompatDelegate);
            f728l.add(new WeakReference<>(appCompatDelegate));
        }
    }

    /* renamed from: g */
    public static AppCompatDelegate m40923g(Activity activity, AbstractC1512c cVar) {
        return new LayoutInflater$Factory2C1513d(activity, cVar);
    }

    /* renamed from: h */
    public static AppCompatDelegate m40922h(Dialog dialog, AbstractC1512c cVar) {
        return new LayoutInflater$Factory2C1513d(dialog, cVar);
    }

    /* renamed from: j */
    public static int m40921j() {
        return f727k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static void m40920y(AppCompatDelegate appCompatDelegate) {
        synchronized (f729m) {
            m40919z(appCompatDelegate);
        }
    }

    /* renamed from: z */
    private static void m40919z(AppCompatDelegate appCompatDelegate) {
        synchronized (f729m) {
            Iterator<WeakReference<AppCompatDelegate>> it = f728l.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract boolean mo40911A(int i);

    /* renamed from: C */
    public abstract void mo40908C(int i);

    /* renamed from: D */
    public abstract void mo40906D(View view);

    /* renamed from: E */
    public abstract void mo40904E(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: F */
    public abstract void mo40902F(Toolbar toolbar);

    /* renamed from: G */
    public void mo40900G(int i) {
    }

    /* renamed from: H */
    public abstract void mo40898H(CharSequence charSequence);

    /* renamed from: I */
    public abstract ActionMode mo40896I(ActionMode.Callback callback);

    /* renamed from: d */
    public abstract void mo40867d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void m40924e(Context context) {
    }

    /* renamed from: f */
    public Context mo40864f(Context context) {
        m40924e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo40860i(int i);

    /* renamed from: k */
    public abstract ActionBarDrawerToggle$Delegate mo40857k();

    /* renamed from: l */
    public int mo40855l() {
        return -100;
    }

    /* renamed from: m */
    public abstract MenuInflater mo40853m();

    /* renamed from: n */
    public abstract ActionBar mo40851n();

    /* renamed from: o */
    public abstract void mo40849o();

    /* renamed from: p */
    public abstract void mo40847p();

    /* renamed from: q */
    public abstract void mo40845q(Configuration configuration);

    /* renamed from: r */
    public abstract void mo40843r(Bundle bundle);

    /* renamed from: s */
    public abstract void mo40841s();

    /* renamed from: t */
    public abstract void mo40839t(Bundle bundle);

    /* renamed from: u */
    public abstract void mo40837u();

    /* renamed from: v */
    public abstract void mo40835v(Bundle bundle);

    /* renamed from: w */
    public abstract void mo40833w();

    /* renamed from: x */
    public abstract void mo40831x();
}
