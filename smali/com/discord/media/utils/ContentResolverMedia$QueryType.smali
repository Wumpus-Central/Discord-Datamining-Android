.class public final enum Lcom/discord/media/utils/ContentResolverMedia$QueryType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/media/utils/ContentResolverMedia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "QueryType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/media/utils/ContentResolverMedia$QueryType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/discord/media/utils/ContentResolverMedia$QueryType;",
        "",
        "(Ljava/lang/String;I)V",
        "getSelection",
        "",
        "shouldIncludeImages",
        "",
        "shouldIncludeVideo",
        "ALL",
        "IMAGE",
        "VIDEO",
        "Companion",
        "media_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/media/utils/ContentResolverMedia$QueryType;

.field public static final enum ALL:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

.field public static final Companion:Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;

.field public static final enum IMAGE:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

.field private static final UNSUPPORTED_IMAGE_MIME_TYPES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum VIDEO:Lcom/discord/media/utils/ContentResolverMedia$QueryType;


# direct methods
.method private static final synthetic $values()[Lcom/discord/media/utils/ContentResolverMedia$QueryType;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->ALL:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->IMAGE:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->VIDEO:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    .line 2
    .line 3
    const-string v1, "ALL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$QueryType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->ALL:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    .line 10
    .line 11
    new-instance v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    .line 12
    .line 13
    const-string v1, "IMAGE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$QueryType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->IMAGE:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    .line 20
    .line 21
    new-instance v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    .line 22
    .line 23
    const-string v1, "VIDEO"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$QueryType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->VIDEO:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    .line 30
    .line 31
    invoke-static {}, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->$values()[Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->$VALUES:[Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    .line 36
    .line 37
    new-instance v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, v1}, Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->Companion:Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;

    .line 44
    .line 45
    const-string v0, "image/x-adobe-dng"

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->UNSUPPORTED_IMAGE_MIME_TYPES:Ljava/util/List;

    .line 52
    .line 53
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getUNSUPPORTED_IMAGE_MIME_TYPES$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->UNSUPPORTED_IMAGE_MIME_TYPES:Ljava/util/List;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/media/utils/ContentResolverMedia$QueryType;
    .locals 1

    const-class v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    return-object p0
.end method

.method public static values()[Lcom/discord/media/utils/ContentResolverMedia$QueryType;
    .locals 1

    sget-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->$VALUES:[Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    return-object v0
.end method


# virtual methods
.method public final getSelection()Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->shouldIncludeImages()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->Companion:Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;->access$getUnsupportedImageMimeTypes(Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v3, "media_type=1 AND mime_type NOT IN ("

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ")"

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v0, v1

    .line 38
    :goto_0
    invoke-virtual {p0}, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->shouldIncludeVideo()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    const-string v1, "media_type = 3"

    .line 45
    .line 46
    :cond_1
    const/4 v2, 0x2

    .line 47
    new-array v2, v2, [Ljava/lang/String;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    aput-object v0, v2, v3

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    aput-object v1, v2, v0

    .line 54
    .line 55
    invoke-static {v2}, Lkotlin/collections/h;->n([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, " OR "

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    const/16 v10, 0x3e

    .line 67
    .line 68
    const/4 v11, 0x0

    .line 69
    invoke-static/range {v3 .. v11}, Lkotlin/collections/h;->e0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0
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
.end method

.method public final shouldIncludeImages()Z
    .locals 1

    sget-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->ALL:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->IMAGE:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final shouldIncludeVideo()Z
    .locals 1

    sget-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->ALL:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/discord/media/utils/ContentResolverMedia$QueryType;->VIDEO:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
