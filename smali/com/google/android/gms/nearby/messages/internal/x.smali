.class public final Lcom/google/android/gms/nearby/messages/internal/x;
.super Lx9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/nearby/messages/internal/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final k:I

.field public final l:Lya/f;

.field public final m:Lxa/i;

.field public final n:Lya/r;

.field public final o:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final p:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final q:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final r:Lya/t;

.field public final s:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final t:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/y;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/y;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILya/f;Lxa/i;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;ZLandroid/os/IBinder;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx9/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/x;->k:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->l:Lya/f;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/x;->m:Lxa/i;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez p4, :cond_0

    .line 12
    .line 13
    move-object p2, p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p2, "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback"

    .line 16
    .line 17
    invoke-interface {p4, p2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    instance-of p3, p2, Lya/r;

    .line 22
    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    check-cast p2, Lya/r;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance p2, Lcom/google/android/gms/nearby/messages/internal/j0;

    .line 29
    .line 30
    invoke-direct {p2, p4}, Lcom/google/android/gms/nearby/messages/internal/j0;-><init>(Landroid/os/IBinder;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->n:Lya/r;

    .line 34
    .line 35
    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/internal/x;->o:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p6, p0, Lcom/google/android/gms/nearby/messages/internal/x;->p:Ljava/lang/String;

    .line 38
    .line 39
    iput-boolean p7, p0, Lcom/google/android/gms/nearby/messages/internal/x;->q:Z

    .line 40
    .line 41
    if-nez p8, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const-string p1, "com.google.android.gms.nearby.messages.internal.IPublishCallback"

    .line 45
    .line 46
    invoke-interface {p8, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    instance-of p2, p1, Lya/t;

    .line 51
    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    check-cast p1, Lya/t;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    new-instance p1, Lcom/google/android/gms/nearby/messages/internal/l0;

    .line 58
    .line 59
    invoke-direct {p1, p8}, Lcom/google/android/gms/nearby/messages/internal/l0;-><init>(Landroid/os/IBinder;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/x;->r:Lya/t;

    .line 63
    .line 64
    iput-boolean p9, p0, Lcom/google/android/gms/nearby/messages/internal/x;->s:Z

    .line 65
    .line 66
    invoke-static {p10, p6, p5, p9}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->v(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/x;->t:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    .line 71
    .line 72
    iput p11, p0, Lcom/google/android/gms/nearby/messages/internal/x;->u:I

    .line 73
    .line 74
    return-void
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
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lx9/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->k:I

    .line 7
    .line 8
    invoke-static {p1, v1, v2}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/x;->l:Lya/f;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {p1, v2, v1, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->m:Lxa/i;

    .line 20
    .line 21
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/x;->n:Lya/r;

    .line 25
    .line 26
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x4

    .line 31
    invoke-static {p1, v2, v1, v3}, Lx9/c;->i(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x5

    .line 35
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->o:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v1, v2, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x6

    .line 41
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->p:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1, v1, v2, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x7

    .line 47
    iget-boolean v2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->q:Z

    .line 48
    .line 49
    invoke-static {p1, v1, v2}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/x;->r:Lya/t;

    .line 53
    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_0
    const/16 v2, 0x8

    .line 63
    .line 64
    invoke-static {p1, v2, v1, v3}, Lx9/c;->i(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 65
    .line 66
    .line 67
    const/16 v1, 0x9

    .line 68
    .line 69
    iget-boolean v2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->s:Z

    .line 70
    .line 71
    invoke-static {p1, v1, v2}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0xa

    .line 75
    .line 76
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/x;->t:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    .line 77
    .line 78
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 79
    .line 80
    .line 81
    const/16 p2, 0xb

    .line 82
    .line 83
    iget v1, p0, Lcom/google/android/gms/nearby/messages/internal/x;->u:I

    .line 84
    .line 85
    invoke-static {p1, p2, v1}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v0}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 89
    .line 90
    .line 91
    return-void
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
.end method
