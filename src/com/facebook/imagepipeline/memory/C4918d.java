package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import p394w3.C13740j;
import p437y5.AbstractC14227a0;
import p437y5.AbstractC14235h;
import p437y5.C14257z;
import p455z3.AbstractC14531c;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.memory.d */
/* loaded from: classes7.dex */
public class C4918d extends AbstractC4914b<Bitmap> implements AbstractC14235h {
    public C4918d(AbstractC14531c cVar, C14257z zVar, AbstractC14227a0 a0Var, boolean z) {
        super(cVar, zVar, a0Var, z);
        m31312s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public Bitmap mo31279g(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void mo31278k(Bitmap bitmap) {
        C13740j.m2834g(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public int mo31276o(Bitmap bitmap) {
        C13740j.m2834g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public Bitmap mo31293q(C4917c<Bitmap> cVar) {
        Bitmap bitmap = (Bitmap) super.mo31293q(cVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo31274u(Bitmap bitmap) {
        C13740j.m2834g(bitmap);
        if (bitmap.isRecycled() || !bitmap.isMutable()) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC4914b
    /* renamed from: n */
    protected int mo31277n(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC4914b
    /* renamed from: p */
    protected int mo31275p(int i) {
        return i;
    }
}
