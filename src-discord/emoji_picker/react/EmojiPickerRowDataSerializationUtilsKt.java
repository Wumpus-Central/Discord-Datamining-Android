package com.discord.emoji_picker.react;

import com.discord.emoji_picker.EmojiPickerRow;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import hf.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.q;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"deserializeEmojiPickerRowData", "Lcom/discord/emoji_picker/EmojiPickerRow;", "data", "Lcom/facebook/react/bridge/ReadableMap;", "emoji_picker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmojiPickerRowDataSerializationUtilsKt {
    public static final EmojiPickerRow deserializeEmojiPickerRowData(ReadableMap data) {
        int s10;
        EmojiPickerRow.Emoji emoji;
        q.g(data, "data");
        int i10 = data.getInt("rowContentWidth");
        int i11 = data.getInt("rowContentPaddingVertical");
        int i12 = data.getInt("itemSize");
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(data, "items");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(nonNullArray);
        s10 = k.s(sizeRange, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((p) it).nextInt();
            if (!nonNullArray.isNull(nextInt)) {
                ReadableMap emojiRaw = nonNullArray.getMap(nextInt);
                String string = emojiRaw.getString("emojiId");
                q.f(emojiRaw, "emojiRaw");
                emoji = new EmojiPickerRow.Emoji(string, NativeMapExtensionsKt.getNonNullString(emojiRaw, "emojiName"), NativeMapExtensionsKt.getNonNullString(emojiRaw, "emojiUrl"), NativeMapExtensionsKt.getBoolean(emojiRaw, "disabled", false));
            } else {
                emoji = null;
            }
            arrayList.add(emoji);
        }
        return new EmojiPickerRow(i10, i11, i12, arrayList);
    }
}
