package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p339sf.AbstractC12885a;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m15073d2 = {"Lkotlinx/coroutines/j0;", "Lsf/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "l", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/String;)V", "m", "a", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.j0 */
/* loaded from: classes8.dex */
public final class C10130j0 extends AbstractC12885a {

    /* renamed from: m */
    public static final C10131a f22339m = new C10131a(null);

    /* renamed from: l */
    private final String f22340l;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m15073d2 = {"Lkotlinx/coroutines/j0$a;", "Lkotlin/coroutines/CoroutineContext$c;", "Lkotlinx/coroutines/j0;", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.j0$a */
    /* loaded from: classes8.dex */
    public static final class C10131a implements CoroutineContext.AbstractC9926c<C10130j0> {
        private C10131a() {
        }

        public /* synthetic */ C10131a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C10130j0(String str) {
        super(f22339m);
        this.f22340l = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10130j0) && C9971q.m14638b(this.f22340l, ((C10130j0) obj).f22340l);
    }

    public int hashCode() {
        return this.f22340l.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f22340l + ')';
    }
}
