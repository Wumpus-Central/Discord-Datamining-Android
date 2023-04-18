.class public final Lyd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lyd/d;

.field private final b:Lyd/d;

.field private final c:Lyd/d;


# direct methods
.method public constructor <init>([Lyd/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    aget-object v0, p1, v0

    .line 6
    .line 7
    iput-object v0, p0, Lyd/f;->a:Lyd/d;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    aget-object v0, p1, v0

    .line 11
    .line 12
    iput-object v0, p0, Lyd/f;->b:Lyd/d;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    iput-object p1, p0, Lyd/f;->c:Lyd/d;

    .line 18
    .line 19
    return-void
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
.method public a()Lyd/d;
    .locals 1

    iget-object v0, p0, Lyd/f;->a:Lyd/d;

    return-object v0
.end method

.method public b()Lyd/d;
    .locals 1

    iget-object v0, p0, Lyd/f;->b:Lyd/d;

    return-object v0
.end method

.method public c()Lyd/d;
    .locals 1

    iget-object v0, p0, Lyd/f;->c:Lyd/d;

    return-object v0
.end method
