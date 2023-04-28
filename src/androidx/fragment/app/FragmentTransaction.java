package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class FragmentTransaction {

    /* renamed from: a */
    private final C2960e f4098a;

    /* renamed from: b */
    private final ClassLoader f4099b;

    /* renamed from: c */
    ArrayList<C2936a> f4100c;

    /* renamed from: d */
    int f4101d;

    /* renamed from: e */
    int f4102e;

    /* renamed from: f */
    int f4103f;

    /* renamed from: g */
    int f4104g;

    /* renamed from: h */
    int f4105h;

    /* renamed from: i */
    boolean f4106i;

    /* renamed from: j */
    boolean f4107j;

    /* renamed from: k */
    String f4108k;

    /* renamed from: l */
    int f4109l;

    /* renamed from: m */
    CharSequence f4110m;

    /* renamed from: n */
    int f4111n;

    /* renamed from: o */
    CharSequence f4112o;

    /* renamed from: p */
    ArrayList<String> f4113p;

    /* renamed from: q */
    ArrayList<String> f4114q;

    /* renamed from: r */
    boolean f4115r;

    /* renamed from: s */
    ArrayList<Runnable> f4116s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentTransaction$a */
    /* loaded from: classes.dex */
    public static final class C2936a {

        /* renamed from: a */
        int f4117a;

        /* renamed from: b */
        Fragment f4118b;

        /* renamed from: c */
        int f4119c;

        /* renamed from: d */
        int f4120d;

        /* renamed from: e */
        int f4121e;

        /* renamed from: f */
        int f4122f;

        /* renamed from: g */
        Lifecycle.State f4123g;

        /* renamed from: h */
        Lifecycle.State f4124h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2936a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2936a(int i, Fragment fragment) {
            this.f4117a = i;
            this.f4118b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f4123g = state;
            this.f4124h = state;
        }
    }

    @Deprecated
    public FragmentTransaction() {
        this.f4100c = new ArrayList<>();
        this.f4107j = true;
        this.f4115r = false;
        this.f4098a = null;
        this.f4099b = null;
    }

    /* renamed from: b */
    public FragmentTransaction m36074b(int i, Fragment fragment) {
        mo36043l(i, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public FragmentTransaction m36073c(int i, Fragment fragment, String str) {
        mo36043l(i, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public FragmentTransaction m36072d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m36073c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public FragmentTransaction m36071e(Fragment fragment, String str) {
        mo36043l(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m36070f(C2936a aVar) {
        this.f4100c.add(aVar);
        aVar.f4119c = this.f4101d;
        aVar.f4120d = this.f4102e;
        aVar.f4121e = this.f4103f;
        aVar.f4122f = this.f4104g;
    }

    /* renamed from: g */
    public abstract int mo36047g();

    /* renamed from: h */
    public abstract int mo36046h();

    /* renamed from: i */
    public abstract void mo36045i();

    /* renamed from: j */
    public abstract void mo36044j();

    /* renamed from: k */
    public FragmentTransaction m36069k() {
        if (!this.f4106i) {
            this.f4107j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo36043l(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        m36070f(new C2936a(i2, fragment));
    }

    /* renamed from: m */
    public FragmentTransaction mo36042m(Fragment fragment) {
        m36070f(new C2936a(3, fragment));
        return this;
    }

    /* renamed from: n */
    public FragmentTransaction m36068n(int i, Fragment fragment) {
        return m36067o(i, fragment, null);
    }

    /* renamed from: o */
    public FragmentTransaction m36067o(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo36043l(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: p */
    public FragmentTransaction m36066p(Runnable runnable) {
        m36069k();
        if (this.f4116s == null) {
            this.f4116s = new ArrayList<>();
        }
        this.f4116s.add(runnable);
        return this;
    }

    /* renamed from: q */
    public FragmentTransaction m36065q(int i, int i2) {
        return m36064r(i, i2, 0, 0);
    }

    /* renamed from: r */
    public FragmentTransaction m36064r(int i, int i2, int i3, int i4) {
        this.f4101d = i;
        this.f4102e = i2;
        this.f4103f = i3;
        this.f4104g = i4;
        return this;
    }

    /* renamed from: s */
    public FragmentTransaction m36063s(boolean z) {
        this.f4115r = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentTransaction(C2960e eVar, ClassLoader classLoader) {
        this.f4100c = new ArrayList<>();
        this.f4107j = true;
        this.f4115r = false;
        this.f4098a = eVar;
        this.f4099b = classLoader;
    }
}
