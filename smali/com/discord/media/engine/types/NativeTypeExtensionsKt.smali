.class public final Lcom/discord/media/engine/types/NativeTypeExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media/engine/types/NativeTypeExtensionsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u00a2\u0006\u0002\u0010\u0007\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00080\u0005H\u0000\u00a2\u0006\u0002\u0010\t\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\n0\u0005H\u0000\u00a2\u0006\u0002\u0010\u000b\u001a\u0018\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\rH\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "toListOfMaps",
        "",
        "",
        "",
        "",
        "",
        "Lcom/discord/native/engine/AudioInputDeviceDescription;",
        "([Lcom/discord/native/engine/AudioInputDeviceDescription;)Ljava/util/List;",
        "Lcom/discord/native/engine/AudioOutputDeviceDescription;",
        "([Lcom/discord/native/engine/AudioOutputDeviceDescription;)Ljava/util/List;",
        "Lcom/discord/native/engine/VideoInputDeviceDescription;",
        "([Lcom/discord/native/engine/VideoInputDeviceDescription;)Ljava/util/List;",
        "toMap",
        "Lcom/discord/native/engine/ConnectionInfo;",
        "media_engine_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toListOfMaps([Lcom/discord/native/engine/AudioInputDeviceDescription;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/discord/native/engine/AudioInputDeviceDescription;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, p0, v3

    add-int/lit8 v6, v4, 0x1

    const/4 v7, 0x3

    new-array v7, v7, [Lkotlin/Pair;

    .line 3
    invoke-virtual {v5}, Lcom/discord/native/engine/AudioInputDeviceDescription;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "name"

    invoke-static {v9, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v2

    const-string v8, "guid"

    .line 4
    invoke-virtual {v5}, Lcom/discord/native/engine/AudioInputDeviceDescription;->getGuid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v5}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v8, 0x1

    aput-object v5, v7, v8

    const-string v5, "index"

    .line 5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v5, v4}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v7, v5

    .line 6
    invoke-static {v7}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    .line 7
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final toListOfMaps([Lcom/discord/native/engine/AudioOutputDeviceDescription;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/discord/native/engine/AudioOutputDeviceDescription;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, p0, v3

    add-int/lit8 v6, v4, 0x1

    const/4 v7, 0x3

    new-array v7, v7, [Lkotlin/Pair;

    .line 10
    invoke-virtual {v5}, Lcom/discord/native/engine/AudioOutputDeviceDescription;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "name"

    invoke-static {v9, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v2

    const-string v8, "guid"

    .line 11
    invoke-virtual {v5}, Lcom/discord/native/engine/AudioOutputDeviceDescription;->getGuid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v5}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v8, 0x1

    aput-object v5, v7, v8

    const-string v5, "index"

    .line 12
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v5, v4}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v7, v5

    .line 13
    invoke-static {v7}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    .line 14
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final toListOfMaps([Lcom/discord/native/engine/VideoInputDeviceDescription;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/discord/native/engine/VideoInputDeviceDescription;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    array-length v2, p0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_2

    aget-object v6, p0, v4

    .line 18
    invoke-virtual {v6}, Lcom/discord/native/engine/VideoInputDeviceDescription;->getFacing()Lcom/discord/native/engine/VideoInputDeviceFacing;

    move-result-object v7

    sget-object v8, Lcom/discord/native/engine/VideoInputDeviceFacing;->Front:Lcom/discord/native/engine/VideoInputDeviceFacing;

    if-ne v7, v8, :cond_0

    goto :goto_1

    :cond_0
    move v5, v3

    :goto_1
    if-eqz v5, :cond_1

    .line 19
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 20
    :cond_1
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 21
    :cond_2
    new-instance p0, Lkotlin/Pair;

    invoke-direct {p0, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    invoke-virtual {p0}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    const/4 v1, 0x2

    new-array v2, v1, [Lcom/discord/native/engine/VideoInputDeviceDescription;

    .line 23
    invoke-static {v0}, Lkotlin/collections/h;->W(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/native/engine/VideoInputDeviceDescription;

    aput-object v0, v2, v3

    invoke-static {p0}, Lkotlin/collections/h;->W(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/discord/native/engine/VideoInputDeviceDescription;

    aput-object p0, v2, v5

    invoke-static {v2}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 24
    invoke-static {p0}, Lkotlin/collections/h;->R(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v2, v3

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v2, 0x1

    if-gez v2, :cond_3

    .line 27
    invoke-static {}, Lkotlin/collections/h;->s()V

    :cond_3
    check-cast v4, Lcom/discord/native/engine/VideoInputDeviceDescription;

    .line 28
    invoke-virtual {v4}, Lcom/discord/native/engine/VideoInputDeviceDescription;->getFacing()Lcom/discord/native/engine/VideoInputDeviceFacing;

    move-result-object v7

    sget-object v8, Lcom/discord/media/engine/types/NativeTypeExtensionsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v8, v7

    if-eq v7, v5, :cond_5

    if-eq v7, v1, :cond_4

    const-string v7, "unknown"

    goto :goto_4

    :cond_4
    const-string v7, "back"

    goto :goto_4

    :cond_5
    const-string v7, "front"

    :goto_4
    const/4 v8, 0x4

    new-array v8, v8, [Lkotlin/Pair;

    const-string v9, "name"

    .line 29
    invoke-virtual {v4}, Lcom/discord/native/engine/VideoInputDeviceDescription;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v8, v3

    const-string v9, "guid"

    .line 30
    invoke-virtual {v4}, Lcom/discord/native/engine/VideoInputDeviceDescription;->getGuid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v8, v5

    const-string v4, "facing"

    .line 31
    invoke-static {v4, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v8, v1

    const-string v4, "index"

    .line 32
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x3

    aput-object v2, v8, v4

    .line 33
    invoke-static {v8}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    .line 34
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v6

    goto :goto_3

    :cond_6
    return-object v0
.end method

.method public static final toMap(Lcom/discord/native/engine/ConnectionInfo;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/native/engine/ConnectionInfo;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    new-array v0, v0, [Lkotlin/Pair;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/discord/native/engine/ConnectionInfo;->getProtocol()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "protocol"

    .line 14
    .line 15
    invoke-static {v2, v1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    aput-object v1, v0, v2

    .line 21
    .line 22
    const-string v1, "address"

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/discord/native/engine/ConnectionInfo;->getLocalAddress()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x1

    .line 33
    aput-object v1, v0, v2

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/discord/native/engine/ConnectionInfo;->getLocalPort()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v1, "port"

    .line 44
    .line 45
    invoke-static {v1, p0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v1, 0x2

    .line 50
    aput-object p0, v0, v1

    .line 51
    .line 52
    invoke-static {v0}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
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
.end method
