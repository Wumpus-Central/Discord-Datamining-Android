package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;
import p095f4.C7014c;
import p170j5.C9489b;
import p170j5.C9490c;
import p394w3.AbstractC13731d;
import p394w3.C13740j;

@AbstractC13731d
/* loaded from: classes7.dex */
public class WebpTranscoderImpl implements AbstractC4937i {
    @AbstractC13731d
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i);

    @AbstractC13731d
    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream);

    @Override // com.facebook.imagepipeline.nativecode.AbstractC4937i
    /* renamed from: a */
    public void mo31247a(InputStream inputStream, OutputStream outputStream) {
        C4936h.m31248a();
        nativeTranscodeWebpToPng((InputStream) C13740j.m2834g(inputStream), (OutputStream) C13740j.m2834g(outputStream));
    }

    @Override // com.facebook.imagepipeline.nativecode.AbstractC4937i
    /* renamed from: b */
    public boolean mo31246b(C9490c cVar) {
        if (cVar == C9489b.f21016f) {
            return true;
        }
        if (cVar == C9489b.f21017g || cVar == C9489b.f21018h || cVar == C9489b.f21019i) {
            return C7014c.f15299c;
        }
        if (cVar == C9489b.f21020j) {
            return false;
        }
        throw new IllegalArgumentException("Image format is not a WebP.");
    }

    @Override // com.facebook.imagepipeline.nativecode.AbstractC4937i
    /* renamed from: c */
    public void mo31245c(InputStream inputStream, OutputStream outputStream, int i) {
        C4936h.m31248a();
        nativeTranscodeWebpToJpeg((InputStream) C13740j.m2834g(inputStream), (OutputStream) C13740j.m2834g(outputStream), i);
    }
}
