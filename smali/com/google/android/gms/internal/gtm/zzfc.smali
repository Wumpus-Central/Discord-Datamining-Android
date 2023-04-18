.class final Lcom/google/android/gms/internal/gtm/zzfc;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field static final zza:Ljava/lang/String; = "com.google.android.gms.internal.gtm.zzfc"


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/gtm/zzbv;

.field private zzc:Z

.field private zzd:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzbv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzf()Lcom/google/android/gms/internal/gtm/zzbq;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "NetworkBroadcastReceiver received action"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzfc;->zze()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget-boolean p2, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzd:Z

    .line 39
    .line 40
    if-eq p2, p1, :cond_0

    .line 41
    .line 42
    iput-boolean p1, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzd:Z

    .line 43
    .line 44
    iget-object p2, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/google/android/gms/internal/gtm/zzbv;->zzf()Lcom/google/android/gms/internal/gtm/zzbq;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const-string v0, "Network connectivity status changed"

    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Lcom/google/android/gms/internal/gtm/zzbr;->zzq()Lk9/n;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Lcom/google/android/gms/internal/gtm/zzbj;

    .line 64
    .line 65
    invoke-direct {v1, p2, p1}, Lcom/google/android/gms/internal/gtm/zzbj;-><init>(Lcom/google/android/gms/internal/gtm/zzbq;Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lk9/n;->e(Ljava/lang/Runnable;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void

    .line 72
    :cond_1
    const-string v0, "com.google.analytics.RADIO_POWERED"

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    sget-object p1, Lcom/google/android/gms/internal/gtm/zzfc;->zza:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p2, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    iget-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzf()Lcom/google/android/gms/internal/gtm/zzbq;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string p2, "Radio powered up"

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/gtm/zzbr;->zzO(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbq;->zzc()V

    .line 100
    .line 101
    .line 102
    :cond_2
    return-void

    .line 103
    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 104
    .line 105
    invoke-virtual {p2}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    const-string v0, "NetworkBroadcastReceiver received unknown action"

    .line 110
    .line 111
    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzS(Ljava/lang/String;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void
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

.method public final zza()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzf()Lcom/google/android/gms/internal/gtm/zzbq;

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzc:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zza()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Landroid/content/IntentFilter;

    .line 23
    .line 24
    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 25
    .line 26
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    new-instance v1, Landroid/content/IntentFilter;

    .line 33
    .line 34
    const-string v2, "com.google.analytics.RADIO_POWERED"

    .line 35
    .line 36
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzfc;->zze()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzd:Z

    .line 54
    .line 55
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-boolean v1, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzd:Z

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v2, "Registering connectivity change receiver. Network connected"

    .line 68
    .line 69
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzP(Ljava/lang/String;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    iput-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzc:Z

    .line 74
    .line 75
    return-void
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
.end method

.method public final zzb()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zza()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroid/content/Intent;

    .line 8
    .line 9
    const-string v2, "com.google.analytics.RADIO_POWERED"

    .line 10
    .line 11
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    sget-object v2, Lcom/google/android/gms/internal/gtm/zzfc;->zza:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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
.end method

.method public final zzc()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzc:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "Unregistering connectivity change receiver"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzO(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzc:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzd:Z

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zza()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception v0

    .line 33
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "Failed to unregister the network broadcast receiver"

    .line 40
    .line 41
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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
.end method

.method public final zzd()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzc:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "Connectivity unknown. Receiver not registered"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzR(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzd:Z

    .line 17
    .line 18
    return v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method protected final zze()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfc;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zza()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "connectivity"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 23
    .line 24
    .line 25
    move-result v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :catch_0
    :cond_0
    return v1
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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
.end method
