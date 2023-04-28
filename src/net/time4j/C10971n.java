package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.time4j.AbstractC11036w;
import p143hj.AbstractC8041a;
import p143hj.AbstractC8044b;
import p143hj.AbstractC8049d0;
import p143hj.AbstractC8067j0;
import p143hj.AbstractC8071l0;
import p143hj.AbstractC8086w;
import p161ij.AbstractC8672w;

/* renamed from: net.time4j.n */
/* loaded from: classes8.dex */
public final class C10971n<U extends AbstractC11036w> extends AbstractC8041a<U> implements Serializable {

    /* renamed from: A */
    private static final AbstractC8067j0<AbstractC11032u, C10971n<AbstractC11032u>> f38940A;

    /* renamed from: m */
    private static final char f24360m;

    /* renamed from: n */
    private static final C10971n f24361n;

    /* renamed from: o */
    private static final C10972a<EnumC10882f> f24362o;

    /* renamed from: p */
    private static final C10972a<EnumC10882f> f24363p;

    /* renamed from: q */
    private static final C10972a<EnumC10882f> f24364q;

    /* renamed from: r */
    private static final C10972a<EnumC10882f> f24365r;

    /* renamed from: s */
    private static final C10972a<EnumC10899g> f24366s;
    private static final long serialVersionUID = -6321211763598951499L;

    /* renamed from: t */
    private static final C10972a<EnumC10899g> f24367t;

    /* renamed from: u */
    private static final Comparator<AbstractC8071l0.C8072a<? extends AbstractC8086w>> f24368u;

    /* renamed from: v */
    public static AbstractC8049d0<AbstractC11036w> f24369v;

    /* renamed from: w */
    public static AbstractC8049d0<EnumC10882f> f24370w;

    /* renamed from: x */
    public static AbstractC8049d0<EnumC10899g> f24371x;

    /* renamed from: y */
    private static final AbstractC8067j0<EnumC10882f, C10971n<EnumC10882f>> f24372y;

    /* renamed from: z */
    private static final AbstractC8067j0<EnumC10899g, C10971n<EnumC10899g>> f24373z;

    /* renamed from: k */
    private final transient List<AbstractC8071l0.C8072a<U>> f24374k;

    /* renamed from: l */
    private final transient boolean f24375l;

    /* renamed from: net.time4j.n$a */
    /* loaded from: classes8.dex */
    public static final class C10972a<U extends AbstractC11036w> extends AbstractC8672w<U, C10971n<U>> {
        private C10972a(Class<U> cls, String str) {
            super(cls, str);
        }

        /* renamed from: k */
        public static <U extends AbstractC11036w> C10972a<U> m11406k(Class<U> cls, String str) {
            return new C10972a<>(cls, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: j */
        public U mo11408f(char c) {
            if (c == 'I') {
                return EnumC10882f.f24148k;
            }
            if (c == 'M') {
                return EnumC10882f.f24153p;
            }
            if (c == 'Q') {
                return EnumC10882f.f24152o;
            }
            if (c == 'W') {
                return EnumC10882f.f24154q;
            }
            if (c == 'Y') {
                return EnumC10882f.f24151n;
            }
            if (c == 'f') {
                return EnumC10899g.f24194p;
            }
            if (c == 'h') {
                return EnumC10899g.f24189k;
            }
            if (c == 'm') {
                return EnumC10899g.f24190l;
            }
            if (c == 's') {
                return EnumC10899g.f24191m;
            }
            switch (c) {
                case 'C':
                    return EnumC10882f.f24149l;
                case 'D':
                    return EnumC10882f.f24155r;
                case 'E':
                    return EnumC10882f.f24150m;
                default:
                    throw new IllegalArgumentException("Unsupported pattern symbol: " + c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.n$b */
    /* loaded from: classes8.dex */
    public static class C10973b<U extends AbstractC11036w> extends AbstractC8044b<U, C10971n<U>> {
        /* synthetic */ C10973b(AbstractC11036w[] wVarArr, C10969m mVar) {
            this(wVarArr);
        }

        private C10973b(U... uArr) {
            super(uArr.length <= 1 ? false : true, uArr);
        }
    }

    static {
        char c;
        if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
            c = '.';
        } else {
            c = ',';
        }
        f24360m = c;
        f24361n = new C10971n();
        f24362o = m11415e(true, false);
        f24363p = m11415e(true, true);
        f24364q = m11415e(false, false);
        f24365r = m11415e(false, true);
        f24366s = m11414f(true);
        f24367t = m11414f(false);
        f24368u = C10976o0.m11404b();
        f24369v = C10976o0.m11399k();
        f24370w = C10976o0.m11401g();
        f24371x = C10976o0.m11400h();
        EnumC10882f fVar = EnumC10882f.f24155r;
        f24372y = m11413g(EnumC10882f.f24151n, EnumC10882f.f24153p, fVar);
        f24373z = m11413g(EnumC10899g.f24189k, EnumC10899g.f24190l, EnumC10899g.f24191m, EnumC10899g.f24194p);
        f38940A = m11413g(EnumC10882f.m11891d(), EnumC10882f.f24154q, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10971n(List<AbstractC8071l0.C8072a<U>> list, boolean z) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty) {
            this.f24374k = Collections.emptyList();
        } else {
            Collections.sort(list, f24368u);
            this.f24374k = Collections.unmodifiableList(list);
        }
        this.f24375l = !isEmpty && z;
    }

    /* renamed from: d */
    private int m11416d() {
        return mo11418a().size();
    }

    /* renamed from: e */
    private static C10972a<EnumC10882f> m11415e(boolean z, boolean z2) {
        String str;
        if (z) {
            if (z2) {
                str = "YYYY-DDD";
            } else {
                str = "YYYY-MM-DD";
            }
        } else if (z2) {
            str = "YYYYDDD";
        } else {
            str = "YYYYMMDD";
        }
        return C10972a.m11406k(EnumC10882f.class, str);
    }

    /* renamed from: f */
    private static C10972a<EnumC10899g> m11414f(boolean z) {
        String str;
        if (z) {
            str = "hh[:mm[:ss[,fffffffff]]]";
        } else {
            str = "hh[mm[ss[,fffffffff]]]";
        }
        return C10972a.m11406k(EnumC10899g.class, str);
    }

    /* renamed from: g */
    public static <U extends AbstractC11036w> AbstractC8067j0<U, C10971n<U>> m11413g(U... uArr) {
        return new C10973b(uArr, null);
    }

    /* renamed from: h */
    private boolean m11412h(AbstractC11036w wVar) {
        char a = wVar.mo11166a();
        return a >= '1' && a <= '9';
    }

    /* renamed from: j */
    public static <U extends AbstractC11036w> C10971n<U> m11410j() {
        return f24361n;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ff  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m11409k(int r22) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.C10971n.m11409k(int):java.lang.String");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 6);
    }

    @Override // p143hj.AbstractC8071l0
    /* renamed from: a */
    public List<AbstractC8071l0.C8072a<U>> mo11418a() {
        return this.f24374k;
    }

    /* renamed from: c */
    public boolean m11417c(AbstractC11036w wVar) {
        if (wVar == null) {
            return false;
        }
        boolean h = m11412h(wVar);
        int size = this.f24374k.size();
        for (int i = 0; i < size; i++) {
            AbstractC8071l0.C8072a<U> aVar = this.f24374k.get(i);
            U b = aVar.m20674b();
            if (b.equals(wVar) || (h && m11412h(b))) {
                if (aVar.m20675a() > 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10971n)) {
            return false;
        }
        C10971n nVar = (C10971n) C10971n.class.cast(obj);
        if (this.f24375l != nVar.f24375l || !mo11418a().equals(nVar.mo11418a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = mo11418a().hashCode();
        if (this.f24375l) {
            return hashCode ^ hashCode;
        }
        return hashCode;
    }

    /* renamed from: i */
    public boolean m11411i() {
        return this.f24375l;
    }

    public String toString() {
        return m11409k(0);
    }

    private C10971n() {
        this.f24374k = Collections.emptyList();
        this.f24375l = false;
    }
}
