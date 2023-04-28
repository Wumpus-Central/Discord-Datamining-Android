package p213l9;

import android.net.Uri;
import android.util.LogPrinter;

/* renamed from: l9.e */
/* loaded from: classes5.dex */
public final class C10364e {

    /* renamed from: b */
    private static final Uri f22744b;

    /* renamed from: a */
    private final LogPrinter f22745a = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f22744b = builder.build();
    }
}
