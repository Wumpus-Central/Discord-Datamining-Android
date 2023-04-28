package p315r6;

import java.util.Arrays;
import p279p6.EnumC11574d;
import p315r6.AbstractC12430o;

/* renamed from: r6.d */
/* loaded from: classes7.dex */
final class C12411d extends AbstractC12430o {

    /* renamed from: a */
    private final String f27945a;

    /* renamed from: b */
    private final byte[] f27946b;

    /* renamed from: c */
    private final EnumC11574d f27947c;

    /* renamed from: r6.d$b */
    /* loaded from: classes7.dex */
    static final class C12413b extends AbstractC12430o.AbstractC12431a {

        /* renamed from: a */
        private String f27948a;

        /* renamed from: b */
        private byte[] f27949b;

        /* renamed from: c */
        private EnumC11574d f27950c;

        @Override // p315r6.AbstractC12430o.AbstractC12431a
        /* renamed from: a */
        public AbstractC12430o mo6796a() {
            String str = "";
            if (this.f27948a == null) {
                str = str + " backendName";
            }
            if (this.f27950c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C12411d(this.f27948a, this.f27949b, this.f27950c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p315r6.AbstractC12430o.AbstractC12431a
        /* renamed from: b */
        public AbstractC12430o.AbstractC12431a mo6795b(String str) {
            if (str != null) {
                this.f27948a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // p315r6.AbstractC12430o.AbstractC12431a
        /* renamed from: c */
        public AbstractC12430o.AbstractC12431a mo6794c(byte[] bArr) {
            this.f27949b = bArr;
            return this;
        }

        @Override // p315r6.AbstractC12430o.AbstractC12431a
        /* renamed from: d */
        public AbstractC12430o.AbstractC12431a mo6793d(EnumC11574d dVar) {
            if (dVar != null) {
                this.f27950c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // p315r6.AbstractC12430o
    /* renamed from: b */
    public String mo6801b() {
        return this.f27945a;
    }

    @Override // p315r6.AbstractC12430o
    /* renamed from: c */
    public byte[] mo6800c() {
        return this.f27946b;
    }

    @Override // p315r6.AbstractC12430o
    /* renamed from: d */
    public EnumC11574d mo6799d() {
        return this.f27947c;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12430o)) {
            return false;
        }
        AbstractC12430o oVar = (AbstractC12430o) obj;
        if (this.f27945a.equals(oVar.mo6801b())) {
            byte[] bArr2 = this.f27946b;
            if (oVar instanceof C12411d) {
                bArr = ((C12411d) oVar).f27946b;
            } else {
                bArr = oVar.mo6800c();
            }
            if (Arrays.equals(bArr2, bArr) && this.f27947c.equals(oVar.mo6799d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f27945a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27946b)) * 1000003) ^ this.f27947c.hashCode();
    }

    private C12411d(String str, byte[] bArr, EnumC11574d dVar) {
        this.f27945a = str;
        this.f27946b = bArr;
        this.f27947c = dVar;
    }
}
