package p003a2;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: a2.c */
/* loaded from: classes.dex */
public class C1246c implements AbstractC1254h {

    /* renamed from: a */
    private static final String[] f89a = new String[0];

    @Override // p003a2.AbstractC1254h
    /* renamed from: a */
    public String[] mo41520a() {
        return f89a;
    }

    @Override // p003a2.AbstractC1254h
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
