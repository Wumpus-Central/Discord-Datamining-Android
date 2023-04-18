.class public Lg0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lf0/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lf0/c;

    .line 5
    .line 6
    invoke-static {v0}, Lf0/a;->a(Ljava/lang/Class;)Lw/f2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lf0/c;

    .line 11
    .line 12
    iput-object v0, p0, Lg0/a;->a:Lf0/c;

    .line 13
    .line 14
    return-void
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
.end method


# virtual methods
.method public a(Z)Z
    .locals 1

    iget-object v0, p0, Lg0/a;->a:Lf0/c;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lf0/c;->c(Z)Z

    move-result p1

    :goto_0
    return p1
.end method
