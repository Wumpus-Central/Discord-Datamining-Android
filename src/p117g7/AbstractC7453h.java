package p117g7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p119g9.C7557q0;

/* renamed from: g7.h */
/* loaded from: classes7.dex */
public interface AbstractC7453h {

    /* renamed from: a */
    public static final ByteBuffer f16082a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: g7.h$a */
    /* loaded from: classes7.dex */
    public static final class C7454a {

        /* renamed from: e */
        public static final C7454a f16083e = new C7454a(-1, -1, -1);

        /* renamed from: a */
        public final int f16084a;

        /* renamed from: b */
        public final int f16085b;

        /* renamed from: c */
        public final int f16086c;

        /* renamed from: d */
        public final int f16087d;

        public C7454a(int i, int i2, int i3) {
            int i4;
            this.f16084a = i;
            this.f16085b = i2;
            this.f16086c = i3;
            if (C7557q0.m22132p0(i3)) {
                i4 = C7557q0.m22158c0(i3, i2);
            } else {
                i4 = -1;
            }
            this.f16087d = i4;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f16084a + ", channelCount=" + this.f16085b + ", encoding=" + this.f16086c + ']';
        }
    }

    /* renamed from: g7.h$b */
    /* loaded from: classes7.dex */
    public static final class C7455b extends Exception {
        public C7455b(C7454a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: b */
    boolean mo22412b();

    /* renamed from: c */
    boolean mo22411c();

    /* renamed from: d */
    ByteBuffer mo22410d();

    /* renamed from: e */
    C7454a mo22409e(C7454a aVar);

    /* renamed from: f */
    void mo22405f(ByteBuffer byteBuffer);

    void flush();

    /* renamed from: g */
    void mo22408g();

    void reset();
}
