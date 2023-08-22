package com.discord.bundle_updater;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import ni.a;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"getManifestFromAsset", "Lcom/discord/bundle_updater/AppManifest;", "Landroid/content/res/AssetManager;", "asset", "", "bundle_updater_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class BundleUpdaterUtilsKt {
    public static final AppManifest getManifestFromAsset(AssetManager assetManager, String asset) {
        BufferedReader bufferedReader;
        q.h(assetManager, "<this>");
        q.h(asset, "asset");
        InputStream open = assetManager.open(asset);
        q.g(open, "open(asset)");
        InputStreamReader inputStreamReader = new InputStreamReader(open, a.f24906b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            Json.a aVar = Json.f21735d;
            String e10 = tf.q.e(bufferedReader);
            aVar.a();
            AppManifest appManifest = (AppManifest) aVar.b(AppManifest.Companion.serializer(), e10);
            th = null;
            return appManifest;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
