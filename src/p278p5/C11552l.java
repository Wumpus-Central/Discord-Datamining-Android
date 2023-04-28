package p278p5;

import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.concurrent.TimeUnit;

/* renamed from: p5.l */
/* loaded from: classes7.dex */
public class C11552l implements Supplier<MemoryCacheParams> {

    /* renamed from: a */
    private static final long f25792a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    private int m9390b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    /* renamed from: a */
    public MemoryCacheParams get() {
        int b = m9390b();
        return new MemoryCacheParams(b, ViewDefaults.NUMBER_OF_LINES, b, ViewDefaults.NUMBER_OF_LINES, b / 8, f25792a);
    }
}
