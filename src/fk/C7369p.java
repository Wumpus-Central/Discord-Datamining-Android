package fk;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.ByteString;
import p267of.AbstractC11267c;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0014B!\b\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m15073d2 = {"Lfk/p;", "Lof/c;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "f", "", "l", "[Lokio/ByteString;", "g", "()[Lokio/ByteString;", "byteStrings", "", "m", "[I", "i", "()[I", "trie", "a", "()I", "size", "<init>", "([Lokio/ByteString;[I)V", "n", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.p */
/* loaded from: classes8.dex */
public final class C7369p extends AbstractC11267c<ByteString> implements RandomAccess {

    /* renamed from: n */
    public static final C7370a f15866n = new C7370a(null);

    /* renamed from: l */
    private final ByteString[] f15867l;

    /* renamed from: m */
    private final int[] f15868m;

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00020\u0002*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m15073d2 = {"Lfk/p$a;", "", "", "nodeOffset", "Lokio/Buffer;", "node", "", "byteStringOffset", "", "Lokio/ByteString;", "byteStrings", "fromIndex", "toIndex", "indexes", "", "a", "", "Lfk/p;", "d", "([Lokio/ByteString;)Lfk/p;", "c", "(Lokio/Buffer;)J", "intCount", "<init>", "()V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: fk.p$a */
    /* loaded from: classes8.dex */
    public static final class C7370a {
        private C7370a() {
        }

        public /* synthetic */ C7370a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m22789a(long j, Buffer buffer, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            int i7;
            Buffer buffer2;
            boolean z3;
            int i8 = i;
            if (i2 < i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (((ByteString) list.get(i9)).m9697v() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = (ByteString) list.get(i2);
                ByteString byteString2 = (ByteString) list.get(i3 - 1);
                int i10 = -1;
                if (i8 == byteString.m9697v()) {
                    int i11 = i2 + 1;
                    i4 = i11;
                    i5 = list2.get(i2).intValue();
                    byteString = (ByteString) list.get(i11);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (byteString.m9713f(i8) != byteString2.m9713f(i8)) {
                    int i12 = 1;
                    for (int i13 = i4 + 1; i13 < i3; i13++) {
                        if (((ByteString) list.get(i13 - 1)).m9713f(i8) != ((ByteString) list.get(i13)).m9713f(i8)) {
                            i12++;
                        }
                    }
                    long c = j + m22787c(buffer) + 2 + (i12 * 2);
                    buffer.writeInt(i12);
                    buffer.writeInt(i5);
                    for (int i14 = i4; i14 < i3; i14++) {
                        byte f = ((ByteString) list.get(i14)).m9713f(i8);
                        if (i14 == i4 || f != ((ByteString) list.get(i14 - 1)).m9713f(i8)) {
                            buffer.writeInt(f & 255);
                        }
                    }
                    Buffer buffer3 = new Buffer();
                    while (i4 < i3) {
                        byte f2 = ((ByteString) list.get(i4)).m9713f(i8);
                        int i15 = i4 + 1;
                        int i16 = i15;
                        while (true) {
                            if (i16 >= i3) {
                                i6 = i3;
                                break;
                            } else if (f2 != ((ByteString) list.get(i16)).m9713f(i8)) {
                                i6 = i16;
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (i15 == i6 && i8 + 1 == ((ByteString) list.get(i4)).m9697v()) {
                            buffer.writeInt(list2.get(i4).intValue());
                            i7 = i6;
                            buffer2 = buffer3;
                        } else {
                            buffer.writeInt(((int) (c + m22787c(buffer3))) * i10);
                            i7 = i6;
                            buffer2 = buffer3;
                            m22789a(c, buffer3, i8 + 1, list, i4, i6, list2);
                        }
                        buffer3 = buffer2;
                        i4 = i7;
                        i10 = -1;
                    }
                    buffer.mo9748N(buffer3);
                    return;
                }
                int min = Math.min(byteString.m9697v(), byteString2.m9697v());
                int i17 = 0;
                for (int i18 = i8; i18 < min && byteString.m9713f(i18) == byteString2.m9713f(i18); i18++) {
                    i17++;
                }
                long c2 = j + m22787c(buffer) + 2 + i17 + 1;
                buffer.writeInt(-i17);
                buffer.writeInt(i5);
                int i19 = i8 + i17;
                while (i8 < i19) {
                    buffer.writeInt(byteString.m9713f(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i19 == ((ByteString) list.get(i4)).m9697v()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        buffer.writeInt(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                Buffer buffer4 = new Buffer();
                buffer.writeInt(((int) (m22787c(buffer4) + c2)) * (-1));
                m22789a(c2, buffer4, i19, list, i4, i3, list2);
                buffer.mo9748N(buffer4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m22788b(C7370a aVar, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m22789a((i4 & 1) != 0 ? 0L : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: c */
        private final long m22787c(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
            continue;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final fk.C7369p m22786d(okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fk.C7369p.C7370a.m22786d(okio.ByteString[]):fk.p");
        }
    }

    public /* synthetic */ C7369p(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    /* renamed from: r */
    public static final C7369p m22790r(ByteString... byteStringArr) {
        return f15866n.m22786d(byteStringArr);
    }

    @Override // p267of.AbstractC11263a
    /* renamed from: a */
    public int mo5832a() {
        return this.f15867l.length;
    }

    /* renamed from: b */
    public /* bridge */ boolean m22796b(ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // p267of.AbstractC11263a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return m22796b((ByteString) obj);
        }
        return false;
    }

    /* renamed from: f */
    public ByteString get(int i) {
        return this.f15867l[i];
    }

    /* renamed from: g */
    public final ByteString[] m22794g() {
        return this.f15867l;
    }

    /* renamed from: i */
    public final int[] m22793i() {
        return this.f15868m;
    }

    @Override // p267of.AbstractC11267c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return m22792j((ByteString) obj);
        }
        return -1;
    }

    /* renamed from: j */
    public /* bridge */ int m22792j(ByteString byteString) {
        return super.indexOf(byteString);
    }

    @Override // p267of.AbstractC11267c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return m22791p((ByteString) obj);
        }
        return -1;
    }

    /* renamed from: p */
    public /* bridge */ int m22791p(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    private C7369p(ByteString[] byteStringArr, int[] iArr) {
        this.f15867l = byteStringArr;
        this.f15868m = iArr;
    }
}
