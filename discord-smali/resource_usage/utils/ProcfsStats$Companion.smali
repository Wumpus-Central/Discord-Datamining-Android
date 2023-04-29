.class public final Lcom/discord/resource_usage/utils/ProcfsStats$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/resource_usage/utils/ProcfsStats;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/discord/resource_usage/utils/ProcfsStats$Companion;",
        "",
        "()V",
        "statFile",
        "Ljava/io/File;",
        "getStatFile",
        "()Ljava/io/File;",
        "statFile$delegate",
        "Lkotlin/Lazy;",
        "readStatFile",
        "Lcom/discord/resource_usage/utils/ProcfsStats;",
        "parsePidStats",
        "resource_usage_monitor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/resource_usage/utils/ProcfsStats$Companion;-><init>()V

    return-void
.end method

.method private final getStatFile()Ljava/io/File;
    .locals 1

    invoke-static {}, Lcom/discord/resource_usage/utils/ProcfsStats;->access$getStatFile$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method private final parsePidStats(Ljava/io/File;)Lcom/discord/resource_usage/utils/ProcfsStats;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-static {p1, v0, v1, v0}, Lxf/j;->d(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, 0x0

    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    move p1, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p1, v3

    .line 23
    :goto_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-array p1, v1, [C

    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    aput-char v1, p1, v3

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x6

    .line 34
    const/4 v7, 0x0

    .line 35
    move-object v3, p1

    .line 36
    invoke-static/range {v2 .. v7}, Lri/l;->y0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const/16 v1, 0xd

    .line 41
    .line 42
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    const-wide/16 v2, 0x0

    .line 49
    .line 50
    invoke-static {v1, v2, v3}, Lrj/c;->T(Ljava/lang/String;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    const/16 v1, 0xe

    .line 55
    .line 56
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1, v2, v3}, Lrj/c;->T(Ljava/lang/String;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    const/16 v1, 0x17

    .line 67
    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p1, v2, v3}, Lrj/c;->T(Ljava/lang/String;J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    new-instance p1, Lcom/discord/resource_usage/utils/ProcfsStats;

    .line 79
    .line 80
    add-long/2addr v4, v6

    .line 81
    invoke-direct {p1, v4, v5, v1, v2}, Lcom/discord/resource_usage/utils/ProcfsStats;-><init>(JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    move-object v0, p1

    .line 85
    :catch_0
    :cond_1
    return-object v0
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
.end method


# virtual methods
.method public final readStatFile()Lcom/discord/resource_usage/utils/ProcfsStats;
    .locals 1

    invoke-direct {p0}, Lcom/discord/resource_usage/utils/ProcfsStats$Companion;->getStatFile()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/discord/resource_usage/utils/ProcfsStats$Companion;->parsePidStats(Ljava/io/File;)Lcom/discord/resource_usage/utils/ProcfsStats;

    move-result-object v0

    return-object v0
.end method
