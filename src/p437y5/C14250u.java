package p437y5;

import com.facebook.imagepipeline.memory.AbstractC4924h;
import com.facebook.imagepipeline.memory.C4926j;
import java.io.IOException;
import java.io.InputStream;
import p394w3.C13747n;
import p455z3.AbstractC14537h;
import p455z3.C14540k;

/* renamed from: y5.u */
/* loaded from: classes7.dex */
public class C14250u implements AbstractC14537h {

    /* renamed from: a */
    private final C14540k f32178a;

    /* renamed from: b */
    private final AbstractC4924h f32179b;

    public C14250u(AbstractC4924h hVar, C14540k kVar) {
        this.f32179b = hVar;
        this.f32178a = kVar;
    }

    /* renamed from: f */
    C14249t m1276f(InputStream inputStream, C4926j jVar) {
        this.f32178a.m257a(inputStream, jVar);
        return jVar.mo258b();
    }

    /* renamed from: g */
    public C14249t mo263a(InputStream inputStream) {
        C4926j jVar = new C4926j(this.f32179b);
        try {
            return m1276f(inputStream, jVar);
        } finally {
            jVar.close();
        }
    }

    /* renamed from: h */
    public C14249t mo262b(InputStream inputStream, int i) {
        C4926j jVar = new C4926j(this.f32179b, i);
        try {
            return m1276f(inputStream, jVar);
        } finally {
            jVar.close();
        }
    }

    /* renamed from: i */
    public C14249t mo260d(byte[] bArr) {
        C4926j jVar = new C4926j(this.f32179b, bArr.length);
        try {
            try {
                jVar.write(bArr, 0, bArr.length);
                return jVar.mo258b();
            } catch (IOException e) {
                throw C13747n.m2823a(e);
            }
        } finally {
            jVar.close();
        }
    }

    /* renamed from: j */
    public C4926j mo261c() {
        return new C4926j(this.f32179b);
    }

    /* renamed from: k */
    public C4926j mo259e(int i) {
        return new C4926j(this.f32179b, i);
    }
}
