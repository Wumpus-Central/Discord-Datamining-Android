package p025b5;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import p191k5.AbstractC9748a;
import p226m5.C10487d;
import p414x3.C13925a;
import p436y4.AbstractC14224b;
import p436y4.AbstractC14225c;

/* renamed from: b5.b */
/* loaded from: classes7.dex */
public class C3383b implements AbstractC14225c {

    /* renamed from: e */
    private static final Class<?> f5410e = C3383b.class;

    /* renamed from: a */
    private final AbstractC14224b f5411a;

    /* renamed from: b */
    private AbstractC9748a f5412b;

    /* renamed from: c */
    private C10487d f5413c;

    /* renamed from: d */
    private final C10487d.AbstractC10489b f5414d;

    /* renamed from: b5.b$a */
    /* loaded from: classes7.dex */
    class C3384a implements C10487d.AbstractC10489b {
        C3384a() {
        }

        @Override // p226m5.C10487d.AbstractC10489b
        /* renamed from: a */
        public void mo13048a(int i, Bitmap bitmap) {
        }

        @Override // p226m5.C10487d.AbstractC10489b
        /* renamed from: b */
        public CloseableReference<Bitmap> mo13047b(int i) {
            return C3383b.this.f5411a.mo245e(i);
        }
    }

    public C3383b(AbstractC14224b bVar, AbstractC9748a aVar) {
        C3384a aVar2 = new C3384a();
        this.f5414d = aVar2;
        this.f5411a = bVar;
        this.f5412b = aVar;
        this.f5413c = new C10487d(aVar, aVar2);
    }

    @Override // p436y4.AbstractC14225c
    /* renamed from: a */
    public boolean mo1330a(int i, Bitmap bitmap) {
        try {
            this.f5413c.m13049g(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            C13925a.m2289i(f5410e, e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }

    @Override // p436y4.AbstractC14225c
    /* renamed from: c */
    public int mo1329c() {
        return this.f5412b.getHeight();
    }

    @Override // p436y4.AbstractC14225c
    /* renamed from: d */
    public void mo1328d(Rect rect) {
        AbstractC9748a e = this.f5412b.mo13074e(rect);
        if (e != this.f5412b) {
            this.f5412b = e;
            this.f5413c = new C10487d(e, this.f5414d);
        }
    }

    @Override // p436y4.AbstractC14225c
    /* renamed from: e */
    public int mo1327e() {
        return this.f5412b.getWidth();
    }
}
