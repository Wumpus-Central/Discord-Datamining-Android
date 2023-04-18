.class public final Landroidx/core/app/NotificationCompat$Action$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationCompat$Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/core/graphics/drawable/IconCompat;

.field private final b:Ljava/lang/CharSequence;

.field private final c:Landroid/app/PendingIntent;

.field private d:Z

.field private final e:Landroid/os/Bundle;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/RemoteInput;",
            ">;"
        }
    .end annotation
.end field

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Z


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
    .locals 12

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 2
    invoke-static {v0, v1, p1}, Landroidx/core/graphics/drawable/IconCompat;->l(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    :goto_0
    move-object v2, v0

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v11}, Landroidx/core/app/NotificationCompat$Action$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroidx/core/app/RemoteInput;ZIZZZ)V

    return-void
.end method

.method public constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
    .locals 11

    .line 1
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v10}, Landroidx/core/app/NotificationCompat$Action$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroidx/core/app/RemoteInput;ZIZZZ)V

    return-void
.end method

.method private constructor <init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroidx/core/app/RemoteInput;ZIZZZ)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/core/app/NotificationCompat$Action$a;->d:Z

    .line 5
    iput-boolean v0, p0, Landroidx/core/app/NotificationCompat$Action$a;->h:Z

    .line 6
    iput-object p1, p0, Landroidx/core/app/NotificationCompat$Action$a;->a:Landroidx/core/graphics/drawable/IconCompat;

    .line 7
    invoke-static {p2}, Landroidx/core/app/NotificationCompat$Builder;->q(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/NotificationCompat$Action$a;->b:Ljava/lang/CharSequence;

    .line 8
    iput-object p3, p0, Landroidx/core/app/NotificationCompat$Action$a;->c:Landroid/app/PendingIntent;

    .line 9
    iput-object p4, p0, Landroidx/core/app/NotificationCompat$Action$a;->e:Landroid/os/Bundle;

    if-nez p5, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    invoke-static {p5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    iput-object p1, p0, Landroidx/core/app/NotificationCompat$Action$a;->f:Ljava/util/ArrayList;

    .line 12
    iput-boolean p6, p0, Landroidx/core/app/NotificationCompat$Action$a;->d:Z

    .line 13
    iput p7, p0, Landroidx/core/app/NotificationCompat$Action$a;->g:I

    .line 14
    iput-boolean p8, p0, Landroidx/core/app/NotificationCompat$Action$a;->h:Z

    .line 15
    iput-boolean p9, p0, Landroidx/core/app/NotificationCompat$Action$a;->i:Z

    .line 16
    iput-boolean p10, p0, Landroidx/core/app/NotificationCompat$Action$a;->j:Z

    return-void
.end method

.method private c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/core/app/NotificationCompat$Action$a;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/core/app/NotificationCompat$Action$a;->c:Landroid/app/PendingIntent;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 12
    .line 13
    const-string v1, "Contextual Actions must contain a valid PendingIntent"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
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
.end method

.method public static d(Landroid/app/Notification$Action;)Landroidx/core/app/NotificationCompat$Action$a;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Notification$Action;->getIcon()Landroid/graphics/drawable/Icon;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Notification$Action;->getIcon()Landroid/graphics/drawable/Icon;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroidx/core/app/NotificationCompat$Action$a;

    .line 16
    .line 17
    iget-object v2, p0, Landroid/app/Notification$Action;->title:Ljava/lang/CharSequence;

    .line 18
    .line 19
    iget-object v3, p0, Landroid/app/Notification$Action;->actionIntent:Landroid/app/PendingIntent;

    .line 20
    .line 21
    invoke-direct {v1, v0, v2, v3}, Landroidx/core/app/NotificationCompat$Action$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Landroidx/core/app/NotificationCompat$Action$a;

    .line 26
    .line 27
    iget v0, p0, Landroid/app/Notification$Action;->icon:I

    .line 28
    .line 29
    iget-object v2, p0, Landroid/app/Notification$Action;->title:Ljava/lang/CharSequence;

    .line 30
    .line 31
    iget-object v3, p0, Landroid/app/Notification$Action;->actionIntent:Landroid/app/PendingIntent;

    .line 32
    .line 33
    invoke-direct {v1, v0, v2, v3}, Landroidx/core/app/NotificationCompat$Action$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p0}, Landroid/app/Notification$Action;->getRemoteInputs()[Landroid/app/RemoteInput;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    array-length v2, v0

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    array-length v2, v0

    .line 46
    const/4 v3, 0x0

    .line 47
    :goto_1
    if-ge v3, v2, :cond_1

    .line 48
    .line 49
    aget-object v4, v0, v3

    .line 50
    .line 51
    invoke-static {v4}, Landroidx/core/app/RemoteInput;->c(Landroid/app/RemoteInput;)Landroidx/core/app/RemoteInput;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v1, v4}, Landroidx/core/app/NotificationCompat$Action$a;->a(Landroidx/core/app/RemoteInput;)Landroidx/core/app/NotificationCompat$Action$a;

    .line 56
    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v2, 0x18

    .line 64
    .line 65
    if-lt v0, v2, :cond_2

    .line 66
    .line 67
    invoke-static {p0}, Landroidx/core/app/y0;->a(Landroid/app/Notification$Action;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iput-boolean v2, v1, Landroidx/core/app/NotificationCompat$Action$a;->d:Z

    .line 72
    .line 73
    :cond_2
    const/16 v2, 0x1c

    .line 74
    .line 75
    if-lt v0, v2, :cond_3

    .line 76
    .line 77
    invoke-static {p0}, Landroidx/core/app/z0;->a(Landroid/app/Notification$Action;)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Action$a;->h(I)Landroidx/core/app/NotificationCompat$Action$a;

    .line 82
    .line 83
    .line 84
    :cond_3
    const/16 v2, 0x1d

    .line 85
    .line 86
    if-lt v0, v2, :cond_4

    .line 87
    .line 88
    invoke-static {p0}, Landroidx/core/app/a1;->a(Landroid/app/Notification$Action;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {v1, v2}, Landroidx/core/app/NotificationCompat$Action$a;->g(Z)Landroidx/core/app/NotificationCompat$Action$a;

    .line 93
    .line 94
    .line 95
    :cond_4
    const/16 v2, 0x1f

    .line 96
    .line 97
    if-lt v0, v2, :cond_5

    .line 98
    .line 99
    invoke-static {p0}, Landroidx/core/app/b1;->a(Landroid/app/Notification$Action;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-virtual {v1, p0}, Landroidx/core/app/NotificationCompat$Action$a;->f(Z)Landroidx/core/app/NotificationCompat$Action$a;

    .line 104
    .line 105
    .line 106
    :cond_5
    return-object v1
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
.end method


# virtual methods
.method public a(Landroidx/core/app/RemoteInput;)Landroidx/core/app/NotificationCompat$Action$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/core/app/NotificationCompat$Action$a;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/core/app/NotificationCompat$Action$a;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/core/app/NotificationCompat$Action$a;->f:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_1
    return-object p0
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
.end method

.method public b()Landroidx/core/app/NotificationCompat$Action;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Landroidx/core/app/NotificationCompat$Action$a;->c()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Landroidx/core/app/NotificationCompat$Action$a;->f:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Landroidx/core/app/RemoteInput;

    .line 35
    .line 36
    invoke-virtual {v4}, Landroidx/core/app/RemoteInput;->l()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x0

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    move-object v11, v4

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    new-array v3, v3, [Landroidx/core/app/RemoteInput;

    .line 64
    .line 65
    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, [Landroidx/core/app/RemoteInput;

    .line 70
    .line 71
    move-object v11, v1

    .line 72
    :goto_1
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    new-array v1, v1, [Landroidx/core/app/RemoteInput;

    .line 84
    .line 85
    invoke-interface {v2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v4, v1

    .line 90
    check-cast v4, [Landroidx/core/app/RemoteInput;

    .line 91
    .line 92
    :goto_2
    move-object v10, v4

    .line 93
    new-instance v1, Landroidx/core/app/NotificationCompat$Action;

    .line 94
    .line 95
    iget-object v6, v0, Landroidx/core/app/NotificationCompat$Action$a;->a:Landroidx/core/graphics/drawable/IconCompat;

    .line 96
    .line 97
    iget-object v7, v0, Landroidx/core/app/NotificationCompat$Action$a;->b:Ljava/lang/CharSequence;

    .line 98
    .line 99
    iget-object v8, v0, Landroidx/core/app/NotificationCompat$Action$a;->c:Landroid/app/PendingIntent;

    .line 100
    .line 101
    iget-object v9, v0, Landroidx/core/app/NotificationCompat$Action$a;->e:Landroid/os/Bundle;

    .line 102
    .line 103
    iget-boolean v12, v0, Landroidx/core/app/NotificationCompat$Action$a;->d:Z

    .line 104
    .line 105
    iget v13, v0, Landroidx/core/app/NotificationCompat$Action$a;->g:I

    .line 106
    .line 107
    iget-boolean v14, v0, Landroidx/core/app/NotificationCompat$Action$a;->h:Z

    .line 108
    .line 109
    iget-boolean v15, v0, Landroidx/core/app/NotificationCompat$Action$a;->i:Z

    .line 110
    .line 111
    iget-boolean v2, v0, Landroidx/core/app/NotificationCompat$Action$a;->j:Z

    .line 112
    .line 113
    move-object v5, v1

    .line 114
    move/from16 v16, v2

    .line 115
    .line 116
    invoke-direct/range {v5 .. v16}, Landroidx/core/app/NotificationCompat$Action;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroidx/core/app/RemoteInput;[Landroidx/core/app/RemoteInput;ZIZZZ)V

    .line 117
    .line 118
    .line 119
    return-object v1
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
.end method

.method public e(Z)Landroidx/core/app/NotificationCompat$Action$a;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/NotificationCompat$Action$a;->d:Z

    return-object p0
.end method

.method public f(Z)Landroidx/core/app/NotificationCompat$Action$a;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/NotificationCompat$Action$a;->j:Z

    return-object p0
.end method

.method public g(Z)Landroidx/core/app/NotificationCompat$Action$a;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/NotificationCompat$Action$a;->i:Z

    return-object p0
.end method

.method public h(I)Landroidx/core/app/NotificationCompat$Action$a;
    .locals 0

    iput p1, p0, Landroidx/core/app/NotificationCompat$Action$a;->g:I

    return-object p0
.end method

.method public i(Z)Landroidx/core/app/NotificationCompat$Action$a;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/NotificationCompat$Action$a;->h:Z

    return-object p0
.end method
