package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C2517g;
import androidx.lifecycle.AbstractC3056x;

/* loaded from: classes.dex */
public class FragmentController {

    /* renamed from: a */
    private final FragmentHostCallback<?> f4040a;

    private FragmentController(FragmentHostCallback<?> fragmentHostCallback) {
        this.f4040a = fragmentHostCallback;
    }

    /* renamed from: b */
    public static FragmentController m36246b(FragmentHostCallback<?> fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) C2517g.m37587h(fragmentHostCallback, "callbacks == null"));
    }

    /* renamed from: a */
    public void m36247a(Fragment fragment) {
        FragmentHostCallback<?> fragmentHostCallback = this.f4040a;
        fragmentHostCallback.f4045o.m36128k(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    /* renamed from: c */
    public void m36245c() {
        this.f4040a.f4045o.m36091y();
    }

    /* renamed from: d */
    public void m36244d(Configuration configuration) {
        this.f4040a.f4045o.m36210A(configuration);
    }

    /* renamed from: e */
    public boolean m36243e(MenuItem menuItem) {
        return this.f4040a.f4045o.m36208B(menuItem);
    }

    /* renamed from: f */
    public void m36242f() {
        this.f4040a.f4045o.m36206C();
    }

    /* renamed from: g */
    public boolean m36241g(Menu menu, MenuInflater menuInflater) {
        return this.f4040a.f4045o.m36204D(menu, menuInflater);
    }

    /* renamed from: h */
    public void m36240h() {
        this.f4040a.f4045o.m36202E();
    }

    /* renamed from: i */
    public void m36239i() {
        this.f4040a.f4045o.m36198G();
    }

    /* renamed from: j */
    public void m36238j(boolean z) {
        this.f4040a.f4045o.m36196H(z);
    }

    /* renamed from: k */
    public boolean m36237k(MenuItem menuItem) {
        return this.f4040a.f4045o.m36192J(menuItem);
    }

    /* renamed from: l */
    public void m36236l(Menu menu) {
        this.f4040a.f4045o.m36190K(menu);
    }

    /* renamed from: m */
    public void m36235m() {
        this.f4040a.f4045o.m36186M();
    }

    /* renamed from: n */
    public void m36234n(boolean z) {
        this.f4040a.f4045o.m36184N(z);
    }

    /* renamed from: o */
    public boolean m36233o(Menu menu) {
        return this.f4040a.f4045o.m36182O(menu);
    }

    /* renamed from: p */
    public void m36232p() {
        this.f4040a.f4045o.m36178Q();
    }

    /* renamed from: q */
    public void m36231q() {
        this.f4040a.f4045o.m36176R();
    }

    /* renamed from: r */
    public void m36230r() {
        this.f4040a.f4045o.m36172T();
    }

    /* renamed from: s */
    public boolean m36229s() {
        return this.f4040a.f4045o.m36157a0(true);
    }

    /* renamed from: t */
    public FragmentManager m36228t() {
        return this.f4040a.f4045o;
    }

    /* renamed from: u */
    public void m36227u() {
        this.f4040a.f4045o.m36167V0();
    }

    /* renamed from: v */
    public View m36226v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4040a.f4045o.m36094w0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m36225w(Parcelable parcelable) {
        FragmentHostCallback<?> fragmentHostCallback = this.f4040a;
        if (fragmentHostCallback instanceof AbstractC3056x) {
            fragmentHostCallback.f4045o.m36132i1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable m36224x() {
        return this.f4040a.f4045o.m36126k1();
    }
}
