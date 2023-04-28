package com.discord.notifications.api;

import com.discord.serialization.IntEnum;
import com.discord.serialization.IntEnumSerializer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C9656f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import nf.C10839n;
import nf.EnumC10842p;
import p450yi.AbstractC14370f;

@AbstractC14370f(with = Serializer.class)
@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\f\rB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, m15073d2 = {"Lcom/discord/notifications/api/StickerFormatType;", "", "Lcom/discord/serialization/IntEnum;", "serialNumber", "", "(Ljava/lang/String;II)V", "getSerialNumber", "()I", "UNKNOWN", "PNG", "APNG", "LOTTIE", "Companion", "Serializer", "notification_api_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public enum StickerFormatType implements IntEnum {
    UNKNOWN(-1),
    PNG(1),
    APNG(2),
    LOTTIE(3);
    
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final int serialNumber;

    @Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, m15073d2 = {"Lcom/discord/notifications/api/StickerFormatType$Companion;", "", "()V", "fromInt", "Lcom/discord/notifications/api/StickerFormatType;", "int", "", "serializer", "Lkotlinx/serialization/KSerializer;", "notification_api_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return StickerFormatType.$cachedSerializer$delegate;
        }

        public final StickerFormatType fromInt(int i) {
            StickerFormatType stickerFormatType;
            boolean z;
            StickerFormatType[] values = StickerFormatType.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    stickerFormatType = null;
                    break;
                }
                stickerFormatType = values[i2];
                if (stickerFormatType.getSerialNumber() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            if (stickerFormatType == null) {
                return StickerFormatType.UNKNOWN;
            }
            return stickerFormatType;
        }

        public final KSerializer<StickerFormatType> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lcom/discord/notifications/api/StickerFormatType$Serializer;", "Lcom/discord/serialization/IntEnumSerializer;", "Lcom/discord/notifications/api/StickerFormatType;", "()V", "notification_api_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Serializer extends IntEnumSerializer<StickerFormatType> {
        public static final Serializer INSTANCE = new Serializer();

        private Serializer() {
            super(C9656f0.m14684b(StickerFormatType.class), null, 2, null);
        }
    }

    static {
        Lazy<KSerializer<Object>> b;
        b = C10839n.m10944b(EnumC10842p.PUBLICATION, StickerFormatType$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = b;
    }

    StickerFormatType(int i) {
        this.serialNumber = i;
    }

    @Override // com.discord.serialization.IntEnum
    public int getSerialNumber() {
        return this.serialNumber;
    }
}
