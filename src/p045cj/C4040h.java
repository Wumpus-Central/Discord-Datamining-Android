package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00188\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\u001d\u0010\"\"\u0004\b#\u0010$¨\u0006("}, m15073d2 = {"Lcj/h;", "", "", "b", "p", "c", "o", "", "v", "e", "", "j", "", "g", "", "f", "", "d", "", "k", "", "h", "", "i", "", "l", "value", "m", "Lcj/k0;", "a", "Lcj/k0;", "writer", "<set-?>", "Z", "()Z", "n", "(Z)V", "writingFirst", "<init>", "(Lcj/k0;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.h */
/* loaded from: classes8.dex */
public class C4040h {

    /* renamed from: a */
    public final AbstractC4049k0 f6643a;

    /* renamed from: b */
    private boolean f6644b = true;

    public C4040h(AbstractC4049k0 writer) {
        C9971q.m14633g(writer, "writer");
        this.f6643a = writer;
    }

    /* renamed from: a */
    public final boolean m32967a() {
        return this.f6644b;
    }

    /* renamed from: b */
    public void mo32899b() {
        this.f6644b = true;
    }

    /* renamed from: c */
    public void mo32898c() {
        this.f6644b = false;
    }

    /* renamed from: d */
    public void mo32913d(byte b) {
        this.f6643a.writeLong(b);
    }

    /* renamed from: e */
    public final void m32966e(char c) {
        this.f6643a.mo32941a(c);
    }

    /* renamed from: f */
    public void m32965f(double d) {
        this.f6643a.mo32939c(String.valueOf(d));
    }

    /* renamed from: g */
    public void m32964g(float f) {
        this.f6643a.mo32939c(String.valueOf(f));
    }

    /* renamed from: h */
    public void mo32912h(int i) {
        this.f6643a.writeLong(i);
    }

    /* renamed from: i */
    public void mo32911i(long j) {
        this.f6643a.writeLong(j);
    }

    /* renamed from: j */
    public final void m32963j(String v) {
        C9971q.m14633g(v, "v");
        this.f6643a.mo32939c(v);
    }

    /* renamed from: k */
    public void mo32910k(short s) {
        this.f6643a.writeLong(s);
    }

    /* renamed from: l */
    public void m32962l(boolean z) {
        this.f6643a.mo32939c(String.valueOf(z));
    }

    /* renamed from: m */
    public void mo32959m(String value) {
        C9971q.m14633g(value, "value");
        this.f6643a.mo32940b(value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m32961n(boolean z) {
        this.f6644b = z;
    }

    /* renamed from: o */
    public void mo32897o() {
    }

    /* renamed from: p */
    public void mo32896p() {
    }
}
