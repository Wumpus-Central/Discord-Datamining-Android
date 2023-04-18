.class Landroidx/core/app/NotificationCompat$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/NotificationCompat$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# direct methods
.method static a(Landroid/app/Notification$BubbleMetadata;)Landroidx/core/app/NotificationCompat$d;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p0}, Landroidx/core/app/r1;->a(Landroid/app/Notification$BubbleMetadata;)Landroid/app/PendingIntent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    new-instance v0, Landroidx/core/app/NotificationCompat$d$c;

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/core/app/r1;->a(Landroid/app/Notification$BubbleMetadata;)Landroid/app/PendingIntent;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p0}, Landroidx/core/app/s1;->a(Landroid/app/Notification$BubbleMetadata;)Landroid/graphics/drawable/Icon;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v0, v1, v2}, Landroidx/core/app/NotificationCompat$d$c;-><init>(Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Landroidx/core/app/f1;->a(Landroid/app/Notification$BubbleMetadata;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$d$c;->b(Z)Landroidx/core/app/NotificationCompat$d$c;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p0}, Landroidx/core/app/g1;->a(Landroid/app/Notification$BubbleMetadata;)Landroid/app/PendingIntent;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$d$c;->c(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$d$c;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p0}, Landroidx/core/app/h1;->a(Landroid/app/Notification$BubbleMetadata;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$d$c;->g(Z)Landroidx/core/app/NotificationCompat$d$c;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p0}, Landroidx/core/app/i1;->a(Landroid/app/Notification$BubbleMetadata;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    invoke-static {p0}, Landroidx/core/app/i1;->a(Landroid/app/Notification$BubbleMetadata;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$d$c;->d(I)Landroidx/core/app/NotificationCompat$d$c;

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-static {p0}, Landroidx/core/app/j1;->a(Landroid/app/Notification$BubbleMetadata;)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    invoke-static {p0}, Landroidx/core/app/j1;->a(Landroid/app/Notification$BubbleMetadata;)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-virtual {v0, p0}, Landroidx/core/app/NotificationCompat$d$c;->e(I)Landroidx/core/app/NotificationCompat$d$c;

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$d$c;->a()Landroidx/core/app/NotificationCompat$d;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
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
.end method

.method static b(Landroidx/core/app/NotificationCompat$d;)Landroid/app/Notification$BubbleMetadata;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->g()Landroid/app/PendingIntent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    new-instance v0, Landroid/app/Notification$BubbleMetadata$Builder;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->f()Landroidx/core/graphics/drawable/IconCompat;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->x()Landroid/graphics/drawable/Icon;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Landroidx/core/app/e1;->a(Landroid/app/Notification$BubbleMetadata$Builder;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->g()Landroid/app/PendingIntent;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Landroidx/core/app/k1;->a(Landroid/app/Notification$BubbleMetadata$Builder;Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->c()Landroid/app/PendingIntent;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Landroidx/core/app/l1;->a(Landroid/app/Notification$BubbleMetadata$Builder;Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->b()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {v0, v1}, Landroidx/core/app/m1;->a(Landroid/app/Notification$BubbleMetadata$Builder;Z)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->i()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v0, v1}, Landroidx/core/app/n1;->a(Landroid/app/Notification$BubbleMetadata$Builder;Z)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->d()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->d()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {v0, v1}, Landroidx/core/app/o1;->a(Landroid/app/Notification$BubbleMetadata$Builder;I)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->e()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/core/app/NotificationCompat$d;->e()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-static {v0, p0}, Landroidx/core/app/p1;->a(Landroid/app/Notification$BubbleMetadata$Builder;I)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-static {v0}, Landroidx/core/app/q1;->a(Landroid/app/Notification$BubbleMetadata$Builder;)Landroid/app/Notification$BubbleMetadata;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
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
.end method
