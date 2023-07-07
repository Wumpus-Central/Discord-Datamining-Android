package com.discord.notifications.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.notifications.api.StickerFormatType;
import com.discord.notifications.api.StickerType;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.StickerId;
import com.discord.primitives.StickerId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.h;
import ti.n1;
import ti.w0;

@f
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002VWB\u0088\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016Bf\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0019\u00105\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u0010(J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010.J\u0019\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b:J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0011HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001bJv\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\t\u0010C\u001a\u00020\u0003HÖ\u0001J\u0013\u0010D\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\u0006\u0010G\u001a\u00020\u0007J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0006\u0010I\u001a\u00020\u0013J\t\u0010J\u001a\u00020\u0007HÖ\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÇ\u0001J\u0019\u0010R\u001a\u00020L2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0003HÖ\u0001R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001c\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\"R'\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R'\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010)\u0012\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001fR \u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010/\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Lcom/discord/notifications/api/Sticker;", "Landroid/os/Parcelable;", "seen1", "", "id", "Lcom/discord/primitives/StickerId;", ZeroconfModule.KEY_SERVICE_NAME, "", "packId", "", "guildId", "Lcom/discord/primitives/GuildId;", "description", "formatType", "Lcom/discord/notifications/api/StickerFormatType;", "tags", "type", "Lcom/discord/notifications/api/StickerType;", "available", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/StickerId;Ljava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvailable$annotations", "()V", "getAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription$annotations", "getDescription", "()Ljava/lang/String;", "getFormatType$annotations", "getFormatType", "()Lcom/discord/notifications/api/StickerFormatType;", "getGuildId-qOKuAAo$annotations", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getId-e_wqtJY$annotations", "getId-e_wqtJY", "()J", "J", "getName$annotations", "getName", "getPackId$annotations", "getPackId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTags$annotations", "getTags", "getType$annotations", "getType", "()Lcom/discord/notifications/api/StickerType;", "component1", "component1-e_wqtJY", "component2", "component3", "component4", "component4-qOKuAAo", "component5", "component6", "component7", "component8", "component9", "copy", "copy-fJhvhH4", "(JLjava/lang/String;Ljava/lang/Long;Lcom/discord/primitives/GuildId;Ljava/lang/String;Lcom/discord/notifications/api/StickerFormatType;Ljava/lang/String;Lcom/discord/notifications/api/StickerType;Ljava/lang/Boolean;)Lcom/discord/notifications/api/Sticker;", "describeContents", "equals", "other", "", "getExtension", "hashCode", "isAnimated", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Sticker implements Parcelable {
    private final Boolean available;
    private final String description;
    private final StickerFormatType formatType;
    private final GuildId guildId;

    /* renamed from: id  reason: collision with root package name */
    private final long f7595id;
    private final String name;
    private final Long packId;
    private final String tags;
    private final StickerType type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Sticker> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/notifications/api/Sticker$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/Sticker;", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Sticker> serializer() {
            return Sticker$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Sticker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Sticker createFromParcel(Parcel parcel) {
            Boolean bool;
            q.g(parcel, "parcel");
            long j10 = ((StickerId) parcel.readParcelable(Sticker.class.getClassLoader())).m624unboximpl();
            String readString = parcel.readString();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            GuildId guildId = (GuildId) parcel.readParcelable(Sticker.class.getClassLoader());
            String readString2 = parcel.readString();
            StickerFormatType valueOf2 = StickerFormatType.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            StickerType valueOf3 = StickerType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Sticker(j10, readString, valueOf, guildId, readString2, valueOf2, readString3, valueOf3, bool, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Sticker[] newArray(int i10) {
            return new Sticker[i10];
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerFormatType.values().length];
            try {
                iArr[StickerFormatType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerFormatType.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerFormatType.APNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerFormatType.LOTTIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Sticker(int i10, StickerId stickerId, String str, Long l10, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        long j10;
        if (2 != (i10 & 2)) {
            n1.b(i10, 2, Sticker$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            j10 = StickerId.m616constructorimpl(0L);
        } else {
            j10 = stickerId.m624unboximpl();
        }
        this.f7595id = j10;
        this.name = str;
        if ((i10 & 4) == 0) {
            this.packId = null;
        } else {
            this.packId = l10;
        }
        if ((i10 & 8) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i10 & 16) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
        if ((i10 & 32) == 0) {
            this.formatType = StickerFormatType.Companion.fromInt(0);
        } else {
            this.formatType = stickerFormatType;
        }
        if ((i10 & 64) == 0) {
            this.tags = "";
        } else {
            this.tags = str3;
        }
        if ((i10 & 128) == 0) {
            this.type = StickerType.Companion.fromInt(0);
        } else {
            this.type = stickerType;
        }
        if ((i10 & 256) == 0) {
            this.available = null;
        } else {
            this.available = bool;
        }
    }

    public /* synthetic */ Sticker(int i10, StickerId stickerId, String str, Long l10, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, stickerId, str, l10, guildId, str2, stickerFormatType, str3, stickerType, bool, serializationConstructorMarker);
    }

    public /* synthetic */ Sticker(long j10, String str, Long l10, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, l10, guildId, str2, stickerFormatType, str3, stickerType, bool);
    }

    public static /* synthetic */ void getAvailable$annotations() {
    }

    public static /* synthetic */ void getDescription$annotations() {
    }

    public static /* synthetic */ void getFormatType$annotations() {
    }

    /* renamed from: getGuildId-qOKuAAo$annotations  reason: not valid java name */
    public static /* synthetic */ void m537getGuildIdqOKuAAo$annotations() {
    }

    /* renamed from: getId-e_wqtJY$annotations  reason: not valid java name */
    public static /* synthetic */ void m538getIde_wqtJY$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getPackId$annotations() {
    }

    public static /* synthetic */ void getTags$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self(Sticker self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z17 = false;
        if (!output.w(serialDesc, 0) && StickerId.m619equalsimpl0(self.f7595id, StickerId.m616constructorimpl(0L))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.C(serialDesc, 0, StickerId$$serializer.INSTANCE, StickerId.m615boximpl(self.f7595id));
        }
        output.t(serialDesc, 1, self.name);
        if (!output.w(serialDesc, 2) && self.packId == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.e(serialDesc, 2, w0.f27088a, self.packId);
        }
        if (!output.w(serialDesc, 3) && self.guildId == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.e(serialDesc, 3, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (!output.w(serialDesc, 4) && q.b(self.description, "")) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            output.t(serialDesc, 4, self.description);
        }
        if (!output.w(serialDesc, 5) && self.formatType == StickerFormatType.Companion.fromInt(0)) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            output.C(serialDesc, 5, StickerFormatType.Serializer.INSTANCE, self.formatType);
        }
        if (!output.w(serialDesc, 6) && q.b(self.tags, "")) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            output.t(serialDesc, 6, self.tags);
        }
        if (!output.w(serialDesc, 7) && self.type == StickerType.Companion.fromInt(0)) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (z16) {
            output.C(serialDesc, 7, StickerType.Serializer.INSTANCE, self.type);
        }
        if (output.w(serialDesc, 8) || self.available != null) {
            z17 = true;
        }
        if (z17) {
            output.e(serialDesc, 8, h.f27014a, self.available);
        }
    }

    /* renamed from: component1-e_wqtJY  reason: not valid java name */
    public final long m539component1e_wqtJY() {
        return this.f7595id;
    }

    public final String component2() {
        return this.name;
    }

    public final Long component3() {
        return this.packId;
    }

    /* renamed from: component4-qOKuAAo  reason: not valid java name */
    public final GuildId m540component4qOKuAAo() {
        return this.guildId;
    }

    public final String component5() {
        return this.description;
    }

    public final StickerFormatType component6() {
        return this.formatType;
    }

    public final String component7() {
        return this.tags;
    }

    public final StickerType component8() {
        return this.type;
    }

    public final Boolean component9() {
        return this.available;
    }

    /* renamed from: copy-fJhvhH4  reason: not valid java name */
    public final Sticker m541copyfJhvhH4(long j10, String name, Long l10, GuildId guildId, String description, StickerFormatType formatType, String tags, StickerType type, Boolean bool) {
        q.g(name, "name");
        q.g(description, "description");
        q.g(formatType, "formatType");
        q.g(tags, "tags");
        q.g(type, "type");
        return new Sticker(j10, name, l10, guildId, description, formatType, tags, type, bool, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sticker)) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        return StickerId.m619equalsimpl0(this.f7595id, sticker.f7595id) && q.b(this.name, sticker.name) && q.b(this.packId, sticker.packId) && q.b(this.guildId, sticker.guildId) && q.b(this.description, sticker.description) && this.formatType == sticker.formatType && q.b(this.tags, sticker.tags) && this.type == sticker.type && q.b(this.available, sticker.available);
    }

    public final Boolean getAvailable() {
        return this.available;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExtension() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.formatType.ordinal()];
        if (i10 == 1) {
            return "";
        }
        if (i10 == 2 || i10 == 3) {
            return ".png";
        }
        if (i10 == 4) {
            return ".json";
        }
        throw new gf.q();
    }

    public final StickerFormatType getFormatType() {
        return this.formatType;
    }

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m542getGuildIdqOKuAAo() {
        return this.guildId;
    }

    /* renamed from: getId-e_wqtJY  reason: not valid java name */
    public final long m543getIde_wqtJY() {
        return this.f7595id;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getPackId() {
        return this.packId;
    }

    public final String getTags() {
        return this.tags;
    }

    public final StickerType getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = ((StickerId.m620hashCodeimpl(this.f7595id) * 31) + this.name.hashCode()) * 31;
        Long l10 = this.packId;
        int i11 = 0;
        int hashCode = (i10 + (l10 == null ? 0 : l10.hashCode())) * 31;
        GuildId guildId = this.guildId;
        int i12 = (((((((((hashCode + (guildId == null ? 0 : GuildId.m582hashCodeimpl(guildId.m586unboximpl()))) * 31) + this.description.hashCode()) * 31) + this.formatType.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.type.hashCode()) * 31;
        Boolean bool = this.available;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return i12 + i11;
    }

    public final boolean isAnimated() {
        StickerFormatType stickerFormatType = this.formatType;
        return stickerFormatType == StickerFormatType.APNG || stickerFormatType == StickerFormatType.LOTTIE;
    }

    public String toString() {
        String str = StickerId.m622toStringimpl(this.f7595id);
        String str2 = this.name;
        Long l10 = this.packId;
        GuildId guildId = this.guildId;
        String str3 = this.description;
        StickerFormatType stickerFormatType = this.formatType;
        String str4 = this.tags;
        StickerType stickerType = this.type;
        Boolean bool = this.available;
        return "Sticker(id=" + str + ", name=" + str2 + ", packId=" + l10 + ", guildId=" + guildId + ", description=" + str3 + ", formatType=" + stickerFormatType + ", tags=" + str4 + ", type=" + stickerType + ", available=" + bool + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        q.g(out, "out");
        out.writeParcelable(StickerId.m615boximpl(this.f7595id), i10);
        out.writeString(this.name);
        Long l10 = this.packId;
        if (l10 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l10.longValue());
        }
        out.writeParcelable(this.guildId, i10);
        out.writeString(this.description);
        out.writeString(this.formatType.name());
        out.writeString(this.tags);
        out.writeString(this.type.name());
        Boolean bool = this.available;
        if (bool == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool.booleanValue() ? 1 : 0);
    }

    private Sticker(long j10, String str, Long l10, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool) {
        this.f7595id = j10;
        this.name = str;
        this.packId = l10;
        this.guildId = guildId;
        this.description = str2;
        this.formatType = stickerFormatType;
        this.tags = str3;
        this.type = stickerType;
        this.available = bool;
    }

    public /* synthetic */ Sticker(long j10, String str, Long l10, GuildId guildId, String str2, StickerFormatType stickerFormatType, String str3, StickerType stickerType, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? StickerId.m616constructorimpl(0L) : j10, str, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : guildId, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? StickerFormatType.Companion.fromInt(0) : stickerFormatType, (i10 & 64) != 0 ? "" : str3, (i10 & 128) != 0 ? StickerType.Companion.fromInt(0) : stickerType, (i10 & 256) != 0 ? null : bool, null);
    }
}
