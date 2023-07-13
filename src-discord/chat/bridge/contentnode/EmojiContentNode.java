package com.discord.chat.bridge.contentnode;

import com.discord.chat.presentation.textutils.Jumboable;
import ff.n;
import ff.p;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;

@f
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fHÇ\u0001\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "Lcom/discord/chat/presentation/textutils/Jumboable;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public abstract class EmojiContentNode extends ContentNode implements Jumboable {
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/EmojiContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final  Lazy get$cachedSerializer$delegate() {
            return EmojiContentNode.$cachedSerializer$delegate;
        }

        public final KSerializer<EmojiContentNode> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    static {
        Lazy<KSerializer<Object>> a10;
        a10 = n.a(p.PUBLICATION, EmojiContentNode$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = a10;
    }

    public  EmojiContentNode(int i10, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
    }

    public  EmojiContentNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final void write$Self(EmojiContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
    }

    private EmojiContentNode() {
        super(null);
    }
}
