package p350t9;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import p064db.AbstractC6421a;

/* renamed from: t9.z */
/* loaded from: classes5.dex */
public final /* synthetic */ class C13041z implements AbstractC6421a {

    /* renamed from: a */
    public static final /* synthetic */ C13041z f29344a = new C13041z();

    private /* synthetic */ C13041z() {
    }

    @Override // p064db.AbstractC6421a
    /* renamed from: a */
    public final Object mo4702a(Task task) {
        if (task.mo28858o()) {
            return (Bundle) task.mo28862k();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.mo28863j());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.mo28863j());
    }
}
