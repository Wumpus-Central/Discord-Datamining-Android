package cc;

import java.util.Comparator;
import p103fc.C7112a;
import p103fc.C7115d;
import p103fc.C7118f;

/* renamed from: cc.x */
/* loaded from: classes3.dex */
public abstract class AbstractC3966x {

    /* renamed from: a */
    private static final AbstractC3966x f6527a = new C3967a();

    /* renamed from: b */
    private static final AbstractC3966x f6528b = new C3968b(-1);

    /* renamed from: c */
    private static final AbstractC3966x f6529c = new C3968b(1);

    /* renamed from: cc.x$a */
    /* loaded from: classes3.dex */
    class C3967a extends AbstractC3966x {
        C3967a() {
            super(null);
        }

        @Override // cc.AbstractC3966x
        /* renamed from: d */
        public AbstractC3966x mo33233d(int i, int i2) {
            return m33234k(C7115d.m23364d(i, i2));
        }

        @Override // cc.AbstractC3966x
        /* renamed from: e */
        public AbstractC3966x mo33232e(long j, long j2) {
            return m33234k(C7118f.m23353a(j, j2));
        }

        @Override // cc.AbstractC3966x
        /* renamed from: f */
        public <T> AbstractC3966x mo33231f(T t, T t2, Comparator<T> comparator) {
            return m33234k(comparator.compare(t, t2));
        }

        @Override // cc.AbstractC3966x
        /* renamed from: g */
        public AbstractC3966x mo33230g(boolean z, boolean z2) {
            return m33234k(C7112a.m23369a(z, z2));
        }

        @Override // cc.AbstractC3966x
        /* renamed from: h */
        public AbstractC3966x mo33229h(boolean z, boolean z2) {
            return m33234k(C7112a.m23369a(z2, z));
        }

        @Override // cc.AbstractC3966x
        /* renamed from: i */
        public int mo33228i() {
            return 0;
        }

        /* renamed from: k */
        AbstractC3966x m33234k(int i) {
            return i < 0 ? AbstractC3966x.f6528b : i > 0 ? AbstractC3966x.f6529c : AbstractC3966x.f6527a;
        }
    }

    /* renamed from: cc.x$b */
    /* loaded from: classes3.dex */
    private static final class C3968b extends AbstractC3966x {

        /* renamed from: d */
        final int f6530d;

        C3968b(int i) {
            super(null);
            this.f6530d = i;
        }

        @Override // cc.AbstractC3966x
        /* renamed from: d */
        public AbstractC3966x mo33233d(int i, int i2) {
            return this;
        }

        @Override // cc.AbstractC3966x
        /* renamed from: e */
        public AbstractC3966x mo33232e(long j, long j2) {
            return this;
        }

        @Override // cc.AbstractC3966x
        /* renamed from: f */
        public <T> AbstractC3966x mo33231f(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // cc.AbstractC3966x
        /* renamed from: g */
        public AbstractC3966x mo33230g(boolean z, boolean z2) {
            return this;
        }

        @Override // cc.AbstractC3966x
        /* renamed from: h */
        public AbstractC3966x mo33229h(boolean z, boolean z2) {
            return this;
        }

        @Override // cc.AbstractC3966x
        /* renamed from: i */
        public int mo33228i() {
            return this.f6530d;
        }
    }

    private AbstractC3966x() {
    }

    /* synthetic */ AbstractC3966x(C3967a aVar) {
        this();
    }

    /* renamed from: j */
    public static AbstractC3966x m33235j() {
        return f6527a;
    }

    /* renamed from: d */
    public abstract AbstractC3966x mo33233d(int i, int i2);

    /* renamed from: e */
    public abstract AbstractC3966x mo33232e(long j, long j2);

    /* renamed from: f */
    public abstract <T> AbstractC3966x mo33231f(T t, T t2, Comparator<T> comparator);

    /* renamed from: g */
    public abstract AbstractC3966x mo33230g(boolean z, boolean z2);

    /* renamed from: h */
    public abstract AbstractC3966x mo33229h(boolean z, boolean z2);

    /* renamed from: i */
    public abstract int mo33228i();
}
