package com.discord.chat.input.bridge;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import nf.C11084n;
import nf.EnumC11087p;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;", "", "(Ljava/lang/String;I)V", "Bold", "Companion", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public enum ChatInputNodeFontWeight {
    Bold;
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return ChatInputNodeFontWeight.$cachedSerializer$delegate;
        }

        public final KSerializer<ChatInputNodeFontWeight> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    static {
        Lazy<KSerializer<Object>> b;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, ChatInputNodeFontWeight$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b;
    }
}
