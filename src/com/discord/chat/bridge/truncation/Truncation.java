package com.discord.chat.bridge.truncation;

import bj.C2530h;
import bj.C2555m0;
import bj.C2560n1;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m15073d2 = {"Lcom/discord/chat/bridge/truncation/Truncation;", "", "seen1", "", ViewProps.NUMBER_OF_LINES, "seeMoreLabel", "", "seeMoreLabelColor", "forceShow", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getForceShow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNumberOfLines", "()I", "getSeeMoreLabel", "()Ljava/lang/String;", "getSeeMoreLabelColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/truncation/Truncation;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class Truncation {
    public static final Companion Companion = new Companion(null);
    private final Boolean forceShow;
    private final int numberOfLines;
    private final String seeMoreLabel;
    private final Integer seeMoreLabelColor;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/truncation/Truncation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/truncation/Truncation;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Truncation> serializer() {
            return Truncation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Truncation(int i, int i2, String str, Integer num, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2560n1.m33818b(i, 3, Truncation$$serializer.INSTANCE.getDescriptor());
        }
        this.numberOfLines = i2;
        this.seeMoreLabel = str;
        if ((i & 4) == 0) {
            this.seeMoreLabelColor = null;
        } else {
            this.seeMoreLabelColor = num;
        }
        if ((i & 8) == 0) {
            this.forceShow = null;
        } else {
            this.forceShow = bool;
        }
    }

    public static /* synthetic */ Truncation copy$default(Truncation truncation, int i, String str, Integer num, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = truncation.numberOfLines;
        }
        if ((i2 & 2) != 0) {
            str = truncation.seeMoreLabel;
        }
        if ((i2 & 4) != 0) {
            num = truncation.seeMoreLabelColor;
        }
        if ((i2 & 8) != 0) {
            bool = truncation.forceShow;
        }
        return truncation.copy(i, str, num, bool);
    }

    public static final void write$Self(Truncation self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo13866x(serialDesc, 0, self.numberOfLines);
        output.mo13864z(serialDesc, 1, self.seeMoreLabel);
        if (!output.mo13893A(serialDesc, 2) && self.seeMoreLabelColor == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 2, C2555m0.f6794a, self.seeMoreLabelColor);
        }
        if (output.mo13893A(serialDesc, 3) || self.forceShow != null) {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 3, C2530h.f6761a, self.forceShow);
        }
    }

    public final int component1() {
        return this.numberOfLines;
    }

    public final String component2() {
        return this.seeMoreLabel;
    }

    public final Integer component3() {
        return this.seeMoreLabelColor;
    }

    public final Boolean component4() {
        return this.forceShow;
    }

    public final Truncation copy(int i, String seeMoreLabel, Integer num, Boolean bool) {
        C9677q.m14633g(seeMoreLabel, "seeMoreLabel");
        return new Truncation(i, seeMoreLabel, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Truncation)) {
            return false;
        }
        Truncation truncation = (Truncation) obj;
        return this.numberOfLines == truncation.numberOfLines && C9677q.m14638b(this.seeMoreLabel, truncation.seeMoreLabel) && C9677q.m14638b(this.seeMoreLabelColor, truncation.seeMoreLabelColor) && C9677q.m14638b(this.forceShow, truncation.forceShow);
    }

    public final Boolean getForceShow() {
        return this.forceShow;
    }

    public final int getNumberOfLines() {
        return this.numberOfLines;
    }

    public final String getSeeMoreLabel() {
        return this.seeMoreLabel;
    }

    public final Integer getSeeMoreLabelColor() {
        return this.seeMoreLabelColor;
    }

    public int hashCode() {
        int hashCode = ((this.numberOfLines * 31) + this.seeMoreLabel.hashCode()) * 31;
        Integer num = this.seeMoreLabelColor;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.forceShow;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        int i = this.numberOfLines;
        String str = this.seeMoreLabel;
        Integer num = this.seeMoreLabelColor;
        Boolean bool = this.forceShow;
        return "Truncation(numberOfLines=" + i + ", seeMoreLabel=" + str + ", seeMoreLabelColor=" + num + ", forceShow=" + bool + ")";
    }

    public Truncation(int i, String seeMoreLabel, Integer num, Boolean bool) {
        C9677q.m14633g(seeMoreLabel, "seeMoreLabel");
        this.numberOfLines = i;
        this.seeMoreLabel = seeMoreLabel;
        this.seeMoreLabelColor = num;
        this.forceShow = bool;
    }

    public /* synthetic */ Truncation(int i, String str, Integer num, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool);
    }
}
