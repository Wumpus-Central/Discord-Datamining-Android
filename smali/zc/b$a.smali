.class public final Lzc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lzc/a;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lzc/b$a;->a:Lzc/a;

    .line 6
    .line 7
    return-void
    .line 8
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
.end method


# virtual methods
.method public a()Lzc/b;
    .locals 2

    new-instance v0, Lzc/b;

    iget-object v1, p0, Lzc/b$a;->a:Lzc/a;

    invoke-direct {v0, v1}, Lzc/b;-><init>(Lzc/a;)V

    return-object v0
.end method

.method public b(Lzc/a;)Lzc/b$a;
    .locals 0

    iput-object p1, p0, Lzc/b$a;->a:Lzc/a;

    return-object p0
.end method
