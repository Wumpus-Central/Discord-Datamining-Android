package com.discord.chat.bridge.attachment;

import android.net.UrlQuerySanitizer;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import j$.util.Spliterator;
import java.util.regex.Pattern;
import kg.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import oj.t;
import vj.f;

@f
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 j2\u00020\u0001:\u0002ijBó\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 BÉ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f¢\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010I\u001a\u00020\fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010.J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010.J\t\u0010O\u001a\u00020\fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÚ\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\f2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\u0017\u0010W\u001a\u0004\u0018\u00010\u00032\u0006\u0010X\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\fH\u0002J\t\u0010[\u001a\u00020\u0003HÖ\u0001J\b\u0010\\\u001a\u00020\fH\u0002J\b\u0010]\u001a\u00020\fH\u0002J\b\u0010^\u001a\u00020\fH\u0002J\t\u0010_\u001a\u00020\u0005HÖ\u0001J\u0006\u0010`\u001a\u00020aJ!\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u00002\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hHÇ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010,R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010,R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010/\u0012\u0004\b3\u00104R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010/\u0012\u0004\b5\u00104R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b?\u0010*¨\u0006k"}, d2 = {"Lcom/discord/chat/bridge/attachment/Attachment;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "url", "", "videoUrl", "filename", "size", "sourceWidth", "sourceHeight", "isSpoiler", "", "spoiler", "description", "hint", "role", "showDescription", "progress", "uploaderId", "uploaderItemId", "durationSecs", "", "waveform", "isAnimated", "waveformByteArray", "", "spoilerOrNull", "proxyWidth", "proxyHeight", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z[BLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "getDurationSecs", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFilename", "height", "getHeight", "()I", "getHint", "()Z", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRole", "getShowDescription", "getSize", "getSourceHeight$annotations", "()V", "getSourceWidth$annotations", "getSpoiler", "getSpoilerOrNull", "getUploaderId", "getUploaderItemId", "getUrl", "getVideoUrl", "getWaveformByteArray", "()[B", "width", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)Lcom/discord/chat/bridge/attachment/Attachment;", "equals", "other", "", "getProxyUrlQueryParam", "paramName", "(Ljava/lang/String;)Ljava/lang/Integer;", "hasDimensions", "hashCode", "isImage", "isVideo", "shouldShowImages", "toString", "type", "Lcom/discord/chat/bridge/attachment/AttachmentType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Attachment implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final String description;
    private final Float durationSecs;
    private final String filename;
    private final String hint;
    private final boolean isAnimated;
    private final boolean isSpoiler;
    private final Integer progress;
    private final Integer proxyHeight;
    private final Integer proxyWidth;
    private final String role;
    private final boolean showDescription;
    private final String size;
    private final Integer sourceHeight;
    private final Integer sourceWidth;
    private final String spoiler;
    private final String spoilerOrNull;
    private final String uploaderId;
    private final String uploaderItemId;
    private final String url;
    private final String videoUrl;
    private final String waveform;
    private final byte[] waveformByteArray;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/attachment/Attachment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/attachment/Attachment;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Attachment> serializer() {
            return Attachment$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e1, code lost:
        if (r6 != false) goto L_0x00e3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Attachment(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Integer r13, java.lang.Integer r14, boolean r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.Float r24, java.lang.String r25, boolean r26, byte[] r27, java.lang.String r28, java.lang.Integer r29, java.lang.Integer r30, kotlinx.serialization.internal.SerializationConstructorMarker r31) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.attachment.Attachment.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Float, java.lang.String, boolean, byte[], java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    private final String component17() {
        return this.waveform;
    }

    private final Integer component5() {
        return this.sourceWidth;
    }

    private final Integer component6() {
        return this.sourceHeight;
    }

    private final Integer getProxyUrlQueryParam(String str) {
        Object obj;
        Integer num;
        Integer num2 = null;
        try {
            s.a aVar = s.f21863l;
            String value = new UrlQuerySanitizer(this.url).getValue(str);
            if (value != null) {
                q.f(value, "getValue(paramName)");
                num = t.m(value);
            } else {
                num = null;
            }
            obj = s.b(num);
        } catch (Throwable th2) {
            s.a aVar2 = s.f21863l;
            obj = s.b(kg.t.a(th2));
        }
        if (!s.g(obj)) {
            num2 = obj;
        }
        return num2;
    }

    private static /* synthetic */ void getSourceHeight$annotations() {
    }

    private static /* synthetic */ void getSourceWidth$annotations() {
    }

    private final boolean hasDimensions() {
        return getWidth() > 0 && getHeight() > 0;
    }

    private final boolean isImage() {
        Pattern pattern;
        pattern = AttachmentKt.IMAGE_FILE_EXTENSIONS;
        return pattern.matcher(this.filename).find();
    }

    private final boolean isVideo() {
        Pattern pattern;
        pattern = AttachmentKt.VIDEO_FILE_EXTENSIONS;
        return pattern.matcher(this.filename).find();
    }

    private final boolean shouldShowImages() {
        Integer num = this.sourceWidth;
        if ((num != null ? num.intValue() : 0) <= 0) {
            return false;
        }
        Integer num2 = this.sourceHeight;
        return (num2 != null ? num2.intValue() : 0) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.attachment.Attachment r7, kotlinx.serialization.encoding.CompositeEncoder r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.attachment.Attachment.write$Self(com.discord.chat.bridge.attachment.Attachment, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.url;
    }

    public final String component10() {
        return this.hint;
    }

    public final String component11() {
        return this.role;
    }

    public final boolean component12() {
        return this.showDescription;
    }

    public final Integer component13() {
        return this.progress;
    }

    public final String component14() {
        return this.uploaderId;
    }

    public final String component15() {
        return this.uploaderItemId;
    }

    public final Float component16() {
        return this.durationSecs;
    }

    public final boolean component18() {
        return this.isAnimated;
    }

    public final String component2() {
        return this.videoUrl;
    }

    public final String component3() {
        return this.filename;
    }

    public final String component4() {
        return this.size;
    }

    public final boolean component7() {
        return this.isSpoiler;
    }

    public final String component8() {
        return this.spoiler;
    }

    public final String component9() {
        return this.description;
    }

    public final Attachment copy(String url, String str, String filename, String size, Integer num, Integer num2, boolean z10, String str2, String str3, String str4, String str5, boolean z11, Integer num3, String str6, String str7, Float f10, String str8, boolean z12) {
        q.g(url, "url");
        q.g(filename, "filename");
        q.g(size, "size");
        return new Attachment(url, str, filename, size, num, num2, z10, str2, str3, str4, str5, z11, num3, str6, str7, f10, str8, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) obj;
        return q.b(this.url, attachment.url) && q.b(this.videoUrl, attachment.videoUrl) && q.b(this.filename, attachment.filename) && q.b(this.size, attachment.size) && q.b(this.sourceWidth, attachment.sourceWidth) && q.b(this.sourceHeight, attachment.sourceHeight) && this.isSpoiler == attachment.isSpoiler && q.b(this.spoiler, attachment.spoiler) && q.b(this.description, attachment.description) && q.b(this.hint, attachment.hint) && q.b(this.role, attachment.role) && this.showDescription == attachment.showDescription && q.b(this.progress, attachment.progress) && q.b(this.uploaderId, attachment.uploaderId) && q.b(this.uploaderItemId, attachment.uploaderItemId) && q.b(this.durationSecs, attachment.durationSecs) && q.b(this.waveform, attachment.waveform) && this.isAnimated == attachment.isAnimated;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Float getDurationSecs() {
        return this.durationSecs;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getHeight() {
        Integer num = this.proxyHeight;
        if (num == null && (num = this.sourceHeight) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String getHint() {
        return this.hint;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final String getRole() {
        return this.role;
    }

    public final boolean getShowDescription() {
        return this.showDescription;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getSpoiler() {
        return this.spoiler;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public final String getUploaderId() {
        return this.uploaderId;
    }

    public final String getUploaderItemId() {
        return this.uploaderItemId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final byte[] getWaveformByteArray() {
        return this.waveformByteArray;
    }

    public final int getWidth() {
        Integer num = this.proxyWidth;
        if (num == null && (num = this.sourceWidth) == null) {
            return 0;
        }
        return num.intValue();
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.videoUrl;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.filename.hashCode()) * 31) + this.size.hashCode()) * 31;
        Integer num = this.sourceWidth;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sourceHeight;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z10 = this.isSpoiler;
        int i11 = 1;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (hashCode4 + i12) * 31;
        String str2 = this.spoiler;
        int hashCode5 = (i15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hint;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.role;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z11 = this.showDescription;
        if (z11) {
            z11 = true;
        }
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int i18 = z11 ? 1 : 0;
        int i19 = (hashCode8 + i16) * 31;
        Integer num3 = this.progress;
        int hashCode9 = (i19 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.uploaderId;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.uploaderItemId;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f10 = this.durationSecs;
        int hashCode12 = (hashCode11 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str8 = this.waveform;
        if (str8 != null) {
            i10 = str8.hashCode();
        }
        int i20 = (hashCode12 + i10) * 31;
        boolean z12 = this.isAnimated;
        if (!z12) {
            i11 = z12 ? 1 : 0;
        }
        return i20 + i11;
    }

    public final boolean isAnimated() {
        return this.isAnimated;
    }

    public final boolean isSpoiler() {
        return this.isSpoiler;
    }

    public String toString() {
        String str = this.url;
        String str2 = this.videoUrl;
        String str3 = this.filename;
        String str4 = this.size;
        Integer num = this.sourceWidth;
        Integer num2 = this.sourceHeight;
        boolean z10 = this.isSpoiler;
        String str5 = this.spoiler;
        String str6 = this.description;
        String str7 = this.hint;
        String str8 = this.role;
        boolean z11 = this.showDescription;
        Integer num3 = this.progress;
        String str9 = this.uploaderId;
        String str10 = this.uploaderItemId;
        Float f10 = this.durationSecs;
        String str11 = this.waveform;
        boolean z12 = this.isAnimated;
        return "Attachment(url=" + str + ", videoUrl=" + str2 + ", filename=" + str3 + ", size=" + str4 + ", sourceWidth=" + num + ", sourceHeight=" + num2 + ", isSpoiler=" + z10 + ", spoiler=" + str5 + ", description=" + str6 + ", hint=" + str7 + ", role=" + str8 + ", showDescription=" + z11 + ", progress=" + num3 + ", uploaderId=" + str9 + ", uploaderItemId=" + str10 + ", durationSecs=" + f10 + ", waveform=" + str11 + ", isAnimated=" + z12 + ")";
    }

    public final AttachmentType type() {
        if (this.durationSecs != null && this.waveform != null) {
            return AttachmentType.Audio;
        }
        if (!shouldShowImages()) {
            return AttachmentType.File;
        }
        if (isImage() && hasDimensions()) {
            return AttachmentType.Image;
        }
        if (!isVideo() || !hasDimensions()) {
            return AttachmentType.File;
        }
        return AttachmentType.Video;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
        if (r5 != false) goto L_0x0069;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Attachment(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, java.lang.Integer r12, boolean r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, java.lang.Float r22, java.lang.String r23, boolean r24) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r23
            java.lang.String r5 = "url"
            kotlin.jvm.internal.q.g(r7, r5)
            java.lang.String r5 = "filename"
            kotlin.jvm.internal.q.g(r9, r5)
            java.lang.String r5 = "size"
            kotlin.jvm.internal.q.g(r10, r5)
            r6.<init>()
            r0.url = r1
            r1 = r8
            r0.videoUrl = r1
            r0.filename = r2
            r0.size = r3
            r1 = r11
            r0.sourceWidth = r1
            r1 = r12
            r0.sourceHeight = r1
            r1 = r13
            r0.isSpoiler = r1
            r1 = r14
            r0.spoiler = r1
            r1 = r15
            r0.description = r1
            r1 = r16
            r0.hint = r1
            r1 = r17
            r0.role = r1
            r1 = r18
            r0.showDescription = r1
            r1 = r19
            r0.progress = r1
            r1 = r20
            r0.uploaderId = r1
            r1 = r21
            r0.uploaderItemId = r1
            r1 = r22
            r0.durationSecs = r1
            r0.waveform = r4
            r1 = r24
            r0.isAnimated = r1
            r1 = 0
            r2 = 0
            if (r4 == 0) goto L_0x005b
            byte[] r3 = android.util.Base64.decode(r4, r1)     // Catch: Exception -> 0x005b
            goto L_0x005c
        L_0x005b:
            r3 = r2
        L_0x005c:
            r0.waveformByteArray = r3
            java.lang.String r3 = r0.spoiler
            r4 = 1
            if (r3 == 0) goto L_0x0069
            boolean r5 = oj.l.w(r3)
            if (r5 == 0) goto L_0x006a
        L_0x0069:
            r1 = r4
        L_0x006a:
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x006e
            r2 = r3
        L_0x006e:
            r0.spoilerOrNull = r2
            java.lang.String r1 = "width"
            java.lang.Integer r1 = r6.getProxyUrlQueryParam(r1)
            r0.proxyWidth = r1
            java.lang.String r1 = "height"
            java.lang.Integer r1 = r6.getProxyUrlQueryParam(r1)
            r0.proxyHeight = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.attachment.Attachment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Float, java.lang.String, boolean):void");
    }

    public /* synthetic */ Attachment(String str, String str2, String str3, String str4, Integer num, Integer num2, boolean z10, String str5, String str6, String str7, String str8, boolean z11, Integer num3, String str9, String str10, Float f10, String str11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, str3, str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, z10, (i10 & 128) != 0 ? null : str5, (i10 & Spliterator.NONNULL) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & Spliterator.IMMUTABLE) != 0 ? null : str8, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? false : z11, (i10 & 4096) != 0 ? null : num3, (i10 & 8192) != 0 ? null : str9, (i10 & Spliterator.SUBSIZED) != 0 ? null : str10, (32768 & i10) != 0 ? null : f10, (65536 & i10) != 0 ? null : str11, (i10 & 131072) != 0 ? true : z12);
    }
}
