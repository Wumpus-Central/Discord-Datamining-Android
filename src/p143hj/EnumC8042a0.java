package p143hj;

import net.time4j.base.C10813c;

/* renamed from: hj.a0 */
/* loaded from: classes8.dex */
public enum EnumC8042a0 implements AbstractC8079p<Long> {
    UTC(2441317),
    UNIX(2440587),
    MODIFIED_JULIAN_DATE(2400000),
    EXCEL(2415019),
    ANSI(2305812),
    RATA_DIE(1721424),
    JULIAN_DAY_NUMBER(-1),
    LILIAN_DAY_NUMBER(2299159);
    
    private final int offset;

    /* renamed from: hj.a0$a */
    /* loaded from: classes8.dex */
    private static class C8043a<D extends AbstractC8080q<D>> implements AbstractC8091z<D, Long> {

        /* renamed from: k */
        private final EnumC8042a0 f17424k;

        /* renamed from: l */
        private final AbstractC8068k<D> f17425l;

        C8043a(EnumC8042a0 a0Var, AbstractC8068k<D> kVar) {
            this.f17424k = a0Var;
            this.f17425l = kVar;
        }

        /* renamed from: a */
        public AbstractC8079p<?> mo11086b(D d) {
            return null;
        }

        /* renamed from: e */
        public AbstractC8079p<?> mo11085c(D d) {
            return null;
        }

        /* renamed from: f */
        public Long mo11084d(D d) {
            return Long.valueOf(this.f17424k.m20754h(this.f17425l.mo11791a() + 730, EnumC8042a0.UNIX));
        }

        /* renamed from: i */
        public Long mo11078k(D d) {
            return Long.valueOf(this.f17424k.m20754h(this.f17425l.mo11788d() + 730, EnumC8042a0.UNIX));
        }

        /* renamed from: j */
        public Long mo11076n(D d) {
            return Long.valueOf(this.f17424k.m20754h(this.f17425l.mo11789c(d) + 730, EnumC8042a0.UNIX));
        }

        /* renamed from: o */
        public boolean mo11081h(D d, Long l) {
            if (l == null) {
                return false;
            }
            try {
                long m = C10813c.m12190m(EnumC8042a0.UNIX.m20754h(l.longValue(), this.f17424k), 730L);
                if (m > this.f17425l.mo11791a()) {
                    return false;
                }
                if (m >= this.f17425l.mo11788d()) {
                    return true;
                }
                return false;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }

        /* renamed from: p */
        public D mo11077m(D d, Long l, boolean z) {
            if (l != null) {
                return this.f17425l.mo11790b(C10813c.m12190m(EnumC8042a0.UNIX.m20754h(l.longValue(), this.f17424k), 730L));
            }
            throw new IllegalArgumentException("Missing epoch day value.");
        }
    }

    EnumC8042a0(int i) {
        this.offset = (i - 2440587) - 730;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: M */
    public boolean mo11063M() {
        return true;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: U */
    public boolean mo11061U() {
        return false;
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: a */
    public char mo11060a() {
        return this == MODIFIED_JULIAN_DATE ? 'g' : (char) 0;
    }

    /* renamed from: b */
    public int compare(AbstractC8077o oVar, AbstractC8077o oVar2) {
        return ((Long) oVar.mo11371r(this)).compareTo((Long) oVar2.mo11371r(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public <D extends AbstractC8080q<D>> AbstractC8091z<D, Long> m20757c(AbstractC8068k<D> kVar) {
        return new C8043a(this, kVar);
    }

    /* renamed from: d */
    public Long mo11059f() {
        return Long.valueOf(365241779741L - this.offset);
    }

    /* renamed from: g */
    public Long mo11062T() {
        return Long.valueOf((-365243219892L) - this.offset);
    }

    @Override // p143hj.AbstractC8079p
    public Class<Long> getType() {
        return Long.class;
    }

    /* renamed from: h */
    public long m20754h(long j, EnumC8042a0 a0Var) {
        try {
            return C10813c.m12197f(j, a0Var.offset - this.offset);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // p143hj.AbstractC8079p
    /* renamed from: i */
    public boolean mo11088i() {
        return false;
    }
}
