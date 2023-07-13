package com.discord.chat.bridge.botuikit;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import pi.f;

@f(with = ComponentSerializer.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/bridge/botuikit/Component;", "", "()V", "indices", "", "", "getIndices", "()Ljava/util/List;", "type", "getType", "()I", "Companion", "Lcom/discord/chat/bridge/botuikit/ActionRowComponent;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "Lcom/discord/chat/bridge/botuikit/UnknownComponent;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public abstract class Component {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/botuikit/Component$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/Component;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Component> serializer() {
            return ComponentSerializer.INSTANCE;
        }
    }

    private Component() {
    }

    public  Component(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<Integer> getIndices();

    public abstract int getType();
}
