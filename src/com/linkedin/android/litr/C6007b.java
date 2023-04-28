package com.linkedin.android.litr;

import android.media.MediaFormat;
import ie.AbstractC8390a;
import ie.AbstractC8391b;
import p266oe.AbstractC11261c;
import p266oe.AbstractC11262d;
import pe.AbstractC11647i;

/* renamed from: com.linkedin.android.litr.b */
/* loaded from: classes6.dex */
public class C6007b {

    /* renamed from: a */
    private final AbstractC11261c f12167a;

    /* renamed from: b */
    private final AbstractC8390a f12168b;

    /* renamed from: c */
    private final AbstractC11647i f12169c;

    /* renamed from: d */
    private final AbstractC8391b f12170d;

    /* renamed from: e */
    private final AbstractC11262d f12171e;

    /* renamed from: f */
    private final MediaFormat f12172f;

    /* renamed from: g */
    private final int f12173g;

    /* renamed from: h */
    private final int f12174h;

    /* renamed from: com.linkedin.android.litr.b$b */
    /* loaded from: classes6.dex */
    public static class C0174b {

        /* renamed from: a */
        private final AbstractC11261c f12175a;

        /* renamed from: b */
        private final int f12176b;

        /* renamed from: c */
        private final AbstractC11262d f12177c;

        /* renamed from: d */
        private AbstractC8390a f12178d;

        /* renamed from: e */
        private AbstractC11647i f12179e;

        /* renamed from: f */
        private AbstractC8391b f12180f;

        /* renamed from: g */
        private MediaFormat f12181g;

        /* renamed from: h */
        private int f12182h;

        public C0174b(AbstractC11261c cVar, int i, AbstractC11262d dVar) {
            this.f12175a = cVar;
            this.f12176b = i;
            this.f12177c = dVar;
            this.f12182h = i;
        }

        /* renamed from: a */
        public C6007b m26455a() {
            return new C6007b(this.f12175a, this.f12178d, this.f12179e, this.f12180f, this.f12177c, this.f12181g, this.f12176b, this.f12182h);
        }

        /* renamed from: b */
        public C0174b m26454b(AbstractC8390a aVar) {
            this.f12178d = aVar;
            return this;
        }

        /* renamed from: c */
        public C0174b m26453c(AbstractC8391b bVar) {
            this.f12180f = bVar;
            return this;
        }

        /* renamed from: d */
        public C0174b m26452d(AbstractC11647i iVar) {
            this.f12179e = iVar;
            return this;
        }

        /* renamed from: e */
        public C0174b m26451e(MediaFormat mediaFormat) {
            this.f12181g = mediaFormat;
            return this;
        }

        /* renamed from: f */
        public C0174b m26450f(int i) {
            this.f12182h = i;
            return this;
        }
    }

    /* renamed from: a */
    public AbstractC8390a m26463a() {
        return this.f12168b;
    }

    /* renamed from: b */
    public AbstractC8391b m26462b() {
        return this.f12170d;
    }

    /* renamed from: c */
    public AbstractC11261c m26461c() {
        return this.f12167a;
    }

    /* renamed from: d */
    public AbstractC11262d m26460d() {
        return this.f12171e;
    }

    /* renamed from: e */
    public AbstractC11647i m26459e() {
        return this.f12169c;
    }

    /* renamed from: f */
    public int m26458f() {
        return this.f12173g;
    }

    /* renamed from: g */
    public MediaFormat m26457g() {
        return this.f12172f;
    }

    /* renamed from: h */
    public int m26456h() {
        return this.f12174h;
    }

    private C6007b(AbstractC11261c cVar, AbstractC8390a aVar, AbstractC11647i iVar, AbstractC8391b bVar, AbstractC11262d dVar, MediaFormat mediaFormat, int i, int i2) {
        this.f12167a = cVar;
        this.f12168b = aVar;
        this.f12169c = iVar;
        this.f12170d = bVar;
        this.f12171e = dVar;
        this.f12172f = mediaFormat;
        this.f12173g = i;
        this.f12174h = i2;
    }
}
