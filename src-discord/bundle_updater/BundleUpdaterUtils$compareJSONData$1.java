package com.discord.bundle_updater;

import kg.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0018\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/discord/bundle_updater/AssetStatus;", "key", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundleUpdaterUtils$compareJSONData$1 extends s implements Function1<String, Pair<? extends String, ? extends AssetStatus>> {
    final /* synthetic */ JSONObject $apkData;
    final /* synthetic */ JSONObject $newData;
    final /* synthetic */ JSONObject $oldData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterUtils$compareJSONData$1(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        super(1);
        this.$newData = jSONObject;
        this.$apkData = jSONObject2;
        this.$oldData = jSONObject3;
    }

    public final Pair<String, AssetStatus> invoke(String key) {
        AssetStatus assetStatus;
        String string = this.$newData.getString(key);
        JSONObject jSONObject = this.$apkData;
        q.f(key, "key");
        if (q.b(string, BundleUpdaterUtilsKt.getStringOrNull(jSONObject, key))) {
            return null;
        }
        if (q.b(string, BundleUpdaterUtilsKt.getStringOrNull(this.$oldData, key))) {
            assetStatus = AssetStatus.CopyFromPrevious;
        } else {
            assetStatus = AssetStatus.Download;
        }
        return x.a(key, assetStatus);
    }
}
