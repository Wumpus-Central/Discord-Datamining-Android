package eg;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014"}, m15073d2 = {"Leg/g;", "Leg/e;", "", "", "value", "", "j", "isEmpty", "other", "equals", "", "hashCode", "", "toString", ViewProps.START, "endInclusive", "<init>", "(JJ)V", "o", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: eg.g */
/* loaded from: classes8.dex */
public final class C6880g extends C6877e {

    /* renamed from: o */
    public static final C6881a f15057o = new C6881a(null);

    /* renamed from: p */
    private static final C6880g f15058p = new C6880g(1, 0);

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m15073d2 = {"Leg/g$a;", "", "Leg/g;", "EMPTY", "Leg/g;", "a", "()Leg/g;", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: eg.g$a */
    /* loaded from: classes8.dex */
    public static final class C6881a {
        private C6881a() {
        }

        public /* synthetic */ C6881a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6880g m23980a() {
            return C6880g.f15058p;
        }
    }

    public C6880g(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // eg.C6877e
    public boolean equals(Object obj) {
        if (obj instanceof C6880g) {
            if (!isEmpty() || !((C6880g) obj).isEmpty()) {
                C6880g gVar = (C6880g) obj;
                if (!(m23987a() == gVar.m23987a() && m23986b() == gVar.m23986b())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // eg.C6877e
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (m23987a() ^ (m23987a() >>> 32))) + (m23986b() ^ (m23986b() >>> 32)));
    }

    @Override // eg.C6877e
    public boolean isEmpty() {
        return m23987a() > m23986b();
    }

    /* renamed from: j */
    public boolean m23981j(long j) {
        return m23987a() <= j && j <= m23986b();
    }

    @Override // eg.C6877e
    public String toString() {
        return m23987a() + ".." + m23986b();
    }
}
