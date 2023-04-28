package p228m7;

import p119g9.C7510a;

/* renamed from: m7.y */
/* loaded from: classes7.dex */
public interface AbstractC10534y {

    /* renamed from: m7.y$a */
    /* loaded from: classes7.dex */
    public static final class C10535a {

        /* renamed from: a */
        public final C10537z f23291a;

        /* renamed from: b */
        public final C10537z f23292b;

        public C10535a(C10537z zVar) {
            this(zVar, zVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10535a.class != obj.getClass()) {
                return false;
            }
            C10535a aVar = (C10535a) obj;
            if (!this.f23291a.equals(aVar.f23291a) || !this.f23292b.equals(aVar.f23292b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f23291a.hashCode() * 31) + this.f23292b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f23291a);
            if (this.f23291a.equals(this.f23292b)) {
                str = "";
            } else {
                str = ", " + this.f23292b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public C10535a(C10537z zVar, C10537z zVar2) {
            this.f23291a = (C10537z) C7510a.m22367e(zVar);
            this.f23292b = (C10537z) C7510a.m22367e(zVar2);
        }
    }

    /* renamed from: m7.y$b */
    /* loaded from: classes7.dex */
    public static class C10536b implements AbstractC10534y {

        /* renamed from: a */
        private final long f23293a;

        /* renamed from: b */
        private final C10535a f23294b;

        public C10536b(long j) {
            this(j, 0L);
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: f */
        public C10535a mo2208f(long j) {
            return this.f23294b;
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: h */
        public boolean mo2207h() {
            return false;
        }

        @Override // p228m7.AbstractC10534y
        /* renamed from: i */
        public long mo2206i() {
            return this.f23293a;
        }

        public C10536b(long j, long j2) {
            this.f23293a = j;
            this.f23294b = new C10535a(j2 == 0 ? C10537z.f23295c : new C10537z(0L, j2));
        }
    }

    /* renamed from: f */
    C10535a mo2208f(long j);

    /* renamed from: h */
    boolean mo2207h();

    /* renamed from: i */
    long mo2206i();
}
