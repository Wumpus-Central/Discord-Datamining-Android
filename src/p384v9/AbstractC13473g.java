package p384v9;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p384v9.AbstractC13478k;

/* renamed from: v9.g */
/* loaded from: classes5.dex */
public abstract class AbstractC13473g<R extends AbstractC13478k> {

    /* renamed from: v9.g$a */
    /* loaded from: classes5.dex */
    public interface AbstractC13474a {
        /* renamed from: a */
        void mo2080a(Status status);
    }

    public abstract void addStatusListener(AbstractC13474a aVar);

    public abstract R await(long j, TimeUnit timeUnit);
}
