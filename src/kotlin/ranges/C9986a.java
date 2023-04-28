package kotlin.ranges;

import ag.AbstractC1385a;
import com.facebook.react.uimanager.ViewProps;
import eg.C6876d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p267of.AbstractC11283p;
import p370uf.C13274c;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB!\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001d"}, m15073d2 = {"Lkotlin/ranges/a;", "", "", "Lof/p;", "g", "", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "k", "I", "a", "()I", "first", "l", "b", "last", "m", "f", "step", ViewProps.START, "endInclusive", "<init>", "(III)V", "n", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.ranges.a */
/* loaded from: classes8.dex */
public class C9986a implements Iterable<Integer>, AbstractC1385a {

    /* renamed from: n */
    public static final C0305a f22102n = new C0305a(null);

    /* renamed from: k */
    private final int f22103k;

    /* renamed from: l */
    private final int f22104l;

    /* renamed from: m */
    private final int f22105m;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, m15073d2 = {"Lkotlin/ranges/a$a;", "", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/a;", "a", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.ranges.a$a */
    /* loaded from: classes8.dex */
    public static final class C0305a {
        private C0305a() {
        }

        public /* synthetic */ C0305a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9986a m14601a(int i, int i2, int i3) {
            return new C9986a(i, i2, i3);
        }
    }

    public C9986a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f22103k = i;
            this.f22104l = C13274c.m4084c(i, i2, i3);
            this.f22105m = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final int m14605a() {
        return this.f22103k;
    }

    /* renamed from: b */
    public final int m14604b() {
        return this.f22104l;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9986a) {
            if (!isEmpty() || !((C9986a) obj).isEmpty()) {
                C9986a aVar = (C9986a) obj;
                if (!(this.f22103k == aVar.f22103k && this.f22104l == aVar.f22104l && this.f22105m == aVar.f22105m)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m14603f() {
        return this.f22105m;
    }

    /* renamed from: g */
    public AbstractC11283p iterator() {
        return new C6876d(this.f22103k, this.f22104l, this.f22105m);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f22103k * 31) + this.f22104l) * 31) + this.f22105m;
    }

    public boolean isEmpty() {
        if (this.f22105m > 0) {
            if (this.f22103k > this.f22104l) {
                return true;
            }
        } else if (this.f22103k < this.f22104l) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb2;
        if (this.f22105m > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f22103k);
            sb2.append("..");
            sb2.append(this.f22104l);
            sb2.append(" step ");
            i = this.f22105m;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f22103k);
            sb2.append(" downTo ");
            sb2.append(this.f22104l);
            sb2.append(" step ");
            i = -this.f22105m;
        }
        sb2.append(i);
        return sb2.toString();
    }
}
