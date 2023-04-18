.class final Lq9/k;
.super Lq9/n;
.source "SourceFile"


# direct methods
.method constructor <init>(Lu9/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lq9/n;-><init>(Lu9/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic c(Lu9/a$b;)V
    .locals 2

    .line 1
    check-cast p1, Lq9/i;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw9/c;->C()Landroid/os/IInterface;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lq9/u;

    .line 8
    .line 9
    new-instance v1, Lq9/j;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lq9/j;-><init>(Lq9/k;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lq9/i;->k0()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, v1, p1}, Lq9/u;->e0(Lq9/t;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method protected final bridge synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lu9/k;
    .locals 0

    return-object p1
.end method
