package com.facebook.imagepipeline.nativecode;

import p026b6.AbstractC3387c;
import p026b6.AbstractC3388d;
import p170j5.C9489b;
import p170j5.C9490c;
import p394w3.AbstractC13731d;

@AbstractC13731d
/* loaded from: classes7.dex */
public class NativeJpegTranscoderFactory implements AbstractC3388d {

    /* renamed from: a */
    private final int f8347a;

    /* renamed from: b */
    private final boolean f8348b;

    /* renamed from: c */
    private final boolean f8349c;

    @AbstractC13731d
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.f8347a = i;
        this.f8348b = z;
        this.f8349c = z2;
    }

    @Override // p026b6.AbstractC3388d
    @AbstractC13731d
    public AbstractC3387c createImageTranscoder(C9490c cVar, boolean z) {
        if (cVar != C9489b.f21011a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f8347a, this.f8348b, this.f8349c);
    }
}
