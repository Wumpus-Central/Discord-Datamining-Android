package com.discord.chat.bridge.attachment;

import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, m15073d2 = {"IMAGE_FILE_EXTENSIONS", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "VIDEO_FILE_EXTENSIONS", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AttachmentKt {
    private static final Pattern IMAGE_FILE_EXTENSIONS = Pattern.compile("\\.(jpeg|jpg|gif|png|bmp|webp)$", 2);
    private static final Pattern VIDEO_FILE_EXTENSIONS = Pattern.compile("\\.(mov|mp4|webm)$", 2);
}
