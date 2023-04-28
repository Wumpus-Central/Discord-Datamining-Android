package eg;

import ag.AbstractC1385a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p267of.AbstractC11274g;
import p370uf.C13274c;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B!\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m15073d2 = {"Leg/a;", "", "", "Lof/g;", "f", "k", "C", "a", "()C", "first", "l", "b", "last", "", "m", "I", "getStep", "()I", "step", ViewProps.START, "endInclusive", "<init>", "(CCI)V", "n", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: eg.a */
/* loaded from: classes8.dex */
public class C6872a implements Iterable<Character>, AbstractC1385a {

    /* renamed from: n */
    public static final C0208a f15035n = new C0208a(null);

    /* renamed from: k */
    private final char f15036k;

    /* renamed from: l */
    private final char f15037l;

    /* renamed from: m */
    private final int f15038m;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Leg/a$a;", "", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: eg.a$a */
    /* loaded from: classes8.dex */
    public static final class C0208a {
        private C0208a() {
        }

        public /* synthetic */ C0208a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6872a(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i != Integer.MIN_VALUE) {
            this.f15036k = c;
            this.f15037l = (char) C13274c.m4084c(c, c2, i);
            this.f15038m = i;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final char m23991a() {
        return this.f15036k;
    }

    /* renamed from: b */
    public final char m23990b() {
        return this.f15037l;
    }

    /* renamed from: f */
    public AbstractC11274g iterator() {
        return new C6873b(this.f15036k, this.f15037l, this.f15038m);
    }
}
