package p353te;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import nf.C11067f;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a6\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\n"}, m15073d2 = {"", "throwable", "Lcom/facebook/react/bridge/ReadableMap;", "a", "", "code", "message", "Lcom/facebook/react/bridge/WritableMap;", "userInfo", "b", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.b */
/* loaded from: classes6.dex */
public final class C13058b {
    /* renamed from: a */
    private static final ReadableMap m4678a(Throwable th2) {
        String b;
        WritableMap map = Arguments.createMap();
        map.putString("message", th2.getMessage());
        b = C11067f.m10980b(th2);
        map.putString("stacktrace", b);
        if (th2.getCause() != null) {
            Throwable cause = th2.getCause();
            C9971q.m14636d(cause);
            map.putMap("cause", m4678a(cause));
        }
        C9971q.m14634f(map, "map");
        return map;
    }

    /* renamed from: b */
    public static final ReadableMap m4677b(String str, String str2, Throwable th2, WritableMap writableMap) {
        ReadableMap readableMap;
        WritableMap map = Arguments.createMap();
        map.putString("code", str);
        map.putString("message", str2);
        if (th2 != null) {
            readableMap = m4678a(th2);
        } else {
            readableMap = null;
        }
        map.putMap("cause", readableMap);
        map.putMap("userInfo", writableMap);
        C9971q.m14634f(map, "map");
        return map;
    }

    /* renamed from: c */
    public static /* synthetic */ ReadableMap m4676c(String str, String str2, Throwable th2, WritableMap writableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            th2 = null;
        }
        if ((i & 8) != 0) {
            writableMap = null;
        }
        return m4677b(str, str2, th2, writableMap);
    }
}
