package io.sentry;

import io.sentry.vendor.gson.stream.EnumC9125b;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: io.sentry.w0 */
/* loaded from: classes8.dex */
public final class C9129w0 {

    /* renamed from: a */
    private final ArrayList<AbstractC9132c> f20030a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.w0$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C9130a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20031a;

        static {
            int[] iArr = new int[EnumC9125b.values().length];
            f20031a = iArr;
            try {
                iArr[EnumC9125b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20031a[EnumC9125b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20031a[EnumC9125b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20031a[EnumC9125b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20031a[EnumC9125b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20031a[EnumC9125b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20031a[EnumC9125b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20031a[EnumC9125b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20031a[EnumC9125b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20031a[EnumC9125b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.w0$b */
    /* loaded from: classes8.dex */
    public interface AbstractC9131b {
        /* renamed from: a */
        Object mo16892a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.w0$c */
    /* loaded from: classes8.dex */
    public interface AbstractC9132c {
        Object getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.w0$f */
    /* loaded from: classes8.dex */
    public static final class C9135f implements AbstractC9132c {

        /* renamed from: a */
        final String f20034a;

        C9135f(String str) {
            this.f20034a = str;
        }

        @Override // io.sentry.C9129w0.AbstractC9132c
        public Object getValue() {
            return this.f20034a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.w0$g */
    /* loaded from: classes8.dex */
    public static final class C9136g implements AbstractC9132c {

        /* renamed from: a */
        final Object f20035a;

        C9136g(Object obj) {
            this.f20035a = obj;
        }

        @Override // io.sentry.C9129w0.AbstractC9132c
        public Object getValue() {
            return this.f20035a;
        }
    }

    /* renamed from: d */
    private AbstractC9132c m16902d() {
        if (this.f20030a.isEmpty()) {
            return null;
        }
        ArrayList<AbstractC9132c> arrayList = this.f20030a;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: e */
    private boolean m16901e() {
        if (m16899g()) {
            return true;
        }
        AbstractC9132c d = m16902d();
        m16894l();
        if (m16902d() instanceof C9135f) {
            C9135f fVar = (C9135f) m16902d();
            m16894l();
            C9134e eVar = (C9134e) m16902d();
            if (fVar == null || d == null || eVar == null) {
                return false;
            }
            eVar.f20033a.put(fVar.f20034a, d.getValue());
            return false;
        } else if (!(m16902d() instanceof C9133d)) {
            return false;
        } else {
            C9133d dVar = (C9133d) m16902d();
            if (d == null || dVar == null) {
                return false;
            }
            dVar.f20032a.add(d.getValue());
            return false;
        }
    }

    /* renamed from: f */
    private boolean m16900f(AbstractC9131b bVar) {
        Object a = bVar.mo16892a();
        if (m16902d() == null && a != null) {
            m16893m(new C9136g(a));
            return true;
        } else if (m16902d() instanceof C9135f) {
            m16894l();
            ((C9134e) m16902d()).f20033a.put(((C9135f) m16902d()).f20034a, a);
            return false;
        } else if (!(m16902d() instanceof C9133d)) {
            return false;
        } else {
            ((C9133d) m16902d()).f20032a.add(a);
            return false;
        }
    }

    /* renamed from: g */
    private boolean m16899g() {
        return this.f20030a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ Object m16897i() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public Object m16898h(C9146x0 x0Var) {
        try {
            try {
                return Integer.valueOf(x0Var.m16948Q());
            } catch (Exception unused) {
                return Double.valueOf(x0Var.m16956H());
            }
        } catch (Exception unused2) {
            return Long.valueOf(x0Var.m16947R());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: k */
    private void m16895k(final C9146x0 x0Var) {
        boolean z;
        switch (C9130a.f20031a[x0Var.m16930w0().ordinal()]) {
            case 1:
                x0Var.m16943b();
                m16893m(new C9133d(null));
                z = false;
                break;
            case 2:
                x0Var.m16935n();
                z = m16901e();
                break;
            case 3:
                x0Var.m16940g();
                m16893m(new C9134e(null));
                z = false;
                break;
            case 4:
                x0Var.m16934p();
                z = m16901e();
                break;
            case 5:
                m16893m(new C9135f(x0Var.m16946S()));
                z = false;
                break;
            case 6:
                z = m16900f(new AbstractC9131b() { // from class: io.sentry.s0
                    @Override // io.sentry.C9129w0.AbstractC9131b
                    /* renamed from: a */
                    public final Object mo16892a() {
                        return C9146x0.this.m16941f0();
                    }
                });
                break;
            case 7:
                z = m16900f(new AbstractC9131b() { // from class: io.sentry.t0
                    @Override // io.sentry.C9129w0.AbstractC9131b
                    /* renamed from: a */
                    public final Object mo16892a() {
                        Object h;
                        h = C9129w0.this.m16898h(x0Var);
                        return h;
                    }
                });
                break;
            case 8:
                z = m16900f(new AbstractC9131b() { // from class: io.sentry.u0
                    @Override // io.sentry.C9129w0.AbstractC9131b
                    /* renamed from: a */
                    public final Object mo16892a() {
                        return Boolean.valueOf(C9146x0.this.m16959C());
                    }
                });
                break;
            case 9:
                x0Var.m16944Y();
                z = m16900f(new AbstractC9131b() { // from class: io.sentry.v0
                    @Override // io.sentry.C9129w0.AbstractC9131b
                    /* renamed from: a */
                    public final Object mo16892a() {
                        Object i;
                        i = C9129w0.m16897i();
                        return i;
                    }
                });
                break;
            case 10:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            m16895k(x0Var);
        }
    }

    /* renamed from: l */
    private void m16894l() {
        if (!this.f20030a.isEmpty()) {
            ArrayList<AbstractC9132c> arrayList = this.f20030a;
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* renamed from: m */
    private void m16893m(AbstractC9132c cVar) {
        this.f20030a.add(cVar);
    }

    /* renamed from: c */
    public Object m16903c(C9146x0 x0Var) {
        m16895k(x0Var);
        AbstractC9132c d = m16902d();
        if (d != null) {
            return d.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.w0$d */
    /* loaded from: classes8.dex */
    public static final class C9133d implements AbstractC9132c {

        /* renamed from: a */
        final ArrayList<Object> f20032a;

        private C9133d() {
            this.f20032a = new ArrayList<>();
        }

        @Override // io.sentry.C9129w0.AbstractC9132c
        public Object getValue() {
            return this.f20032a;
        }

        /* synthetic */ C9133d(C9130a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.sentry.w0$e */
    /* loaded from: classes8.dex */
    public static final class C9134e implements AbstractC9132c {

        /* renamed from: a */
        final HashMap<String, Object> f20033a;

        private C9134e() {
            this.f20033a = new HashMap<>();
        }

        @Override // io.sentry.C9129w0.AbstractC9132c
        public Object getValue() {
            return this.f20033a;
        }

        /* synthetic */ C9134e(C9130a aVar) {
            this();
        }
    }
}
