package com.discord.chat.bridge;

import com.discord.serialization.IntEnum;
import com.discord.serialization.IntEnumSerializer;
import java.util.EnumSet;
import java.util.Set;
import kg.n;
import kg.p;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import vj.f;

@f(with = Serializer.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\b\u0087\u0001\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u000256B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\r\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4¨\u00067"}, d2 = {"Lcom/discord/chat/bridge/MessageType;", "", "Lcom/discord/serialization/IntEnum;", "serialNumber", "", "(Ljava/lang/String;II)V", "isAutomodSystem", "", "()Z", "isAutomodSystem$delegate", "Lkotlin/Lazy;", "isCall", "isCall$delegate", "isSystem", "isSystem$delegate", "getSerialNumber", "()I", "DEFAULT", "RECIPIENT_ADD", "RECIPIENT_REMOVE", "CALL", "CHANNEL_NAME_CHANGE", "CHANNEL_ICON_CHANGE", "CHANNEL_PINNED_MESSAGE", "USER_JOIN", "USER_PREMIUM_GUILD_SUBSCRIPTION", "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1", "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2", "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3", "CHANNEL_FOLLOW_ADD", "GUILD_STREAM", "GUILD_DISCOVERY_DISQUALIFIED", "GUILD_DISCOVERY_REQUALIFIED", "GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING", "GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING", "THREAD_CREATED", "REPLY", "CHAT_INPUT_COMMAND", "THREAD_STARTER_MESSAGE", "GUILD_INVITE_REMINDER", "CONTEXT_MENU_COMMAND", "AUTO_MODERATION_ACTION", "ROLE_SUBSCRIPTION_PURCHASE", "INTERACTION_PREMIUM_UPSELL", "STAGE_START", "STAGE_END", "STAGE_SPEAKER", "STAGE_RAISE_HAND", "STAGE_TOPIC", "GUILD_APPLICATION_PREMIUM_SUBSCRIPTION", "PRIVATE_CHANNEL_INTEGRATION_ADDED", "PRIVATE_CHANNEL_INTEGRATION_REMOVED", "PREMIUM_REFERRAL", "Companion", "Serializer", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public enum MessageType implements IntEnum {
    DEFAULT(0),
    RECIPIENT_ADD(1),
    RECIPIENT_REMOVE(2),
    CALL(3),
    CHANNEL_NAME_CHANGE(4),
    CHANNEL_ICON_CHANGE(5),
    CHANNEL_PINNED_MESSAGE(6),
    USER_JOIN(7),
    USER_PREMIUM_GUILD_SUBSCRIPTION(8),
    USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1(9),
    USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2(10),
    USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3(11),
    CHANNEL_FOLLOW_ADD(12),
    GUILD_STREAM(13),
    GUILD_DISCOVERY_DISQUALIFIED(14),
    GUILD_DISCOVERY_REQUALIFIED(15),
    GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING(16),
    GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING(17),
    THREAD_CREATED(18),
    REPLY(19),
    CHAT_INPUT_COMMAND(20),
    THREAD_STARTER_MESSAGE(21),
    GUILD_INVITE_REMINDER(22),
    CONTEXT_MENU_COMMAND(23),
    AUTO_MODERATION_ACTION(24),
    ROLE_SUBSCRIPTION_PURCHASE(25),
    INTERACTION_PREMIUM_UPSELL(26),
    STAGE_START(27),
    STAGE_END(28),
    STAGE_SPEAKER(29),
    STAGE_RAISE_HAND(30),
    STAGE_TOPIC(31),
    GUILD_APPLICATION_PREMIUM_SUBSCRIPTION(32),
    PRIVATE_CHANNEL_INTEGRATION_ADDED(33),
    PRIVATE_CHANNEL_INTEGRATION_REMOVED(34),
    PREMIUM_REFERRAL(35);
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    private static final Set<MessageType> CallTypes;
    public static final Companion Companion = new Companion(null);
    private static final Set<MessageType> SystemTypes;
    private final Lazy isAutomodSystem$delegate;
    private final Lazy isCall$delegate;
    private final Lazy isSystem$delegate;
    private final int serialNumber;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/discord/chat/bridge/MessageType$Companion;", "", "()V", "CallTypes", "", "Lcom/discord/chat/bridge/MessageType;", "getCallTypes", "()Ljava/util/Set;", "SystemTypes", "getSystemTypes", "serializer", "Lkotlinx/serialization/KSerializer;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return MessageType.$cachedSerializer$delegate;
        }

        public final Set<MessageType> getCallTypes() {
            return MessageType.CallTypes;
        }

        public final Set<MessageType> getSystemTypes() {
            return MessageType.SystemTypes;
        }

        public final KSerializer<MessageType> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/chat/bridge/MessageType$Serializer;", "Lcom/discord/serialization/IntEnumSerializer;", "Lcom/discord/chat/bridge/MessageType;", "()V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Serializer extends IntEnumSerializer<MessageType> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
            super(f0.b(MessageType.class), null, 2, null);
        }
    }

    static {
        MessageType messageType;
        MessageType messageType2;
        MessageType messageType3;
        MessageType messageType4;
        MessageType messageType5;
        MessageType messageType6;
        MessageType messageType7;
        MessageType messageType8;
        MessageType messageType9;
        MessageType messageType10;
        MessageType messageType11;
        MessageType messageType12;
        MessageType messageType13;
        MessageType messageType14;
        MessageType messageType15;
        MessageType messageType16;
        MessageType messageType17;
        MessageType messageType18;
        MessageType messageType19;
        MessageType messageType20;
        MessageType messageType21;
        MessageType messageType22;
        MessageType messageType23;
        MessageType messageType24;
        MessageType messageType25;
        MessageType messageType26;
        Lazy<KSerializer<Object>> a10;
        MessageType messageType27 = CALL;
        MessageType messageType28 = GUILD_STREAM;
        EnumSet of2 = EnumSet.of(r0, messageType, messageType27, messageType2, messageType3, messageType4, messageType5, messageType6, messageType7, messageType8, messageType9, messageType10, messageType28, messageType11, messageType12, messageType13, messageType14, messageType15, messageType16, messageType17, messageType18, messageType19, messageType20, messageType21, messageType22, messageType23, messageType24, messageType25, messageType26);
        q.f(of2, "of(\n            RECIPIEN…RATION_REMOVED,\n        )");
        SystemTypes = of2;
        EnumSet of3 = EnumSet.of(messageType27, messageType28);
        q.f(of3, "of(\n            CALL,\n  …  GUILD_STREAM,\n        )");
        CallTypes = of3;
        a10 = n.a(p.PUBLICATION, MessageType$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = a10;
    }

    MessageType(int i10) {
        Lazy b10;
        Lazy b11;
        Lazy b12;
        this.serialNumber = i10;
        b10 = n.b(new MessageType$isSystem$2(this));
        this.isSystem$delegate = b10;
        b11 = n.b(new MessageType$isAutomodSystem$2(this));
        this.isAutomodSystem$delegate = b11;
        b12 = n.b(new MessageType$isCall$2(this));
        this.isCall$delegate = b12;
    }

    @Override // com.discord.serialization.IntEnum
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public final boolean isAutomodSystem() {
        return ((Boolean) this.isAutomodSystem$delegate.getValue()).booleanValue();
    }

    public final boolean isCall() {
        return ((Boolean) this.isCall$delegate.getValue()).booleanValue();
    }

    public final boolean isSystem() {
        return ((Boolean) this.isSystem$delegate.getValue()).booleanValue();
    }
}
