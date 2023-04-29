.class public final Lcom/discord/theme/ThemeManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\r\u0010\u001e\u001a\u00020\u0013H\u0000\u00a2\u0006\u0002\u0008\u001fJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0006\"\u0004\u0008\u0016\u0010\u0008\u00a8\u0006&"
    }
    d2 = {
        "Lcom/discord/theme/ThemeManager;",
        "",
        "()V",
        "currentTheme",
        "Lcom/discord/theme/DiscordTheme;",
        "getCurrentTheme$theme_release",
        "()Lcom/discord/theme/DiscordTheme;",
        "setCurrentTheme$theme_release",
        "(Lcom/discord/theme/DiscordTheme;)V",
        "<set-?>",
        "Lcom/discord/theme/DarkTheme;",
        "darkTheme",
        "getDarkTheme",
        "()Lcom/discord/theme/DarkTheme;",
        "Lcom/discord/theme/LightTheme;",
        "lightTheme",
        "getLightTheme",
        "()Lcom/discord/theme/LightTheme;",
        "showSplashImage",
        "",
        "themeOverride",
        "getThemeOverride",
        "setThemeOverride",
        "init",
        "",
        "context",
        "Landroid/content/Context;",
        "isInitialized",
        "setDarkTheme",
        "setLightTheme",
        "shouldShowSplashImage",
        "shouldShowSplashImage$theme_release",
        "updateSystemUi",
        "activity",
        "Landroid/app/Activity;",
        "view",
        "Landroid/view/View;",
        "updateWindowBackground",
        "theme_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/theme/ThemeManager;

.field public static currentTheme:Lcom/discord/theme/DiscordTheme;

.field private static darkTheme:Lcom/discord/theme/DarkTheme;

.field private static lightTheme:Lcom/discord/theme/LightTheme;

.field private static showSplashImage:Z

.field private static themeOverride:Lcom/discord/theme/DiscordTheme;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/discord/theme/ThemeManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/theme/ThemeManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/theme/ThemeManager;->INSTANCE:Lcom/discord/theme/ThemeManager;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Lcom/discord/theme/ThemeManager;->showSplashImage:Z

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCurrentTheme$theme_release()Lcom/discord/theme/DiscordTheme;
    .locals 1

    sget-object v0, Lcom/discord/theme/ThemeManager;->currentTheme:Lcom/discord/theme/DiscordTheme;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "currentTheme"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDarkTheme()Lcom/discord/theme/DarkTheme;
    .locals 1

    sget-object v0, Lcom/discord/theme/ThemeManager;->darkTheme:Lcom/discord/theme/DarkTheme;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "darkTheme"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLightTheme()Lcom/discord/theme/LightTheme;
    .locals 1

    sget-object v0, Lcom/discord/theme/ThemeManager;->lightTheme:Lcom/discord/theme/LightTheme;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "lightTheme"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getThemeOverride()Lcom/discord/theme/DiscordTheme;
    .locals 1

    sget-object v0, Lcom/discord/theme/ThemeManager;->themeOverride:Lcom/discord/theme/DiscordTheme;

    return-object v0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/discord/theme/ThemeManager;->lightTheme:Lcom/discord/theme/LightTheme;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/discord/theme/LightTheme;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lcom/discord/theme/LightTheme;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/discord/theme/ThemeManager;->lightTheme:Lcom/discord/theme/LightTheme;

    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/discord/theme/ThemeManager;->darkTheme:Lcom/discord/theme/DarkTheme;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    move v0, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v0, v2

    .line 31
    :goto_1
    if-eqz v0, :cond_3

    .line 32
    .line 33
    new-instance v0, Lcom/discord/theme/DarkTheme;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Lcom/discord/theme/DarkTheme;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lcom/discord/theme/ThemeManager;->darkTheme:Lcom/discord/theme/DarkTheme;

    .line 39
    .line 40
    :cond_3
    sget-object p1, Lcom/discord/theme/ThemeManager;->currentTheme:Lcom/discord/theme/DiscordTheme;

    .line 41
    .line 42
    if-nez p1, :cond_4

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    move v1, v2

    .line 46
    :goto_2
    if-eqz v1, :cond_5

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/discord/theme/ThemeManager;->getDarkTheme()Lcom/discord/theme/DarkTheme;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Lcom/discord/theme/ThemeManager;->setCurrentTheme$theme_release(Lcom/discord/theme/DiscordTheme;)V

    .line 53
    .line 54
    .line 55
    :cond_5
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
.end method

.method public final isInitialized()Z
    .locals 1

    sget-object v0, Lcom/discord/theme/ThemeManager;->currentTheme:Lcom/discord/theme/DiscordTheme;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final setCurrentTheme$theme_release(Lcom/discord/theme/DiscordTheme;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-object p1, Lcom/discord/theme/ThemeManager;->currentTheme:Lcom/discord/theme/DiscordTheme;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public final setDarkTheme()V
    .locals 1

    invoke-virtual {p0}, Lcom/discord/theme/ThemeManager;->getDarkTheme()Lcom/discord/theme/DarkTheme;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/discord/theme/ThemeManager;->setCurrentTheme$theme_release(Lcom/discord/theme/DiscordTheme;)V

    return-void
.end method

.method public final setLightTheme()V
    .locals 1

    invoke-virtual {p0}, Lcom/discord/theme/ThemeManager;->getLightTheme()Lcom/discord/theme/LightTheme;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/discord/theme/ThemeManager;->setCurrentTheme$theme_release(Lcom/discord/theme/DiscordTheme;)V

    return-void
.end method

.method public final setThemeOverride(Lcom/discord/theme/DiscordTheme;)V
    .locals 0

    sput-object p1, Lcom/discord/theme/ThemeManager;->themeOverride:Lcom/discord/theme/DiscordTheme;

    return-void
.end method

.method public final shouldShowSplashImage$theme_release()Z
    .locals 1

    sget-boolean v0, Lcom/discord/theme/ThemeManager;->showSplashImage:Z

    return v0
.end method

.method public final updateSystemUi(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/discord/theme/utils/UpdateSystemUiKt;->updateSystemUi(Landroid/app/Activity;)V

    return-void
.end method

.method public final updateSystemUi(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lcom/discord/theme/utils/UpdateSystemUiKt;->updateSystemUi(Landroid/view/View;)V

    return-void
.end method

.method public final updateWindowBackground(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-boolean p2, Lcom/discord/theme/ThemeManager;->showSplashImage:Z

    .line 7
    .line 8
    instance-of p2, p1, Landroid/app/Activity;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    move-object p2, p1

    .line 14
    check-cast p2, Landroid/app/Activity;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p2, v0

    .line 18
    :goto_0
    if-nez p2, :cond_2

    .line 19
    .line 20
    instance-of p2, p1, Lcom/facebook/react/bridge/ReactContext;

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object p1, v0

    .line 28
    :goto_1
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object v0, p2

    .line 36
    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    .line 37
    .line 38
    sget-object p1, Lcom/discord/theme/utils/ActivityThemeUtils;->INSTANCE:Lcom/discord/theme/utils/ActivityThemeUtils;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lcom/discord/theme/utils/ActivityThemeUtils;->updateWindowBackground$theme_release(Landroid/app/Activity;)V

    .line 41
    .line 42
    .line 43
    :cond_4
    return-void
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method
