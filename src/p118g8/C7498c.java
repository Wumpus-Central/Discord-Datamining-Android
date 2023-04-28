package p118g8;

import java.nio.ByteBuffer;
import p119g9.C7544l0;
import p119g9.C7569x;
import p119g9.C7570y;
import p459z7.AbstractC14585h;
import p459z7.C14576a;
import p459z7.C14582e;

/* renamed from: g8.c */
/* loaded from: classes7.dex */
public final class C7498c extends AbstractC14585h {

    /* renamed from: a */
    private final C7570y f16251a = new C7570y();

    /* renamed from: b */
    private final C7569x f16252b = new C7569x();

    /* renamed from: c */
    private C7544l0 f16253c;

    @Override // p459z7.AbstractC14585h
    /* renamed from: b */
    protected C14576a mo161b(C14582e eVar, ByteBuffer byteBuffer) {
        C14576a.AbstractC14577b bVar;
        C7544l0 l0Var = this.f16253c;
        if (l0Var == null || eVar.f33049s != l0Var.m22261e()) {
            C7544l0 l0Var2 = new C7544l0(eVar.f17800o);
            this.f16253c = l0Var2;
            l0Var2.m22265a(eVar.f17800o - eVar.f33049s);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f16251a.m22019N(array, limit);
        this.f16252b.m22037o(array, limit);
        this.f16252b.m22034r(39);
        long h = (this.f16252b.m22044h(1) << 32) | this.f16252b.m22044h(32);
        this.f16252b.m22034r(20);
        int h2 = this.f16252b.m22044h(12);
        int h3 = this.f16252b.m22044h(8);
        this.f16251a.m22016Q(14);
        if (h3 == 0) {
            bVar = new C7502e();
        } else if (h3 == 255) {
            bVar = C7496a.m22398a(this.f16251a, h2, h);
        } else if (h3 == 4) {
            bVar = C7504f.m22388a(this.f16251a);
        } else if (h3 == 5) {
            bVar = C7499d.m22395a(this.f16251a, h, this.f16253c);
        } else if (h3 != 6) {
            bVar = null;
        } else {
            bVar = C7508g.m22375a(this.f16251a, h, this.f16253c);
        }
        if (bVar == null) {
            return new C14576a(new C14576a.AbstractC14577b[0]);
        }
        return new C14576a(bVar);
    }
}
