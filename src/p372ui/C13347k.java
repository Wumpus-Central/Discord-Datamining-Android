package p372ui;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.C10132j1;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m15073d2 = {"Lui/t;", "", "cause", "", "a", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, m15072k = 5, m15071mv = {1, 6, 0}, m15068xs = "kotlinx/coroutines/channels/ChannelsKt")
/* renamed from: ui.k */
/* loaded from: classes8.dex */
final /* synthetic */ class C13347k {
    /* renamed from: a */
    public static final void m3894a(AbstractC13358t<?> tVar, Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = C10132j1.m14191a("Channel was consumed, consumer had failed", th2);
            }
        }
        tVar.mo3867h(cancellationException);
    }
}
