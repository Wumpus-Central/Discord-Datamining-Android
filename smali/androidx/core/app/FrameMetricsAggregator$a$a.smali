.class Landroidx/core/app/FrameMetricsAggregator$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/FrameMetricsAggregator$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/core/app/FrameMetricsAggregator$a;


# direct methods
.method constructor <init>(Landroidx/core/app/FrameMetricsAggregator$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 8

    .line 1
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 2
    .line 3
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    and-int/2addr p3, v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 13
    .line 14
    aget-object p3, p3, v1

    .line 15
    .line 16
    invoke-static {p2, v2}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-virtual {p1, p3, v3, v4}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 24
    .line 25
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    and-int/2addr p3, v3

    .line 29
    if-eqz p3, :cond_1

    .line 30
    .line 31
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 32
    .line 33
    aget-object p3, p3, v0

    .line 34
    .line 35
    invoke-static {p2, v0}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    invoke-virtual {p1, p3, v4, v5}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 43
    .line 44
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 45
    .line 46
    const/4 v0, 0x4

    .line 47
    and-int/2addr p3, v0

    .line 48
    const/4 v4, 0x3

    .line 49
    if-eqz p3, :cond_2

    .line 50
    .line 51
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 52
    .line 53
    aget-object p3, p3, v3

    .line 54
    .line 55
    invoke-static {p2, v4}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    invoke-virtual {p1, p3, v5, v6}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 63
    .line 64
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 65
    .line 66
    and-int/2addr p3, v2

    .line 67
    if-eqz p3, :cond_3

    .line 68
    .line 69
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 70
    .line 71
    aget-object p3, p3, v4

    .line 72
    .line 73
    invoke-static {p2, v0}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    invoke-virtual {p1, p3, v4, v5}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 78
    .line 79
    .line 80
    :cond_3
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 81
    .line 82
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 83
    .line 84
    and-int/lit8 p3, p3, 0x10

    .line 85
    .line 86
    const/4 v4, 0x5

    .line 87
    if-eqz p3, :cond_4

    .line 88
    .line 89
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 90
    .line 91
    aget-object p3, p3, v0

    .line 92
    .line 93
    invoke-static {p2, v4}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    invoke-virtual {p1, p3, v5, v6}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 98
    .line 99
    .line 100
    :cond_4
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 101
    .line 102
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 103
    .line 104
    and-int/lit8 p3, p3, 0x40

    .line 105
    .line 106
    const/4 v0, 0x7

    .line 107
    const/4 v5, 0x6

    .line 108
    if-eqz p3, :cond_5

    .line 109
    .line 110
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 111
    .line 112
    aget-object p3, p3, v5

    .line 113
    .line 114
    invoke-static {p2, v0}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    invoke-virtual {p1, p3, v6, v7}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 119
    .line 120
    .line 121
    :cond_5
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 122
    .line 123
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 124
    .line 125
    and-int/lit8 p3, p3, 0x20

    .line 126
    .line 127
    if-eqz p3, :cond_6

    .line 128
    .line 129
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 130
    .line 131
    aget-object p3, p3, v4

    .line 132
    .line 133
    invoke-static {p2, v5}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 134
    .line 135
    .line 136
    move-result-wide v4

    .line 137
    invoke-virtual {p1, p3, v4, v5}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 138
    .line 139
    .line 140
    :cond_6
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 141
    .line 142
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 143
    .line 144
    and-int/lit16 p3, p3, 0x80

    .line 145
    .line 146
    if-eqz p3, :cond_7

    .line 147
    .line 148
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 149
    .line 150
    aget-object p3, p3, v0

    .line 151
    .line 152
    invoke-static {p2, v1}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 153
    .line 154
    .line 155
    move-result-wide v0

    .line 156
    invoke-virtual {p1, p3, v0, v1}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 157
    .line 158
    .line 159
    :cond_7
    iget-object p1, p0, Landroidx/core/app/FrameMetricsAggregator$a$a;->a:Landroidx/core/app/FrameMetricsAggregator$a;

    .line 160
    .line 161
    iget p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->a:I

    .line 162
    .line 163
    and-int/lit16 p3, p3, 0x100

    .line 164
    .line 165
    if-eqz p3, :cond_8

    .line 166
    .line 167
    iget-object p3, p1, Landroidx/core/app/FrameMetricsAggregator$a;->b:[Landroid/util/SparseIntArray;

    .line 168
    .line 169
    aget-object p3, p3, v2

    .line 170
    .line 171
    invoke-static {p2, v3}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 172
    .line 173
    .line 174
    move-result-wide v0

    .line 175
    invoke-virtual {p1, p3, v0, v1}, Landroidx/core/app/FrameMetricsAggregator$a;->f(Landroid/util/SparseIntArray;J)V

    .line 176
    .line 177
    .line 178
    :cond_8
    return-void
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
.end method
