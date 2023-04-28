package nf;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, m15073d2 = {"T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "a", "Lnf/p;", "mode", "b", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/LazyKt")
/* renamed from: nf.n */
/* loaded from: classes8.dex */
public class C11084n {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: nf.n$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C11085a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24601a;

        static {
            int[] iArr = new int[EnumC11087p.values().length];
            try {
                iArr[EnumC11087p.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11087p.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11087p.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24601a = iArr;
        }
    }

    /* renamed from: a */
    public static <T> Lazy<T> m10945a(Function0<? extends T> initializer) {
        C9971q.m14633g(initializer, "initializer");
        return new C11096v(initializer, null, 2, null);
    }

    /* renamed from: b */
    public static <T> Lazy<T> m10944b(EnumC11087p mode, Function0<? extends T> initializer) {
        C9971q.m14633g(mode, "mode");
        C9971q.m14633g(initializer, "initializer");
        int i = C11085a.f24601a[mode.ordinal()];
        if (i == 1) {
            return new C11096v(initializer, null, 2, null);
        }
        if (i == 2) {
            return new C11094u(initializer);
        }
        if (i == 3) {
            return new C11078j0(initializer);
        }
        throw new C11088q();
    }
}
