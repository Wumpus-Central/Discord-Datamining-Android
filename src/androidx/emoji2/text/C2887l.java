package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.p018os.C2458t;
import androidx.core.util.C2517g;
import java.nio.ByteBuffer;
import p163j$.util.Spliterator;
import p187k1.C9717b;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
public final class C2887l {

    /* renamed from: a */
    private final C9717b f3904a;

    /* renamed from: b */
    private final char[] f3905b;

    /* renamed from: c */
    private final C2888a f3906c = new C2888a(Spliterator.IMMUTABLE);

    /* renamed from: d */
    private final Typeface f3907d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.l$a */
    /* loaded from: classes.dex */
    public static class C2888a {

        /* renamed from: a */
        private final SparseArray<C2888a> f3908a;

        /* renamed from: b */
        private C2873f f3909b;

        private C2888a() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C2888a m36375a(int i) {
            SparseArray<C2888a> sparseArray = this.f3908a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public final C2873f m36374b() {
            return this.f3909b;
        }

        /* renamed from: c */
        void m36373c(C2873f fVar, int i, int i2) {
            C2888a a = m36375a(fVar.m36433b(i));
            if (a == null) {
                a = new C2888a();
                this.f3908a.put(fVar.m36433b(i), a);
            }
            if (i2 > i) {
                a.m36373c(fVar, i + 1, i2);
            } else {
                a.f3909b = fVar;
            }
        }

        C2888a(int i) {
            this.f3908a = new SparseArray<>(i);
        }
    }

    private C2887l(Typeface typeface, C9717b bVar) {
        this.f3907d = typeface;
        this.f3904a = bVar;
        this.f3905b = new char[bVar.m15519k() * 2];
        m36383a(bVar);
    }

    /* renamed from: a */
    private void m36383a(C9717b bVar) {
        int k = bVar.m15519k();
        for (int i = 0; i < k; i++) {
            C2873f fVar = new C2873f(this, i);
            Character.toChars(fVar.m36429f(), this.f3905b, i * 2);
            m36376h(fVar);
        }
    }

    /* renamed from: b */
    public static C2887l m36382b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            C2458t.m37717a("EmojiCompat.MetadataRepo.create");
            return new C2887l(typeface, C2883k.m36390b(byteBuffer));
        } finally {
            C2458t.m37716b();
        }
    }

    /* renamed from: c */
    public char[] m36381c() {
        return this.f3905b;
    }

    /* renamed from: d */
    public C9717b m36380d() {
        return this.f3904a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m36379e() {
        return this.f3904a.m15518l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C2888a m36378f() {
        return this.f3906c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Typeface m36377g() {
        return this.f3907d;
    }

    /* renamed from: h */
    void m36376h(C2873f fVar) {
        boolean z;
        C2517g.m37587h(fVar, "emoji metadata cannot be null");
        if (fVar.m36432c() > 0) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "invalid metadata codepoint length");
        this.f3906c.m36373c(fVar, 0, fVar.m36432c() - 1);
    }
}
