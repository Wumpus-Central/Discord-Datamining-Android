package com.discord.bundle_updater;

import ak.j;
import ak.m;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jf.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import okio.BufferedSource;
import tf.l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdaterUtils;", "", "()V", "compareJSONData", "", "Lkotlin/Pair;", "", "Lcom/discord/bundle_updater/AssetStatus;", "apkManifest", "Lcom/discord/bundle_updater/AppManifest;", "oldManifest", "newManifest", "getManifestFromFile", JSStackTrace.FILE_KEY, "Ljava/io/File;", "md5", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BundleUpdaterUtils {
    public static final BundleUpdaterUtils INSTANCE = new BundleUpdaterUtils();

    private BundleUpdaterUtils() {
    }

    public final List<Pair<String, AssetStatus>> compareJSONData(AppManifest apkManifest, AppManifest appManifest, AppManifest newManifest) {
        List<Pair<String, AssetStatus>> B0;
        Pair pair;
        AssetStatus assetStatus;
        q.h(apkManifest, "apkManifest");
        q.h(newManifest, "newManifest");
        Set<String> keySet = newManifest.getHashes().keySet();
        ArrayList arrayList = new ArrayList();
        for (String str : keySet) {
            String str2 = newManifest.getHashes().get(str);
            if (q.c(str2, apkManifest.getHashes().get(str))) {
                pair = null;
            } else {
                if (appManifest == null || !q.c(str2, appManifest.getHashes().get(str))) {
                    assetStatus = AssetStatus.Download;
                } else {
                    assetStatus = AssetStatus.CopyFromPrevious;
                }
                pair = x.a(str, assetStatus);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        B0 = r.B0(arrayList);
        return B0;
    }

    public final AppManifest getManifestFromFile(File file) {
        String d10;
        q.h(file, "file");
        Json.a aVar = Json.f21732d;
        d10 = l.d(file, null, 1, null);
        aVar.a();
        return (AppManifest) aVar.b(AppManifest.Companion.serializer(), d10);
    }

    public final String md5(File file) {
        q.h(file, "file");
        BufferedSource d10 = m.d(m.k(file));
        try {
            j a10 = j.f630m.a(m.b());
            d10.u0(a10);
            th = null;
            return a10.a().l();
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
