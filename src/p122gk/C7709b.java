package p122gk;

import fk.C7380w;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.ByteString;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a$\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m15073d2 = {"Lokio/ByteString;", "", "algorithm", "d", "Lfk/w;", "e", "Lokio/Buffer;", "buffer", "", "offset", "byteCount", "", "f", "", "c", "g", "", "s", "codePointCount", "", "a", "[C", "h", "()[C", "HEX_DIGIT_CHARS", "okio"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: gk.b */
/* loaded from: classes8.dex */
public final class C7709b {

    /* renamed from: a */
    private static final char[] f16736a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
        return -1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m21584c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p122gk.C7709b.m21584c(byte[], int):int");
    }

    /* renamed from: d */
    public static final ByteString m21583d(ByteString commonDigest, String algorithm) {
        C9971q.m14633g(commonDigest, "$this$commonDigest");
        C9971q.m14633g(algorithm, "algorithm");
        AbstractC7710c a = C7711d.m21578a(algorithm);
        a.update(commonDigest.m9712g(), 0, commonDigest.m9697v());
        return new ByteString(a.mo21577a());
    }

    /* renamed from: e */
    public static final ByteString m21582e(C7380w commonSegmentDigest, String algorithm) {
        C9971q.m14633g(commonSegmentDigest, "$this$commonSegmentDigest");
        C9971q.m14633g(algorithm, "algorithm");
        AbstractC7710c a = C7711d.m21578a(algorithm);
        int length = commonSegmentDigest.m22768F().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = commonSegmentDigest.m22769E()[length + i];
            int i4 = commonSegmentDigest.m22769E()[i];
            a.update(commonSegmentDigest.m22768F()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new ByteString(a.mo21577a());
    }

    /* renamed from: f */
    public static final void m21581f(ByteString commonWrite, Buffer buffer, int i, int i2) {
        C9971q.m14633g(commonWrite, "$this$commonWrite");
        C9971q.m14633g(buffer, "buffer");
        buffer.write(commonWrite.m9712g(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final int m21580g(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: h */
    public static final char[] m21579h() {
        return f16736a;
    }
}
