package com.discord.bundle_updater;

import com.facebook.react.util.JSStackTrace;
import fk.C7362j;
import fk.C7366m;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import okio.BufferedSource;
import org.json.JSONObject;
import p306qi.C12193m;
import p306qi.C12200o;
import p426xf.C14097l;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/bundle_updater/BundleUpdaterUtils;", "", "()V", "compareJSONData", "", "Lkotlin/Pair;", "", "Lcom/discord/bundle_updater/AssetStatus;", "apkData", "Lorg/json/JSONObject;", "oldData", "newData", "getJSONFromFile", JSStackTrace.FILE_KEY, "Ljava/io/File;", "md5", "bundle_updater_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class BundleUpdaterUtils {
    public static final BundleUpdaterUtils INSTANCE = new BundleUpdaterUtils();

    private BundleUpdaterUtils() {
    }

    public final List<Pair<String, AssetStatus>> compareJSONData(JSONObject apkData, JSONObject oldData, JSONObject newData) {
        Sequence c;
        Sequence z;
        List<Pair<String, AssetStatus>> E;
        C9971q.m14633g(apkData, "apkData");
        C9971q.m14633g(oldData, "oldData");
        C9971q.m14633g(newData, "newData");
        Iterator<String> keys = newData.keys();
        C9971q.m14634f(keys, "newData\n            .keys()");
        c = C12193m.m7450c(keys);
        z = C12200o.m7419z(c, new BundleUpdaterUtils$compareJSONData$1(newData, apkData, oldData));
        E = C12200o.m7436E(z);
        return E;
    }

    public final JSONObject getJSONFromFile(File file) {
        String d;
        C9971q.m14633g(file, "file");
        d = C14097l.m1686d(file, null, 1, null);
        return new JSONObject(d);
    }

    public final String md5(File file) {
        C9971q.m14633g(file, "file");
        BufferedSource d = C7366m.m22819d(C7366m.m22812k(file));
        try {
            C7362j a = C7362j.f15856n.m22826a(C7366m.m22821b());
            d.mo9723x0(a);
            th = null;
            return a.m22827b().mo9708k();
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
