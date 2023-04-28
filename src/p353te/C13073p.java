package p353te;

import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m15073d2 = {"Lcom/facebook/react/bridge/WritableMap;", "", "key", "", "value", "", "b", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Integer;)V", "", "a", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Double;)V", "react-native-vision-camera_release"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: te.p */
/* loaded from: classes6.dex */
public final class C13073p {
    /* renamed from: a */
    public static final void m4656a(WritableMap writableMap, String key, Double d) {
        C9971q.m14633g(writableMap, "<this>");
        C9971q.m14633g(key, "key");
        if (d == null) {
            writableMap.putNull(key);
        } else {
            writableMap.putDouble(key, d.doubleValue());
        }
    }

    /* renamed from: b */
    public static final void m4655b(WritableMap writableMap, String key, Integer num) {
        C9971q.m14633g(writableMap, "<this>");
        C9971q.m14633g(key, "key");
        if (num == null) {
            writableMap.putNull(key);
        } else {
            writableMap.putInt(key, num.intValue());
        }
    }
}
