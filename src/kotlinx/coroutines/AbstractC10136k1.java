package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p339sf.AbstractC12886b;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lkotlinx/coroutines/k1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "<init>", "()V", "m", "a", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.k1 */
/* loaded from: classes8.dex */
public abstract class AbstractC10136k1 extends CoroutineDispatcher implements Closeable {

    /* renamed from: m */
    public static final C10137a f22341m = new C10137a(null);

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m15073d2 = {"Lkotlinx/coroutines/k1$a;", "Lsf/b;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/k1;", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.k1$a */
    /* loaded from: classes8.dex */
    public static final class C10137a extends AbstractC12886b<CoroutineDispatcher, AbstractC10136k1> {

        @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "it", "Lkotlinx/coroutines/k1;", "a", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/k1;"}, m15072k = 3, m15071mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.k1$a$a */
        /* loaded from: classes8.dex */
        static final class C0310a extends AbstractC9973s implements Function1<CoroutineContext.AbstractC9924b, AbstractC10136k1> {

            /* renamed from: k */
            public static final C0310a f22342k = new C0310a();

            C0310a() {
                super(1);
            }

            /* renamed from: a */
            public final AbstractC10136k1 invoke(CoroutineContext.AbstractC9924b bVar) {
                if (bVar instanceof AbstractC10136k1) {
                    return (AbstractC10136k1) bVar;
                }
                return null;
            }
        }

        private C10137a() {
            super(CoroutineDispatcher.f22118l, C0310a.f22342k);
        }

        public /* synthetic */ C10137a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
