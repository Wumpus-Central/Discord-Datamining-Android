package cg;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p370uf.C13273b;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\r"}, m15073d2 = {"Lcg/c;", "", "", "bitCount", "b", "c", "from", "until", "d", "<init>", "()V", "k", "a", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cg.c */
/* loaded from: classes8.dex */
public abstract class AbstractC4002c {

    /* renamed from: k */
    public static final C4003a f6576k = new C4003a(null);

    /* renamed from: l */
    private static final AbstractC4002c f6577l = C13273b.f29800a.mo2414b();

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m15073d2 = {"Lcg/c$a;", "Lcg/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "bitCount", "b", "c", "from", "until", "d", "defaultRandom", "Lcg/c;", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: cg.c$a */
    /* loaded from: classes8.dex */
    public static final class C4003a extends AbstractC4002c implements Serializable {
        private C4003a() {
        }

        public /* synthetic */ C4003a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // cg.AbstractC4002c
        /* renamed from: b */
        public int mo33126b(int i) {
            return AbstractC4002c.f6577l.mo33126b(i);
        }

        @Override // cg.AbstractC4002c
        /* renamed from: c */
        public int mo33125c() {
            return AbstractC4002c.f6577l.mo33125c();
        }

        @Override // cg.AbstractC4002c
        /* renamed from: d */
        public int mo25537d(int i, int i2) {
            return AbstractC4002c.f6577l.mo25537d(i, i2);
        }
    }

    /* renamed from: b */
    public abstract int mo33126b(int i);

    /* renamed from: c */
    public abstract int mo33125c();

    /* renamed from: d */
    public int mo25537d(int i, int i2) {
        int i3;
        int c;
        int i4;
        int c2;
        boolean z;
        C4004d.m33123b(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i3 = mo33126b(C4004d.m33122c(i5));
            } else {
                do {
                    c = mo33125c() >>> 1;
                    i4 = c % i5;
                } while ((c - i4) + (i5 - 1) < 0);
                i3 = i4;
            }
            return i + i3;
        }
        do {
            c2 = mo33125c();
            z = false;
            if (i <= c2 && c2 < i2) {
                z = true;
                continue;
            }
        } while (!z);
        return c2;
    }
}
