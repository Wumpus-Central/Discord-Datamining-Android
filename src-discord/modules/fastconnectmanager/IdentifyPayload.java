package com.discord.modules.fastconnectmanager;

import com.discord.app_database.GuildVersion;
import com.discord.logging.Log;
import ff.s;
import ff.t;
import ff.x;
import gf.u;
import gf.v;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j;
import kotlin.jvm.internal.q;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\u00020\u000b*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/discord/modules/fastconnectmanager/IdentifyPayload;", "", "()V", "withGuildVersions", "", "json", "versions", "", "Lcom/discord/app_database/GuildVersion;", "(Ljava/lang/String;[Lcom/discord/app_database/GuildVersion;)Ljava/lang/String;", "put", "Lkotlinx/serialization/json/JsonObject;", "path", "", "value", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class IdentifyPayload {
    public static final IdentifyPayload INSTANCE = new IdentifyPayload();

    private IdentifyPayload() {
    }

    private final JsonObject put(JsonObject jsonObject, List<String> list, JsonObject jsonObject2) {
        Map v10;
        JsonObject jsonObject3;
        Map v11;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                String str = list.get(0);
                JsonElement jsonElement = (JsonElement) jsonObject.get(str);
                if (!(jsonElement instanceof JsonObject)) {
                    return jsonObject;
                }
                v11 = v.v(jsonObject);
                v11.put(str, INSTANCE.put((JsonObject) jsonElement, list.subList(1, list.size()), jsonObject2));
                jsonObject3 = new JsonObject(v11);
            } else {
                String str2 = list.get(0);
                v10 = v.v(jsonObject);
                JsonElement jsonElement2 = jsonObject2;
                if (jsonObject2 == null) {
                    jsonElement2 = g.a(null);
                }
                v10.put(str2, jsonElement2 == 1 ? 1 : 0);
                jsonObject3 = new JsonObject(v10);
            }
            return jsonObject3;
        }
        throw new IllegalArgumentException("path cannot have zero elements");
    }

    public final String withGuildVersions(String json, GuildVersion[] versions) {
        Object obj;
        List<String> k10;
        int d10;
        int c10;
        q.g(json, "json");
        q.g(versions, "versions");
        try {
            s.a aVar = s.f14772l;
            obj = s.b(Json.f21165d.g(json));
        } catch (Throwable th2) {
            s.a aVar2 = s.f14772l;
            obj = s.b(t.a(th2));
        }
        if (s.g(obj)) {
            obj = null;
        }
        JsonElement jsonElement = (JsonElement) obj;
        if (jsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElement;
            k10 = j.k("d", "client_state", "guild_versions");
            d10 = u.d(versions.length);
            c10 = wf.j.c(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(c10);
            for (GuildVersion guildVersion : versions) {
                Pair a10 = x.a(guildVersion.getId(), g.c(Long.valueOf(guildVersion.getVersion())));
                linkedHashMap.put(a10.c(), a10.d());
            }
            return put(jsonObject, k10, new JsonObject(linkedHashMap)).toString();
        }
        Log.w$default(Log.INSTANCE, "IdentifyPayload", "skipping identify mutation: root is not a json object", (Throwable) null, 4, (Object) null);
        return json;
    }
}
