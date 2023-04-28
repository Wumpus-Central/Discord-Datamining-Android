package p213l9;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzft;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: l9.b */
/* loaded from: classes5.dex */
public final class C10361b extends C10363d {

    /* renamed from: h */
    private static List<Runnable> f22739h = new ArrayList();

    /* renamed from: e */
    private boolean f22740e;

    /* renamed from: f */
    private Set<Object> f22741f = new HashSet();

    /* renamed from: g */
    private boolean f22742g;

    public C10361b(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* renamed from: c */
    public static void m13544c() {
        synchronized (C10361b.class) {
            List<Runnable> list = f22739h;
            if (list != null) {
                for (Runnable runnable : list) {
                    runnable.run();
                }
                f22739h = null;
            }
        }
    }

    /* renamed from: b */
    public void m13545b(boolean z) {
        this.f22742g = z;
    }

    /* renamed from: d */
    public final void m13543d() {
        zzft zzq = m13542a().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            m13545b(zzq.zzc());
        }
        zzq.zzf();
        this.f22740e = true;
    }
}
