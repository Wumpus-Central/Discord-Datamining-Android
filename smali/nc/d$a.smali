.class Lnc/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llc/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc/d;->i()Llc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnc/d;


# direct methods
.method constructor <init>(Lnc/d;)V
    .locals 0

    iput-object p1, p0, Lnc/d$a;->a:Lnc/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/io/Writer;)V
    .locals 7

    .line 1
    new-instance v6, Lnc/e;

    .line 2
    .line 3
    iget-object v0, p0, Lnc/d$a;->a:Lnc/d;

    .line 4
    .line 5
    invoke-static {v0}, Lnc/d;->e(Lnc/d;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v0, p0, Lnc/d$a;->a:Lnc/d;

    .line 10
    .line 11
    invoke-static {v0}, Lnc/d;->f(Lnc/d;)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v0, p0, Lnc/d$a;->a:Lnc/d;

    .line 16
    .line 17
    invoke-static {v0}, Lnc/d;->g(Lnc/d;)Llc/d;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v0, p0, Lnc/d$a;->a:Lnc/d;

    .line 22
    .line 23
    invoke-static {v0}, Lnc/d;->h(Lnc/d;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    move-object v0, v6

    .line 28
    move-object v1, p2

    .line 29
    invoke-direct/range {v0 .. v5}, Lnc/e;-><init>(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Llc/d;Z)V

    .line 30
    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    invoke-virtual {v6, p1, p2}, Lnc/e;->h(Ljava/lang/Object;Z)Lnc/e;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6}, Lnc/e;->p()V

    .line 37
    .line 38
    .line 39
    return-void
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
