package p119g9;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: g9.a0 */
/* loaded from: classes5.dex */
public final class C7511a0 {

    /* renamed from: a */
    private final Object f16286a = new Object();

    /* renamed from: b */
    private final PriorityQueue<Integer> f16287b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    private int f16288c = Integer.MIN_VALUE;

    /* renamed from: g9.a0$a */
    /* loaded from: classes5.dex */
    public static class C7512a extends IOException {
        public C7512a(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + "]");
        }
    }

    /* renamed from: a */
    public void m22362a(int i) {
        synchronized (this.f16286a) {
            this.f16287b.add(Integer.valueOf(i));
            this.f16288c = Math.max(this.f16288c, i);
        }
    }

    /* renamed from: b */
    public void m22361b(int i) {
        synchronized (this.f16286a) {
            if (this.f16288c != i) {
                throw new C7512a(i, this.f16288c);
            }
        }
    }

    /* renamed from: c */
    public void m22360c(int i) {
        int i2;
        synchronized (this.f16286a) {
            this.f16287b.remove(Integer.valueOf(i));
            if (this.f16287b.isEmpty()) {
                i2 = Integer.MIN_VALUE;
            } else {
                i2 = ((Integer) C7557q0.m22145j(this.f16287b.peek())).intValue();
            }
            this.f16288c = i2;
            this.f16286a.notifyAll();
        }
    }
}
