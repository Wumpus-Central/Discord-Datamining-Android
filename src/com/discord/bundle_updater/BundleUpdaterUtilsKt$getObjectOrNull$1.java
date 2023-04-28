package com.discord.bundle_updater;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import org.json.JSONObject;

@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "it", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class BundleUpdaterUtilsKt$getObjectOrNull$1 extends AbstractC9973s implements Function1<JSONObject, JSONObject> {
    final /* synthetic */ String $key;
    final /* synthetic */ JSONObject $this_getObjectOrNull;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterUtilsKt$getObjectOrNull$1(JSONObject jSONObject, String str) {
        super(1);
        this.$this_getObjectOrNull = jSONObject;
        this.$key = str;
    }

    public final JSONObject invoke(JSONObject it) {
        C9971q.m14633g(it, "it");
        return this.$this_getObjectOrNull.getJSONObject(this.$key);
    }
}
