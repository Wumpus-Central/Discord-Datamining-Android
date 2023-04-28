package p119g9;

import android.os.Handler;
import android.os.Message;

/* renamed from: g9.j0 */
/* loaded from: classes5.dex */
final class C7540j0 implements AbstractC7545m {

    /* renamed from: a */
    private final Handler f16337a;

    public C7540j0(Handler handler) {
        this.f16337a = handler;
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: a */
    public boolean mo22255a(Runnable runnable) {
        return this.f16337a.post(runnable);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: b */
    public Message mo22254b(int i) {
        return this.f16337a.obtainMessage(i);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: c */
    public boolean mo22253c(int i) {
        return this.f16337a.hasMessages(i);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: d */
    public Message mo22252d(int i, int i2, int i3, Object obj) {
        return this.f16337a.obtainMessage(i, i2, i3, obj);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: e */
    public Message mo22251e(int i, Object obj) {
        return this.f16337a.obtainMessage(i, obj);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: f */
    public void mo22250f(Object obj) {
        this.f16337a.removeCallbacksAndMessages(obj);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: g */
    public Message mo22249g(int i, int i2, int i3) {
        return this.f16337a.obtainMessage(i, i2, i3);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: h */
    public boolean mo22248h(int i) {
        return this.f16337a.sendEmptyMessage(i);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: i */
    public boolean mo22247i(int i, long j) {
        return this.f16337a.sendEmptyMessageAtTime(i, j);
    }

    @Override // p119g9.AbstractC7545m
    /* renamed from: j */
    public void mo22246j(int i) {
        this.f16337a.removeMessages(i);
    }
}
