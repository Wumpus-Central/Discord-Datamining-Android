.class public Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;


# instance fields
.field private final mDelayBetweenAttemptsInMs:I

.field private final mRetryAttempts:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->mRetryAttempts:I

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->mDelayBetweenAttemptsInMs:I

    .line 7
    .line 8
    return-void
    .line 9
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
.end method


# virtual methods
.method public canRetry()Z
    .locals 1

    iget v0, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->mRetryAttempts:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public copy()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;
    .locals 3

    new-instance v0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;

    iget v1, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->mRetryAttempts:I

    iget v2, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->mDelayBetweenAttemptsInMs:I

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;-><init>(II)V

    return-object v0
.end method

.method public getDelay()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->mDelayBetweenAttemptsInMs:I

    return v0
.end method

.method public update()Lcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->mRetryAttempts:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;

    .line 8
    .line 9
    iget v2, p0, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;->mDelayBetweenAttemptsInMs:I

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, Lcom/facebook/react/jstasks/LinearCountingRetryPolicy;-><init>(II)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    sget-object v0, Lcom/facebook/react/jstasks/NoRetryPolicy;->INSTANCE:Lcom/facebook/react/jstasks/NoRetryPolicy;

    .line 16
    .line 17
    return-object v0
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
.end method
