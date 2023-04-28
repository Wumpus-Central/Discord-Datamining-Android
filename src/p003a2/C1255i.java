package p003a2;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p184jk.C9687a;

/* renamed from: a2.i */
/* loaded from: classes.dex */
public class C1255i implements AbstractC1254h {

    /* renamed from: a */
    WebViewProviderFactoryBoundaryInterface f117a;

    public C1255i(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f117a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // p003a2.AbstractC1254h
    /* renamed from: a */
    public String[] mo41520a() {
        return this.f117a.getSupportedFeatures();
    }

    @Override // p003a2.AbstractC1254h
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C9687a.m15593a(WebkitToCompatConverterBoundaryInterface.class, this.f117a.getWebkitToCompatConverter());
    }
}
