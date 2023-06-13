package com.discord.chat.bridge.gift;

import kotlin.Metadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.g;
import oj.u;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a%\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"hasPrimitive", "", "Lkotlinx/serialization/json/JsonObject;", "key", "", "hasPrimitives", "keys", "", "(Lkotlinx/serialization/json/JsonObject;[Ljava/lang/String;)Z", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GiftEmbedKt {
    public static final /* synthetic */ boolean access$hasPrimitive(JsonObject jsonObject, String str) {
        return hasPrimitive(jsonObject, str);
    }

    public static final /* synthetic */ boolean access$hasPrimitives(JsonObject jsonObject, String... strArr) {
        return hasPrimitives(jsonObject, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPrimitive(JsonObject jsonObject, String str) {
        JsonPrimitive n10;
        String b10;
        boolean w10;
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        if (jsonElement == null || (n10 = g.n(jsonElement)) == null || (b10 = n10.b()) == null) {
            return false;
        }
        w10 = u.w(b10);
        return w10 ^ true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPrimitives(JsonObject jsonObject, String... strArr) {
        for (String str : strArr) {
            if (!hasPrimitive(jsonObject, str)) {
                return false;
            }
        }
        return true;
    }
}
