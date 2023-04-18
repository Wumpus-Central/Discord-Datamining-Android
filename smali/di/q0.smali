.class final Ldi/q0;
.super Ldi/s;
.source "SourceFile"


# instance fields
.field private final m:Ldi/c1;


# direct methods
.method public constructor <init>(Ldi/o0;Ldi/c1;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Ldi/s;-><init>(Ldi/o0;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Ldi/q0;->m:Ldi/c1;

    .line 15
    .line 16
    return-void
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
.end method


# virtual methods
.method public M0()Ldi/c1;
    .locals 1

    iget-object v0, p0, Ldi/q0;->m:Ldi/c1;

    return-object v0
.end method

.method public bridge synthetic Y0(Ldi/o0;)Ldi/r;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/q0;->Z0(Ldi/o0;)Ldi/q0;

    move-result-object p1

    return-object p1
.end method

.method public Z0(Ldi/o0;)Ldi/q0;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/q0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldi/q0;->M0()Ldi/c1;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, p1, v1}, Ldi/q0;-><init>(Ldi/o0;Ldi/c1;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
