package p355u;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import p272p.C11502b;
import p340t.C12921i;
import p340t.C12926n;

/* renamed from: u.g */
/* loaded from: classes.dex */
public class C13167g {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m4430a(int i, C11502b.C11503a aVar) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        if (((C12926n) C12921i.m5067a(C12926n.class)) != null) {
            if (i == 0) {
                key = CaptureRequest.CONTROL_ENABLE_ZSL;
                aVar.m9553e(key, Boolean.TRUE);
            } else if (i == 1) {
                key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                aVar.m9553e(key2, Boolean.FALSE);
            }
        }
    }
}
