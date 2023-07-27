package com.discord.chat.bridge.activityinviteembed;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import qi.a;
import si.a2;
import si.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289B\u007f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Bm\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u0013\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J}\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÇ\u0001R\u001b\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u0006:"}, d2 = {"Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "", "seen1", "", "coverImage", "", "isListening", "", "headerText", "partyStatus", "avatarsToRender", "", "maxPartySize", ZeroconfModule.KEY_SERVICE_NAME, "subtext", "joinable", "ctaText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAvatarsToRender", "()Ljava/util/List;", "getCoverImage", "()Ljava/lang/String;", "getCtaText", "getHeaderText", "()Z", "getJoinable", "getMaxPartySize", "()I", "getName", "getPartyStatus", "getSubtext", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ActivityInviteEmbed {
    public static final Companion Companion = new Companion(null);
    private final List<String> avatarsToRender;
    private final String coverImage;
    private final String ctaText;
    private final String headerText;
    private final boolean isListening;
    private final boolean joinable;
    private final int maxPartySize;
    private final String name;
    private final String partyStatus;
    private final String subtext;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityInviteEmbed> serializer() {
            return ActivityInviteEmbed$$serializer.INSTANCE;
        }
    }

    public  ActivityInviteEmbed(int i10, String str, boolean z10, String str2, String str3, List list, int i11, String str4, String str5, boolean z11, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (814 != (i10 & 814)) {
            n1.b(i10, 814, ActivityInviteEmbed$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.coverImage = null;
        } else {
            this.coverImage = str;
        }
        this.isListening = z10;
        this.headerText = str2;
        this.partyStatus = str3;
        if ((i10 & 16) == 0) {
            this.avatarsToRender = null;
        } else {
            this.avatarsToRender = list;
        }
        this.maxPartySize = i11;
        if ((i10 & 64) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i10 & 128) == 0) {
            this.subtext = null;
        } else {
            this.subtext = str5;
        }
        this.joinable = z11;
        this.ctaText = str6;
    }

    public static final void write$Self(ActivityInviteEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z13 = false;
        if (!output.w(serialDesc, 0) && self.coverImage == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 0, a2.f26233a, self.coverImage);
        }
        output.r(serialDesc, 1, self.isListening);
        output.s(serialDesc, 2, self.headerText);
        output.s(serialDesc, 3, self.partyStatus);
        if (!output.w(serialDesc, 4) && self.avatarsToRender == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.z(serialDesc, 4, new si.f(a.u(a2.f26233a)), self.avatarsToRender);
        }
        output.q(serialDesc, 5, self.maxPartySize);
        if (!output.w(serialDesc, 6) && self.name == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.z(serialDesc, 6, a2.f26233a, self.name);
        }
        if (output.w(serialDesc, 7) || self.subtext != null) {
            z13 = true;
        }
        if (z13) {
            output.z(serialDesc, 7, a2.f26233a, self.subtext);
        }
        output.r(serialDesc, 8, self.joinable);
        output.s(serialDesc, 9, self.ctaText);
    }

    public final String component1() {
        return this.coverImage;
    }

    public final String component10() {
        return this.ctaText;
    }

    public final boolean component2() {
        return this.isListening;
    }

    public final String component3() {
        return this.headerText;
    }

    public final String component4() {
        return this.partyStatus;
    }

    public final List<String> component5() {
        return this.avatarsToRender;
    }

    public final int component6() {
        return this.maxPartySize;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.subtext;
    }

    public final boolean component9() {
        return this.joinable;
    }

    public final ActivityInviteEmbed copy(String str, boolean z10, String headerText, String partyStatus, List<String> list, int i10, String str2, String str3, boolean z11, String ctaText) {
        q.g(headerText, "headerText");
        q.g(partyStatus, "partyStatus");
        q.g(ctaText, "ctaText");
        return new ActivityInviteEmbed(str, z10, headerText, partyStatus, list, i10, str2, str3, z11, ctaText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityInviteEmbed)) {
            return false;
        }
        ActivityInviteEmbed activityInviteEmbed = (ActivityInviteEmbed) obj;
        return q.b(this.coverImage, activityInviteEmbed.coverImage) && this.isListening == activityInviteEmbed.isListening && q.b(this.headerText, activityInviteEmbed.headerText) && q.b(this.partyStatus, activityInviteEmbed.partyStatus) && q.b(this.avatarsToRender, activityInviteEmbed.avatarsToRender) && this.maxPartySize == activityInviteEmbed.maxPartySize && q.b(this.name, activityInviteEmbed.name) && q.b(this.subtext, activityInviteEmbed.subtext) && this.joinable == activityInviteEmbed.joinable && q.b(this.ctaText, activityInviteEmbed.ctaText);
    }

    public final List<String> getAvatarsToRender() {
        return this.avatarsToRender;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final boolean getJoinable() {
        return this.joinable;
    }

    public final int getMaxPartySize() {
        return this.maxPartySize;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartyStatus() {
        return this.partyStatus;
    }

    public final String getSubtext() {
        return this.subtext;
    }

    public int hashCode() {
        String str = this.coverImage;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.isListening;
        int i11 = 1;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int hashCode2 = (((((hashCode + i12) * 31) + this.headerText.hashCode()) * 31) + this.partyStatus.hashCode()) * 31;
        List<String> list = this.avatarsToRender;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.maxPartySize) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtext;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        int i15 = (hashCode4 + i10) * 31;
        boolean z11 = this.joinable;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return ((i15 + i11) * 31) + this.ctaText.hashCode();
    }

    public final boolean isListening() {
        return this.isListening;
    }

    public String toString() {
        String str = this.coverImage;
        boolean z10 = this.isListening;
        String str2 = this.headerText;
        String str3 = this.partyStatus;
        List<String> list = this.avatarsToRender;
        int i10 = this.maxPartySize;
        String str4 = this.name;
        String str5 = this.subtext;
        boolean z11 = this.joinable;
        String str6 = this.ctaText;
        return "ActivityInviteEmbed(coverImage=" + str + ", isListening=" + z10 + ", headerText=" + str2 + ", partyStatus=" + str3 + ", avatarsToRender=" + list + ", maxPartySize=" + i10 + ", name=" + str4 + ", subtext=" + str5 + ", joinable=" + z11 + ", ctaText=" + str6 + ")";
    }

    public ActivityInviteEmbed(String str, boolean z10, String headerText, String partyStatus, List<String> list, int i10, String str2, String str3, boolean z11, String ctaText) {
        q.g(headerText, "headerText");
        q.g(partyStatus, "partyStatus");
        q.g(ctaText, "ctaText");
        this.coverImage = str;
        this.isListening = z10;
        this.headerText = headerText;
        this.partyStatus = partyStatus;
        this.avatarsToRender = list;
        this.maxPartySize = i10;
        this.name = str2;
        this.subtext = str3;
        this.joinable = z11;
        this.ctaText = ctaText;
    }

    public  ActivityInviteEmbed(String str, boolean z10, String str2, String str3, List list, int i10, String str4, String str5, boolean z11, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, z10, str2, str3, (i11 & 16) != 0 ? null : list, i10, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, z11, str6);
    }
}
