package com.discord.chat.bridge;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ti.f;
import wi.n1;

@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002;<Bw\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Jw\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001J!\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u0006="}, d2 = {"Lcom/discord/chat/bridge/UploadProgress;", "", "seen1", "", "headerText", "", "headerColor", ViewProps.BACKGROUND_COLOR, "progress", "", "fileId", "fileType", "progressTrackColor", "progressStartColor", "progressEndColor", "iconTintColor", "closeTintColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIFLjava/lang/String;Ljava/lang/String;IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;IIFLjava/lang/String;Ljava/lang/String;IIIII)V", "getBackgroundColor", "()I", "getCloseTintColor", "getFileId", "()Ljava/lang/String;", "getFileType", "getHeaderColor", "getHeaderText", "getIconTintColor", "getProgress", "()F", "getProgressEndColor", "getProgressStartColor", "getProgressTrackColor", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class UploadProgress {
    public static final Companion Companion = new Companion(null);
    private final int backgroundColor;
    private final int closeTintColor;
    private final String fileId;
    private final String fileType;
    private final int headerColor;
    private final String headerText;
    private final int iconTintColor;
    private final float progress;
    private final int progressEndColor;
    private final int progressStartColor;
    private final int progressTrackColor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/UploadProgress$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/UploadProgress;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UploadProgress> serializer() {
            return UploadProgress$$serializer.INSTANCE;
        }
    }

    public  UploadProgress(int i10, String str, int i11, int i12, float f10, String str2, String str3, int i13, int i14, int i15, int i16, int i17, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i10 & 2047)) {
            n1.b(i10, 2047, UploadProgress$$serializer.INSTANCE.getDescriptor());
        }
        this.headerText = str;
        this.headerColor = i11;
        this.backgroundColor = i12;
        this.progress = f10;
        this.fileId = str2;
        this.fileType = str3;
        this.progressTrackColor = i13;
        this.progressStartColor = i14;
        this.progressEndColor = i15;
        this.iconTintColor = i16;
        this.closeTintColor = i17;
    }

    public static final void write$Self(UploadProgress self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.x(serialDesc, 0, self.headerText);
        output.v(serialDesc, 1, self.headerColor);
        output.v(serialDesc, 2, self.backgroundColor);
        output.r(serialDesc, 3, self.progress);
        output.x(serialDesc, 4, self.fileId);
        output.x(serialDesc, 5, self.fileType);
        output.v(serialDesc, 6, self.progressTrackColor);
        output.v(serialDesc, 7, self.progressStartColor);
        output.v(serialDesc, 8, self.progressEndColor);
        output.v(serialDesc, 9, self.iconTintColor);
        output.v(serialDesc, 10, self.closeTintColor);
    }

    public final String component1() {
        return this.headerText;
    }

    public final int component10() {
        return this.iconTintColor;
    }

    public final int component11() {
        return this.closeTintColor;
    }

    public final int component2() {
        return this.headerColor;
    }

    public final int component3() {
        return this.backgroundColor;
    }

    public final float component4() {
        return this.progress;
    }

    public final String component5() {
        return this.fileId;
    }

    public final String component6() {
        return this.fileType;
    }

    public final int component7() {
        return this.progressTrackColor;
    }

    public final int component8() {
        return this.progressStartColor;
    }

    public final int component9() {
        return this.progressEndColor;
    }

    public final UploadProgress copy(String headerText, int i10, int i11, float f10, String fileId, String fileType, int i12, int i13, int i14, int i15, int i16) {
        q.h(headerText, "headerText");
        q.h(fileId, "fileId");
        q.h(fileType, "fileType");
        return new UploadProgress(headerText, i10, i11, f10, fileId, fileType, i12, i13, i14, i15, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadProgress)) {
            return false;
        }
        UploadProgress uploadProgress = (UploadProgress) obj;
        return q.c(this.headerText, uploadProgress.headerText) && this.headerColor == uploadProgress.headerColor && this.backgroundColor == uploadProgress.backgroundColor && Float.compare(this.progress, uploadProgress.progress) == 0 && q.c(this.fileId, uploadProgress.fileId) && q.c(this.fileType, uploadProgress.fileType) && this.progressTrackColor == uploadProgress.progressTrackColor && this.progressStartColor == uploadProgress.progressStartColor && this.progressEndColor == uploadProgress.progressEndColor && this.iconTintColor == uploadProgress.iconTintColor && this.closeTintColor == uploadProgress.closeTintColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCloseTintColor() {
        return this.closeTintColor;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final int getHeaderColor() {
        return this.headerColor;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final int getIconTintColor() {
        return this.iconTintColor;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getProgressEndColor() {
        return this.progressEndColor;
    }

    public final int getProgressStartColor() {
        return this.progressStartColor;
    }

    public final int getProgressTrackColor() {
        return this.progressTrackColor;
    }

    public int hashCode() {
        return (((((((((((((((((((this.headerText.hashCode() * 31) + this.headerColor) * 31) + this.backgroundColor) * 31) + Float.floatToIntBits(this.progress)) * 31) + this.fileId.hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.progressTrackColor) * 31) + this.progressStartColor) * 31) + this.progressEndColor) * 31) + this.iconTintColor) * 31) + this.closeTintColor;
    }

    public String toString() {
        String str = this.headerText;
        int i10 = this.headerColor;
        int i11 = this.backgroundColor;
        float f10 = this.progress;
        String str2 = this.fileId;
        String str3 = this.fileType;
        int i12 = this.progressTrackColor;
        int i13 = this.progressStartColor;
        int i14 = this.progressEndColor;
        int i15 = this.iconTintColor;
        int i16 = this.closeTintColor;
        return "UploadProgress(headerText=" + str + ", headerColor=" + i10 + ", backgroundColor=" + i11 + ", progress=" + f10 + ", fileId=" + str2 + ", fileType=" + str3 + ", progressTrackColor=" + i12 + ", progressStartColor=" + i13 + ", progressEndColor=" + i14 + ", iconTintColor=" + i15 + ", closeTintColor=" + i16 + ")";
    }

    public UploadProgress(String headerText, int i10, int i11, float f10, String fileId, String fileType, int i12, int i13, int i14, int i15, int i16) {
        q.h(headerText, "headerText");
        q.h(fileId, "fileId");
        q.h(fileType, "fileType");
        this.headerText = headerText;
        this.headerColor = i10;
        this.backgroundColor = i11;
        this.progress = f10;
        this.fileId = fileId;
        this.fileType = fileType;
        this.progressTrackColor = i12;
        this.progressStartColor = i13;
        this.progressEndColor = i14;
        this.iconTintColor = i15;
        this.closeTintColor = i16;
    }
}
