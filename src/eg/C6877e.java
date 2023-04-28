package eg;

import ag.AbstractC1385a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p267of.AbstractC11284q;
import p370uf.C13274c;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B!\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001e"}, m15073d2 = {"Leg/e;", "", "", "Lof/q;", "g", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "k", "J", "a", "()J", "first", "l", "b", "last", "m", "f", "step", ViewProps.START, "endInclusive", "<init>", "(JJJ)V", "n", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: eg.e */
/* loaded from: classes8.dex */
public class C6877e implements Iterable<Long>, AbstractC1385a {

    /* renamed from: n */
    public static final C6878a f15049n = new C6878a(null);

    /* renamed from: k */
    private final long f15050k;

    /* renamed from: l */
    private final long f15051l;

    /* renamed from: m */
    private final long f15052m;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, m15073d2 = {"Leg/e$a;", "", "", "rangeStart", "rangeEnd", "step", "Leg/e;", "a", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: eg.e$a */
    /* loaded from: classes8.dex */
    public static final class C6878a {
        private C6878a() {
        }

        public /* synthetic */ C6878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6877e m23983a(long j, long j2, long j3) {
            return new C6877e(j, j2, j3);
        }
    }

    public C6877e(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f15050k = j;
            this.f15051l = C13274c.m4083d(j, j2, j3);
            this.f15052m = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final long m23987a() {
        return this.f15050k;
    }

    /* renamed from: b */
    public final long m23986b() {
        return this.f15051l;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6877e) {
            if (!isEmpty() || !((C6877e) obj).isEmpty()) {
                C6877e eVar = (C6877e) obj;
                if (!(this.f15050k == eVar.f15050k && this.f15051l == eVar.f15051l && this.f15052m == eVar.f15052m)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m23985f() {
        return this.f15052m;
    }

    /* renamed from: g */
    public AbstractC11284q iterator() {
        return new C6879f(this.f15050k, this.f15051l, this.f15052m);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.f15050k;
        long j3 = this.f15051l;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.f15052m;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        int i = (this.f15052m > 0L ? 1 : (this.f15052m == 0L ? 0 : -1));
        long j = this.f15050k;
        long j2 = this.f15051l;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    public String toString() {
        long j;
        StringBuilder sb2;
        if (this.f15052m > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f15050k);
            sb2.append("..");
            sb2.append(this.f15051l);
            sb2.append(" step ");
            j = this.f15052m;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f15050k);
            sb2.append(" downTo ");
            sb2.append(this.f15051l);
            sb2.append(" step ");
            j = -this.f15052m;
        }
        sb2.append(j);
        return sb2.toString();
    }
}
