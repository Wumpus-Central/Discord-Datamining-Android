package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p185k.C9688a;
import p203l.C10296a;
import p203l.C10297b;

/* loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle {

    /* renamed from: b */
    private C10296a<AbstractC3040l, C3012a> f4373b;

    /* renamed from: c */
    private Lifecycle.State f4374c;

    /* renamed from: d */
    private final WeakReference<LifecycleOwner> f4375d;

    /* renamed from: e */
    private int f4376e;

    /* renamed from: f */
    private boolean f4377f;

    /* renamed from: g */
    private boolean f4378g;

    /* renamed from: h */
    private ArrayList<Lifecycle.State> f4379h;

    /* renamed from: i */
    private final boolean f4380i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.LifecycleRegistry$a */
    /* loaded from: classes.dex */
    public static class C3012a {

        /* renamed from: a */
        Lifecycle.State f4381a;

        /* renamed from: b */
        AbstractC3038j f4382b;

        C3012a(AbstractC3040l lVar, Lifecycle.State state) {
            this.f4382b = C3043o.m35765f(lVar);
            this.f4381a = state;
        }

        /* renamed from: a */
        void m35828a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC3010b bVar) {
            Lifecycle.State b = bVar.m35849b();
            this.f4381a = LifecycleRegistry.m35834k(this.f4381a, b);
            this.f4382b.mo34707c(lifecycleOwner, bVar);
            this.f4381a = b;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
    }

    /* renamed from: d */
    private void m35841d(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<AbstractC3040l, C3012a>> descendingIterator = this.f4373b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f4378g) {
            Map.Entry<AbstractC3040l, C3012a> next = descendingIterator.next();
            C3012a value = next.getValue();
            while (value.f4381a.compareTo(this.f4374c) > 0 && !this.f4378g && this.f4373b.contains(next.getKey())) {
                Lifecycle.EnumC3010b a = Lifecycle.EnumC3010b.m35850a(value.f4381a);
                if (a != null) {
                    m35831n(a.m35849b());
                    value.m35828a(lifecycleOwner, a);
                    m35832m();
                } else {
                    throw new IllegalStateException("no event down from " + value.f4381a);
                }
            }
        }
    }

    /* renamed from: e */
    private Lifecycle.State m35840e(AbstractC3040l lVar) {
        Lifecycle.State state;
        ArrayList<Lifecycle.State> arrayList;
        Map.Entry<AbstractC3040l, C3012a> p = this.f4373b.m13671p(lVar);
        Lifecycle.State state2 = null;
        if (p != null) {
            state = p.getValue().f4381a;
        } else {
            state = null;
        }
        if (!this.f4379h.isEmpty()) {
            state2 = this.f4379h.get(arrayList.size() - 1);
        }
        return m35834k(m35834k(this.f4374c, state), state2);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m35839f(String str) {
        if (this.f4380i && !C9688a.m15590d().mo15586b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    private void m35838g(LifecycleOwner lifecycleOwner) {
        C10297b<AbstractC3040l, C3012a>.C10300d e = this.f4373b.m13668e();
        while (e.hasNext() && !this.f4378g) {
            Map.Entry next = e.next();
            C3012a aVar = (C3012a) next.getValue();
            while (aVar.f4381a.compareTo(this.f4374c) < 0 && !this.f4378g && this.f4373b.contains((AbstractC3040l) next.getKey())) {
                m35831n(aVar.f4381a);
                Lifecycle.EnumC3010b c = Lifecycle.EnumC3010b.m35848c(aVar.f4381a);
                if (c != null) {
                    aVar.m35828a(lifecycleOwner, c);
                    m35832m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f4381a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m35836i() {
        if (this.f4373b.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.f4373b.m13670a().getValue().f4381a;
        Lifecycle.State state2 = this.f4373b.m13667f().getValue().f4381a;
        if (state == state2 && this.f4374c == state2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static Lifecycle.State m35834k(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    /* renamed from: l */
    private void m35833l(Lifecycle.State state) {
        Lifecycle.State state2 = this.f4374c;
        if (state2 != state) {
            if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
                throw new IllegalStateException("no event down from " + this.f4374c);
            }
            this.f4374c = state;
            if (this.f4377f || this.f4376e != 0) {
                this.f4378g = true;
                return;
            }
            this.f4377f = true;
            m35829p();
            this.f4377f = false;
            if (this.f4374c == Lifecycle.State.DESTROYED) {
                this.f4373b = new C10296a<>();
            }
        }
    }

    /* renamed from: m */
    private void m35832m() {
        ArrayList<Lifecycle.State> arrayList = this.f4379h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m35831n(Lifecycle.State state) {
        this.f4379h.add(state);
    }

    /* renamed from: p */
    private void m35829p() {
        LifecycleOwner lifecycleOwner = this.f4375d.get();
        if (lifecycleOwner != null) {
            while (!m35836i()) {
                this.f4378g = false;
                if (this.f4374c.compareTo(this.f4373b.m13670a().getValue().f4381a) < 0) {
                    m35841d(lifecycleOwner);
                }
                Map.Entry<AbstractC3040l, C3012a> f = this.f4373b.m13667f();
                if (!this.f4378g && f != null && this.f4374c.compareTo(f.getValue().f4381a) > 0) {
                    m35838g(lifecycleOwner);
                }
            }
            this.f4378g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: a */
    public void mo35844a(AbstractC3040l lVar) {
        LifecycleOwner lifecycleOwner;
        boolean z;
        m35839f("addObserver");
        Lifecycle.State state = this.f4374c;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        C3012a aVar = new C3012a(lVar, state2);
        if (this.f4373b.mo13665i(lVar, aVar) == null && (lifecycleOwner = this.f4375d.get()) != null) {
            if (this.f4376e != 0 || this.f4377f) {
                z = true;
            } else {
                z = false;
            }
            Lifecycle.State e = m35840e(lVar);
            this.f4376e++;
            while (aVar.f4381a.compareTo(e) < 0 && this.f4373b.contains(lVar)) {
                m35831n(aVar.f4381a);
                Lifecycle.EnumC3010b c = Lifecycle.EnumC3010b.m35848c(aVar.f4381a);
                if (c != null) {
                    aVar.m35828a(lifecycleOwner, c);
                    m35832m();
                    e = m35840e(lVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f4381a);
                }
            }
            if (!z) {
                m35829p();
            }
            this.f4376e--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: b */
    public Lifecycle.State mo35843b() {
        return this.f4374c;
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: c */
    public void mo35842c(AbstractC3040l lVar) {
        m35839f("removeObserver");
        this.f4373b.mo13664j(lVar);
    }

    /* renamed from: h */
    public void m35837h(Lifecycle.EnumC3010b bVar) {
        m35839f("handleLifecycleEvent");
        m35833l(bVar.m35849b());
    }

    @Deprecated
    /* renamed from: j */
    public void m35835j(Lifecycle.State state) {
        m35839f("markState");
        m35830o(state);
    }

    /* renamed from: o */
    public void m35830o(Lifecycle.State state) {
        m35839f("setCurrentState");
        m35833l(state);
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.f4373b = new C10296a<>();
        this.f4376e = 0;
        this.f4377f = false;
        this.f4378g = false;
        this.f4379h = new ArrayList<>();
        this.f4375d = new WeakReference<>(lifecycleOwner);
        this.f4374c = Lifecycle.State.INITIALIZED;
        this.f4380i = z;
    }
}
