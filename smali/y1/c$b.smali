.class public final Ly1/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly1/c$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ly1/c$b;->a:Z

    .line 6
    .line 7
    const-string v0, "appassets.androidplatform.net"

    .line 8
    .line 9
    iput-object v0, p0, Ly1/c$b;->b:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ly1/c$b;->c:Ljava/util/List;

    .line 17
    .line 18
    return-void
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
.method public a(Ljava/lang/String;Ly1/c$d;)Ly1/c$b;
    .locals 4

    iget-object v0, p0, Ly1/c$b;->c:Ljava/util/List;

    new-instance v1, Ly1/c$e;

    iget-object v2, p0, Ly1/c$b;->b:Ljava/lang/String;

    iget-boolean v3, p0, Ly1/c$b;->a:Z

    invoke-direct {v1, v2, p1, v3, p2}, Ly1/c$e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLy1/c$d;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Ly1/c;
    .locals 2

    new-instance v0, Ly1/c;

    iget-object v1, p0, Ly1/c$b;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ly1/c;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ly1/c$b;
    .locals 0

    iput-object p1, p0, Ly1/c$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)Ly1/c$b;
    .locals 0

    iput-boolean p1, p0, Ly1/c$b;->a:Z

    return-object p0
.end method
