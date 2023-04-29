.class public final Lcom/discord/chrome_custom_tabs/CustomTabs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016Jy\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00082\u0016\u0010\u0012\u001a\u0012\u0012\u0008\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/discord/chrome_custom_tabs/CustomTabs;",
        "",
        "Landroid/content/Context;",
        "context",
        "Landroid/net/Uri;",
        "uri",
        "",
        "showTitle",
        "",
        "toolbarColor",
        "animShowEnterResId",
        "animShowExitResId",
        "animHideEnterResId",
        "animHideExitResId",
        "Lkotlin/Function1;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "",
        "onFailure",
        "openUrlWithCustomTabs",
        "(Landroid/content/Context;Landroid/net/Uri;ZILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V",
        "<init>",
        "()V",
        "chrome_custom_tabs_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chrome_custom_tabs/CustomTabs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chrome_custom_tabs/CustomTabs;

    invoke-direct {v0}, Lcom/discord/chrome_custom_tabs/CustomTabs;-><init>()V

    sput-object v0, Lcom/discord/chrome_custom_tabs/CustomTabs;->INSTANCE:Lcom/discord/chrome_custom_tabs/CustomTabs;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic openUrlWithCustomTabs$default(Lcom/discord/chrome_custom_tabs/CustomTabs;Landroid/content/Context;Landroid/net/Uri;ZILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p8

    :goto_4
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move/from16 v6, p4

    move-object/from16 v11, p9

    invoke-virtual/range {v2 .. v11}, Lcom/discord/chrome_custom_tabs/CustomTabs;->openUrlWithCustomTabs(Landroid/content/Context;Landroid/net/Uri;ZILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final openUrlWithCustomTabs(Landroid/content/Context;Landroid/net/Uri;ZILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "ZI",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "uri"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onFailure"

    .line 12
    .line 13
    invoke-static {p9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/discord/chrome_custom_tabs/CustomTabsPackages;->INSTANCE:Lcom/discord/chrome_custom_tabs/CustomTabsPackages;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/discord/chrome_custom_tabs/CustomTabsPackages;->getCustomTabsDefaultPackage(Landroid/content/Context;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    new-instance v0, Ln/a$a;

    .line 25
    .line 26
    invoke-direct {v0}, Ln/a$a;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p4}, Ln/a$a;->b(I)Ln/a$a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, p4}, Ln/a$a;->d(I)Ln/a$a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p4}, Ln/a$a;->c(I)Ln/a$a;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    invoke-virtual {p4}, Ln/a$a;->a()Ln/a;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    const-string v0, "Builder()\n              \u2026\n                .build()"

    .line 46
    .line 47
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Ln/b$a;

    .line 51
    .line 52
    invoke-direct {v1}, Ln/b$a;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p4}, Ln/b$a;->b(Ln/a;)Ln/b$a;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-virtual {p4, p3}, Ln/b$a;->e(Z)Ln/b$a;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    if-eqz p5, :cond_0

    .line 64
    .line 65
    if-eqz p6, :cond_0

    .line 66
    .line 67
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p5

    .line 75
    invoke-virtual {p3, p1, p4, p5}, Ln/b$a;->f(Landroid/content/Context;II)Ln/b$a;

    .line 76
    .line 77
    .line 78
    :cond_0
    if-eqz p7, :cond_1

    .line 79
    .line 80
    if-eqz p8, :cond_1

    .line 81
    .line 82
    invoke-virtual {p7}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p4

    .line 86
    invoke-virtual {p8}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p5

    .line 90
    invoke-virtual {p3, p1, p4, p5}, Ln/b$a;->c(Landroid/content/Context;II)Ln/b$a;

    .line 91
    .line 92
    .line 93
    :cond_1
    invoke-virtual {p3}, Ln/b$a;->a()Ln/b;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :try_start_0
    iget-object p4, p3, Ln/b;->a:Landroid/content/Intent;

    .line 101
    .line 102
    invoke-virtual {p4, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3, p1, p2}, Ln/b;->a(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catch_0
    move-exception p1

    .line 110
    invoke-interface {p9, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string p2, "Unable to find custom tabs package."

    .line 117
    .line 118
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p9, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :goto_0
    return-void
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
.end method
