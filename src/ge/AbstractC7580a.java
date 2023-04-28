package ge;

import java.util.List;
import p138he.C8008a;

/* renamed from: ge.a */
/* loaded from: classes6.dex */
public interface AbstractC7580a {
    void onCancelled(String str, List<C8008a> list);

    void onCompleted(String str, List<C8008a> list);

    void onError(String str, Throwable th2, List<C8008a> list);

    void onProgress(String str, float f);

    void onStarted(String str);
}
