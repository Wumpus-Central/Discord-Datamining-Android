package com.discord.bundle_updater;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.q;
import kotlin.text.p;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.g;
import lf.u;
import okhttp3.Cookie;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/discord/bundle_updater/CookieValidator;", "", "()V", "parseBuildOverrideCookie", "Lcom/discord/bundle_updater/BuildOverrideCookieContents;", "buildOverrideCookie", "Lokhttp3/Cookie;", "validateBuildOverrideCookie", "", "version", "", "bundle_updater_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class CookieValidator {
    public static final CookieValidator INSTANCE = new CookieValidator();

    private CookieValidator() {
    }

    public final BuildOverrideCookieContents parseBuildOverrideCookie(Cookie cookie) {
        List z02;
        Object V;
        String D;
        int d10;
        if (cookie == null) {
            return null;
        }
        z02 = p.z0(cookie.g(), new String[]{"."}, false, 0, 6, null);
        V = r.V(z02, 1);
        String str = (String) V;
        if (str == null) {
            return null;
        }
        String base64String = URLDecoder.decode(str, "UTF-8");
        ByteString.a aVar = ByteString.f25929n;
        q.g(base64String, "base64String");
        ByteString a10 = aVar.a(base64String);
        if (!(a10 == null || (D = a10.D()) == null)) {
            try {
                Json.a aVar2 = Json.f21963d;
                JsonElement g10 = aVar2.g(D);
                JsonElement jsonElement = (JsonElement) g.m(g10).get("$meta");
                if (jsonElement == null) {
                    return null;
                }
                aVar2.a();
                BuildOverrideCookieMeta buildOverrideCookieMeta = (BuildOverrideCookieMeta) aVar2.d(BuildOverrideCookieMeta.Companion.serializer(), jsonElement);
                JsonObject m10 = g.m(g10);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, JsonElement> entry : m10.entrySet()) {
                    if (!q.c(entry.getKey(), "$meta")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                d10 = u.d(linkedHashMap.size());
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d10);
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    Json.a aVar3 = Json.f21963d;
                    aVar3.a();
                    linkedHashMap2.put(key, (BuildOverrideCookieBuild) aVar3.d(BuildOverrideCookieBuild.Companion.serializer(), (JsonElement) entry2.getValue()));
                }
                return new BuildOverrideCookieContents(buildOverrideCookieMeta, linkedHashMap2);
            } catch (ui.g unused) {
            }
        }
        return null;
    }

    public final boolean validateBuildOverrideCookie(Cookie cookie, String version) {
        List<String> allowedVersions;
        q.h(version, "version");
        BuildOverrideCookieContents parseBuildOverrideCookie = parseBuildOverrideCookie(cookie);
        if (parseBuildOverrideCookie == null || (allowedVersions = parseBuildOverrideCookie.getMeta().getAllowedVersions()) == null || allowedVersions.isEmpty()) {
            return false;
        }
        for (String str : allowedVersions) {
            if (q.c(str, version)) {
                return true;
            }
        }
        return false;
    }
}
