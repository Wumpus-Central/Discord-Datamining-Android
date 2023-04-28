package p335s6;

import java.util.Arrays;
import p315r6.AbstractC12420i;
import p335s6.AbstractC12793f;

/* renamed from: s6.a */
/* loaded from: classes7.dex */
final class C12787a extends AbstractC12793f {

    /* renamed from: a */
    private final Iterable<AbstractC12420i> f28709a;

    /* renamed from: b */
    private final byte[] f28710b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s6.a$b */
    /* loaded from: classes7.dex */
    public static final class C12788b extends AbstractC12793f.AbstractC12794a {

        /* renamed from: a */
        private Iterable<AbstractC12420i> f28711a;

        /* renamed from: b */
        private byte[] f28712b;

        @Override // p335s6.AbstractC12793f.AbstractC12794a
        /* renamed from: a */
        public AbstractC12793f mo5475a() {
            String str = "";
            if (this.f28711a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C12787a(this.f28711a, this.f28712b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p335s6.AbstractC12793f.AbstractC12794a
        /* renamed from: b */
        public AbstractC12793f.AbstractC12794a mo5474b(Iterable<AbstractC12420i> iterable) {
            if (iterable != null) {
                this.f28711a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // p335s6.AbstractC12793f.AbstractC12794a
        /* renamed from: c */
        public AbstractC12793f.AbstractC12794a mo5473c(byte[] bArr) {
            this.f28712b = bArr;
            return this;
        }
    }

    @Override // p335s6.AbstractC12793f
    /* renamed from: b */
    public Iterable<AbstractC12420i> mo5477b() {
        return this.f28709a;
    }

    @Override // p335s6.AbstractC12793f
    /* renamed from: c */
    public byte[] mo5476c() {
        return this.f28710b;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12793f)) {
            return false;
        }
        AbstractC12793f fVar = (AbstractC12793f) obj;
        if (this.f28709a.equals(fVar.mo5477b())) {
            byte[] bArr2 = this.f28710b;
            if (fVar instanceof C12787a) {
                bArr = ((C12787a) fVar).f28710b;
            } else {
                bArr = fVar.mo5476c();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f28709a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f28710b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f28709a + ", extras=" + Arrays.toString(this.f28710b) + "}";
    }

    private C12787a(Iterable<AbstractC12420i> iterable, byte[] bArr) {
        this.f28709a = iterable;
        this.f28710b = bArr;
    }
}
