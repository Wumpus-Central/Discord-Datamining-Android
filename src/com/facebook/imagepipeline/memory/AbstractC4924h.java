package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.AbstractC4914b;
import p394w3.C13740j;
import p437y5.AbstractC14227a0;
import p437y5.AbstractC14248s;
import p437y5.C14257z;
import p455z3.AbstractC14531c;

/* renamed from: com.facebook.imagepipeline.memory.h */
/* loaded from: classes7.dex */
public abstract class AbstractC4924h extends AbstractC4914b<AbstractC14248s> {

    /* renamed from: k */
    private final int[] f8336k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4924h(AbstractC14531c cVar, C14257z zVar, AbstractC14227a0 a0Var) {
        super(cVar, zVar, a0Var);
        SparseIntArray sparseIntArray = (SparseIntArray) C13740j.m2834g(zVar.f32218c);
        this.f8336k = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f8336k;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                m31312s();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public abstract AbstractC14248s mo31279g(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void mo31278k(AbstractC14248s sVar) {
        C13740j.m2834g(sVar);
        sVar.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public int mo31276o(AbstractC14248s sVar) {
        C13740j.m2834g(sVar);
        return sVar.getSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public int m31281D() {
        return this.f8336k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo31274u(AbstractC14248s sVar) {
        C13740j.m2834g(sVar);
        return !sVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC4914b
    /* renamed from: n */
    protected int mo31277n(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f8336k) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new AbstractC4914b.C0121b(Integer.valueOf(i));
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC4914b
    /* renamed from: p */
    protected int mo31275p(int i) {
        return i;
    }
}
