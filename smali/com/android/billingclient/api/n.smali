.class final Lcom/android/billingclient/api/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult;
    .locals 7

    .line 1
    sget-object p1, Lcom/android/billingclient/api/k;->j:Lcom/android/billingclient/api/BillingResult;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const-string v2, "BillingClient"

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    new-array p0, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    aput-object p2, p0, v0

    .line 12
    .line 13
    const-string p2, "%s got null owned items list"

    .line 14
    .line 15
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {v2, p0}, Lsa/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    invoke-static {p0, v2}, Lsa/k;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {p0, v2}, Lsa/k;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {}, Lcom/android/billingclient/api/BillingResult;->b()Lcom/android/billingclient/api/BillingResult$a;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5, v3}, Lcom/android/billingclient/api/BillingResult$a;->c(I)Lcom/android/billingclient/api/BillingResult$a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v4}, Lcom/android/billingclient/api/BillingResult$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult$a;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/android/billingclient/api/BillingResult$a;->a()Lcom/android/billingclient/api/BillingResult;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    const/4 p0, 0x2

    .line 48
    new-array p0, p0, [Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p2, p0, v0

    .line 51
    .line 52
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    aput-object p1, p0, v1

    .line 57
    .line 58
    const-string p1, "%s failed. Response code: %s"

    .line 59
    .line 60
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {v2, p0}, Lsa/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_1
    const-string v3, "INAPP_PURCHASE_ITEM_LIST"

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_6

    .line 75
    .line 76
    const-string v4, "INAPP_PURCHASE_DATA_LIST"

    .line 77
    .line 78
    invoke-virtual {p0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_6

    .line 83
    .line 84
    const-string v5, "INAPP_DATA_SIGNATURE_LIST"

    .line 85
    .line 86
    invoke-virtual {p0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {p0, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-nez v3, :cond_3

    .line 106
    .line 107
    new-array p0, v1, [Ljava/lang/Object;

    .line 108
    .line 109
    aput-object p2, p0, v0

    .line 110
    .line 111
    const-string p2, "Bundle returned from %s contains null SKUs list."

    .line 112
    .line 113
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {v2, p0}, Lsa/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_3
    if-nez v4, :cond_4

    .line 122
    .line 123
    new-array p0, v1, [Ljava/lang/Object;

    .line 124
    .line 125
    aput-object p2, p0, v0

    .line 126
    .line 127
    const-string p2, "Bundle returned from %s contains null purchases list."

    .line 128
    .line 129
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {v2, p0}, Lsa/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_4
    if-nez p0, :cond_5

    .line 138
    .line 139
    new-array p0, v1, [Ljava/lang/Object;

    .line 140
    .line 141
    aput-object p2, p0, v0

    .line 142
    .line 143
    const-string p2, "Bundle returned from %s contains null signatures list."

    .line 144
    .line 145
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {v2, p0}, Lsa/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-object p1

    .line 153
    :cond_5
    sget-object p0, Lcom/android/billingclient/api/k;->l:Lcom/android/billingclient/api/BillingResult;

    .line 154
    .line 155
    return-object p0

    .line 156
    :cond_6
    :goto_0
    new-array p0, v1, [Ljava/lang/Object;

    .line 157
    .line 158
    aput-object p2, p0, v0

    .line 159
    .line 160
    const-string p2, "Bundle returned from %s doesn\'t contain required fields."

    .line 161
    .line 162
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {v2, p0}, Lsa/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-object p1
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
.end method
