.class public final Lcom/google/android/gms/nearby/messages/internal/d0;
.super Lx9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/nearby/messages/internal/d0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final k:I

.field public final l:Lya/p;

.field public final m:Lya/r;

.field public final n:Landroid/app/PendingIntent;

.field public final o:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final p:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final q:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final r:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final s:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lya/l;

    invoke-direct {v0}, Lya/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lx9/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->k:I

    const/4 p1, 0x0

    if-nez p2, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.nearby.messages.internal.IMessageListener"

    .line 2
    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    .line 3
    instance-of v1, v0, Lya/p;

    if-eqz v1, :cond_1

    .line 4
    check-cast v0, Lya/p;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/i0;

    invoke-direct {v0, p2}, Lcom/google/android/gms/nearby/messages/internal/i0;-><init>(Landroid/os/IBinder;)V

    .line 5
    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->l:Lya/p;

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback"

    .line 6
    invoke-interface {p3, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    .line 7
    instance-of p2, p1, Lya/r;

    if-eqz p2, :cond_3

    .line 8
    check-cast p1, Lya/r;

    goto :goto_1

    :cond_3
    new-instance p1, Lcom/google/android/gms/nearby/messages/internal/j0;

    invoke-direct {p1, p3}, Lcom/google/android/gms/nearby/messages/internal/j0;-><init>(Landroid/os/IBinder;)V

    .line 9
    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->m:Lya/r;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->n:Landroid/app/PendingIntent;

    iput p5, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->o:I

    iput-object p6, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->p:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->q:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->r:Z

    .line 10
    invoke-static {p9, p7, p6, p8}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->v(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->s:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;)V
    .locals 10

    const/4 v1, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 11
    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/nearby/messages/internal/d0;-><init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V

    return-void
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
    iget v2, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->k:I

    .line 7
    .line 8
    invoke-static {p1, v1, v2}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->l:Lya/p;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    const/4 v2, 0x2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {p1, v2, v1, v3}, Lx9/c;->i(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->m:Lya/r;

    .line 27
    .line 28
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x3

    .line 33
    invoke-static {p1, v2, v1, v3}, Lx9/c;->i(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->n:Landroid/app/PendingIntent;

    .line 38
    .line 39
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x5

    .line 43
    iget v2, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->o:I

    .line 44
    .line 45
    invoke-static {p1, v1, v2}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x6

    .line 49
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->p:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p1, v1, v2, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x7

    .line 55
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->q:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {p1, v1, v2, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    const/16 v1, 0x8

    .line 61
    .line 62
    iget-boolean v2, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->r:Z

    .line 63
    .line 64
    invoke-static {p1, v1, v2}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 65
    .line 66
    .line 67
    const/16 v1, 0x9

    .line 68
    .line 69
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/d0;->s:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    .line 70
    .line 71
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v0}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 75
    .line 76
    .line 77
    return-void
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
.end method
