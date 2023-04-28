package p373uj;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9962k0;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, m15073d2 = {"Luj/a;", "task", "Luj/d;", "queue", "", "message", "", "c", "", "ns", "b", "okhttp"}, m15072k = 2, m15071mv = {1, 4, 0})
/* renamed from: uj.b */
/* loaded from: classes8.dex */
public final class C13367b {
    /* renamed from: a */
    public static final /* synthetic */ void m3841a(AbstractC13366a aVar, C13369d dVar, String str) {
        m3839c(aVar, dVar, str);
    }

    /* renamed from: b */
    public static final String m3840b(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA)) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        C9962k0 k0Var = C9962k0.f22091a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C9971q.m14634f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m3839c(AbstractC13366a aVar, C13369d dVar, String str) {
        Logger a = C13370e.f29935j.m3814a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dVar.m3833f());
        sb2.append(' ');
        C9962k0 k0Var = C9962k0.f22091a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C9971q.m14634f(format, "java.lang.String.format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.m3846b());
        a.fine(sb2.toString());
    }
}
