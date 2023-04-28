package com.discord.sticker_picker.react;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.sticker_picker.StickerPickerRow;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C9611k;
import kotlin.jvm.internal.C9677q;
import kotlin.ranges.IntRange;
import p268of.AbstractC11047p;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m15073d2 = {"deserializeStickerPickerRowData", "Lcom/discord/sticker_picker/StickerPickerRow;", "data", "Lcom/facebook/react/bridge/ReadableMap;", "sticker_picker_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class StickerPickerRowDataSerializationUtilsKt {
    public static final StickerPickerRow deserializeStickerPickerRowData(ReadableMap data) {
        int t;
        StickerPickerRow.Sticker sticker;
        StickerPickerRow.Sticker.Type type;
        C9677q.m14633g(data, "data");
        int i = data.getInt("rowContentWidth");
        int i2 = data.getInt("rowContentPaddingVertical");
        int i3 = data.getInt("itemSize");
        ReadableArray nonNullArray = NativeMapExtensionsKt.getNonNullArray(data, "items");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(nonNullArray);
        t = C9611k.m14809t(sizeRange, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11047p) it).nextInt();
            if (!nonNullArray.isNull(nextInt)) {
                ReadableMap stickerRow = nonNullArray.getMap(nextInt);
                C9677q.m14634f(stickerRow, "stickerRow");
                String nonNullString = NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerId");
                String nonNullString2 = NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerName");
                int i4 = stickerRow.getInt("stickerType");
                if (i4 == 1) {
                    type = StickerPickerRow.Sticker.Type.PNG;
                } else if (i4 == 2) {
                    type = StickerPickerRow.Sticker.Type.APNG;
                } else if (i4 == 3) {
                    type = StickerPickerRow.Sticker.Type.LOTTIE;
                } else if (i4 == 4) {
                    type = StickerPickerRow.Sticker.Type.GIF;
                } else {
                    throw new IllegalArgumentException("Unknown type " + i4);
                }
                sticker = new StickerPickerRow.Sticker(nonNullString, nonNullString2, type, stickerRow.getBoolean("stickerAnimated"), NativeMapExtensionsKt.getNonNullString(stickerRow, "stickerUrl"), stickerRow.getBoolean("stickerDisabled"), stickerRow.getBoolean("stickerOpaque"));
            } else {
                sticker = null;
            }
            arrayList.add(sticker);
        }
        return new StickerPickerRow(i, i2, i3, arrayList);
    }
}
