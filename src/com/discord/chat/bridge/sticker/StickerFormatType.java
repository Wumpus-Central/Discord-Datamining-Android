package com.discord.chat.bridge.sticker;

import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import nf.C11084n;
import nf.EnumC11087p;
import p014aj.AbstractC1413e;
import p014aj.C1427g;
import p449yi.AbstractC14435f;

@AbstractC14435f(with = StickerFormatTypeSerializer.class)
@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, m15073d2 = {"Lcom/discord/chat/bridge/sticker/StickerFormatType;", "", "intType", "", "(Ljava/lang/String;II)V", "getIntType", "()I", "PNG", "APNG", "LOTTIE", "GIF", "Companion", "StickerFormatTypeSerializer", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public enum StickerFormatType {
    PNG(1),
    APNG(2),
    LOTTIE(3),
    GIF(4);
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final int intType;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/sticker/StickerFormatType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/sticker/StickerFormatType;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return StickerFormatType.$cachedSerializer$delegate;
        }

        public final KSerializer<StickerFormatType> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/chat/bridge/sticker/StickerFormatType$StickerFormatTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/sticker/StickerFormatType;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class StickerFormatTypeSerializer implements KSerializer<StickerFormatType> {
        public static final StickerFormatTypeSerializer INSTANCE = new StickerFormatTypeSerializer();

        private StickerFormatTypeSerializer() {
        }

        @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
        public SerialDescriptor getDescriptor() {
            return C1427g.m41131a("StickerFormatType", AbstractC1413e.C1418f.f468a);
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public StickerFormatType deserialize(Decoder decoder) {
            StickerFormatType[] values;
            C9971q.m14633g(decoder, "decoder");
            int h = decoder.mo13903h();
            for (StickerFormatType stickerFormatType : StickerFormatType.values()) {
                if (stickerFormatType.getIntType() == h) {
                    return stickerFormatType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public void serialize(Encoder encoder, StickerFormatType value) {
            C9971q.m14633g(encoder, "encoder");
            C9971q.m14633g(value, "value");
            encoder.mo13892B(value.getIntType());
        }
    }

    static {
        Lazy<KSerializer<Object>> b;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, StickerFormatType$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b;
    }

    StickerFormatType(int i) {
        this.intType = i;
    }

    public final int getIntType() {
        return this.intType;
    }
}
