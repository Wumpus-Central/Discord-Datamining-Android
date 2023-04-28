package p400w9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p384v9.C13465b;

/* renamed from: w9.m */
/* loaded from: classes5.dex */
public class C13835m {
    /* renamed from: a */
    public static void m2549a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        m2548b(status, null, taskCompletionSource);
    }

    /* renamed from: b */
    public static <TResult> void m2548b(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.m29108z()) {
            taskCompletionSource.m28900c(tresult);
        } else {
            taskCompletionSource.m28901b(new C13465b(status));
        }
    }
}
