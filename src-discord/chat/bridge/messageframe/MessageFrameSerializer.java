package com.discord.chat.bridge.messageframe;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.d;
import kotlinx.serialization.json.g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/bridge/messageframe/MessageFrameSerializer;", "Lkotlinx/serialization/json/d;", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "", "", "knownTypes", "Ljava/util/List;", "Lkotlinx/serialization/SealedClassSerializer;", "messageFrameClassSerializer", "Lkotlinx/serialization/SealedClassSerializer;", "getMessageFrameClassSerializer$annotations", "()V", "<init>", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageFrameSerializer extends d<MessageFrame> {
    public static final MessageFrameSerializer INSTANCE = new MessageFrameSerializer();
    private static final List<Integer> knownTypes;
    private static final SealedClassSerializer<MessageFrame> messageFrameClassSerializer;

    static {
        MessageFrameType[] values = MessageFrameType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (MessageFrameType messageFrameType : values) {
            arrayList.add(Integer.valueOf(messageFrameType.getSerialNumber()));
        }
        knownTypes = arrayList;
        messageFrameClassSerializer = new SealedClassSerializer<>("MessageFrame", f0.b(MessageFrame.class), new KClass[]{f0.b(UnknownMessageFrame.class), f0.b(MessageFrameJump.class), f0.b(MessageFrameMediaViewer.class)}, new KSerializer[]{UnknownMessageFrame.Companion.serializer(), MessageFrameJump.Companion.serializer(), MessageFrameMediaViewer.Companion.serializer()});
    }

    private MessageFrameSerializer() {
        super(f0.b(MessageFrame.class));
    }

    private static  void getMessageFrameClassSerializer$annotations() {
    }

    @Override 
    protected DeserializationStrategy<MessageFrame> selectDeserializer(JsonElement element) {
        Integer num;
        boolean K;
        JsonPrimitive n10;
        q.h(element, "element");
        List<Integer> list = knownTypes;
        JsonElement jsonElement = (JsonElement) g.m(element).get("type");
        if (jsonElement == null || (n10 = g.n(jsonElement)) == null) {
            num = null;
        } else {
            num = Integer.valueOf(g.l(n10));
        }
        K = r.K(list, num);
        if (K) {
            return messageFrameClassSerializer;
        }
        return UnknownMessageFrame.Companion.serializer();
    }
}
