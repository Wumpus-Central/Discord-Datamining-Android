package bj;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003H ¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038 X \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lbj/q1;", "Array", "", "", "requiredCapacity", "", "b", "(I)V", "a", "()Ljava/lang/Object;", "d", "()I", ViewProps.POSITION, "<init>", "()V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.q1 */
/* loaded from: classes8.dex */
public abstract class AbstractC3693q1<Array> {
    /* renamed from: c */
    public static /* synthetic */ void m33811c(AbstractC3693q1 q1Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = q1Var.mo33747d() + 1;
            }
            q1Var.mo33748b(i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
    }

    /* renamed from: a */
    public abstract Array mo33749a();

    /* renamed from: b */
    public abstract void mo33748b(int i);

    /* renamed from: d */
    public abstract int mo33747d();
}
