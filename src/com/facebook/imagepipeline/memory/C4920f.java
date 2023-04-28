package com.facebook.imagepipeline.memory;

import com.facebook.common.references.CloseableReference;
import p005a4.AbstractC1262c;
import p394w3.C13740j;
import p437y5.AbstractC14227a0;
import p437y5.C14251v;
import p437y5.C14257z;
import p455z3.AbstractC14531c;

/* renamed from: com.facebook.imagepipeline.memory.f */
/* loaded from: classes7.dex */
public class C4920f {

    /* renamed from: a */
    private final AbstractC1262c<byte[]> f8332a;

    /* renamed from: b */
    final C4922b f8333b;

    /* renamed from: com.facebook.imagepipeline.memory.f$a */
    /* loaded from: classes7.dex */
    class C4921a implements AbstractC1262c<byte[]> {
        C4921a() {
        }

        /* renamed from: a */
        public void release(byte[] bArr) {
            C4920f.this.m31290b(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.f$b */
    /* loaded from: classes7.dex */
    public static class C4922b extends C4923g {
        public C4922b(AbstractC14531c cVar, C14257z zVar, AbstractC14227a0 a0Var) {
            super(cVar, zVar, a0Var);
        }

        @Override // com.facebook.imagepipeline.memory.AbstractC4914b
        /* renamed from: x */
        C4917c<byte[]> mo31288x(int i) {
            return new C4928k(mo31275p(i), this.f8314c.f32222g, 0);
        }
    }

    public C4920f(AbstractC14531c cVar, C14257z zVar) {
        boolean z;
        if (zVar.f32222g > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        this.f8333b = new C4922b(cVar, zVar, C14251v.m1263h());
        this.f8332a = new C4921a();
    }

    /* renamed from: a */
    public CloseableReference<byte[]> m31291a(int i) {
        return CloseableReference.m32033Y(this.f8333b.get(i), this.f8332a);
    }

    /* renamed from: b */
    public void m31290b(byte[] bArr) {
        this.f8333b.release(bArr);
    }
}
