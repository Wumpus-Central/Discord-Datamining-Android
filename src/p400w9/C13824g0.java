package p400w9;

import androidx.collection.C2094a;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
import p365u9.C13215a;
import p384v9.C13466c;

/* renamed from: w9.g0 */
/* loaded from: classes5.dex */
public final class C13824g0 {

    /* renamed from: a */
    private final C2094a<C13813b<?>, C13215a> f31135a;

    /* renamed from: b */
    private final C2094a<C13813b<?>, String> f31136b;

    /* renamed from: c */
    private final TaskCompletionSource<Map<C13813b<?>, String>> f31137c;

    /* renamed from: d */
    private int f31138d;

    /* renamed from: e */
    private boolean f31139e;

    /* renamed from: a */
    public final Set<C13813b<?>> m2562a() {
        return this.f31135a.keySet();
    }

    /* renamed from: b */
    public final void m2561b(C13813b<?> bVar, C13215a aVar, String str) {
        this.f31135a.put(bVar, aVar);
        this.f31136b.put(bVar, str);
        this.f31138d--;
        if (!aVar.m4294z()) {
            this.f31139e = true;
        }
        if (this.f31138d != 0) {
            return;
        }
        if (this.f31139e) {
            this.f31137c.m28901b(new C13466c(this.f31135a));
            return;
        }
        this.f31137c.m28900c(this.f31136b);
    }
}
