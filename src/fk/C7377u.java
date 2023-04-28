package fk;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001f"}, m15073d2 = {"Lfk/u;", "", "d", "f", "b", "segment", "c", "", "byteCount", "e", "", "a", "sink", "g", "", "[B", "data", "I", "pos", "limit", "", "Z", "shared", "owner", "Lfk/u;", "next", "prev", "<init>", "()V", "([BIIZZ)V", "h", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.u */
/* loaded from: classes8.dex */
public final class C7377u {

    /* renamed from: h */
    public static final C7378a f15885h = new C7378a(null);

    /* renamed from: a */
    public final byte[] f15886a;

    /* renamed from: b */
    public int f15887b;

    /* renamed from: c */
    public int f15888c;

    /* renamed from: d */
    public boolean f15889d;

    /* renamed from: e */
    public boolean f15890e;

    /* renamed from: f */
    public C7377u f15891f;

    /* renamed from: g */
    public C7377u f15892g;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lfk/u$a;", "", "", "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: fk.u$a */
    /* loaded from: classes8.dex */
    public static final class C7378a {
        private C7378a() {
        }

        public /* synthetic */ C7378a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C7377u() {
        this.f15886a = new byte[8192];
        this.f15890e = true;
        this.f15889d = false;
    }

    /* renamed from: a */
    public final void m22779a() {
        boolean z;
        C7377u uVar = this.f15892g;
        int i = 0;
        if (uVar != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C9971q.m14636d(uVar);
            if (uVar.f15890e) {
                int i2 = this.f15888c - this.f15887b;
                C7377u uVar2 = this.f15892g;
                C9971q.m14636d(uVar2);
                int i3 = 8192 - uVar2.f15888c;
                C7377u uVar3 = this.f15892g;
                C9971q.m14636d(uVar3);
                if (!uVar3.f15889d) {
                    C7377u uVar4 = this.f15892g;
                    C9971q.m14636d(uVar4);
                    i = uVar4.f15887b;
                }
                if (i2 <= i3 + i) {
                    C7377u uVar5 = this.f15892g;
                    C9971q.m14636d(uVar5);
                    m22773g(uVar5, i2);
                    m22778b();
                    C7379v.m22771b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final C7377u m22778b() {
        C7377u uVar = this.f15891f;
        if (uVar == this) {
            uVar = null;
        }
        C7377u uVar2 = this.f15892g;
        C9971q.m14636d(uVar2);
        uVar2.f15891f = this.f15891f;
        C7377u uVar3 = this.f15891f;
        C9971q.m14636d(uVar3);
        uVar3.f15892g = this.f15892g;
        this.f15891f = null;
        this.f15892g = null;
        return uVar;
    }

    /* renamed from: c */
    public final C7377u m22777c(C7377u segment) {
        C9971q.m14633g(segment, "segment");
        segment.f15892g = this;
        segment.f15891f = this.f15891f;
        C7377u uVar = this.f15891f;
        C9971q.m14636d(uVar);
        uVar.f15892g = segment;
        this.f15891f = segment;
        return segment;
    }

    /* renamed from: d */
    public final C7377u m22776d() {
        this.f15889d = true;
        return new C7377u(this.f15886a, this.f15887b, this.f15888c, true, false);
    }

    /* renamed from: e */
    public final C7377u m22775e(int i) {
        boolean z;
        C7377u uVar;
        if (i <= 0 || i > this.f15888c - this.f15887b) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i >= 1024) {
                uVar = m22776d();
            } else {
                uVar = C7379v.m22770c();
                byte[] bArr = this.f15886a;
                byte[] bArr2 = uVar.f15886a;
                int i2 = this.f15887b;
                C9897e.m14988g(bArr, bArr2, 0, i2, i2 + i, 2, null);
            }
            uVar.f15888c = uVar.f15887b + i;
            this.f15887b += i;
            C7377u uVar2 = this.f15892g;
            C9971q.m14636d(uVar2);
            uVar2.m22777c(uVar);
            return uVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final C7377u m22774f() {
        byte[] bArr = this.f15886a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C9971q.m14634f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C7377u(copyOf, this.f15887b, this.f15888c, false, true);
    }

    /* renamed from: g */
    public final void m22773g(C7377u sink, int i) {
        C9971q.m14633g(sink, "sink");
        if (sink.f15890e) {
            int i2 = sink.f15888c;
            if (i2 + i > 8192) {
                if (!sink.f15889d) {
                    int i3 = sink.f15887b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = sink.f15886a;
                        C9897e.m14988g(bArr, bArr, 0, i3, i2, 2, null);
                        sink.f15888c -= sink.f15887b;
                        sink.f15887b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f15886a;
            byte[] bArr3 = sink.f15886a;
            int i4 = sink.f15888c;
            int i5 = this.f15887b;
            C9897e.m14990e(bArr2, bArr3, i4, i5, i5 + i);
            sink.f15888c += i;
            this.f15887b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C7377u(byte[] data, int i, int i2, boolean z, boolean z2) {
        C9971q.m14633g(data, "data");
        this.f15886a = data;
        this.f15887b = i;
        this.f15888c = i2;
        this.f15889d = z;
        this.f15890e = z2;
    }
}
