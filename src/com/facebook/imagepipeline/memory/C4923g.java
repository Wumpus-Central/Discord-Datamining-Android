package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.AbstractC4914b;
import p394w3.C13740j;
import p437y5.AbstractC14227a0;
import p437y5.C14257z;
import p455z3.AbstractC14529a;
import p455z3.AbstractC14531c;

/* renamed from: com.facebook.imagepipeline.memory.g */
/* loaded from: classes7.dex */
public class C4923g extends AbstractC4914b<byte[]> implements AbstractC14529a {

    /* renamed from: k */
    private final int[] f8335k;

    public C4923g(AbstractC14531c cVar, C14257z zVar, AbstractC14227a0 a0Var) {
        super(cVar, zVar, a0Var);
        SparseIntArray sparseIntArray = (SparseIntArray) C13740j.m2834g(zVar.f32218c);
        this.f8335k = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f8335k[i] = sparseIntArray.keyAt(i);
        }
        m31312s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public byte[] mo31279g(int i) {
        return new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void mo31278k(byte[] bArr) {
        C13740j.m2834g(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public int mo31276o(byte[] bArr) {
        C13740j.m2834g(bArr);
        return bArr.length;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC4914b
    /* renamed from: n */
    protected int mo31277n(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f8335k) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new AbstractC4914b.C0121b(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC4914b
    /* renamed from: p */
    public int mo31275p(int i) {
        return i;
    }
}
