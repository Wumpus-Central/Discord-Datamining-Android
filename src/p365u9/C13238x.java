package p365u9;

import android.content.Context;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u9.x */
/* loaded from: classes5.dex */
public final class C13238x {

    /* renamed from: a */
    static final AbstractBinderC13236v f29710a = new BinderC13230p(AbstractBinderC13234t.m4253c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final AbstractBinderC13236v f29711b = new BinderC13231q(AbstractBinderC13234t.m4253c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final AbstractBinderC13236v f29712c = new BinderC13232r(AbstractBinderC13234t.m4253c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final AbstractBinderC13236v f29713d = new BinderC13233s(AbstractBinderC13234t.m4253c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: e */
    private static final Object f29714e = new Object();

    /* renamed from: f */
    private static Context f29715f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m4250a(Context context) {
        synchronized (C13238x.class) {
            if (f29715f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f29715f = context.getApplicationContext();
            }
        }
    }
}
