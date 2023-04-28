package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p335s6.AbstractC12791d;
import p335s6.AbstractC12797h;
import p335s6.AbstractC12803m;

@Keep
/* loaded from: classes7.dex */
public class CctBackendFactory implements AbstractC12791d {
    @Override // p335s6.AbstractC12791d
    public AbstractC12803m create(AbstractC12797h hVar) {
        return new C5141d(hVar.mo5465b(), hVar.mo5462e(), hVar.mo5463d());
    }
}
