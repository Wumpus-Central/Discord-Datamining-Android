package net.time4j;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p143hj.AbstractC8080q;
import p143hj.AbstractC8085v;

/* renamed from: net.time4j.q */
/* loaded from: classes8.dex */
final class C10981q<T extends AbstractC8080q<T>> implements AbstractC8085v<T> {

    /* renamed from: k */
    private final char f24393k;

    /* renamed from: l */
    private final boolean f24394l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10981q(char c, boolean z) {
        this.f24393k = c;
        this.f24394l = z;
    }

    /* renamed from: a */
    public T apply(T t) {
        if (this.f24393k == '9') {
            return t;
        }
        AbstractC10966k0<Integer, C10906g0> k0Var = C10906g0.f38920M;
        int intValue = ((Integer) t.mo11371r(k0Var)).intValue();
        int intValue2 = ((Integer) t.mo11380b(k0Var)).intValue();
        char c = this.f24393k;
        int i = 0;
        if (c == '3') {
            int i2 = (intValue / 1000000) * 1000000;
            if (this.f24394l) {
                i = 999999;
            }
            return (T) t.mo15655B(k0Var, Math.min(intValue2, i2 + i));
        } else if (c == '6') {
            int i3 = (intValue / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            if (this.f24394l) {
                i = 999;
            }
            return (T) t.mo15655B(k0Var, Math.min(intValue2, i3 + i));
        } else {
            throw new UnsupportedOperationException("Unknown: " + this.f24393k);
        }
    }
}
