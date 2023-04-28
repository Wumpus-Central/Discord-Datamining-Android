package p163j$.util.stream;

/* renamed from: j$.util.stream.B3 */
/* loaded from: classes2.dex */
final class RunnableC9322B3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f20452a;

    /* renamed from: b */
    final /* synthetic */ Runnable f20453b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC9322B3(Runnable runnable, Runnable runnable2) {
        this.f20452a = runnable;
        this.f20453b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f20453b;
        try {
            this.f20452a.run();
            runnable.run();
        } catch (Throwable th2) {
            try {
                runnable.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
