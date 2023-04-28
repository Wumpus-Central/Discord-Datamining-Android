package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nf.C11088q;
import p339sf.C12892e;
import p429xi.C14169a;
import p429xi.C14170b;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JY\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\b\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m15073d2 = {"Lkotlinx/coroutines/l0;", "", "R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "receiver", "completion", "", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "", "c", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "n", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.l0 */
/* loaded from: classes8.dex */
public enum EnumC10140l0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: kotlinx.coroutines.l0$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C10141a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22349a;

        static {
            int[] iArr = new int[EnumC10140l0.values().length];
            iArr[EnumC10140l0.DEFAULT.ordinal()] = 1;
            iArr[EnumC10140l0.ATOMIC.ordinal()] = 2;
            iArr[EnumC10140l0.UNDISPATCHED.ordinal()] = 3;
            iArr[EnumC10140l0.LAZY.ordinal()] = 4;
            f22349a = iArr;
        }
    }

    /* renamed from: b */
    public final <R, T> void m14171b(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        int i = C10141a.f22349a[ordinal()];
        if (i == 1) {
            C14169a.m1467e(function2, r, continuation, null, 4, null);
        } else if (i == 2) {
            C12892e.m5179a(function2, r, continuation);
        } else if (i == 3) {
            C14170b.m1466a(function2, r, continuation);
        } else if (i != 4) {
            throw new C11088q();
        }
    }

    /* renamed from: c */
    public final boolean m14170c() {
        return this == LAZY;
    }
}
