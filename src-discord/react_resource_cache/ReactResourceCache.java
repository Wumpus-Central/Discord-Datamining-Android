package com.discord.react_resource_cache;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.Enum;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0017R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/discord/react_resource_cache/ReactResourceCache;", "T", "", "", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "reactResources", "", "cache", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "getCache", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "get", "context", "reactResource", "(Landroid/content/Context;Ljava/lang/Enum;)Ljava/lang/String;", "set", "", "newReactResources", "", "react_resource_cache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ReactResourceCache<T extends Enum<?>> {
    private Map<String, String> reactResources = new LinkedHashMap();

    private final SharedPreferences getCache(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(getCacheKey(), 0);
        q.f(sharedPreferences, "getSharedPreferences(cac…ey, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final String get(Context context, T reactResource) {
        q.g(context, "context");
        q.g(reactResource, "reactResource");
        String str = this.reactResources.get(reactResource.name());
        if (str == null) {
            String string = getCache(context).getString(reactResource.name(), null);
            if (string != null) {
                this.reactResources.put(reactResource.name(), string);
                str = string;
            } else {
                str = null;
            }
            if (str == null) {
                throw new IllegalAccessException("Unable to access " + reactResource.name() + " as it has not yet been provided.");
            }
        }
        return str;
    }

    public abstract String getCacheKey();

    public final void set(Context context, Map<String, String> newReactResources) {
        q.g(context, "context");
        q.g(newReactResources, "newReactResources");
        SharedPreferences.Editor editor = getCache(context).edit();
        q.f(editor, "editor");
        editor.clear();
        for (Map.Entry<String, String> entry : newReactResources.entrySet()) {
            editor.putString(entry.getKey(), entry.getValue());
        }
        this.reactResources = new HashMap(newReactResources);
        editor.apply();
    }
}
