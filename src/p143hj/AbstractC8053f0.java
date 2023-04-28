package p143hj;

import net.time4j.p248tz.AbstractC11001k;

/* renamed from: hj.f0 */
/* loaded from: classes8.dex */
public abstract class AbstractC8053f0 {

    /* renamed from: a */
    public static final AbstractC8053f0 f17431a = m20738a(0);

    /* renamed from: b */
    public static final AbstractC8053f0 f17432b = m20738a(-21600);

    /* renamed from: c */
    public static final AbstractC8053f0 f17433c = m20738a(21600);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hj.f0$b */
    /* loaded from: classes8.dex */
    public static class C8055b extends AbstractC8053f0 {

        /* renamed from: d */
        private final int f17434d;

        @Override // p143hj.AbstractC8053f0
        /* renamed from: b */
        public int mo20737b(AbstractC8056g gVar, AbstractC11001k kVar) {
            return this.f17434d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8055b) || this.f17434d != ((C8055b) obj).f17434d) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f17434d;
        }

        public String toString() {
            return "FixedStartOfDay[" + this.f17434d + "]";
        }

        private C8055b(int i) {
            this.f17434d = i;
        }
    }

    protected AbstractC8053f0() {
    }

    /* renamed from: a */
    private static AbstractC8053f0 m20738a(int i) {
        return new C8055b(i);
    }

    /* renamed from: b */
    public abstract int mo20737b(AbstractC8056g gVar, AbstractC11001k kVar);
}
