package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.C4920f;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p394w3.AbstractC13731d;
import p394w3.C13740j;
import p455z3.AbstractC14535g;

@TargetApi(19)
@AbstractC13731d
/* loaded from: classes7.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c */
    private final C4920f f8357c;

    @AbstractC13731d
    public KitKatPurgeableDecoder(C4920f fVar) {
        this.f8357c = fVar;
    }

    /* renamed from: h */
    private static void m31237h(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: c */
    protected Bitmap mo31239c(CloseableReference<AbstractC14535g> closeableReference, BitmapFactory.Options options) {
        AbstractC14535g C = closeableReference.m32039C();
        int size = C.size();
        CloseableReference<byte[]> a = this.f8357c.m31291a(size);
        try {
            byte[] C2 = a.m32039C();
            C.mo266f(0, C2, 0, size);
            return (Bitmap) C13740j.m2833h(BitmapFactory.decodeByteArray(C2, 0, size, options), "BitmapFactory returned null");
        } finally {
            CloseableReference.m32025t(a);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: d */
    protected Bitmap mo31238d(CloseableReference<AbstractC14535g> closeableReference, int i, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z;
        if (DalvikPurgeableDecoder.m31266e(closeableReference, i)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f8342b;
        }
        AbstractC14535g C = closeableReference.m32039C();
        if (i <= C.size()) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        int i2 = i + 2;
        CloseableReference<byte[]> a = this.f8357c.m31291a(i2);
        try {
            byte[] C2 = a.m32039C();
            C.mo266f(0, C2, 0, i);
            if (bArr != null) {
                m31237h(C2, i);
                i = i2;
            }
            return (Bitmap) C13740j.m2833h(BitmapFactory.decodeByteArray(C2, 0, i, options), "BitmapFactory returned null");
        } finally {
            CloseableReference.m32025t(a);
        }
    }
}
