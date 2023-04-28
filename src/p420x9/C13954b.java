package p420x9;

import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import p384v9.C13465b;

/* renamed from: x9.b */
/* loaded from: classes5.dex */
public class C13954b {
    /* renamed from: a */
    public static C13465b m2200a(Status status) {
        if (status.m29109u()) {
            return new ResolvableApiException(status);
        }
        return new C13465b(status);
    }
}
