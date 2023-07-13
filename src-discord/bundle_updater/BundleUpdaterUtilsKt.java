package com.discord.bundle_updater;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import ji.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a3\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\n0\f¢\u0006\u0002\u0010\r\u001a\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"getArrayOrNull", "Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "key", "", "getJSONFromAsset", "Landroid/content/res/AssetManager;", "asset", "getObjectOrNull", "getOrNull", "T", "callback", "Lkotlin/Function1;", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getStringOrNull", "bundle_updater_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class BundleUpdaterUtilsKt {
    public static final JSONArray getArrayOrNull(JSONObject jSONObject, String key) {
        q.g(jSONObject, "<this>");
        q.g(key, "key");
        return (JSONArray) getOrNull(jSONObject, key, new BundleUpdaterUtilsKt$getArrayOrNull$1(jSONObject, key));
    }

    public static final JSONObject getJSONFromAsset(AssetManager assetManager, String asset) {
        BufferedReader bufferedReader;
        q.g(assetManager, "<this>");
        q.g(asset, "asset");
        InputStream open = assetManager.open(asset);
        q.f(open, "open(asset)");
        InputStreamReader inputStreamReader = new InputStreamReader(open, d.f19883b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            th = null;
            return new JSONObject(pf.q.e(bufferedReader));
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final JSONObject getObjectOrNull(JSONObject jSONObject, String key) {
        q.g(jSONObject, "<this>");
        q.g(key, "key");
        return (JSONObject) getOrNull(jSONObject, key, new BundleUpdaterUtilsKt$getObjectOrNull$1(jSONObject, key));
    }

    public static final <T> T getOrNull(JSONObject jSONObject, String key, Function1<? super JSONObject, ? extends T> callback) {
        q.g(jSONObject, "<this>");
        q.g(key, "key");
        q.g(callback, "callback");
        if (jSONObject.has(key)) {
            return (T) callback.invoke(jSONObject);
        }
        return null;
    }

    public static final String getStringOrNull(JSONObject jSONObject, String key) {
        q.g(jSONObject, "<this>");
        q.g(key, "key");
        return (String) getOrNull(jSONObject, key, new BundleUpdaterUtilsKt$getStringOrNull$1(jSONObject, key));
    }
}
