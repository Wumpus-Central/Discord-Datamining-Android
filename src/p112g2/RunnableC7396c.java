package p112g2;

import p074e2.C6639l;

/* renamed from: g2.c */
/* loaded from: classes.dex */
public class RunnableC7396c implements Runnable {

    /* renamed from: k */
    private Runnable f15939k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC7396c(Runnable runnable) {
        this.f15939k = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f15939k.run();
        } catch (Throwable th2) {
            C6639l.m24863j().mo24885b("Runnable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
        }
    }
}
