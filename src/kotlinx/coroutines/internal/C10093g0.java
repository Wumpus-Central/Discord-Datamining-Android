package kotlinx.coroutines.internal;

import com.facebook.react.uimanager.ViewDefaults;
import kotlin.Metadata;
import p326ri.C12717t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\u000b"}, m15073d2 = {"", "propertyName", "", "defaultValue", "c", "", "minValue", "maxValue", "a", "", "b", "kotlinx-coroutines-core"}, m15072k = 5, m15071mv = {1, 6, 0}, m15068xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: kotlinx.coroutines.internal.g0 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10093g0 {
    /* renamed from: a */
    public static final int m14312a(String str, int i, int i2, int i3) {
        return (int) C10089e0.m14327c(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m14311b(String str, long j, long j2, long j3) {
        Long o;
        String d = C10089e0.m14326d(str);
        if (d == null) {
            return j;
        }
        o = C12717t.m5745o(d);
        if (o != null) {
            long longValue = o.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m14310c(String str, boolean z) {
        String d = C10089e0.m14326d(str);
        return d != null ? Boolean.parseBoolean(d) : z;
    }

    /* renamed from: d */
    public static /* synthetic */ int m14309d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = ViewDefaults.NUMBER_OF_LINES;
        }
        return C10089e0.m14328b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m14308e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C10089e0.m14327c(str, j, j2, j3);
    }
}
