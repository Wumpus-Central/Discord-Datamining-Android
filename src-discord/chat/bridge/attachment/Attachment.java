package com.discord.chat.bridge.attachment;

import android.net.UrlQuerySanitizer;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.react_asset_fetcher.ReactAsset;
import com.facebook.react.uimanager.ViewProps;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import kotlinx.serialization.KSerializer;
import pf.s;
import pf.t;
import zi.f;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u0084\u00012\u00020\u0001:\u0004\u0083\u0001\u0084\u0001BÃ\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010(B\u009d\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f¢\u0006\u0002\u0010)J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010T\u001a\u00020\fHÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010b\u001a\u00020\fHÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010+J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010+J\t\u0010g\u001a\u00020\fHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J®\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001f\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010kJ\u0013\u0010l\u001a\u00020\f2\b\u0010m\u001a\u0004\u0018\u00010nHÖ\u0003J\b\u0010o\u001a\u0004\u0018\u00010pJ\u0017\u0010q\u001a\u0004\u0018\u00010\u00032\u0006\u0010r\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010sJ\b\u0010t\u001a\u00020\fH\u0002J\t\u0010u\u001a\u00020\u0003HÖ\u0001J\b\u0010v\u001a\u00020\fH\u0002J\b\u0010w\u001a\u00020\fH\u0002J\b\u0010x\u001a\u00020\fH\u0002J\t\u0010y\u001a\u00020\u0005HÖ\u0001J\u0006\u0010z\u001a\u00020{J$\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u00002\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001HÇ\u0001R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b/\u0010+R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b0\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0011\u00106\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0011\u0010\u001f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010:R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010:R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0016\u0010#\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b@\u0010+R\u0012\u0010%\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010,R\u0012\u0010$\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bB\u0010:R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010,\u0012\u0004\bD\u0010ER\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010,\u0012\u0004\bF\u0010ER\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u0016\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010.R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bP\u00108¨\u0006\u0085\u0001"}, d2 = {"Lcom/discord/chat/bridge/attachment/Attachment;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "url", "", "videoUrl", "filename", "size", "sourceWidth", "sourceHeight", "isSpoiler", "", "spoiler", "description", "hint", "role", "showDescription", "progress", "uploaderId", "uploaderItemId", ViewProps.BACKGROUND_COLOR, "attachmentTagText", "attachmentTagBackgroundColor", "attachmentTagTextColor", "attachmentTagIconType", "obscure", "obscureDescription", "durationSecs", "", "waveform", "isAnimated", "waveformByteArray", "", "spoilerOrNull", "obscureOrNull", "proxyWidth", "proxyHeight", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z[BLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)V", "getAttachmentTagBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAttachmentTagText", "()Ljava/lang/String;", "getAttachmentTagTextColor", "getBackgroundColor", "getDescription", "getDurationSecs", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFilename", "height", "getHeight", "()I", "getHint", "()Z", "getObscure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getObscureDescription", "getObscureOrNull", "getProgress", "getRole", "getShowDescription", "getSize", "getSourceHeight$annotations", "()V", "getSourceWidth$annotations", "getSpoiler", "getSpoilerOrNull", "getUploaderId", "getUploaderItemId", "getUrl", "getVideoUrl", "getWaveformByteArray", "()[B", "width", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)Lcom/discord/chat/bridge/attachment/Attachment;", "equals", "other", "", "getAttachmentTagIcon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "getProxyUrlQueryParam", "paramName", "(Ljava/lang/String;)Ljava/lang/Integer;", "hasDimensions", "hashCode", "isImage", "isVideo", "shouldShowImages", "toString", "type", "Lcom/discord/chat/bridge/attachment/AttachmentType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class Attachment implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final Integer attachmentTagBackgroundColor;
    private final String attachmentTagIconType;
    private final String attachmentTagText;
    private final Integer attachmentTagTextColor;
    private final Integer backgroundColor;
    private final String description;
    private final Float durationSecs;
    private final String filename;
    private final String hint;
    private final boolean isAnimated;
    private final boolean isSpoiler;
    private final Boolean obscure;
    private final String obscureDescription;
    private final String obscureOrNull;
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
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Attachment> serializer() {
            return Attachment$$serializer.INSTANCE;
        }
    }

    
    
    
    public  Attachment(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Integer r13, java.lang.Integer r14, boolean r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.lang.String r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.String r28, java.lang.Boolean r29, java.lang.String r30, java.lang.Float r31, java.lang.String r32, boolean r33, byte[] r34, java.lang.String r35, java.lang.String r36, java.lang.Integer r37, java.lang.Integer r38, kotlinx.serialization.internal.SerializationConstructorMarker r39) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.attachment.Attachment.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Float, java.lang.String, boolean, byte[], java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, kotlinx.serialization.internal.SerializationConstructorMarker):void");
    }

    private final String component20() {
        return this.attachmentTagIconType;
    }

    private final String component24() {
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
            s.a aVar = s.f26001k;
            String value = new UrlQuerySanitizer(this.url).getValue(str);
            if (value != null) {
                q.g(value, "getValue(paramName)");
                num = n.m(value);
            } else {
                num = null;
            }
            obj = s.b(num);
        } catch (Throwable th2) {
            s.a aVar2 = s.f26001k;
            obj = s.b(t.a(th2));
        }
        if (!s.g(obj)) {
            num2 = obj;
        }
        return num2;
    }

    private static  void getSourceHeight$annotations() {
    }

    private static  void getSourceWidth$annotations() {
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static final void write$Self(com.discord.chat.bridge.attachment.Attachment r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        
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

    public final Integer component16() {
        return this.backgroundColor;
    }

    public final String component17() {
        return this.attachmentTagText;
    }

    public final Integer component18() {
        return this.attachmentTagBackgroundColor;
    }

    public final Integer component19() {
        return this.attachmentTagTextColor;
    }

    public final String component2() {
        return this.videoUrl;
    }

    public final Boolean component21() {
        return this.obscure;
    }

    public final String component22() {
        return this.obscureDescription;
    }

    public final Float component23() {
        return this.durationSecs;
    }

    public final boolean component25() {
        return this.isAnimated;
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

    public final Attachment copy(String url, String str, String filename, String size, Integer num, Integer num2, boolean z10, String str2, String str3, String str4, String str5, boolean z11, Integer num3, String str6, String str7, Integer num4, String str8, Integer num5, Integer num6, String str9, Boolean bool, String str10, Float f10, String str11, boolean z12) {
        q.h(url, "url");
        q.h(filename, "filename");
        q.h(size, "size");
        return new Attachment(url, str, filename, size, num, num2, z10, str2, str3, str4, str5, z11, num3, str6, str7, num4, str8, num5, num6, str9, bool, str10, f10, str11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) obj;
        return q.c(this.url, attachment.url) && q.c(this.videoUrl, attachment.videoUrl) && q.c(this.filename, attachment.filename) && q.c(this.size, attachment.size) && q.c(this.sourceWidth, attachment.sourceWidth) && q.c(this.sourceHeight, attachment.sourceHeight) && this.isSpoiler == attachment.isSpoiler && q.c(this.spoiler, attachment.spoiler) && q.c(this.description, attachment.description) && q.c(this.hint, attachment.hint) && q.c(this.role, attachment.role) && this.showDescription == attachment.showDescription && q.c(this.progress, attachment.progress) && q.c(this.uploaderId, attachment.uploaderId) && q.c(this.uploaderItemId, attachment.uploaderItemId) && q.c(this.backgroundColor, attachment.backgroundColor) && q.c(this.attachmentTagText, attachment.attachmentTagText) && q.c(this.attachmentTagBackgroundColor, attachment.attachmentTagBackgroundColor) && q.c(this.attachmentTagTextColor, attachment.attachmentTagTextColor) && q.c(this.attachmentTagIconType, attachment.attachmentTagIconType) && q.c(this.obscure, attachment.obscure) && q.c(this.obscureDescription, attachment.obscureDescription) && q.c(this.durationSecs, attachment.durationSecs) && q.c(this.waveform, attachment.waveform) && this.isAnimated == attachment.isAnimated;
    }

    public final Integer getAttachmentTagBackgroundColor() {
        return this.attachmentTagBackgroundColor;
    }

    public final ReactAsset getAttachmentTagIcon() {
        if (q.c(this.attachmentTagIconType, "clip")) {
            return ReactAsset.Clip;
        }
        return null;
    }

    public final String getAttachmentTagText() {
        return this.attachmentTagText;
    }

    public final Integer getAttachmentTagTextColor() {
        return this.attachmentTagTextColor;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
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

    public final Boolean getObscure() {
        return this.obscure;
    }

    public final String getObscureDescription() {
        return this.obscureDescription;
    }

    @Override 
    public String getObscureOrNull() {
        return this.obscureOrNull;
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

    @Override 
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
        Integer num4 = this.backgroundColor;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.attachmentTagText;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num5 = this.attachmentTagBackgroundColor;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.attachmentTagTextColor;
        int hashCode15 = (hashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str9 = this.attachmentTagIconType;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.obscure;
        int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.obscureDescription;
        int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Float f10 = this.durationSecs;
        int hashCode19 = (hashCode18 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str11 = this.waveform;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        int i20 = (hashCode19 + i10) * 31;
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
        Integer num4 = this.backgroundColor;
        String str11 = this.attachmentTagText;
        Integer num5 = this.attachmentTagBackgroundColor;
        Integer num6 = this.attachmentTagTextColor;
        String str12 = this.attachmentTagIconType;
        Boolean bool = this.obscure;
        String str13 = this.obscureDescription;
        Float f10 = this.durationSecs;
        String str14 = this.waveform;
        boolean z12 = this.isAnimated;
        return "Attachment(url=" + str + ", videoUrl=" + str2 + ", filename=" + str3 + ", size=" + str4 + ", sourceWidth=" + num + ", sourceHeight=" + num2 + ", isSpoiler=" + z10 + ", spoiler=" + str5 + ", description=" + str6 + ", hint=" + str7 + ", role=" + str8 + ", showDescription=" + z11 + ", progress=" + num3 + ", uploaderId=" + str9 + ", uploaderItemId=" + str10 + ", backgroundColor=" + num4 + ", attachmentTagText=" + str11 + ", attachmentTagBackgroundColor=" + num5 + ", attachmentTagTextColor=" + num6 + ", attachmentTagIconType=" + str12 + ", obscure=" + bool + ", obscureDescription=" + str13 + ", durationSecs=" + f10 + ", waveform=" + str14 + ", isAnimated=" + z12 + ")";
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

    
    
    
    
    
    
    public Attachment(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, java.lang.Integer r12, boolean r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, java.lang.Integer r22, java.lang.String r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.String r26, java.lang.Boolean r27, java.lang.String r28, java.lang.Float r29, java.lang.String r30, boolean r31) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.attachment.Attachment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Float, java.lang.String, boolean):void");
    }

    public  Attachment(String str, String str2, String str3, String str4, Integer num, Integer num2, boolean z10, String str5, String str6, String str7, String str8, boolean z11, Integer num3, String str9, String str10, Integer num4, String str11, Integer num5, Integer num6, String str12, Boolean bool, String str13, Float f10, String str14, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, str3, str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2, z10, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? null : str8, (i10 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? false : z11, (i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : num3, (i10 & 8192) != 0 ? null : str9, (i10 & 16384) != 0 ? null : str10, (32768 & i10) != 0 ? null : num4, (65536 & i10) != 0 ? null : str11, (131072 & i10) != 0 ? null : num5, (262144 & i10) != 0 ? null : num6, (524288 & i10) != 0 ? null : str12, (1048576 & i10) != 0 ? null : bool, (2097152 & i10) != 0 ? null : str13, (4194304 & i10) != 0 ? null : f10, (8388608 & i10) != 0 ? null : str14, (i10 & 16777216) != 0 ? true : z12);
    }
}
