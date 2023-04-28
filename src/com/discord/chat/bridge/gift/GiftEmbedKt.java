package com.discord.chat.bridge.gift;

import kotlin.Metadata;
import kotlinx.serialization.json.C10274f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a%\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, m15073d2 = {"hasPrimitive", "", "Lkotlinx/serialization/json/JsonObject;", "key", "", "hasPrimitives", "keys", "", "(Lkotlinx/serialization/json/JsonObject;[Ljava/lang/String;)Z", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class GiftEmbedKt {
    public static final /* synthetic */ boolean access$hasPrimitive(JsonObject jsonObject, String str) {
        return hasPrimitive(jsonObject, str);
    }

    public static final /* synthetic */ boolean access$hasPrimitives(JsonObject jsonObject, String... strArr) {
        return hasPrimitives(jsonObject, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPrimitive(JsonObject jsonObject, String str) {
        JsonPrimitive k;
        String a;
        boolean w;
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        if (jsonElement == null || (k = C10274f.m13718k(jsonElement)) == null || (a = k.mo13692a()) == null) {
            return false;
        }
        w = C12718u.m5729w(a);
        return w ^ true;
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
