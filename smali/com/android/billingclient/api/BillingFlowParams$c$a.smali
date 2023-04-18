.class public Lcom/android/billingclient/api/BillingFlowParams$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/BillingFlowParams$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:I


# direct methods
.method synthetic constructor <init>(Lu2/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->c:I

    return-void
.end method

.method static synthetic f(Lcom/android/billingclient/api/BillingFlowParams$c$a;)Lcom/android/billingclient/api/BillingFlowParams$c$a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->b:Z

    return-object p0
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/BillingFlowParams$c;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v0, v2

    .line 21
    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    xor-int/2addr v2, v3

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v1, "Please provide Old SKU purchase information(token/id) or original external transaction id, not both."

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_3
    :goto_2
    iget-boolean v3, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->b:Z

    .line 40
    .line 41
    if-nez v3, :cond_5

    .line 42
    .line 43
    if-nez v0, :cond_5

    .line 44
    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string v1, "Old SKU purchase information(token/id) or original external transaction id must be provided."

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_5
    :goto_3
    new-instance v0, Lcom/android/billingclient/api/BillingFlowParams$c;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$c;-><init>(Lu2/n;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$c;->e(Lcom/android/billingclient/api/BillingFlowParams$c;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget v1, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->c:I

    .line 67
    .line 68
    invoke-static {v0, v1}, Lcom/android/billingclient/api/BillingFlowParams$c;->f(Lcom/android/billingclient/api/BillingFlowParams$c;I)V

    .line 69
    .line 70
    .line 71
    return-object v0
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

.method public b(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$c$a;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$c$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(I)Lcom/android/billingclient/api/BillingFlowParams$c$a;
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->c:I

    return-object p0
.end method

.method public e(I)Lcom/android/billingclient/api/BillingFlowParams$c$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/android/billingclient/api/BillingFlowParams$c$a;->c:I

    return-object p0
.end method
