package com.discord.bundle_updater;

import com.facebook.react.util.JSStackTrace;
import fk.j;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import kotlin.sequences.Sequence;
import okio.BufferedSource;
import org.json.JSONObject;
import qi.m;
import qi.o;
import xf.l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdaterUtils;", "", "()V", "compareJSONData", "", "Lkotlin/Pair;", "", "Lcom/discord/bundle_updater/AssetStatus;", "apkData", "Lorg/json/JSONObject;", "oldData", "newData", "getJSONFromFile", JSStackTrace.FILE_KEY, "Ljava/io/File;", "md5", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundleUpdaterUtils {
    public static final BundleUpdaterUtils INSTANCE = new BundleUpdaterUtils();

    private BundleUpdaterUtils() {
    }

    public final List<Pair<String, AssetStatus>> compareJSONData(JSONObject apkData, JSONObject oldData, JSONObject newData) {
        Sequence c10;
        Sequence z10;
        List<Pair<String, AssetStatus>> E;
        q.g(apkData, "apkData");
        q.g(oldData, "oldData");
        q.g(newData, "newData");
        Iterator<String> keys = newData.keys();
        q.f(keys, "newData\n            .keys()");
        c10 = m.c(keys);
        z10 = o.z(c10, new BundleUpdaterUtils$compareJSONData$1(newData, apkData, oldData));
        E = o.E(z10);
        return E;
    }

    public final JSONObject getJSONFromFile(File file) {
        String d10;
        q.g(file, "file");
        d10 = l.d(file, null, 1, null);
        return new JSONObject(d10);
    }

    public final String md5(File file) {
        q.g(file, "file");
        BufferedSource d10 = fk.m.d(fk.m.k(file));
        try {
            j a10 = j.f15850n.a(fk.m.b());
            d10.x0(a10);
            th = null;
            return a10.b().k();
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
