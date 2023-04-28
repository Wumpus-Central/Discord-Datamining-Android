package p400w9;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import p420x9.C14004p;

/* renamed from: w9.e */
/* loaded from: classes5.dex */
public class C13819e {

    /* renamed from: a */
    private final Object f31115a;

    public C13819e(Activity activity) {
        C14004p.m2050k(activity, "Activity must not be null");
        this.f31115a = activity;
    }

    /* renamed from: a */
    public final Activity m2587a() {
        return (Activity) this.f31115a;
    }

    /* renamed from: b */
    public final FragmentActivity m2586b() {
        return (FragmentActivity) this.f31115a;
    }

    /* renamed from: c */
    public final boolean m2585c() {
        return this.f31115a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m2584d() {
        return this.f31115a instanceof FragmentActivity;
    }
}
