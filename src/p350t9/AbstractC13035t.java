package p350t9;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: t9.t */
/* loaded from: classes5.dex */
abstract class AbstractC13035t<T> {

    /* renamed from: a */
    final int f29330a;

    /* renamed from: b */
    final TaskCompletionSource<T> f29331b = new TaskCompletionSource<>();

    /* renamed from: c */
    final int f29332c;

    /* renamed from: d */
    final Bundle f29333d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC13035t(int i, int i2, Bundle bundle) {
        this.f29330a = i;
        this.f29332c = i2;
        this.f29333d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo4713a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo4712b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m4715c(C13036u uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(uVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f29331b.m28901b(uVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m4714d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f29331b.m28900c(t);
    }

    public final String toString() {
        int i = this.f29332c;
        int i2 = this.f29330a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i);
        sb2.append(" id=");
        sb2.append(i2);
        sb2.append(" oneWay=");
        sb2.append(mo4712b());
        sb2.append("}");
        return sb2.toString();
    }
}
