package com.discord.bundle_updater;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import qf.u;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/discord/bundle_updater/BuildOverrideCookieContents;", "", "meta", "Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "builds", "", "", "Lcom/discord/bundle_updater/BuildOverrideCookieBuild;", "(Lcom/discord/bundle_updater/BuildOverrideCookieMeta;Ljava/util/Map;)V", "getBuilds", "()Ljava/util/Map;", "getMeta", "()Lcom/discord/bundle_updater/BuildOverrideCookieMeta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toNativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BuildOverrideCookieContents {
    private final Map<String, BuildOverrideCookieBuild> builds;
    private final BuildOverrideCookieMeta meta;

    public BuildOverrideCookieContents(BuildOverrideCookieMeta meta, Map<String, BuildOverrideCookieBuild> builds) {
        q.h(meta, "meta");
        q.h(builds, "builds");
        this.meta = meta;
        this.builds = builds;
    }

    
    public static  BuildOverrideCookieContents copy$default(BuildOverrideCookieContents buildOverrideCookieContents, BuildOverrideCookieMeta buildOverrideCookieMeta, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            buildOverrideCookieMeta = buildOverrideCookieContents.meta;
        }
        if ((i10 & 2) != 0) {
            map = buildOverrideCookieContents.builds;
        }
        return buildOverrideCookieContents.copy(buildOverrideCookieMeta, map);
    }

    public final BuildOverrideCookieMeta component1() {
        return this.meta;
    }

    public final Map<String, BuildOverrideCookieBuild> component2() {
        return this.builds;
    }

    public final BuildOverrideCookieContents copy(BuildOverrideCookieMeta meta, Map<String, BuildOverrideCookieBuild> builds) {
        q.h(meta, "meta");
        q.h(builds, "builds");
        return new BuildOverrideCookieContents(meta, builds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuildOverrideCookieContents)) {
            return false;
        }
        BuildOverrideCookieContents buildOverrideCookieContents = (BuildOverrideCookieContents) obj;
        return q.c(this.meta, buildOverrideCookieContents.meta) && q.c(this.builds, buildOverrideCookieContents.builds);
    }

    public final Map<String, BuildOverrideCookieBuild> getBuilds() {
        return this.builds;
    }

    public final BuildOverrideCookieMeta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return (this.meta.hashCode() * 31) + this.builds.hashCode();
    }

    public final WritableNativeMap toNativeMap() {
        int d10;
        Map<String, BuildOverrideCookieBuild> map = this.builds;
        d10 = u.d(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((BuildOverrideCookieBuild) entry.getValue()).toNativeMap());
        }
        WritableNativeMap nativeMap = NativeMapExtensionsKt.toNativeMap(linkedHashMap);
        NativeMapExtensionsKt.put(nativeMap, "$meta", this.meta.toNativeMap());
        return nativeMap;
    }

    public String toString() {
        BuildOverrideCookieMeta buildOverrideCookieMeta = this.meta;
        Map<String, BuildOverrideCookieBuild> map = this.builds;
        return "BuildOverrideCookieContents(meta=" + buildOverrideCookieMeta + ", builds=" + map + ")";
    }
}
