package p031bk;

import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okhttp3.OkHttpClient;
import p267of.C11289v;
import p326ri.C12719v;
import p326ri.C12724x;
import p373uj.C13370e;
import p450yj.C14456e;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, m15073d2 = {"Lbk/e;", "", "", "loggerName", "d", "logger", "tag", "", "c", "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", "", "Ljava/util/Map;", "knownLoggers", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: bk.e */
/* loaded from: classes8.dex */
public final class C3730e {

    /* renamed from: b */
    private static final Map<String, String> f6068b;

    /* renamed from: c */
    public static final C3730e f6069c = new C3730e();

    /* renamed from: a */
    private static final CopyOnWriteArraySet<Logger> f6067a = new CopyOnWriteArraySet<>();

    static {
        String str;
        Map<String, String> t;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        if (r2 != null) {
            str = r2.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = OkHttpClient.class.getName();
        C9971q.m14634f(name, "OkHttpClient::class.java.name");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = C14456e.class.getName();
        C9971q.m14634f(name2, "Http2::class.java.name");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = C13370e.class.getName();
        C9971q.m14634f(name3, "TaskRunner::class.java.name");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        t = C11289v.m10239t(linkedHashMap);
        f6068b = t;
    }

    private C3730e() {
    }

    /* renamed from: c */
    private final void m33725c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f6067a.add(logger)) {
            C9971q.m14634f(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C3731f.f6070a);
        }
    }

    /* renamed from: d */
    private final String m33724d(String str) {
        String a1;
        String str2 = f6068b.get(str);
        if (str2 != null) {
            return str2;
        }
        a1 = C12724x.m5652a1(str, 23);
        return a1;
    }

    /* renamed from: a */
    public final void m33727a(String loggerName, int i, String message, Throwable th2) {
        int Y;
        int min;
        C9971q.m14633g(loggerName, "loggerName");
        C9971q.m14633g(message, "message");
        String d = m33724d(loggerName);
        if (Log.isLoggable(d, i)) {
            if (th2 != null) {
                message = message + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + Log.getStackTraceString(th2);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                Y = C12719v.m5687Y(message, '\n', i2, false, 4, null);
                if (Y == -1) {
                    Y = length;
                }
                while (true) {
                    min = Math.min(Y, i2 + 4000);
                    String substring = message.substring(i2, min);
                    C9971q.m14634f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, d, substring);
                    if (min >= Y) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m33726b() {
        for (Map.Entry<String, String> entry : f6068b.entrySet()) {
            m33725c(entry.getKey(), entry.getValue());
        }
    }
}
