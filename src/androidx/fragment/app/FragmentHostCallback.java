package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C2198b;
import androidx.core.content.C2337a;
import androidx.core.util.C2517g;

/* loaded from: classes.dex */
public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* renamed from: k */
    private final Activity f4041k;

    /* renamed from: l */
    private final Context f4042l;

    /* renamed from: m */
    private final Handler f4043m;

    /* renamed from: n */
    private final int f4044n;

    /* renamed from: o */
    final FragmentManager f4045o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentHostCallback(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Override // androidx.fragment.app.FragmentContainer
    /* renamed from: c */
    public View mo36223c(int i) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentContainer
    /* renamed from: d */
    public boolean mo36222d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity m36221e() {
        return this.f4041k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m36220f() {
        return this.f4042l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Handler m36219g() {
        return this.f4043m;
    }

    /* renamed from: h */
    public abstract E mo36218h();

    /* renamed from: i */
    public LayoutInflater mo36217i() {
        return LayoutInflater.from(this.f4042l);
    }

    @Deprecated
    /* renamed from: j */
    public void m36216j(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: k */
    public boolean mo36215k(Fragment fragment) {
        return true;
    }

    /* renamed from: l */
    public boolean mo36214l(String str) {
        return false;
    }

    /* renamed from: m */
    public void m36213m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C2337a.m38126l(this.f4042l, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: n */
    public void m36212n(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            C2198b.m38325x(this.f4041k, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: o */
    public void mo36211o() {
    }

    FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        this.f4045o = new C2965h();
        this.f4041k = activity;
        this.f4042l = (Context) C2517g.m37587h(context, "context == null");
        this.f4043m = (Handler) C2517g.m37587h(handler, "handler == null");
        this.f4044n = i;
    }
}
