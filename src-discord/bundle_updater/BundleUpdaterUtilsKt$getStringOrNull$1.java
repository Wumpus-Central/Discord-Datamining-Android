package com.discord.bundle_updater;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class BundleUpdaterUtilsKt$getStringOrNull$1 extends s implements Function1<JSONObject, String> {
    final  String $key;
    final  JSONObject $this_getStringOrNull;

    
    
    public BundleUpdaterUtilsKt$getStringOrNull$1(JSONObject jSONObject, String str) {
        super(1);
        this.$this_getStringOrNull = jSONObject;
        this.$key = str;
    }

    public final String invoke(JSONObject it) {
        q.h(it, "it");
        return this.$this_getStringOrNull.getString(this.$key);
    }
}
