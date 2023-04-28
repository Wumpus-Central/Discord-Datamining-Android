package p354ti;

import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC10034f2;
import kotlinx.coroutines.internal.AbstractC10121t;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m15073d2 = {"Lti/a;", "Lkotlinx/coroutines/internal/t;", "", "allFactories", "Lkotlinx/coroutines/f2;", "b", "", "a", "", "c", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ti.a */
/* loaded from: classes8.dex */
public final class C13135a implements AbstractC10121t {
    @Override // kotlinx.coroutines.internal.AbstractC10121t
    /* renamed from: a */
    public String mo4551a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.AbstractC10121t
    /* renamed from: b */
    public AbstractC10034f2 mo4550b(List<? extends AbstractC10121t> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C13138d(C13142f.m4536a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.AbstractC10121t
    /* renamed from: c */
    public int mo4549c() {
        return 1073741823;
    }
}
