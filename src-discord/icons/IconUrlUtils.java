package com.discord.icons;

import android.content.Context;
import com.discord.hosts.Hosts;
import com.discord.icons.media.MediaExtensionKt;
import com.discord.icons.media.MediaProxy;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.snowflake.SnowflakeUtils;
import ff.s;
import ff.t;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\nJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010JC\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001a\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'JQ\u0010(\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J&\u0010-\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/discord/icons/IconUrlUtils;", "", "()V", "getApplicationIcon", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "imageId", "size", "", "getApplicationIcon-weIltyw", "getCustomEmojiUrl", "emojiId", "", "animate", "", "(JZLjava/lang/Integer;)Ljava/lang/String;", "getForChannel", "context", "Landroid/content/Context;", "id", "Lcom/discord/primitives/ChannelId;", "icon", "isGroupDM", "getForChannel-JYSGpIY", "(Landroid/content/Context;Lcom/discord/primitives/ChannelId;Ljava/lang/String;ZLjava/lang/Integer;)Ljava/lang/String;", "getForGuild", "Lcom/discord/primitives/GuildId;", "defaultIcon", "animated", "getForGuild-14CJxO4", "(Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Ljava/lang/String;", "getForGuildMember", "guildMemberAvatar", "guildId", "userId", "Lcom/discord/primitives/UserId;", "sizePx", "getForGuildMember-2tNb6hE", "(Ljava/lang/String;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Ljava/lang/Integer;Z)Ljava/lang/String;", "getForUser", "userAvatar", "discriminator", "getForUser-_fRzTXg", "(Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;)Ljava/lang/String;", "init", "", "cdnHost", "apiHost", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class IconUrlUtils {
    public static final IconUrlUtils INSTANCE = new IconUrlUtils();

    private IconUrlUtils() {
    }

    
    public static  String m458getApplicationIconweIltyw$default(IconUrlUtils iconUrlUtils, ApplicationId applicationId, String str, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 160;
        }
        return iconUrlUtils.m463getApplicationIconweIltyw(applicationId, str, i10);
    }

    public static  String getCustomEmojiUrl$default(IconUrlUtils iconUrlUtils, long j10, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return iconUrlUtils.getCustomEmojiUrl(j10, z10, num);
    }

    
    public static  String m459getForChannelJYSGpIY$default(IconUrlUtils iconUrlUtils, Context context, ChannelId channelId, String str, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            num = null;
        }
        return iconUrlUtils.m464getForChannelJYSGpIY(context, channelId, str, z10, num);
    }

    
    public static  String m460getForGuild14CJxO4$default(IconUrlUtils iconUrlUtils, GuildId guildId, String str, String str2, boolean z10, Integer num, int i10, Object obj) {
        String str3 = (i10 & 4) != 0 ? null : str2;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return iconUrlUtils.m465getForGuild14CJxO4(guildId, str, str3, z10, (i10 & 16) != 0 ? null : num);
    }

    
    public static  String m461getForGuildMember2tNb6hE$default(IconUrlUtils iconUrlUtils, String str, GuildId guildId, UserId userId, Integer num, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return iconUrlUtils.m466getForGuildMember2tNb6hE(str, guildId, userId, num, z10);
    }

    public static  void init$default(IconUrlUtils iconUrlUtils, Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        iconUrlUtils.init(context, str, str2);
    }

    
    public final String m463getApplicationIconweIltyw(ApplicationId applicationId, String str, int i10) {
        MediaProxy mediaProxy = MediaProxy.INSTANCE;
        String cdn = Hosts.INSTANCE.getCDN();
        String mediaExtension$default = MediaExtensionKt.getMediaExtension$default(false, null, 2, null);
        return MediaProxy.withSize$default(mediaProxy, cdn + "/app-icons/" + applicationId + "/" + str + "." + mediaExtension$default, Integer.valueOf(i10), null, 4, null);
    }

    public final String getCustomEmojiUrl(long j10, boolean z10, Integer num) {
        MediaProxy mediaProxy = MediaProxy.INSTANCE;
        String cdn = Hosts.INSTANCE.getCDN();
        String mediaExtension$default = MediaExtensionKt.getMediaExtension$default(z10, null, 2, null);
        return MediaProxy.withSize$default(mediaProxy, cdn + "/emojis/" + j10 + "." + mediaExtension$default, num, null, 4, null);
    }

    
    public final String m464getForChannelJYSGpIY(Context context, ChannelId channelId, String str, boolean z10, Integer num) {
        boolean z11;
        Object obj;
        q.g(context, "context");
        if (channelId == null) {
            return "";
        }
        if (str == null || str.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            try {
                s.a aVar = s.f14787l;
                obj = s.b(MediaProxy.withSize$default(MediaProxy.INSTANCE, Hosts.INSTANCE.getCDN() + "/channel-icons/" + channelId + "/" + str + "." + MediaExtensionKt.getMediaExtension$default(false, null, 2, null), num, null, 4, null));
            } catch (Throwable th2) {
                s.a aVar2 = s.f14787l;
                obj = s.b(t.a(th2));
            }
            if (s.e(obj) != null) {
                obj = Hosts.INSTANCE.getAPI() + "/channels/" + channelId + "/icons/" + str + ".jpg";
            }
            return (String) obj;
        } else if (!z10) {
            return "";
        } else {
            switch ((int) (SnowflakeUtils.INSTANCE.toTimestamp(channelId) % 8)) {
                case 1:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup1.getUri(context));
                case 2:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup2.getUri(context));
                case 3:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup3.getUri(context));
                case 4:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup4.getUri(context));
                case 5:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup5.getUri(context));
                case 6:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup6.getUri(context));
                case 7:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup7.getUri(context));
                default:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup0.getUri(context));
            }
        }
    }

    
    public final String m465getForGuild14CJxO4(GuildId guildId, String str, String str2, boolean z10, Integer num) {
        boolean z11;
        Object obj;
        if (str == null || str.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && guildId != null) {
            MediaProxy mediaProxy = MediaProxy.INSTANCE;
            try {
                s.a aVar = s.f14787l;
                obj = s.b(Hosts.INSTANCE.getCDN() + "/icons/" + guildId + "/" + str + "." + MediaExtensionKt.getMediaExtension(z10, str));
            } catch (Throwable th2) {
                s.a aVar2 = s.f14787l;
                obj = s.b(t.a(th2));
            }
            if (s.e(obj) != null) {
                obj = Hosts.INSTANCE.getAPI() + "/guilds/" + guildId + "/icons/" + str + ".jpg";
            }
            return MediaProxy.withSize$default(mediaProxy, (String) obj, num, null, 4, null);
        } else if (str2 == null) {
            return "";
        } else {
            return str2;
        }
    }

    
    
    
    
    public final java.lang.String m466getForGuildMember2tNb6hE(java.lang.String r9, com.discord.primitives.GuildId r10, com.discord.primitives.UserId r11, java.lang.Integer r12, boolean r13) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.icons.IconUrlUtils.m466getForGuildMember2tNb6hE(java.lang.String, com.discord.primitives.GuildId, com.discord.primitives.UserId, java.lang.Integer, boolean):java.lang.String");
    }

    
    public final String m467getForUser_fRzTXg(Context context, UserId userId, String str, Integer num, boolean z10, Integer num2) {
        Object obj;
        q.g(context, "context");
        if (userId != null) {
            if (UserId.m633equalsimpl(UserId.m631constructorimpl(-1L), userId)) {
                if (str == null) {
                    return "";
                }
                return str;
            } else if (str != null) {
                try {
                    s.a aVar = s.f14787l;
                    String mediaExtension = MediaExtensionKt.getMediaExtension(z10, str);
                    obj = s.b(MediaProxy.withSize$default(MediaProxy.INSTANCE, Hosts.INSTANCE.getCDN() + "/avatars/" + userId + "/" + str + "." + mediaExtension, num2, null, 4, null));
                } catch (Throwable th2) {
                    s.a aVar2 = s.f14787l;
                    obj = s.b(t.a(th2));
                }
                if (s.e(obj) != null) {
                    obj = Hosts.INSTANCE.getAPI() + "/users/" + userId + "/avatars/" + str + ".jpg";
                }
                return (String) obj;
            } else if (num != null) {
                int intValue = num.intValue() % 5;
                if (intValue == 1) {
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar1.getUri(context));
                }
                if (intValue == 2) {
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar2.getUri(context));
                }
                if (intValue == 3) {
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar3.getUri(context));
                }
                if (intValue != 4) {
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar0.getUri(context));
                }
                return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar4.getUri(context));
            }
        }
        return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar0.getUri(context));
    }

    public final void init(Context context, String str, String str2) {
        q.g(context, "context");
        Hosts.INSTANCE.init(context, str2, str);
    }
}
