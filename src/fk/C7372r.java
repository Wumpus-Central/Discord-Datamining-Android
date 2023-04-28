package fk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m15073d2 = {"Lfk/r;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", "close", "k", "Lokio/Buffer;", "buffer", "Lfk/u;", "l", "Lfk/u;", "expectedSegment", "", "m", "I", "expectedPos", "", "n", "Z", "closed", "o", "J", "pos", "Lokio/BufferedSource;", "p", "Lokio/BufferedSource;", "upstream", "<init>", "(Lokio/BufferedSource;)V", "okio"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: fk.r */
/* loaded from: classes8.dex */
public final class C7372r implements Source {

    /* renamed from: k */
    private final Buffer f15871k;

    /* renamed from: l */
    private C7377u f15872l;

    /* renamed from: m */
    private int f15873m;

    /* renamed from: n */
    private boolean f15874n;

    /* renamed from: o */
    private long f15875o;

    /* renamed from: p */
    private final BufferedSource f15876p;

    public C7372r(BufferedSource upstream) {
        int i;
        C9971q.m14633g(upstream, "upstream");
        this.f15876p = upstream;
        Buffer c = upstream.mo9734c();
        this.f15871k = c;
        C7377u uVar = c.f25530k;
        this.f15872l = uVar;
        if (uVar != null) {
            i = uVar.f15887b;
        } else {
            i = -1;
        }
        this.f15873m = i;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15874n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 == r6.f15887b) goto L_0x002a;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C9971q.m14633g(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f15874n
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x007b
            fk.u r5 = r8.f15872l
            if (r5 == 0) goto L_0x002a
            okio.Buffer r6 = r8.f15871k
            fk.u r6 = r6.f25530k
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f15873m
            kotlin.jvm.internal.C9971q.m14636d(r6)
            int r6 = r6.f15887b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x006f
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            okio.BufferedSource r0 = r8.f15876p
            long r1 = r8.f15875o
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo9738P(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            fk.u r0 = r8.f15872l
            if (r0 != 0) goto L_0x0053
            okio.Buffer r0 = r8.f15871k
            fk.u r0 = r0.f25530k
            if (r0 == 0) goto L_0x0053
            r8.f15872l = r0
            kotlin.jvm.internal.C9971q.m14636d(r0)
            int r0 = r0.f15887b
            r8.f15873m = r0
        L_0x0053:
            okio.Buffer r0 = r8.f15871k
            long r0 = r0.size()
            long r2 = r8.f15875o
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.f15871k
            long r4 = r8.f15875o
            r3 = r9
            r6 = r10
            r2.m9760s(r3, r4, r6)
            long r0 = r8.f15875o
            long r0 = r0 + r10
            r8.f15875o = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.C7372r.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f15876p.timeout();
    }
}
