.class public final Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/media/utils/ContentResolverMedia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "QueryColumns"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001BY\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0011\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0008\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;",
        "",
        "queryColumnId",
        "Lcom/discord/media/utils/ContentResolverMedia$Column;",
        "queryColumnDisplayName",
        "queryColumnMimeType",
        "queryColumnWidth",
        "queryColumnHeight",
        "queryColumnDateAdded",
        "queryMediaType",
        "queryColumnDuration",
        "(Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;)V",
        "getContentResolverMedia",
        "Lcom/discord/media/utils/ContentResolverMedia;",
        "queryUri",
        "Landroid/net/Uri;",
        "cursor",
        "Landroid/database/Cursor;",
        "getProjection",
        "",
        "",
        "()[Ljava/lang/String;",
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


# instance fields
.field private final queryColumnDateAdded:Lcom/discord/media/utils/ContentResolverMedia$Column;

.field private final queryColumnDisplayName:Lcom/discord/media/utils/ContentResolverMedia$Column;

.field private final queryColumnDuration:Lcom/discord/media/utils/ContentResolverMedia$Column;

.field private final queryColumnHeight:Lcom/discord/media/utils/ContentResolverMedia$Column;

.field private final queryColumnId:Lcom/discord/media/utils/ContentResolverMedia$Column;

.field private final queryColumnMimeType:Lcom/discord/media/utils/ContentResolverMedia$Column;

.field private final queryColumnWidth:Lcom/discord/media/utils/ContentResolverMedia$Column;

.field private final queryMediaType:Lcom/discord/media/utils/ContentResolverMedia$Column;


# direct methods
.method public constructor <init>()V
    .locals 11

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xff

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;-><init>(Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;)V
    .locals 1

    const-string v0, "queryColumnId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryColumnDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryColumnMimeType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryColumnWidth"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryColumnHeight"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryColumnDateAdded"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnId:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 3
    iput-object p2, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDisplayName:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 4
    iput-object p3, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnMimeType:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 5
    iput-object p4, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnWidth:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 6
    iput-object p5, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnHeight:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 7
    iput-object p6, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDateAdded:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 8
    iput-object p7, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryMediaType:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 9
    iput-object p8, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDuration:Lcom/discord/media/utils/ContentResolverMedia$Column;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 10
    new-instance v1, Lcom/discord/media/utils/ContentResolverMedia$Column;

    const-string v2, "_id"

    invoke-direct {v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 11
    new-instance v2, Lcom/discord/media/utils/ContentResolverMedia$Column;

    const-string v3, "_display_name"

    invoke-direct {v2, v3}, Lcom/discord/media/utils/ContentResolverMedia$Column;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    .line 12
    new-instance v3, Lcom/discord/media/utils/ContentResolverMedia$Column;

    const-string v4, "mime_type"

    invoke-direct {v3, v4}, Lcom/discord/media/utils/ContentResolverMedia$Column;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    .line 13
    new-instance v4, Lcom/discord/media/utils/ContentResolverMedia$Column;

    const-string v5, "width"

    invoke-direct {v4, v5}, Lcom/discord/media/utils/ContentResolverMedia$Column;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    move-object v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    .line 14
    new-instance v5, Lcom/discord/media/utils/ContentResolverMedia$Column;

    const-string v6, "height"

    invoke-direct {v5, v6}, Lcom/discord/media/utils/ContentResolverMedia$Column;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    move-object v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    .line 15
    new-instance v6, Lcom/discord/media/utils/ContentResolverMedia$Column;

    const-string v7, "date_added"

    invoke-direct {v6, v7}, Lcom/discord/media/utils/ContentResolverMedia$Column;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    move-object v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    .line 16
    new-instance v7, Lcom/discord/media/utils/ContentResolverMedia$Column;

    const-string v8, "media_type"

    invoke-direct {v7, v8}, Lcom/discord/media/utils/ContentResolverMedia$Column;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    .line 17
    new-instance v0, Lcom/discord/media/utils/ContentResolverMedia$Column;

    const-string v8, "duration"

    invoke-direct {v0, v8}, Lcom/discord/media/utils/ContentResolverMedia$Column;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_7
    move-object/from16 v0, p8

    :goto_7
    move-object p1, p0

    move-object p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object p5, v4

    move-object p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v0

    .line 18
    invoke-direct/range {p1 .. p9}, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;-><init>(Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;)V

    return-void
.end method


# virtual methods
.method public final getContentResolverMedia(Landroid/net/Uri;Landroid/database/Cursor;)Lcom/discord/media/utils/ContentResolverMedia;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "queryUri"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "cursor"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryMediaType:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getInt(Landroid/database/Cursor;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v6, 0x3

    .line 28
    if-ne v3, v6, :cond_0

    .line 29
    .line 30
    move v3, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v3, v5

    .line 33
    :goto_0
    if-nez v3, :cond_3

    .line 34
    .line 35
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const-string v6, "video"

    .line 42
    .line 43
    invoke-interface {v3, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ne v3, v4, :cond_1

    .line 48
    .line 49
    move v3, v4

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v3, v5

    .line 52
    :goto_1
    if-eqz v3, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move v4, v5

    .line 56
    :cond_3
    :goto_2
    new-instance v3, Lcom/discord/media/utils/ContentResolverMedia;

    .line 57
    .line 58
    iget-object v6, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnId:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 59
    .line 60
    invoke-virtual {v6, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getLong(Landroid/database/Cursor;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v7

    .line 64
    iget-object v6, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnId:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 65
    .line 66
    invoke-virtual {v6, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getLong(Landroid/database/Cursor;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v9

    .line 70
    invoke-static {v1, v9, v10}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    const-string v1, "withAppendedId(queryUri,\u2026ColumnId.getLong(cursor))"

    .line 75
    .line 76
    invoke-static {v9, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    if-eqz v4, :cond_4

    .line 80
    .line 81
    sget-object v1, Lcom/discord/media/utils/ContentResolverMedia$MediaType;->VIDEO:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    sget-object v1, Lcom/discord/media/utils/ContentResolverMedia$MediaType;->IMAGE:Lcom/discord/media/utils/ContentResolverMedia$MediaType;

    .line 85
    .line 86
    :goto_3
    move-object v10, v1

    .line 87
    iget-object v1, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnMimeType:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getString(Landroid/database/Cursor;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    iget-object v1, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDisplayName:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getString(Landroid/database/Cursor;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    iget-object v1, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDuration:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 100
    .line 101
    if-eqz v1, :cond_5

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getInt(Landroid/database/Cursor;)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    :cond_5
    div-int/lit16 v13, v5, 0x3e8

    .line 108
    .line 109
    iget-object v1, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDateAdded:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getInt(Landroid/database/Cursor;)I

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    iget-object v1, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnWidth:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getInt(Landroid/database/Cursor;)I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    iget-object v1, v0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnHeight:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getInt(Landroid/database/Cursor;)I

    .line 124
    .line 125
    .line 126
    move-result v16

    .line 127
    move-object v6, v3

    .line 128
    invoke-direct/range {v6 .. v16}, Lcom/discord/media/utils/ContentResolverMedia;-><init>(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)V

    .line 129
    .line 130
    .line 131
    return-object v3
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
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
.end method

.method public final getProjection()[Ljava/lang/String;
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnId:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getField()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDisplayName:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getField()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v3, 0x1

    .line 21
    aput-object v1, v0, v3

    .line 22
    .line 23
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnMimeType:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getField()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v3, 0x2

    .line 30
    aput-object v1, v0, v3

    .line 31
    .line 32
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnWidth:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getField()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v3, 0x3

    .line 39
    aput-object v1, v0, v3

    .line 40
    .line 41
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnHeight:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getField()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v3, 0x4

    .line 48
    aput-object v1, v0, v3

    .line 49
    .line 50
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDateAdded:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getField()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v3, 0x5

    .line 57
    aput-object v1, v0, v3

    .line 58
    .line 59
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryMediaType:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getField()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-object v1, v3

    .line 70
    :goto_0
    const/4 v4, 0x6

    .line 71
    aput-object v1, v0, v4

    .line 72
    .line 73
    iget-object v1, p0, Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;->queryColumnDuration:Lcom/discord/media/utils/ContentResolverMedia$Column;

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/discord/media/utils/ContentResolverMedia$Column;->getField()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    :cond_1
    const/4 v1, 0x7

    .line 82
    aput-object v3, v0, v1

    .line 83
    .line 84
    invoke-static {v0}, Lkotlin/collections/h;->n([Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-array v1, v2, [Ljava/lang/String;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, [Ljava/lang/String;

    .line 95
    .line 96
    return-object v0
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
.end method
