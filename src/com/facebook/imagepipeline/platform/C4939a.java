package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.util.C2517g;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.imageutils.C5064a;
import p437y5.AbstractC14235h;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.platform.a */
/* loaded from: classes7.dex */
public class C4939a extends AbstractC4940b {
    public C4939a(AbstractC14235h hVar, int i, Pools$SynchronizedPool pools$SynchronizedPool) {
        super(hVar, i, pools$SynchronizedPool);
    }

    @Override // com.facebook.imagepipeline.platform.AbstractC4940b
    /* renamed from: d */
    public int mo31231d(int i, int i2, BitmapFactory.Options options) {
        return C5064a.m30860d(i, i2, (Bitmap.Config) C2517g.m37588g(options.inPreferredConfig));
    }
}
