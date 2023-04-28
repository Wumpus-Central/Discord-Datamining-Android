package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p187k1.C9717b;

/* renamed from: androidx.emoji2.text.k */
/* loaded from: classes.dex */
class C2883k {

    /* renamed from: androidx.emoji2.text.k$a */
    /* loaded from: classes.dex */
    private static class C2884a implements AbstractC2886c {

        /* renamed from: a */
        private final ByteBuffer f3901a;

        C2884a(ByteBuffer byteBuffer) {
            this.f3901a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.C2883k.AbstractC2886c
        /* renamed from: a */
        public void mo36386a(int i) {
            ByteBuffer byteBuffer = this.f3901a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.C2883k.AbstractC2886c
        /* renamed from: b */
        public int mo36385b() {
            return this.f3901a.getInt();
        }

        @Override // androidx.emoji2.text.C2883k.AbstractC2886c
        /* renamed from: c */
        public long mo36384c() {
            return C2883k.m36389c(this.f3901a.getInt());
        }

        @Override // androidx.emoji2.text.C2883k.AbstractC2886c
        public long getPosition() {
            return this.f3901a.position();
        }

        @Override // androidx.emoji2.text.C2883k.AbstractC2886c
        public int readUnsignedShort() {
            return C2883k.m36388d(this.f3901a.getShort());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.k$b */
    /* loaded from: classes.dex */
    public static class C2885b {

        /* renamed from: a */
        private final long f3902a;

        /* renamed from: b */
        private final long f3903b;

        C2885b(long j, long j2) {
            this.f3902a = j;
            this.f3903b = j2;
        }

        /* renamed from: a */
        long m36387a() {
            return this.f3902a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.k$c */
    /* loaded from: classes.dex */
    public interface AbstractC2886c {
        /* renamed from: a */
        void mo36386a(int i);

        /* renamed from: b */
        int mo36385b();

        /* renamed from: c */
        long mo36384c();

        long getPosition();

        int readUnsignedShort();
    }

    /* renamed from: a */
    private static C2885b m36391a(AbstractC2886c cVar) {
        long j;
        cVar.mo36386a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.mo36386a(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int b = cVar.mo36385b();
                cVar.mo36386a(4);
                j = cVar.mo36384c();
                cVar.mo36386a(4);
                if (1835365473 == b) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo36386a((int) (j - cVar.getPosition()));
                cVar.mo36386a(12);
                long c = cVar.mo36384c();
                for (int i2 = 0; i2 < c; i2++) {
                    int b2 = cVar.mo36385b();
                    long c2 = cVar.mo36384c();
                    long c3 = cVar.mo36384c();
                    if (1164798569 == b2 || 1701669481 == b2) {
                        return new C2885b(c2 + j, c3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C9717b m36390b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m36391a(new C2884a(duplicate)).m36387a());
        return C9717b.m15522h(duplicate);
    }

    /* renamed from: c */
    static long m36389c(int i) {
        return i & 4294967295L;
    }

    /* renamed from: d */
    static int m36388d(short s) {
        return s & 65535;
    }
}
