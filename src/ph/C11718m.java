package ph;

import java.io.IOException;

/* renamed from: ph.m */
/* loaded from: classes8.dex */
public class C11718m {

    /* renamed from: a */
    private AbstractC11691d f26169a;

    /* renamed from: b */
    private C11697g f26170b;

    /* renamed from: c */
    private volatile boolean f26171c;

    /* renamed from: d */
    protected volatile AbstractC11724q f26172d;

    /* renamed from: a */
    protected void m8797a(AbstractC11724q qVar) {
        if (this.f26172d == null) {
            synchronized (this) {
                if (this.f26172d == null) {
                    try {
                        if (this.f26169a != null) {
                            this.f26172d = (AbstractC11724q) qVar.mo8778h().mo8773b(this.f26169a, this.f26170b);
                        } else {
                            this.f26172d = qVar;
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public int m8796b() {
        if (this.f26171c) {
            return this.f26172d.mo8781c();
        }
        return this.f26169a.size();
    }

    /* renamed from: c */
    public AbstractC11724q m8795c(AbstractC11724q qVar) {
        m8797a(qVar);
        return this.f26172d;
    }

    /* renamed from: d */
    public AbstractC11724q m8794d(AbstractC11724q qVar) {
        AbstractC11724q qVar2 = this.f26172d;
        this.f26172d = qVar;
        this.f26169a = null;
        this.f26171c = true;
        return qVar2;
    }
}
