package p308r;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import p308r.C12306v0;

/* renamed from: r.w0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C12310w0 {
    /* renamed from: a */
    public static C12306v0.AbstractC12308b m7167a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new C12254a1(context);
        }
        if (i >= 28) {
            return C12316z0.m7158g(context);
        }
        return C12258b1.m7259f(context, handler);
    }
}
