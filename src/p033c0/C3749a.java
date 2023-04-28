package p033c0;

import androidx.camera.core.ImageProxy;
import p020b0.C3336a;
import p020b0.C3338c;
import p390w.C13639n0;

/* renamed from: c0.a */
/* loaded from: classes.dex */
public class C3749a {
    /* renamed from: a */
    public boolean m33696a() {
        C3338c cVar = (C3338c) C3336a.m34622a(C3338c.class);
        if (cVar != null) {
            return cVar.m34618c(C13639n0.f30458g);
        }
        return true;
    }

    /* renamed from: b */
    public boolean m33695b(ImageProxy imageProxy) {
        C3338c cVar = (C3338c) C3336a.m34622a(C3338c.class);
        if ((cVar == null || cVar.m34618c(C13639n0.f30458g)) && imageProxy.getFormat() == 256) {
            return true;
        }
        return false;
    }
}
