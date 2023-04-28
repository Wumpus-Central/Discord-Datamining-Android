package com.discord.chat.bridge.botuikit;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9618r;
import kotlin.jvm.internal.C9656f0;
import kotlin.jvm.internal.C9677q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.json.AbstractC9992d;
import kotlinx.serialization.json.C9994f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/chat/bridge/botuikit/ComponentSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/botuikit/Component;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "", "", "knownTypes", "Ljava/util/List;", "Lkotlinx/serialization/SealedClassSerializer;", "componentClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "getComponentClassSerializer$annotations", "()V", "<init>", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ComponentSerializer extends AbstractC9992d<Component> {
    public static final ComponentSerializer INSTANCE = new ComponentSerializer();
    private static final SealedClassSerializer<Component> componentClassSerializer;
    private static final List<Integer> knownTypes;

    static {
        ComponentType[] values = ComponentType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (ComponentType componentType : values) {
            arrayList.add(Integer.valueOf(componentType.getSerialNumber()));
        }
        knownTypes = arrayList;
        componentClassSerializer = new SealedClassSerializer<>("Component", C9656f0.m14684b(Component.class), new KClass[]{C9656f0.m14684b(UnknownComponent.class), C9656f0.m14684b(ActionRowComponent.class), C9656f0.m14684b(ButtonComponent.class), C9656f0.m14684b(StringSelectComponent.class), C9656f0.m14684b(UserSelectComponent.class), C9656f0.m14684b(RoleSelectComponent.class), C9656f0.m14684b(MentionableSelectComponent.class), C9656f0.m14684b(ChannelSelectComponent.class)}, new KSerializer[]{UnknownComponent.Companion.serializer(), ActionRowComponent.Companion.serializer(), ButtonComponent.Companion.serializer(), StringSelectComponent.Companion.serializer(), UserSelectComponent.Companion.serializer(), RoleSelectComponent.Companion.serializer(), MentionableSelectComponent.Companion.serializer(), ChannelSelectComponent.Companion.serializer()});
    }

    private ComponentSerializer() {
        super(C9656f0.m14684b(Component.class));
    }

    private static /* synthetic */ void getComponentClassSerializer$annotations() {
    }

    @Override // kotlinx.serialization.json.AbstractC9992d
    protected DeserializationStrategy<Component> selectDeserializer(JsonElement element) {
        Integer num;
        boolean M;
        JsonPrimitive k;
        C9677q.m14633g(element, "element");
        List<Integer> list = knownTypes;
        JsonElement jsonElement = (JsonElement) C9994f.m13719j(element).get("type");
        if (jsonElement == null || (k = C9994f.m13718k(jsonElement)) == null) {
            num = null;
        } else {
            num = Integer.valueOf(C9994f.m13720i(k));
        }
        M = C9618r.m14778M(list, num);
        if (M) {
            return componentClassSerializer;
        }
        return UnknownComponent.Companion.serializer();
    }
}
