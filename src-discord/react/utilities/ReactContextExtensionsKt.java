package com.discord.react.utilities;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"jsiId", "", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "Lcom/facebook/react/bridge/ReactContext;", "react_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ReactContextExtensionsKt {
    public static final long jsiId(ReactContext reactContext) {
        q.h(reactContext, "<this>");
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        q.g(javaScriptContextHolder, "javaScriptContextHolder");
        return jsiId(javaScriptContextHolder);
    }

    public static final long jsiId(JavaScriptContextHolder javaScriptContextHolder) {
        q.h(javaScriptContextHolder, "<this>");
        long j10 = javaScriptContextHolder.get();
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("JSI Runtime is not available.".toString());
    }
}
