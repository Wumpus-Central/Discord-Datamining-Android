.class public final Lw9/d1;
.super Lw9/s0;
.source "SourceFile"


# instance fields
.field final synthetic g:Lw9/c;


# direct methods
.method public constructor <init>(Lw9/c;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lw9/d1;->g:Lw9/c;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lw9/s0;-><init>(Lw9/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final f(Lt9/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw9/d1;->g:Lw9/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw9/c;->s()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lw9/d1;->g:Lw9/c;

    .line 10
    .line 11
    invoke-static {v0}, Lw9/c;->f0(Lw9/c;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lw9/d1;->g:Lw9/c;

    .line 18
    .line 19
    const/16 v0, 0x10

    .line 20
    .line 21
    invoke-static {p1, v0}, Lw9/c;->b0(Lw9/c;I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lw9/d1;->g:Lw9/c;

    .line 26
    .line 27
    iget-object v0, v0, Lw9/c;->z:Lw9/c$c;

    .line 28
    .line 29
    invoke-interface {v0, p1}, Lw9/c$c;->c(Lt9/a;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lw9/d1;->g:Lw9/c;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lw9/c;->K(Lt9/a;)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method protected final g()Z
    .locals 2

    iget-object v0, p0, Lw9/d1;->g:Lw9/c;

    iget-object v0, v0, Lw9/c;->z:Lw9/c$c;

    sget-object v1, Lt9/a;->o:Lt9/a;

    invoke-interface {v0, v1}, Lw9/c$c;->c(Lt9/a;)V

    const/4 v0, 0x1

    return v0
.end method
