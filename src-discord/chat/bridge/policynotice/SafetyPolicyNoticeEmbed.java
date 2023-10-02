package com.discord.chat.bridge.policynotice;

import cj.n1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006+"}, d2 = {"Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "", "seen1", "", "classificationId", "", "titleText", "titleIcon", "subtitleText", "descriptionText", "ctaText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClassificationId", "()Ljava/lang/String;", "getCtaText", "getDescriptionText", "getSubtitleText", "getTitleIcon", "getTitleText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class SafetyPolicyNoticeEmbed {
    public static final Companion Companion = new Companion(null);
    private final String classificationId;
    private final String ctaText;
    private final String descriptionText;
    private final String subtitleText;
    private final String titleIcon;
    private final String titleText;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SafetyPolicyNoticeEmbed> serializer() {
            return SafetyPolicyNoticeEmbed$$serializer.INSTANCE;
        }
    }

    public  SafetyPolicyNoticeEmbed(int i10, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i10 & 63)) {
            n1.b(i10, 63, SafetyPolicyNoticeEmbed$$serializer.INSTANCE.getDescriptor());
        }
        this.classificationId = str;
        this.titleText = str2;
        this.titleIcon = str3;
        this.subtitleText = str4;
        this.descriptionText = str5;
        this.ctaText = str6;
    }

    public static  SafetyPolicyNoticeEmbed copy$default(SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = safetyPolicyNoticeEmbed.classificationId;
        }
        if ((i10 & 2) != 0) {
            str2 = safetyPolicyNoticeEmbed.titleText;
        }
        if ((i10 & 4) != 0) {
            str3 = safetyPolicyNoticeEmbed.titleIcon;
        }
        if ((i10 & 8) != 0) {
            str4 = safetyPolicyNoticeEmbed.subtitleText;
        }
        if ((i10 & 16) != 0) {
            str5 = safetyPolicyNoticeEmbed.descriptionText;
        }
        if ((i10 & 32) != 0) {
            str6 = safetyPolicyNoticeEmbed.ctaText;
        }
        return safetyPolicyNoticeEmbed.copy(str, str2, str3, str4, str5, str6);
    }

    public static final void write$Self(SafetyPolicyNoticeEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.classificationId);
        output.y(serialDesc, 1, self.titleText);
        output.y(serialDesc, 2, self.titleIcon);
        output.y(serialDesc, 3, self.subtitleText);
        output.y(serialDesc, 4, self.descriptionText);
        output.y(serialDesc, 5, self.ctaText);
    }

    public final String component1() {
        return this.classificationId;
    }

    public final String component2() {
        return this.titleText;
    }

    public final String component3() {
        return this.titleIcon;
    }

    public final String component4() {
        return this.subtitleText;
    }

    public final String component5() {
        return this.descriptionText;
    }

    public final String component6() {
        return this.ctaText;
    }

    public final SafetyPolicyNoticeEmbed copy(String classificationId, String titleText, String titleIcon, String subtitleText, String descriptionText, String ctaText) {
        q.h(classificationId, "classificationId");
        q.h(titleText, "titleText");
        q.h(titleIcon, "titleIcon");
        q.h(subtitleText, "subtitleText");
        q.h(descriptionText, "descriptionText");
        q.h(ctaText, "ctaText");
        return new SafetyPolicyNoticeEmbed(classificationId, titleText, titleIcon, subtitleText, descriptionText, ctaText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafetyPolicyNoticeEmbed)) {
            return false;
        }
        SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = (SafetyPolicyNoticeEmbed) obj;
        return q.c(this.classificationId, safetyPolicyNoticeEmbed.classificationId) && q.c(this.titleText, safetyPolicyNoticeEmbed.titleText) && q.c(this.titleIcon, safetyPolicyNoticeEmbed.titleIcon) && q.c(this.subtitleText, safetyPolicyNoticeEmbed.subtitleText) && q.c(this.descriptionText, safetyPolicyNoticeEmbed.descriptionText) && q.c(this.ctaText, safetyPolicyNoticeEmbed.ctaText);
    }

    public final String getClassificationId() {
        return this.classificationId;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final String getSubtitleText() {
        return this.subtitleText;
    }

    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return (((((((((this.classificationId.hashCode() * 31) + this.titleText.hashCode()) * 31) + this.titleIcon.hashCode()) * 31) + this.subtitleText.hashCode()) * 31) + this.descriptionText.hashCode()) * 31) + this.ctaText.hashCode();
    }

    public String toString() {
        String str = this.classificationId;
        String str2 = this.titleText;
        String str3 = this.titleIcon;
        String str4 = this.subtitleText;
        String str5 = this.descriptionText;
        String str6 = this.ctaText;
        return "SafetyPolicyNoticeEmbed(classificationId=" + str + ", titleText=" + str2 + ", titleIcon=" + str3 + ", subtitleText=" + str4 + ", descriptionText=" + str5 + ", ctaText=" + str6 + ")";
    }

    public SafetyPolicyNoticeEmbed(String classificationId, String titleText, String titleIcon, String subtitleText, String descriptionText, String ctaText) {
        q.h(classificationId, "classificationId");
        q.h(titleText, "titleText");
        q.h(titleIcon, "titleIcon");
        q.h(subtitleText, "subtitleText");
        q.h(descriptionText, "descriptionText");
        q.h(ctaText, "ctaText");
        this.classificationId = classificationId;
        this.titleText = titleText;
        this.titleIcon = titleIcon;
        this.subtitleText = subtitleText;
        this.descriptionText = descriptionText;
        this.ctaText = ctaText;
    }
}
