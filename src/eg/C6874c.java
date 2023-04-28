package eg;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014"}, m15073d2 = {"Leg/c;", "Leg/a;", "", "", "value", "", "g", "isEmpty", "other", "equals", "", "hashCode", "", "toString", ViewProps.START, "endInclusive", "<init>", "(CC)V", "o", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: eg.c */
/* loaded from: classes8.dex */
public final class C6874c extends C6872a {

    /* renamed from: o */
    public static final C6875a f15043o = new C6875a(null);

    /* renamed from: p */
    private static final C6874c f15044p = new C6874c(1, 0);

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Leg/c$a;", "", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: eg.c$a */
    /* loaded from: classes8.dex */
    public static final class C6875a {
        private C6875a() {
        }

        public /* synthetic */ C6875a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6874c(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6874c) {
            if (!isEmpty() || !((C6874c) obj).isEmpty()) {
                C6874c cVar = (C6874c) obj;
                if (!(m23991a() == cVar.m23991a() && m23990b() == cVar.m23990b())) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m23988g(char c) {
        return C9971q.m14631i(m23991a(), c) <= 0 && C9971q.m14631i(c, m23990b()) <= 0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m23991a() * 31) + m23990b();
    }

    public boolean isEmpty() {
        return C9971q.m14631i(m23991a(), m23990b()) > 0;
    }

    public String toString() {
        return m23991a() + ".." + m23990b();
    }
}
