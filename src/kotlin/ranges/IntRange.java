package kotlin.ranges;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0016"}, m15073d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "", "", "value", "", "contains", "isEmpty", "other", "equals", "hashCode", "", "toString", "p", "()Ljava/lang/Integer;", ViewProps.START, "j", "endInclusive", "<init>", "(II)V", "o", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class IntRange extends C9986a {

    /* renamed from: o */
    public static final C9985a f22100o = new C9985a(null);

    /* renamed from: p */
    private static final IntRange f22101p = new IntRange(1, 0);

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m15073d2 = {"Lkotlin/ranges/IntRange$a;", "", "Lkotlin/ranges/IntRange;", "EMPTY", "Lkotlin/ranges/IntRange;", "a", "()Lkotlin/ranges/IntRange;", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.ranges.IntRange$a */
    /* loaded from: classes8.dex */
    public static final class C9985a {
        private C9985a() {
        }

        public /* synthetic */ C9985a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final IntRange m14606a() {
            return IntRange.f22101p;
        }
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean contains(int i) {
        return m14605a() <= i && i <= m14604b();
    }

    @Override // kotlin.ranges.C9986a
    public boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (!(m14605a() == intRange.m14605a() && m14604b() == intRange.m14604b())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.C9986a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m14605a() * 31) + m14604b();
    }

    @Override // kotlin.ranges.C9986a
    public boolean isEmpty() {
        return m14605a() > m14604b();
    }

    /* renamed from: j */
    public Integer m14608j() {
        return Integer.valueOf(m14604b());
    }

    /* renamed from: p */
    public Integer m14607p() {
        return Integer.valueOf(m14605a());
    }

    @Override // kotlin.ranges.C9986a
    public String toString() {
        return m14605a() + ".." + m14604b();
    }
}
