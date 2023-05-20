package com.discord.chat.bridge.embed;

import com.discord.media_player.MediaSource;
import com.discord.media_player.MediaType;
import java.util.ArrayList;
import java.util.List;
import jg.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.k;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\u001a\u0012\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u0002\u001a#\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"getMedia", "Lcom/discord/chat/bridge/embed/EmbedUrlProvider;", "Lcom/discord/chat/bridge/embed/Embed;", "getTag", "", "getTargetDimensions", "Lkotlin/Pair;", "", "isInlineMedia", "", "toImageMediaSources", "", "Lcom/discord/media_player/MediaSource;", "toMediaSource", "shouldAutoPlay", "portal", "", "(Lcom/discord/chat/bridge/embed/Embed;ZLjava/lang/Double;)Lcom/discord/media_player/MediaSource;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbedUtilsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbedType.values().length];
            try {
                iArr[EmbedType.GIFV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmbedType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmbedType.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmbedType.Link.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EmbedType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EmbedType.Tweet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EmbedType.Article.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EmbedUrlProvider getMedia(Embed embed) {
        EmbedMedia embedMedia;
        q.g(embed, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()]) {
            case 1:
            case 2:
                embedMedia = embed.getVideo();
                if (embedMedia == null) {
                    return embed.getThumbnail();
                }
                break;
            case 3:
            case 6:
            case 7:
                embedMedia = embed.getImage();
                if (embedMedia == null) {
                    return embed.getThumbnail();
                }
                break;
            case 4:
            case 5:
                return null;
            default:
                return embed.getImage();
        }
        return embedMedia;
    }

    public static final String getTag(Embed embed) {
        q.g(embed, "<this>");
        String simpleName = embed.getClass().getSimpleName();
        String name = embed.getType().name();
        return simpleName + ": " + name;
    }

    public static final Pair<Integer, Integer> getTargetDimensions(Embed embed) {
        Integer num;
        Integer num2;
        Pair<Integer, Integer> a10;
        q.g(embed, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()];
        Integer num3 = null;
        if (i10 == 1) {
            EmbedThumbnail thumbnail = embed.getThumbnail();
            if (thumbnail != null) {
                num = Integer.valueOf(thumbnail.getWidth());
            } else {
                num = null;
            }
            EmbedThumbnail thumbnail2 = embed.getThumbnail();
            if (thumbnail2 != null) {
                num3 = Integer.valueOf(thumbnail2.getHeight());
            }
            return x.a(num, num3);
        } else if (i10 != 2) {
            EmbedMedia image = embed.getImage();
            if (image == null || (a10 = x.a(Integer.valueOf(image.getWidth()), Integer.valueOf(image.getHeight()))) == null) {
                return x.a(null, null);
            }
            return a10;
        } else {
            EmbedMedia video = embed.getVideo();
            if (video != null) {
                num2 = Integer.valueOf(video.getWidth());
            } else {
                num2 = null;
            }
            EmbedMedia video2 = embed.getVideo();
            if (video2 != null) {
                num3 = Integer.valueOf(video2.getHeight());
            }
            return x.a(num2, num3);
        }
    }

    public static final boolean isInlineMedia(Embed embed) {
        q.g(embed, "<this>");
        if (getMedia(embed) == null && embed.getVideo() == null) {
            return true;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()];
        if (i10 == 1 || ((i10 == 2 || i10 == 3) && embed.getAuthor() == null && embed.getTitle() == null)) {
            return false;
        }
        return true;
    }

    public static final List<MediaSource> toImageMediaSources(Embed embed) {
        int t10;
        q.g(embed, "<this>");
        List<EmbedMedia> images = embed.getImages();
        if (images == null) {
            return null;
        }
        t10 = k.t(images, 10);
        ArrayList arrayList = new ArrayList(t10);
        for (EmbedMedia embedMedia : images) {
            arrayList.add(new MediaSource(null, embedMedia.getEmbedUrl(), getTag(embed), MediaType.IMAGE, false, null, 33, null));
        }
        return arrayList;
    }

    public static final MediaSource toMediaSource(Embed embed, boolean z10, Double d10) {
        String str;
        String str2;
        String embedUrl;
        q.g(embed, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()];
        String str3 = null;
        if (i10 == 1) {
            EmbedMedia video = embed.getVideo();
            if (video != null) {
                str = video.getEmbedUrl();
            } else {
                str = null;
            }
            EmbedThumbnail thumbnail = embed.getThumbnail();
            if (thumbnail != null) {
                str3 = thumbnail.getEmbedUrl();
            }
            return new MediaSource(str, str3, getTag(embed), MediaType.GIFV, z10, d10);
        } else if (i10 != 2) {
            EmbedMedia image = embed.getImage();
            if (image == null || (embedUrl = image.getEmbedUrl()) == null) {
                return null;
            }
            return new MediaSource(null, embedUrl, getTag(embed), MediaType.IMAGE, false, null, 33, null);
        } else {
            EmbedMedia video2 = embed.getVideo();
            if (video2 != null) {
                str2 = video2.getProxyURL();
            } else {
                str2 = null;
            }
            EmbedThumbnail thumbnail2 = embed.getThumbnail();
            if (thumbnail2 != null) {
                str3 = thumbnail2.getEmbedUrl();
            }
            return new MediaSource(str2, str3, getTag(embed), MediaType.VIDEO, false, d10);
        }
    }
}
