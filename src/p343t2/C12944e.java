package p343t2;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p126h2.AbstractC7761h0;
import p126h2.C7742c;

/* renamed from: t2.e */
/* loaded from: classes.dex */
public class C12944e implements AbstractC7761h0 {

    /* renamed from: a */
    private static final Set<String> f29026a = new HashSet();

    @Override // p126h2.AbstractC7761h0
    /* renamed from: a */
    public void mo5016a(String str) {
        mo5013d(str, null);
    }

    @Override // p126h2.AbstractC7761h0
    /* renamed from: b */
    public void mo5015b(String str, Throwable th2) {
        if (C7742c.f16781a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // p126h2.AbstractC7761h0
    /* renamed from: c */
    public void mo5014c(String str) {
        m5012e(str, null);
    }

    @Override // p126h2.AbstractC7761h0
    /* renamed from: d */
    public void mo5013d(String str, Throwable th2) {
        Set<String> set = f29026a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th2);
            set.add(str);
        }
    }

    /* renamed from: e */
    public void m5012e(String str, Throwable th2) {
        if (C7742c.f16781a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
